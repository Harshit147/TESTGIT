import java.util.Scanner;
class ThrowExample1{
	public static void main(String[]args){
		int day;
		Scanner sc= new Scanner(System.in);
		while(flag){

		try{
             System.out.print("Enter day : ");
             day=sc.nextInt();
             if(day<0 || day>31)
             	throw new Exception("Exception: Invalid day");
             else 
             {
             	System.out.print("\nEntered day ="+day);
             flag=false;
         }
		}
		catch(Exception e){
			System.out.print("\n"+e.gatMessage());
		}
	}
}
}