import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page8({ onMenuClick}) {
    
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
        <h1 style={{textAlign: 'center', margin: 0}}>[인구학 변수 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>24. 현재 학력을 선택해주세요.</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>무학</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>초등학교</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>중학교</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>고등학교</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>전문대학 이상</button>

    <button className="button" onClick={() => navigate('/res')}>제출하기</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page7')}>이전으로</button>
    
    </div>
  );
}

export default Page8;