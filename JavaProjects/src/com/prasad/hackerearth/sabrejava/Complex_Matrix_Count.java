package com.prasad.hackerearth.sabrejava;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * You will be given a matrix of size
 N
 ×
 M
 N×M, and you need to count the number of submatrices which has atleast K occurrences of X and atleast two corner elements equal. These submatrices should have minimum two rows and two columns.

 Input:
 First line of the input contains four space separated integers,
 N
 N,
 M
 M,
 K
 K and
 X
 X respectively.
 Next
 N
 N lines contain
 M
 M space separated integers denoting the matrix

 Output:
 Output a single line containing the answer.

 Constraints:
 1
 ≤
 N
 ,
 M
 ≤
 100
 1≤N,M≤100
 1
 ≤
 K
 ≤
 20
 1≤K≤20
 1
 ≤
 X
 ≤
 100
 1≤X≤100
 1
 ≤
 A
 i
 ,
 j
 ≤
 100
 1≤Ai,j≤100
 Sample Input(Plaintext Link)
 3 3 2 1
 1 2 3
 1 3 6
 22 1 33
 Sample Output(Plaintext Link)
 4
 Explanation
 Here, the four submatrices are :-

 1 2
 1 3
 1 2 3
 1 3 6
 1 2
 1 3
 22 1
 1 3
 22 1
 */

public class Complex_Matrix_Count {

    public static void main(String[] args) throws Exception {

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\complex_matrix_count.txt"));
        String line = br.readLine();
        String[] readMatParam = line.split(" ");

        int nValue = Integer.parseInt(readMatParam[0]);
        int mValue = Integer.parseInt(readMatParam[1]);
        int kValue = Integer.parseInt(readMatParam[2]);
        int xValue = Integer.parseInt(readMatParam[3]);

        int [ ][ ] complexMatrix = new int [nValue][mValue] ;



        for (int i = 0; i < nValue; i++) {
            String nextLine = br.readLine();
            String[] matrixData = nextLine.split(" ");

            for (int j = 0; j < mValue; j++) {

                complexMatrix[i][j] = Integer.parseInt(matrixData[j]) ;
            }

        }

        getComplexMatrixCount(complexMatrix,kValue,xValue);


    }

    private static void getComplexMatrixCount(int[][] complexMatrix, int kValue, int xValue) {

        generateSubMatrix(complexMatrix);
    }

    private static void generateSubMatrix(int[][] complexMatrix) {
        for (int i = 0; i <complexMatrix.length; i++) {
            for (int j = 0; j < complexMatrix[i].length; j++) {
                int [ ][ ] subMatrix = readSubMatrix(complexMatrix, i, j);

                printBoard(subMatrix);
            }
        }

    }

    private static int[][] readSubMatrix(int[][] complexMatrix, int x, int y) {

        int[][] newMatrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newMatrix[i][j] = complexMatrix[i][j];
            }

        }
        return newMatrix ;
    }



    public static void printBoard(int[][] complexMatrix)
    {
        System.out.println();
        for (int i = 0; i < complexMatrix.length; i++) {
            for (int j = 0; j < complexMatrix[i].length; j++) {
                if (complexMatrix[i][j] == 0) {
                    System.out.print("_");
                } else {
                    System.out.print(complexMatrix[i][j]);
                }
                if (j < 2) {
                    System.out.print("|");
                } else {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}