import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        int sum=0;
        int i;
        System.out.println("Enter rhe number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++) {
            sum=(num*(num+1)/2);
            sum+=num;
        }
        System.out.println(" "+sum);
    }
}