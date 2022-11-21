import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ex,a,b;
        do {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
        int option=sc.nextInt();
        if(option!=5)
        {
            System.out.println("Enter first Number");
             a=sc.nextInt();
            System.out.println("Enter second Number");
             b=sc.nextInt();

        }
        else
            break;

        switch (option)
        {
            case 1:
                int result=a+b;
                System.out.println("a + b = "+result);
                break;
            case 2:
                int sub=a-b;
                System.out.println("a - b = "+sub);
                break;
            case 3:
                int mul=a*b;
                System.out.println("a * b ="+mul);
            case 4:
                try{
                    int div=a/b;
                    System.out.println("a / b ="+div);
                }
                catch (ArithmeticException e)
                {
                    System.out.println(" Exception b is Zero");
                }
                finally {
                    System.out.println("pgm reached the line");

                }
                break;

            case 5:
                break;
            default:
                System.out.println("invalid input");


        }
        System.out.println("Do you Want to continue?1.yes 2.No");
        ex=sc.nextInt();
        }while(ex==1);
    }
}
