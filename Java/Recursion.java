import java.util.Scanner;

public class Recursion
{
    public static void printNum(int n)
    {
        if(n == 0)                  // Final Condition
        {
            return;                 // Return output to the main function
        }
        System.out.println(n);      // Initial Statement
        printNum(n-1);              // Callback
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNum(n);
    }
}