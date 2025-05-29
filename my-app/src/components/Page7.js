import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page7({ onMenuClick}) {
    
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
        <h1 style={{textAlign: 'center', margin: 0}}>[흡연 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>22. 현재 담배를 피우십니까?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>전혀 피우지 않는다</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>금연중이다</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>현재도 흡연 중이다</button>

    <h2 style={{textAlign: 'left', width: '90%'}}>23. (현재 흡연 응답자만) 하루 몇 개비 정도 피우십니까? </h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>5개비 이하</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>6개비 ~ 19개비</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>한 갑(20개비) 이상</button>

    <button className="button" onClick={() => navigate('/page8')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page6')}>이전으로</button>
    
    </div>
  );
}

export default Page7;