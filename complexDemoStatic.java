class complex {
	int real;
	int imaginary;
	//Non-parameterized constructor
	complex(){}
	//parameterized constructor
	complex(int read,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	/**complex add(complex c){
		complex cadd=new complex();
		cadd.real=real +c.real;
		cadd.imaginary=imaginary + c.imaginary;
		return cadd;
	}*/
	int getReal(){
		return real;
	}
}
class complexDemoStatic{
	public static void main(String[]args){
	complex c1=new complex(1,2);
	complex c2=new complex(3,4);
	complex c3=new complex();
	c3=add(c1,c2);
	System.out.print("c1= "+c1.getreal() +" "+ c1.imaginary);
	System.out.print("c2= "+c2.getreal() +" "+ c1.imaginary);
	System.out.print("sum= "+c3.getreal() +" "+ c3.imaginary);
}
public static complex add(complex c1,complex c2){
	complex c3=new complex();
	c3.setreal=c1.getreal()+c2.getreal();

	c3.imaginary= c1.imaginary+ c2.imaginary;
	return c3;

}
}