package Seventeenth;

public class Quiz17 {
    //라우터와 스위치의 동작 방식에 대해 기술해보자!
    //# 스위치
    // - MAC 주소 테이블을 가지고 있고 목적지 MAC 주소를 가진 장비가 연결된 포트로만 Frame 을 전송한다.
    // - 이더넷 네트워크에서 각 단말기으 MAC address로 데이터를 전송해주는 제품
    // - 각각의 포트가 하나의 Collison Domain 이다. 즉 충돌이 감소
    // - 스위치에 연결된 모든 장비는 하나의 Broadcast Domain 이다.
    // - 스위치에 연결된 장비가 많을수록 Broadcast 트래픽도 증가해 네트워크 성능저하가 심각해 진다.
    // - 해결책 VLAN 구성. 같은 스위치도 VLAN 이 다르면 Broadcast 프레임을 차단한다.
    //# 라우터
    // - 네트워크 주소가 다른 장비들을 연결해준다.
    // - LAN과 WAN을 연결하여 패킷의 ip 주소를 보고 최적의 경로를 결정하여
    //   다른 네트워크로 전송하여 주는 제품으로 쓰이는 위치나 규모에 따라 라우터의 종류가 달라질 수 있다.
    // - VLAN 이 서로 다른 장비들간의 통신은 라우터를 통해야만 가능
    // -  WAN 구간의 장거리 통신이 가능하다.
}
