class AddNumbers{

   public static void main(String args[])
   {
      int x, y, z;
 
      system.out.println("Enter two integers to calculate their sum");
      scanner in = new scanner(system.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
     
      system.out.println("Sum of the integers = " + z);
   }
}