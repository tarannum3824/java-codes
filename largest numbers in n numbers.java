import java .util.Scanner;
class main{
    public static void main(String[] args){
        int max_num,current_num,i;
        Scanner sc=new Scanner(System.in);
        max_num= Integer.MIN_VALUE;
        System.out.println("Enter how many number you wants:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
              current_num=sc.nextInt();
              max_num=Math.max(max_num,current_num);
         }
         System.out.println("the maximum value in given numbers is "+max_num);
        
    }
}