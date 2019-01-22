package pi;

import java.util.Scanner;

public class Pi {

    public static void main(String[] args) {
        double pi=Math.PI;        
        short n;
        Scanner scan = new Scanner(System.in);
        n=scan.nextShort();
        System.out.println("Вывод числа Pi с 'n' точностью ");
        System.out.format("Pi is: %."+n+"f%n", pi);
    }
    
}
