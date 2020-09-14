package com.company;



import java.util.Scanner;

public class Matrix_class {

    public static void main(String[] args) {
        int[][] m = {{11, 3, 18}, {6, -8, 10}, {1, 2, 3}};
        Matrix matrix1 = new Matrix(m);
        int[][] n = {{5, 6, 7}, {1, 55, 32}, {7, 5, 2}};
        Matrix matrix2 = new Matrix(n);

        Scanner sc = new Scanner(System.in);

        System.out.println("Первая матрица: ");
        matrix1.print_matrix();

        System.out.println("Вторая матрица: ");
        matrix2.print_matrix();

        System.out.println("Сложение матриц: ");
        Matrix res1 = new Matrix(matrix1.addition(matrix2.matrix));
        res1.print_matrix();

        System.out.println("Вычитание матриц: ");
        Matrix res2 = new Matrix(matrix1.subtraction(matrix2.matrix));
        res2.print_matrix();

        System.out.println("Умножение матрицы на число: ");
        int c = sc.nextInt();
        Matrix res3 = new Matrix(matrix1.multiply(c));
        res3.print_matrix();

        System.out.println("Умножение матрицы на матрицу: ");
        Matrix res4 = new Matrix(matrix1.multiply_matrix(matrix2.matrix));
        res4.print_matrix();

        System.out.println("Транспонированная матрица: ");
        Matrix res5 = new Matrix(matrix1.transposition());
        res5.print_matrix();

        System.out.println("Возведение матрицы в степерь: ");
        int b = sc.nextInt();
        Matrix res6 = new Matrix(matrix1.exponentiation(b));
        res6.print_matrix();
    }
}

class Matrix {
    int[][] matrix;
    int columns;
    int rows;

    Matrix(int[][] matrix_args){
        matrix = matrix_args;
        columns = matrix.length;
        rows = matrix[0].length;
    }

    void print_matrix() {
        String string = "";

        for(int i = 0; i < this.columns; i++) {
            for(int j = 0; j < this.rows; j++) {
                string += this.matrix[i][j] + " ";
            }
            System.out.println(string);
            string = "";
        }
    }

    int[][] addition(int[][] matrix2){
        int[][] result_matrix = new int[this.columns][this.rows];

        for(int i = 0; i < this.columns; i++){
            for(int j = 0; j < this.rows; j++){
                result_matrix[i][j] = this.matrix[i][j] + matrix2[i][j];
            }
        }
        return result_matrix;
    }

    int[][] subtraction(int[][] matrix2){
        int[][] result_matrix = new int[this.columns][this.rows];

        for (int i = 0; i < this.columns; i++) {
            for (int j = 0; j < this.rows; j++) {
                result_matrix[i][j] = this.matrix[i][j] - matrix2[i][j];
            }
        }
        return result_matrix;
    }

    int[][] multiply(int multiplier){

        int[][] result_matrix = new int[this.columns][this.rows];

        for(int i = 0; i < this.columns; i++){
            for(int j = 0; j < this.rows; j++){
                result_matrix[i][j] = multiplier * this.matrix[i][j];
            }
        }
        return result_matrix;
    }

    int[][] multiply_matrix(int[][] matrix2){
        int[][] result_matrix = new int[this.columns][this.rows];

        for (int i = 0; i < this.columns; i++) {
            for (int j = 0; j < this.rows; j++) {
                for(int k = 0; k < this.rows; k++){
                    result_matrix[i][j] += this.matrix[i][k] * matrix2[k][j];
                }
            }
        }
        return result_matrix;
    }

    int[][] transposition () {

        int[][] result = new int[this.columns][this.rows];

        for(int i = 0; i < this.columns; i++){
            for(int j = 0; j < this.rows; j++){
                result[i][j] = this.matrix[j][i];
            }
        }

        return result;
    }

    int[][] exponentiation(int degree){
        Matrix result_matrix = new Matrix(this.matrix);
        for(int i = 0; i < degree; i++){
            result_matrix.matrix = result_matrix.multiply_matrix(this.matrix);
        }
        return result_matrix.matrix;
    }
}