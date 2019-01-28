import java.util.*;
class SerachFunction {
	public static void main(String[] args){
		Scanner sc=new Scannner(System.in);
		int[] a =new int[10];
		int item;
		System.out.print("enter the elements of the array");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
	System.out.print("enter the item to search");
	item=sc.nextInt();
	int loc =search(a,item);
	if(loc==-1)
		System.out.print("item not in list");
	else
		System.out.print("item at location" + loc);
}