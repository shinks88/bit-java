package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

//	StringTokenizer
//	특정 구분자를 기준으로 문자열을 토큰화 시키는
//	기본 구분자는 \t\n\r
public class StringTokenizerEx {
	static String rootPath = System.getProperty("user.dir")+
			"\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	
	public static void main(String[] args) {
		try {
		// 주스트림 열기
			Reader freader = new FileReader(filename);
		//	보조스트림 열기
			BufferedReader br = new BufferedReader(freader);
			
		//	데이터 저장용 변수
			String member;
			
			while((member = br.readLine()) != null) {
				//	분절
				StringTokenizer st = new StringTokenizer(member, ",");
				//	토크나이저 루프
				while (st.hasMoreTokens()) {	//	남아있는 토큰이 있는가?
					String token = st.nextToken();
					System.out.print(token + " ");
				}//	한 라인의 처리
				System.out.println();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






