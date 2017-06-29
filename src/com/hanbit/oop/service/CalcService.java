package com.hanbit.oop.service;
import java.util.Scanner;
public class CalcService {
	public  String calBmi(double kidney,double weigh ){
		System.out.print("나의 체질량지수(BMI)는 ? \n");
		double bmi=weigh/(kidney*kidney);
		String check="";
		if(18.5>=bmi){
			check="저체중";
		}else if(18.5>=bmi){
			check="정상";
		}
		else if(30>=bmi){
			check="과체중";
		}else{
			check="비만";
		}
		return check;
}
	/*public int calcPlus(int num1,int num2){
		int result=0;
		result=num1+num2;
		return result;
	}*/
	public String calcPlus(String num3,String num4){
		String result="";
		return String.valueOf(Integer.parseInt(num3)+Integer.parseInt(num4));
	}/*
	public int calcMinus(int num1,int num2){
		int result=0;
		result=num1-num2;
		return result;
	}*/
	public String calcMinus(String num3, String num4){
		return String.valueOf(Integer.parseInt(num3)-Integer.parseInt(num4));
	}/*
	public int calcDivid(int num1,int num2){
		int result=0;
		result=num1/num2;
		return result;
	}*/
	public String calcDivid(String num3, String num4){
		return String.valueOf(Integer.parseInt(num3)/Integer.parseInt(num4));
	}
	/*public int calcMulti(int num1,int num2){
		int result=num1*num2;
		return result;
	}*/
	public String calcMulti(String num3, String num4){
		return String.valueOf(Integer.parseInt(num3)*Integer.parseInt(num4));
	}
	public String calcTax(){
		String result = "";
		return result;
	}
	public int calcTime(int second){
		int result = 0;
		return 0;
	}
}
