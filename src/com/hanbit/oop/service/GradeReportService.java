package com.hanbit.oop.service;

import java.util.Scanner;
public class GradeReportService{
		public String greport(int kor,int eng,int math ,int avg,String name){
			
			
			int total=0;
			String to="";
			total=kor+eng+math;
			avg=total/3;
		
			if(avg>=90){
				to="A";
			}else if(avg>=80){
				to="B";
			}else if(avg>=70){
				to="C";
			}else if(avg>=60){
				to="D";
			}else{
				to="F";
			}
			
			return to;			
			
		}
}