import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();

        System.out.println("Enter the Choice:");

        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
                int result=a+b;
                System.out.println("a + b = "+result);
                break;

        }
    }
}
