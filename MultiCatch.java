import java.util.Scanner;
class MultiCatch{
 public static void main(String[] args){
 	
 	int a;
 	int b;
 	int c;
 	int[] d={2};
 	Scanner sc =new Scanner(System.in);
 	try{
 	a=sc.nextInt();
 	System.out.print("a =" +a);
 	b=sc.nextInt();

 	System.out.print("\nb = "+ b);
 	c=a/b;
 	d[2]=99;
}

catch(ArithmeticException e){
System.out.print("Divide by 0:" +e);
}

catch(ArrayIndexOutOfBoundsException e){

	System.out.print("Array index oob: "+e);
}
System.out.println("After try/catch blocks.");
}
}
 
	
