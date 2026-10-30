import java.util.Scanner;
public class ForLoop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Enter number " + i + ":");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        }
        sc.close();
    }
}