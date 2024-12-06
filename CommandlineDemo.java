public class CommandlineDemo
{
  public static void main(String[] args)
  {
      String name;                //varible Declarations
      int num1,num2,num3,sum=0;
      float avg;

      name = args[0];
      num1 = Integer.parseInt(args[1]);
      num2 = Integer.parseInt(args[2]);
      num3 = Integer.parseInt(args[3]);
      
      //perform calculations
      sum = num1 + num2 + num3;
      avg = (float) sum/3;      //Typecasting
      
      System.out.println("The sum of 3 numbers is : " + sum);
      System.out.println("The Average of 3 numbers is : " + avg);
      System.out.println("Thank You Mr. "+name+" . Happy Coding!!! ");

  }
}