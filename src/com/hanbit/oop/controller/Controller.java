package com.hanbit.oop.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.Calculator;
import com.hanbit.oop.service.GradeReportService;
import com.hanbit.oop.service.LeapYearService;
import com.hanbit.oop.service.TaxCalService;
import com.hanbit.oop.service.TimeService;


public class Controller {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CalcService calcs=new CalcService();
		LeapYearService ly=new LeapYearService();
		TaxCalService taxs=new TaxCalService();
		TimeService time=new TimeService();
		Calculator calc=new Calculator();
		GradeReportService gr=new GradeReportService();
		
		
		
		while (true) {
			System.out.println("0.end 1.BMI,2.LeapYear 3.TaxCal 4.계산기, 5.시간구하기,6.성적,7.calc");
			switch (scan.next()) {
			case "0":
				System.out.println("end");
				return;
				
			case "1":
				System.out.print("신장을 입력하세요(179m 는 1.79로표시)\n");
				double kidney=scan.nextDouble();
				System.out.print("몸무게를 입력하세요\n");
				double weigh=scan.nextDouble();
				String check=calcs.calBmi(kidney,weigh );
				System.out.print("결과 : "+ check+"\n");
				
				break;
				
			case "2" :
				System.out.print("년도를 입력하세요\n");
				int year=scan.nextInt();
				String leap=ly.LeapYear(year);
				System.out.print(leap+"\n");
				break;
			case "3" :
				
				System.out.print("이름을 입력하세요\n");
				String name=scan.next();
				System.out.print("연봉을 입력하세요\n");
				int money=scan.nextInt();
				Double tax=taxs.taxcal(money, name);
				System.out.print(tax+"\n");

				break;
			case "4" :
				System.out.print("계산기\n");
				System.out.print("Enter Integer : " );
				int num1=scan.nextInt();
				System.out.print("연산자를 고르세요 1. + , 2. - ,3. * ,4./ \n");
				int opcode=scan.nextInt();
				System.out.print("Enter Integer : " );
				int num2=scan.nextInt();
				int result = calc.calcu(num1,opcode,num2);
				
				System.out.print(result+"\n");
				break;
			case "5":
				System.out.print("초를 시간과 분으로 바꾸어주는 프로그램입니다. \n");
				System.out.print("초를 입력하여 주세요\n");
				
				int num=scan.nextInt();
				String times=time.time(num);
				System.out.println(times+"\n");
				break;
			case "6" :
				int kor=0,eng=0,math=0,total=0,avg=0;
				// 90~100 A , 89~80 B 
				String name1="";
				System.out.print("이름 : ");
				name1=scan.next();
				System.out.print("국어 점수입력 : ");
				kor=scan.nextInt();
				System.out.print("영어 점수입력 : ");
				eng=scan.nextInt();
				System.out.print("수학 점수입력 : ");
				math=scan.nextInt();
				String report=gr.greport(kor, eng, math, avg, name1);
				System.out.print("=================================== 성 적 확 인 ============================================\n");
				System.out.println();
				System.out.print("국어"+kor+"점, "+"영어"+eng+"점, "+"수학"+math+"점, "+report+"\n");
				System.out.print("============================================================================================\n");
				break;
			case "7":
				System.out.println("계산기 0.더하기 1.빼기 2.나누기 3.곱하기");
				int cal1=scan.nextInt();
				
				if(cal1==0){
					System.out.println("정수입력 : ");
					String num3=scan.next();
					String.valueOf(num3);
					System.out.println("정수입력 : ");
					String num4=scan.next();
					String.valueOf(num4);
					
					String result1=calcs.calcPlus(num3, num4);
					System.out.println(result1);
				}else if(cal1==1){
					System.out.println("정수입력 : ");
					String num3=scan.next();
					String.valueOf(num3);
					System.out.println("정수입력 : ");
					String num4=scan.next();
					String.valueOf(num4);
					String result1=calcs.calcMinus(num3, num4);
					System.out.println(result1);
				}else if(cal1==2){
					System.out.println("정수입력 : ");
					String num3=scan.next();
					String.valueOf(num3);
					System.out.println("정수입력 : ");
					String num4=scan.next();
					String.valueOf(num4);
					String result1=calcs.calcDivid(num3, num4);
					System.out.println(result1);
				}else {
					System.out.println("정수입력 : ");
					String num3=scan.next();
					String.valueOf(num3);
					System.out.println("정수입력 : ");
					String num4=scan.next();
					String.valueOf(num4);
					String result1=calcs.calcMulti(num3, num4);
				}
					
					
					
				break;
			
			}
		}
			
		
	}
}
