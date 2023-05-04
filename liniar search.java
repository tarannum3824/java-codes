import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] search=new int[size];
        int i;
        for( i=1;i<size;i++){
            search[i]=sc.nextInt();
        }
        System.out.println("Enter the key value:");
        int key=sc.nextInt();
        int ans=-1;
            if(search[i]==key){
                ans=key;
            }
            System.out.println("the value is stored in " + ans + "index");
    }
}