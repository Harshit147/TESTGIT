import java.util.Scanner;
class ExceptionExample0{
 public static void main(String[] args){
 	int a;
 	int b;
 	int c;
 	Scanner sc =new Scanner(System.in);
 	System.out.print("\nEnter the value of a");
 	a=sc.nextInt();
try{
 	System.out.print("\n Enter the value of b");
 	b=sc.nextInt();
 	c=a/b;
 
}
catch(ArithmeticException e);
System.out.print("bye");
}
catch(Exception e){
	System.out.print("hello");
}

{
	c=a/b;
 	System.out.print("\na ="+a +" b=" + b +"a/b="+c);


}


 
	
