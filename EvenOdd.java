import java.util.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.println("The given number "+n +" is Even ");
        else
            System.out.println(1"The given number "+n +" is Odd ");
    }
}