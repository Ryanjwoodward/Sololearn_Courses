/*
 * You need a program to convert days to seconds.
 */
package Java_course;

import java.util.Scanner;

public class TimeConverter{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println((((days*24)*60)*60));
    }
}