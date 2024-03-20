package project3HW;

// Write a program to print out duplicate elements from an Array of Strings?

import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {

        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape", "apple"};

        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicateStrings = new HashSet<>();

        for (String str : strings) {

            if (!uniqueStrings.add(str)) {
                duplicateStrings.add(str);
            }
        }
        System.out.println("Duplicate elements in the array:");
        for (String duplicate : duplicateStrings) {
            System.out.println(duplicate);
        }
    }
}
