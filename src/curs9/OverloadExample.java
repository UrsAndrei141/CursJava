package curs9;

public class OverloadExample {

	public static void main(String[] args) {
		
		System.out.println(multiply(2,3));
		System.out.println(multiply(2, 5.5));
		
		System.out.println(123);//integer
		System.out.println("123");//string
		System.out.println('x');//char
		System.out.println(true);//boolean
		
		System.out.println("-----------------");
		printGeneric(123);
		printGeneric("123");
		printGeneric('x');
		printGeneric(true);
		
		
		

	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
	}
	
	public static <T> void printGeneric(T obj) {
		System.out.println(obj);
		System.out.println("data type ot obj :" + obj.getClass());
	}

}
