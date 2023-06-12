//program7: Leap year program
package com.basicjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter an year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year>=1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println(year + " is a leap year");
            else
                System.out.println(year + " is not a leap year");
        }
        else
            System.out.println(year + " is a invalid year");
    }
}

