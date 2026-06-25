import java.util.*;
class LastDigt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int last = n%10;
        System.out.print("The Last digit : "+last);
        sc.close();
    }
}