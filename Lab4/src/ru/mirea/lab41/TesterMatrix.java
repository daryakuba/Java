package ru.mirea.lab41;

import java.util.Scanner;

public class TesterMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int columns = sc.nextInt();
        double[][] matrix = new double[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < columns; k++){
                matrix[i][k] = sc.nextDouble();
            }
        }
        Matrix matrix1 = new Matrix(columns, lines, matrix);
        int lines1 = sc.nextInt();
        int columns1 = sc.nextInt();
        double[][] matrixx = new double[lines1][columns1];
        for (int i = 0; i < lines1; i++) {
            for (int k = 0; k < columns1; k++){
                matrixx[i][k] = sc.nextDouble();
            }
        }
        Matrix matrix2 = new Matrix(columns, lines, matrixx);
        matrix1.Output();
        matrix2.Output();
        Matrix matrix3 = new Matrix(2, 3, matrix1.AdditionOperation(matrix2));
        matrix3.Output();
        Matrix matrix4 = new Matrix(2, 3, matrix1.MultiplicationOp(5));
        matrix4.Output();

    }
}
