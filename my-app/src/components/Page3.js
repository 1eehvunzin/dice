import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page3({ onMenuClick}) {
    
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
        <h1 style={{textAlign: 'center', margin: 0}}>[수면 영역]</h1>
    </div>

    <h2 style={{textAlign: 'left', width: '90%'}}>12. 잠들기까지 걸리는 시간은 얼마나 되나요?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>10분 이내</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>10분 ~ 20분</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>20분 ~ 30분</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>30분 ~ 1시간</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>1시간 이상</button>

    <h2 style={{textAlign: 'left', width: '90%'}}>13. 밤에 잠을 자는 중에 깨어나는 횟수는 어느정도인가요?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>깨는 일이 매우 드물다</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>1번 정도</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>2번 정도</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>3~4번 정도</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>수시로 깬다</button>

    <h2 style={{textAlign: 'left', width: '90%'}}>14. 평균 수면 시간은 얼마인가요?</h2>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>7시간 ~ 8시간</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>6시간 ~ 7시간 또는 8시간 ~ 9시간</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>5시간 ~ 6시간 또는 9시간 ~ 10시간</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>4시간 ~ 5시간 또는 10시간 ~ 11시간</button>
    <button className="button" style={{background: 'white', color: 'black', border: '1px solid black'}}>4시간 미만 또는 11시간 이상</button>

    <button className="button" onClick={() => navigate('/page4')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page2')}>이전으로</button>
    
    </div>
  );
}

export default Page3;