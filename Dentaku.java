package lesson1;

import java.util.Scanner;

public class Dentaku {
 public static void main(String[] args) {
	 System.out.println("＊＊＊電卓＊＊＊");
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("1:足し算　2：引き算 3:かけ算 4:割り算");
	 int menu = scan.nextInt();
	 
	 System.out.println("数字を2個入力してください");
	 
	 int num1 = scan.nextInt();
	 int num2 = scan.nextInt();
	 
	
	
if (menu==1) {
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
}if(menu==2) {
	System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
      }if(menu==3){
	System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
   }if(menu==4){
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
   }
 }
}