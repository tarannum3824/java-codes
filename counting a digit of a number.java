import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int digit=0;
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        while(num>0){
            num/=10;
            digit++;
        }
        System.out.println("it is " + digit + " digit number");
    }
}