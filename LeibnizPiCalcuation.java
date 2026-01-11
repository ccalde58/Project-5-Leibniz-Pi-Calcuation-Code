import java.io.*;
import java.util.Scanner;
public class LeibnizPiCalcuation {
    public static double getNumerator (double k){
        double num = Math.pow(-1, k);
        return num;
    }
    public static int getDenominator ( int k){
        int den = (2*k)+1;
        return den;
    }
    public static double getLeibniz (int n){
        double pi = 0;
        int sigma=0;
        for (int k=0; k<=n; ++k){
            pi += 4*getNumerator(k)/getDenominator(k);
        }
        return pi;
    }
    
    public static void main(String[] args) {
        System.out.println("Please Enter a Number: ");
        Scanner scnr = new Scanner (System.in);
        int n = scnr.nextInt();
        System.out.println("N \t\t Pi");
        System.out.println("--------------------------------------");
        for (int i =0; i<=n; i+=100){
            System.out.println(i + "\t\t" + getLeibniz(i));
            
        }
        
    }
}
