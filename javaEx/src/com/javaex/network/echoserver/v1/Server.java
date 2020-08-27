package com.javaex.network.echoserver.v1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//	1.	서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//	2. bind (주소, 포트 연결)
			InetSocketAddress local = new InetSocketAddress("127.0.0.1",	//	localhost
					10000);	//	Port(protocol or process 구분) : 시스템포트 / 사용자포트
			serverSocket.bind(local);	//	bind
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			//	3. 접속 대기
			Socket socket = serverSocket.accept();
			//	접속 후 처리 : 클라이언트 정보 확인
			
			// 	이 아래 코드들은 서버가 계속 실행해야하는 코드임! 서버는 항상 프로세스가 돌고있어야함
			InetSocketAddress client = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(client.getAddress() + ":" + client.getPort());
			
			//	클라이언트로부터 메시지 전송
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//	Echo Back을 위한 OutputStream 확보 (클라이언트로 응답메시지 보내기)
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	메시지 읽기
			String message;
			while((message = br.readLine()) != null) {
				System.out.println("수신 메시지:" + message);
				//	Echo Back
				
				System.out.println("Echo Back:" + message);
				bw.write("[Echo]:" + message);
				bw.newLine();
				bw.flush();
			}
			
			//	후처리
			System.out.println("[접속이 종료되었습니다.]");
			System.out.println("============");
			System.out.println("<서버 종료>");
			//	스트림 닫기
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//	서버 소켓 닫기
			try {
			serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





