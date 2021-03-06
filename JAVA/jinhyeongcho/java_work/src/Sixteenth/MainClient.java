package Sixteenth;

import java.io.IOException;

// 게임에 접속해서 플레이하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 집에서 하는 경우 자신의 집 컴퓨터 아이피 주소
        // 학원인 경우는 자신의 자리 ip 주소 혹은 동일하게 해도 무방
        String ip = "192.168.0.9";
        int port = 7777;

        ClientSocketManager csm = new ClientSocketManager(ip, port);

        System.out.println("접속 요청 완료!");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        csm.send(csm.getClntSock());

        System.out.println("전송 완료!");

        /*
        Thread.sleep(1000);
        csm.recv(csm.getClntSock());
         */
    }
}