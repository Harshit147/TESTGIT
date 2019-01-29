import java.util.*;
class ExceptionWithFunction{
	static void abc()throws ArithmeticException,ArrayIndexOutOfBoundsException{
	inr a;
	int b;
	int c;
	int[]d={2};
	Scanner.sc = new Scanner(System.in);
	System.out.print("Enter a:");
	a=sc.nextInt();
	System.out.print("Enter b:");
	b=sc.nextInt();
	c=a/b;
	System.out.print("\na= "+a +"b=" +b+"c=" +c);
	d[7]=6;
}
publicstatic void main (String[]args){
	try{
		abc();
	}
	catch(ArithmeticException e){
		System.out.print("\nArithmetic Exception");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.print("\nArray bound Exception");
	}
}
}