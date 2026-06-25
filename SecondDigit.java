import java.util.*;
class SecondDigit{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n / 10 ;
        int second  = org %10;
        System.out.print("The Second Last Digit Number : " + second);
              
    }
}