package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveRanges {
    public static void main(String[] args) {
        int[] arr = {21, 29, 4, 25, 7, 18, 9, 15, 16, 8, 20, 1, 5, 2, 31, 32, 33};

        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Initialize the result list
        List<String> result = new ArrayList<>();

        // Step 3: Loop through the array and identify consecutive ranges
        int start = arr[0]; // Start of the current sequence
        for (int i = 1; i < arr.length; i++) {
            // If the current number is not consecutive to the previous one
            if (arr[i] != arr[i - 1] + 1) {
                // If it's a sequence, add the "start->end"
                if (arr[i - 1] != start) {
                    result.add(start + "->" + arr[i - 1]);
                } else {
                    result.add(String.valueOf(start));
                }
                start = arr[i]; // New sequence starts here
            }
        }
        
        // Handle the last sequence
        if (arr[arr.length - 1] != start) {
            result.add(start + "->" + arr[arr.length - 1]);
        } else {
            result.add(String.valueOf(start));
        }

        // Step 4: Print the result
        	System.out.println(result);
    }
}
