import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function LandingPage({ onMenuClick}) {

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
      <img src="/images/landing.png" alt="landing" style={{ width: '244px', height: '244px', margin: '25px'}}/>
      <h2 style={{width: '90%', textAlign:'left'}}>데이터로 예측하고,<br/>디지털로 경고하다.</h2>
      <h4 style={{width: '90%', textAlign:'left'}}>
        🌿 치매는 하루아침에 오지 않습니다.<br/>
        📉 하지만 기억력, 감정, 수면, 습관…<br/>
        📍 일상의 아주 작은 변화들이 축적될 수 있습니다.<br/>
        📊 우리는 그 변화를 숫자로 감지하고,<br/>
        📥 의미 있는 조언으로 되돌려 드립니다.<br/>
        🔔 지금의 신호를, 놓치지 않기 위해.<br/>
        🧠 그래서 우리는, DICE를 만들었습니다. </h4>

      <button className="button" onClick={() => navigate('/page1')}>시작하기</button>

    </div>
  );
}

export default LandingPage;