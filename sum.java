//Program4: To find the sum of command-line arguments and count the invalid integers entered.
package com.basicjava;
public class sum {
    public static void main(String[] args) {
        int totalSum = 0;
        int invalidCount = 0;
        System.out.println("Calculate sum for below integers: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            try {
                int num = Integer.parseInt(args[i]);
                totalSum += num;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + totalSum);
        System.out.println("Count of invalid integers: " + invalidCount);
    }

}
