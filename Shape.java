import java.util.*;
class Shape{
	public void displayMsg(){
		System.out.print("Thia is a Shape");
	}
}
class Circle extends Shape{
	int radius;
	circle(int radius){
		this.radius=radius;
	}
	double area(){
		return 3.14*radius*radius;
	}
	void displayArea(){
		System.out.print("Area of the circle =" + area());
	}
}
class Rectangle extends Shape{
	int length,breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void displayArea(){
		System.out.print("\nArea of Rectangle =" + area());
	}
}
double area(){
	return length*breadth;
}
class ShapeinheritanceDemo{
	public static void main(String[]args){
		circle c=new circle(4);
		System.out.print("\ncircle calling its function and inherited function");
		c.displayMsg();
		c.displayArea();

		Rectangle r= new Rectangle(2,3);
		System.out.print("\n Rectangle calling its function and inherited function");
		r.displayArea();
		r.displayMsg();
	}


}


