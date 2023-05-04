
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1=sc.nextLine();
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--){
          reverse+=s1.charAt(i);
        }
        if(s1.equals(reverse)){
            System.out.println("given string is palindrome string");
        }
        else{
            System.out.println("given string is not a palindrome string");
        }
    }
}