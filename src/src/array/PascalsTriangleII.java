package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
    /*
    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    Example 1:

    Input: rowIndex = 3
    Output: [1,3,3,1]
    Example 2:

    Input: rowIndex = 0
    Output: [1]
    Example 3:

    Input: rowIndex = 1
    Output: [1,1]
     */

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> previous = triangle.get(i - 1);
            List<Integer> current = new ArrayList<>();

            current.add(1);

            for (int j = 1; j < i; j++) {
                current.add(previous.get(j - 1) + previous.get(j));
            }
            current.add(1);

            triangle.add(current);

        }
        return triangle.get(rowIndex);
    }

    public List<Integer> getRowII(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));

            }
        }
        return row;
    }

}
