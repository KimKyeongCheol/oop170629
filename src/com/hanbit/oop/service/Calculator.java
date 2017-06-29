package com.hanbit.oop.service;
import java.util.Scanner;
public class Calculator{
public  int calcu(int num1,int opcode,int num2){

int result=0;
if(opcode==1){
result = num1+num2;
}else if(opcode==2){
result = num1-num2;
}else if(opcode==3){
result = num1*num2;
}else{
result = num1/num2;
}
return result;


}
}