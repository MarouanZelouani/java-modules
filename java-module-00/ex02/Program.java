
import java.util.Scanner;

public class Program {

    static int sum_digits(int number)
    {
        int sum;

        sum = 0;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    } 

    static int is_prime(int number)
    {
        int i;

        i = 2;
        if (number == 1)
            return (0);
        while (i <= number / i)
        {
            if (number % i == 0)
                return (0); 
            i++;
        }
        return 1; 
    }
    
    public static void main (String[] args)
    {
        int number;
        int result;
        Scanner sc = new Scanner(System.in);
        
        result = 0;
        number = 0;
        while (42 != number)
        { 
            number = sc.nextInt();
            if (is_prime(sum_digits(number)) == 1)
                result++;
        }
        System.out.println("Count of coffee-request : " + result);
        sc.close();
    }
}