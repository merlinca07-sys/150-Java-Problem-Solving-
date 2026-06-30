class EvenOddCount{
    public static void main(String[] args){
        int [] arr = {10,21,30,41,50};
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2==0)
                count1++;
            else
                count2++;
                   
        }
        System.out.println("The count  of even number present : " + count1);
        System.out.println("The count  of odd number present : " + count2);
    }
}