package com.course.a01;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class A01 {

	public void A01_1()
	{

		// Step A
		/*
		 * byte : -128 ~ 127 (2 to the power of 7)
		 * char : 2 byte
		 * short : 2 byte
		 * int : 4 byte
		 * float : 4 byte
		 * long : 8 byte
		 * double : 8 byte
		 */
		
		// getting max values (used when checking overflow)
		int a = Integer.MAX_VALUE;
		int b = (int) Long.MAX_VALUE;
		
		// converting char type to ASCII number
		char c = 'a';
		int c_ascii = (int) c;
		//System.out.print(c_ascii);
		
		// basic I/O
		Scanner s = new Scanner(System.in);	
		//System.out.print("Enter an integer : ");
		//int user_input = s.nextInt();
		
		
		/// [A01] 나이 계산
		System.out.println("[A01] 나이 계산");
		System.out.print("태어난 년도 : ");
		int birth_year =  s.nextInt();
		int age = LocalDateTime.now().getYear() - birth_year;
		System.out.println("당신의 나이는 "+age+" 살입니다.\n");
		
		/// [A02] 온도 변환
		System.out.println("[A02] 온도 변환");
		double c_degree = 0.0;
		double f_degree = 0.0;
		
		System.out.print("섭씨 온도를 입력하시오 : ");
		c_degree = s.nextDouble();
		f_degree = c_degree*(1.8) + 32.0;
		System.out.println("화씨 온도는 "+f_degree+"도 입니다.\n");
		
		/// [A03] 
	}


}
