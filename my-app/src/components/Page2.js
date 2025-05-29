import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page2({ onMenuClick}) {
    
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
        <h1 style={{textAlign: 'center', margin: 0}}>[우울감 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>8. 현재 삶이 대체로 만족스러운가요?</h2>
    <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>예</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>아니요</button>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>9. 지금 하는 일이 별 의미 없다고 느껴지시나요? </h2>
    <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>예</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>아니요</button>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>10. 자주 외롭거나 쓸쓸함을 느끼시나요? </h2>
    <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>예</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>아니요</button>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>11. 최근 며칠간 감정이 복받쳐 눈물이 난 적이 있나요? </h2>
    <div style={{display: 'flex', width: '90%', justifyContent: 'space-evenly'}}>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>예</button>
      <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>아니요</button>
    </div>


    <button className="button" onClick={() => navigate('/page3')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page1')}>이전으로</button>
    
    </div>
  );
}

export default Page2;