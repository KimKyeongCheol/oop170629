package com.hanbit.oop.service;

/*
연도를 4로 나눈값이 0이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떻어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는다 다시 이 값이
 100으로 나눠 떨어지면 평년이다.
 평년이라고 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
 2000, 2016년도 윤년이다.
*/
import java.util.Scanner;
public class LeapYearService{
	
	public String LeapYear(int year){
		
		String LeapYear="";
		if(year%4==0 && year%100!=0 || year%400==0){
			LeapYear="윤년";
		
		}else {
			LeapYear="평년";
		}
		
		return LeapYear;
	}
	
}
