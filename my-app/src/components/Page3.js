import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page3({ onMenuClick}) {

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
      <h1 style={{textAlign: 'center'}}>[수면 영역]</h1>

      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button" onClick={() => navigate('/page2')}>이전으로</button>
        <button className="button" onClick={() => navigate('/page4')}>다음으로</button>
      </div>
    </div>
  );
}

export default Page3;