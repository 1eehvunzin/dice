import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function ResultPage({ onMenuClick}) {

  const navigate = useNavigate();

  return (
    <div style={{
      width: '100vw',
      height: '100vh',
      maxWidth: '600px',
      minWidth: '300px',
      margin: '0 auto',
      padding: '0',
      background: '#e3eeb4',

      display: 'flex',           // flex 컨테이너로 만들기
      flexDirection: 'column',   // 세로 방향 정렬
      alignItems: 'center',      // 하위 요소 가로 중앙정렬
    }}>
      {/* 가운데 - 제목 */}
      <div className='top-bar'>
        <h1 style={{textAlign: 'center', margin: 0}}>D I C E</h1>
      </div>
      <h2>검사 결과</h2>
      <div style={{
        width: '90%',
        height: '60%',
        background: 'white'
      }}></div>

      <button className="button" onClick={() => navigate('/page1')}>결과 PDF 다운로드하기</button>

    </div>
  );
}

export default ResultPage;