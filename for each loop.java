package com.company;
import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        int[] numbers=new int[size];
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        for(int i=0;i<=size-1;i++){
            numbers[i]=sc.nextInt();
        }
        for (num:numbers){
            System.out.println(num);
        } 
    }
}