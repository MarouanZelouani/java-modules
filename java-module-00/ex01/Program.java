import java.util.Scanner;

public class Program {

    public static void main (String[] args)
    {
        int number;
        int i;

        i = 2;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        // System.out.println("number is : " + number);

        if (number <= 1)
        {
            System.out.println("IllegalArgument");
            return ; 
        }    
        while (i <= number / i)
        {
            if (number % i == 0)
            {
                System.out.println("false " + (i - 1));
                return ;
            }
            i++;
        }
        System.out.println("true " + (i - 1));
    }
}