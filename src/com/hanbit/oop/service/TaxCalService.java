package com.hanbit.oop.service;

/*
클라이언트에서 프로그램 개발 요청
이름 연봉 입력받고,
연봉 -- 만원을 받으시는 --- 님에게 납부할 세금은 -- 만원입니다.

*/

public class TaxCalService{
public  double taxcal(int money,String name){
	
	double tax=0.097;
	double mon=money*tax;
	
	return mon;
	
}
}