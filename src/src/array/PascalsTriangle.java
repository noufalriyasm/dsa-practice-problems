package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    /**
     Given an integer numRows, return the first numRows of Pascal's triangle.
     In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
     Example 1:
     Input: numRows = 5
     Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     Example 2:
     Input: numRows = 1
     Output: [[1]]
     */

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();

        if(numRows==0){
            return triangle;
        }
        triangle.add(Arrays.asList(1));
        for (int i=1;i<numRows;i++){
            List<Integer> previous=triangle.get(i-1);
            List<Integer> current=new ArrayList<>();

            current.add(1);

            for (int j=1;j<i;j++){
                current.add(previous.get(j-1)+previous.get(j));
            }
            current.add(1);
            triangle.add(current);
        }
        return triangle;

    }
}
