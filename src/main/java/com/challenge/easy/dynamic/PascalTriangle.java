package com.challenge.easy.dynamic;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    /**
     * Generates the first numRows of Pascal's Triangle.
     *
     * @param numRows The number of rows to generate.
     * @return A list of lists representing Pascal's Triangle.
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Generate Pascal's Triangle row by row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // Fill each row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    // Each element is the sum of the two elements directly above it
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5)); // Output: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]
        System.out.println(generate(1)); // Output: [[1]]
    }
}
