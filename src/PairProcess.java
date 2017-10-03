import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args)
    {

        int num1,num2,sum,prod,ava;

        Scanner keyboard= new Scanner (System.in);

        System.out.print("First Number? :");
        num1= keyboard.nextInt ();

        System.out.print("Last Number? :");

        num2= keyboard.nextInt ();

        sum=num1+num2;
        prod=num1*num2;
        ava= sum/2;


        if (sum<1000 && sum>200){

            System.out.println("The sum of the numbers is : "+ sum + "~"+"*");
            System.out.println("The sum of the numbers is : "+ prod + "~"+"*");
            System.out.println("The sum of the numbers is : "+ ava+ "~"+"*");

        }


    }
}
