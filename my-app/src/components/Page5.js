import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page5({ onMenuClick}) {
    
    const navigate = useNavigate();

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
        <h1 style={{textAlign: 'center', margin: 0}}>[BMI 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>18. 현재 키를 입력해주세요. (cm)</h2>
    <input
    type="number"
    placeholder="숫자만 입력하세요 예) 170"
    style={{ width: '80%', padding: '10px', fontSize: '16px' }}
    />

    <h2 style={{textAlign: 'left', width: '90%'}}>19. 현재 몸무게를 입력해주세요. (kg)</h2>
    <input
    type="number"
    placeholder="숫자만 입력하세요 예) 70"
    style={{ width: '80%', padding: '10px', fontSize: '16px' }}
    />

    <button className="button" onClick={() => navigate('/page6')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page4')}>이전으로</button>
    
    </div>
  );
}

export default Page5;