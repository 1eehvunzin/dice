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
      width: '100vw',
      height: '100vh',
      maxWidth: '600px',
      minWidth: '300px',
      margin: '0 auto',
      padding: '0',
      // background: '#e3eeb4',

      display: 'flex',           // flex 컨테이너로 만들기
      flexDirection: 'column',   // 세로 방향 정렬
      alignItems: 'center',      // 하위 요소 가로 중앙정렬
    }}>
    
    {/* 가운데 - 제목 */}
    <div className='top-bar'>
        <h1 style={{textAlign: 'center', margin: 0}}>[인지기능 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>1. 오늘 날짜를 선택해주세요.</h2>
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

    <h2 style={{textAlign: 'left', width: '90%'}}>2. 아래 장소 중 학생들이 공부하러 가는 장소를 선택해주세요.</h2>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>놀이공원</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>학교</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>수영장</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>영화관</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>식당</button>
     

    <h2 style={{textAlign: 'left', width: '90%'}}>3. 아래 단어를 읽고 발음을 올바르게 했는지 알려주세요.</h2>
      <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
        <h3 style={{color: 'blue'}}>사과</h3>
        <h3 style={{color: 'blue'}}>연필</h3>
        <h3 style={{color: 'blue'}}>시계</h3>
      </div>
      <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
        <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>예</button>
        <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>아니요</button>
      </div>
      

    <h2 style={{textAlign: 'left', width: '90%'}}>4. 100에서 7을 4번 뺀 결과는 얼마입니까?</h2>
    <input
    type="number"
    placeholder="숫자를 입력하세요 예) 34"
    style={{ width: '80%', padding: '10px', fontSize: '16px' }}
    />

    <button className="button" onClick={() => navigate('/page2')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/')}>이전으로</button>
    
    </div>
  );
}

export default Page1;