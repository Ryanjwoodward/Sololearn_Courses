package Java_course;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int month = 3;

        for(int idx=0; idx<3;idx++){
            amount=(amount - (amount /10));
        }
        System.out.println(amount);
    }
    
}
