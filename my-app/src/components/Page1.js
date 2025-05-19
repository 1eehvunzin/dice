import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import '../styles/styles.css';

function Page1({ onMenuClick}) {
    
    const navigate = useNavigate();
    const [selectedDate, setSelectedDate] = useState(null);

    return (
    <div style={{
      width: '50vw',
      maxWidth: '600px',
      minWidth: '300px',
      margin: '0 auto',
      padding: '2rem'
    }}>
    
    {/* 가운데 - 제목 */}
    <h1 style={{textAlign: 'center'}}>[인지기능 영역]</h1>

    <h2 style={{textAlign: 'left', marginTop: '50px'}}>1. 오늘 날짜를 선택해주세요.</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <DatePicker
        selected={selectedDate}
        onChange={(date) => setSelectedDate(date)}
        dateFormat="yyyy-MM-dd"
        placeholderText="날짜 선택"
        showMonthDropdown
        showYearDropdown
        dropdownMode="select"
        />
      </div>

    <h2 style={{textAlign: 'left', marginTop: '50px'}}>2. 지금 이 설문을 어디에서 하고 계신가요 ?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">집</button>
        <button className="button_y">학교</button>
        <button className="button_y">카페</button>
        <button className="button_y">기타</button>
      </div>

    <h2 style={{textAlign: 'left', marginTop: '50px'}}>3. 아래 단어를 보고 30초 뒤 기억나는 단어를 모두 선택해주세요.</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">이 버튼을 누르면 시작됩니다.</button>
      </div>

    <h2 style={{textAlign: 'left', marginTop: '50px'}}>4. 과일을 가능한 많이 골라주세요.</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

    <button className="button_page" onClick={() => navigate('/page2')}>다음으로</button>
    
    </div>
  );
}

export default Page1;