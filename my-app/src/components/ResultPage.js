import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function ResultPage({ onMenuClick}) {

  const navigate = useNavigate();

  return (
    <div style={{
      width: '50vw',
      maxWidth: '600px',
      minWidth: '300px',
      margin: '0 auto',
      padding: '2rem'
    }}>
      {/* 가운데 - 제목 */}
      <h1 style={{textAlign: 'center'}}>ResultPage</h1>

      <div style={{display: 'flex', justifyContent: 'center'}}>
        {/*<button className="button" onClick={() => navigate('/page1')}>시작하기</button>*/}
      </div>
    </div>
  );
}

export default ResultPage;