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

    <h2 style={{textAlign: 'left', width: '90%'}}>21. 최근 한 달간, 다음 중 혼자 하기 어려웠던 활동이 몇 개 있나요? </h2>
    <h3 style={{color: 'blue'}}>
      1) 옷 입기<br/>
      2) 세수 / 양치질 / 머리감기<br/>
      3) 목욕 또는 샤워하기<br/>
      4) 차려 놓은 음식 먹기<br/>
      5) 누웠다 일어나 방 밖으로 나가기<br/>
      6) 화장실 출입과 대소변 후 닦고 옷 입기<br/>
      7) 대소변 조절하기</h3>
    <input
    type="number"
    placeholder="숫자만 입력하세요 예) 3"
    style={{ width: '80%', padding: '10px', fontSize: '16px' }}
    />

    <button className="button" onClick={() => navigate('/page8')}>다음으로</button>
    <button className="button" style={{background: 'white', color: 'black', textDecoration: 'underline'}} onClick={() => navigate('/page6')}>이전으로</button>
    
    </div>
  );
}

export default Page7;