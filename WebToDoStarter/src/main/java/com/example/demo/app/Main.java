package com.example.demo.app;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
       //・1 ≦ N ≦ 10
        //・1 ≦ M ≦ 1,000
        //・0 ≦ p_{i ,j} ≦ 1,000 (1 ≦ i, j ≦ N)
        // 3개 강수량 200되면 안됨
        //n, m
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] ll = line.split(" ");
        int a = Integer.parseInt(ll[0]);
        int b = Integer.parseInt(ll[1]);
        int arr[][] = new int[a][a];
        int sum =0;
        for(int j =1; j<=(int)(Math.log10(a)+1); j++){
           for(int i =1; i<=j;i++){
               if(arr[i][j]>= b){
                   System.out.println("wait");
                   break;
               }
               sum +=arr[i][j];
               if(sum<=b){
                   System.out.println(i);
               }
           }
       }
        
    }
}