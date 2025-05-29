import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page4({ onMenuClick}) {
    
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
        <h1 style={{textAlign: 'center', margin: 0}}>[음주 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>15. 음주 빈도는 얼마나 되나요?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>전혀 마시지 않았다</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>한 달에 한두 번 이하</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>주 1회 이하</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>주 2 ~ 3회</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>주 4회 이상</button>

    <h2 style={{textAlign: 'left', width: '90%'}}>16. 한 번에 마시는 음주량은 얼마나 되나요? (기준: 소주 1잔, 맥주 1잔, 와인 반잔)</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>1잔 ~ 2잔</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>3잔</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>4잔 ~ 5잔</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>6잔 이상</button>

    <h2 style={{textAlign: 'left', width: '90%'}}>17. 음주로 인해 건강이나 대인관계에서 문제가 있었던 적이 있나요?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>없다</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>가끔 있다 (1회 ~ 2회)</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>자주 있다 (3회 이상) 또는 타인에게 지적받은 적 있음</button>

    <button className="button" onClick={() => navigate('/page5')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page3')}>이전으로</button>
    
    </div>
  );
}

export default Page4;