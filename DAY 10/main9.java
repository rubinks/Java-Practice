import java.util.*;
public class main9
{
    public int fibo(int n)
    {
        if(n==1)
        {
            return 0;         // 0 1 1 2 3 5 8 13 21 34 .....
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[]args)        //factorial of number using recursion
    {
        Scanner sc = new Scanner(System.in);
        main9 obj = new main9();
        int n = sc.nextInt();
        System.out.println(obj.fibo(n));
    }
}



// count the no of digits of a given number using recursion
// check whether palindrome usin recursion
// power of gn num using recursion
// gcd of 2 no using recursion
// sum of natural no using recursion
// sum of even no upto n using recursion
// count even digits in a no using recursion
//check whether no is odd or even using recursion
