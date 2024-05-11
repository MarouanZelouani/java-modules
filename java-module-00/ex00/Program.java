public class Program {
    
    public static void main (String[] args)
    {
        int number;
        int sum;

        sum = 0;
        number = 479598;
        while (number != 0)
        {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}