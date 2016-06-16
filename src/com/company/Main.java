package com.company;
import  java.util.Scanner;

public class Main {
    public static void minReverse(int n, double y[]){

        double min = y[0];
        double S = y[0];
        for(int k = 1; k < n; k++)
        {   S += y[k];
            if(min > y[k])
                min = y[k];
            else if(min == y[k])
                y[k] = (int) S / n;
        }
        for(int k = 0; k < n; k++)
            System.out.println("y[" + k + "] = " + y[k]);
    }
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        double y[] = new double[n];
        for(int k = 0; k < n; k++)
        {   System.out.print("y[" + k + "] ");
            y[k] = in.nextDouble();
        }

        minReverse(n, y);
    }
}
