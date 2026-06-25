import java.util.*;
class SumOfLastDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Number 2 : ");
        int n2 = sc.nextInt();
        int last1 = n1%10;
        int last2 = n2%10;
        int sum = last1+last2;
        System.out.print(" The Sum of Two Numbers Last Digit :" + sum );
        
        

    }
}