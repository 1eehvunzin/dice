package com.example.dice.api;

import com.example.dice.dto.ScoreInfo;
import com.example.dice.dto.SurveyAnalysisResultDto;
import com.example.dice.dto.SurveyResponseDto;
import com.example.dice.entity.User;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.IOException;

@RestController
public class ResultPageApiController {

    @PostMapping("/survey/result")
    public void generatePdf(@RequestBody SurveyAnalysisResultDto dto, @AuthenticationPrincipal User user, HttpServletResponse response) throws IOException {
        String userName = user.getName();

        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=DICE_리포트_" + userName + ".pdf");

        Document document = new Document(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document, response.getOutputStream());
        document.open();

        // 1. 제목
        Font titleFont = new Font(Font.HELVETICA, 18, Font.BOLD, Color.BLACK);
        Paragraph title = new Paragraph("DICE 인지건강 리포트", titleFont);
        document.add(title);

        // 2. 이름
        Font normalFont = new Font(Font.HELVETICA, 12);
        Paragraph name = new Paragraph("이름: " + userName, normalFont);
        name.setSpacingBefore(10);
        document.add(name);

        // 3. 반원 게이지
        PdfContentByte canvas = writer.getDirectContent();
        drawHalfGauge(canvas, 300, 600, 120, dto.getGaugeScore());

        // 4. 요약 문단
        Font textFont = new Font(Font.HELVETICA, 10);
        Paragraph summary = new Paragraph(dto.getSummaryText(), textFont);
        summary.setSpacingBefore(150);
        document.add(summary);

        // ---------- PAGE 2 ----------
        document.newPage();

        // 5. 클러스터 설명
        Paragraph clusterTitle = new Paragraph("[클러스터 유형 설명]", new Font(Font.HELVETICA, 13));
        document.add(clusterTitle);
        for (String line : dto.getClusterDescList()) {
            document.add(new Paragraph("- " + line, textFont));
        }

        document.add(new Paragraph("\n[항목별 상태 점수 및 해석]", new Font(Font.HELVETICA, 13)));
        for (ScoreInfo info : dto.getScores()) {
            drawScoreBar(canvas, 60, writer.getVerticalPosition(true) - 30, info);
            document.add(new Paragraph(" "));
        }

        // 6. 루틴 리스트
        document.add(new Paragraph("\n[오늘부터 시작하는 뇌 건강 루틴]", new Font(Font.HELVETICA, 13)));
        for (String item : dto.getRoutineList()) {
            document.add(new Paragraph(item, new Font(Font.HELVETICA, 11)));
        }

        document.close();
    }

    private void drawHalfGauge(PdfContentByte canvas, float centerX, float centerY, float radius, float score) {
        float angle = 180 - (score / 100f * 180);
        float needleX = (float) (centerX + radius * Math.cos(Math.toRadians(angle)));
        float needleY = (float) (centerY + radius * Math.sin(Math.toRadians(angle)));

        Color[] sectorColors = {new Color(231, 76, 60), new Color(241, 196, 15), new Color(46, 204, 113)};
        float[] startAngles = {0, 60, 120};
        for (int i = 0; i < 3; i++) {
            canvas.setColorFill(sectorColors[i]);
            canvas.moveTo(centerX, centerY);
            canvas.arc(centerX - radius, centerY - radius, centerX + radius, centerY + radius, startAngles[i], 60);
            canvas.fill();
        }

        canvas.setColorStroke(Color.BLACK);
        canvas.setLineWidth(2);
        canvas.moveTo(centerX, centerY);
        canvas.lineTo(needleX, needleY);
        canvas.stroke();

        canvas.setColorFill(Color.BLACK);
        canvas.circle(centerX, centerY, 4);
        canvas.fill();
    }

    private void drawScoreBar(PdfContentByte canvas, float x, float y, ScoreInfo info) throws IOException {
        float maxWidth = 100f;
        float filledWidth = (info.getScore() / info.getMaxScore()) * maxWidth;

        Color fillColor;
        float ratio = info.getScore() / info.getMaxScore();
        if (ratio >= 0.75) fillColor = Color.GREEN;
        else if (ratio >= 0.5) fillColor = Color.ORANGE;
        else fillColor = Color.RED;

        canvas.setColorStroke(Color.GRAY);
        canvas.rectangle(x + 50, y, maxWidth, 10);
        canvas.stroke();

        canvas.setColorFill(fillColor);
        canvas.rectangle(x + 50, y, filledWidth, 10);
        canvas.fill();

        canvas.beginText();
        canvas.setFontAndSize(BaseFont.createFont(), 10);
        canvas.setColorFill(Color.BLACK);
        canvas.showTextAligned(PdfContentByte.ALIGN_LEFT, info.getLabel(), x, y + 12, 0);
        canvas.showTextAligned(PdfContentByte.ALIGN_LEFT, info.getScore() + "/" + info.getMaxScore(), x + 160, y + 2, 0);
        canvas.showTextAligned(PdfContentByte.ALIGN_LEFT, "- " + info.getExplanation(), x, y - 10, 0);
        canvas.endText();
    }
}
