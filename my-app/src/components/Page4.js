import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/styles.css';

function Page4({ onMenuClick}) {

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
      <h1 style={{textAlign: 'center'}}>[음주 영역]</h1>
      <h2 style={{textAlign: 'left', marginTop: '50px'}}>14. 지난 3개월 간 술을 얼마나 자주 드셨나요?</h2>
      <div style={{display: 'flex', flexDirection: 'column'}}>
        <button className="button" style={{backgroundColor: '#205072'}}>전혀 마시지 않음</button>
        <button className="button" style={{backgroundColor: '#329d9c'}}>한 달에 한두번 이하</button>
        <button className="button" style={{backgroundColor: '#56c596'}}>주 1회 이하</button>
        <button className="button" style={{backgroundColor: '#7be495'}}>주 2~3회</button>
        <button className="button" style={{backgroundColor: '#cff4d2'}}>주 4회 이상</button>
      </div>

      <h2 style={{textAlign: 'left', marginTop: '50px'}}>15. 한 번 마실 때 보통 얼마나 마시나요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

      <h2 style={{textAlign: 'left', marginTop: '50px'}}>16. 술 마신 후 후회하거나 문제를 겪은 적이 있나요?</h2>
      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button_y">예</button>
        <button className="button_n">아니오</button>
      </div>

      <div style={{display: 'flex', justifyContent: 'center'}}>
        <button className="button" onClick={() => navigate('/page3')}>이전으로</button>
        <button className="button" onClick={() => navigate('/page5')}>다음으로</button>
      </div>
    </div>
  );
}

export default Page4;