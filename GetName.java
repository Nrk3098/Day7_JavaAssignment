//Program5: To get the name using the command prompt
package com.basicjava;

public class GetName {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Unknown";
        System.out.println(name);
    }
}
