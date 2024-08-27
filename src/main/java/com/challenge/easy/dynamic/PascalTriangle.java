package com.challenge.easy.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * # Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * <p>
 * https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif
 * <p>
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */
public class PascalTriangle {

    // Pascal's Triangle with recursion
    public static List<List<Integer>> generate(int numRows) {
        // Create new list of integer lists
        List<List<Integer>> triangle = new ArrayList<>();
        // Create new list which will be store the above numbers
        ArrayList<Integer> row = new ArrayList<>();
        // All the rows within triangle starts with 1
        row.add(1);
        // Base case: Where the num of rows will be 1, to start from bottom
        if (numRows == 1) {
            triangle.add(row);
            return triangle;
        }
        // Store it the previous rows lists
        List<List<Integer>> prev_triangle = generate(numRows - 1);
        // Store it the top list of numbers
        List<Integer> prev_row = prev_triangle.get(numRows - 2);
        // For: from 1 => because every row start with 1, and I need start from second index
        //      until => calculate all, except the last one index (always it will be one)
        for (int iteration = 1; iteration < numRows - 1; iteration++) {
            row.add(prev_row.get(iteration - 1) + prev_row.get(iteration));
        }
        // All the rows within triangle finish with 1
        row.add(1);
        // Save previous rows
        triangle.addAll(prev_triangle);
        // Save current row
        triangle.add(row);
        return triangle;
    }

    public static void printResult(List<List<Integer>> resList) {
        System.out.print("[");
        resList.forEach(res -> {
            System.out.print("[");
            res.forEach(number -> {
                System.out.print(number + ",");
            });
            System.out.print("]");
        });
        System.out.println("]");
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        printResult(result);
    }
}
