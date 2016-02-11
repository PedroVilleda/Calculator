package calculator1;

import java.util.Scanner;

public class Calculator {

	private static int string;

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		int FirstValue = 0;
		int SecondValue = 0;
		String Operator = ""; 		
		int Result = 0;
		String Message = "Have a great day";
		
	System.out.println("What is the first Number?");
	FirstValue = user_input.nextInt();
	System.out.println("Which function would you like to execute? +, -, *, / ?");
	Operator = user_input.next();
	System.out.println("What is the second Number?");
	SecondValue = user_input.nextInt();
	if (Operator.equals("+"))
	{System.out.println("Your result is...");
	Result = FirstValue + SecondValue;
	System.out.println(Result);}
	
	else if (Operator.equals("-"))
	{System.out.println("Your result is...");
	Result = FirstValue - SecondValue;
	System.out.println(Result);}
	
	else if (Operator.equals("*"))
	{System.out.println("Your result is...");
	Result = FirstValue * SecondValue;
	System.out.println(Result);}
	
	else if (Operator.equals("/"))
	{System.out.println("Your result is...");
	Result = FirstValue / SecondValue;
	System.out.println(Result);}
	
	else 
	{System.out.println("Error Dumby!!");}
	
}}
