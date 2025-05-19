import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page2({ onMenuClick}) {

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
      <h1 style={{textAlign: 'center'}}>[우울감 영역]</h1>
      <h2 style={{textAlign: 'left', marginTop: '50px'}}>5. 현재 삶이 대체로 만족스러운가요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

      <h2 style={{textAlign: 'left', marginTop: '50px'}}>6. 지금 하는 일이 별 의미 없다고 느껴지시나요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

      <h2 style={{textAlign: 'left', marginTop: '50px'}}>7. 자주 외롭거나 쓸쓸함을 느끼시나요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

      <h2 style={{textAlign: 'left', marginTop: '50px'}}>8. 최근 며칠간 감정이 복받쳐 눈물이 난 적이 있나요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_page" onClick={() => navigate('/')}>이전으로</button>
        <button className="button_page">다음으로</button>
      </div>
    </div>
  );
}

export default Page2;