package sample;

import javax.management.ValueExp;

public class MethodSample {

	public static void main(String[] args) {
		var number1 = 100;
		var number2 = 10;
		
		
		sumMethod1(number1, number2);
				
		//ーーーーー　追記（ここから）　ーーーーー
		var result2 = sumMethod2(number1,number2);
		System.out.println("sumMethod2の結果は" + result2);
				
		//ーーーーー　追記（ここまで）　ーーーーー

	}
	
	private static void sumMethod1(int num1, int num2) {
		var result = num1 + num2;
		System.out.println("sumMethod1の結果は" +result);
		
	}

	//ーーーーー　追記（ここから）　ーーーーー
	public static int sumMethod2(int num1, int num2) {
		var result = num1 + num2;
		return result;
	}
	//ーーーーー　追記（ここまで）　ーーーーー

}
