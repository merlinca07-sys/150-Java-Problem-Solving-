import java.util.*;
class ExactMultiple{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter M Value : ");
        int m = sc.nextInt();
        System.out.print("Enter N Value : ");
        int n = sc.nextInt();
        if(n%m == 0)
            System.out.print("Yes, "+n+" is an exact multiple of "+m);
        else
            System.out.print("No, "+n+" is not an exact multiple of "+m);
    }
}