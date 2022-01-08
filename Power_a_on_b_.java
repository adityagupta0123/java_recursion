package Recursion;

import java.util.Scanner;

public class Power_a_on_b_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pow(sc.nextInt(), sc.nextInt()));
    }
    static int pow(int a,int b){
        if(b==0) return 1;
         return a * pow(a, b-1);
    }
}
