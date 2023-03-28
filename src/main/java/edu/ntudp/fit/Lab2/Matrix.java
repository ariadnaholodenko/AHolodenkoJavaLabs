package edu.ntudp.fit.Lab2;

import java.util.Scanner;

public class Matrix {

    private static final int MIN_RANDOM_VALUE = -10;
    private static final int MAX_RANDOM_VALUE = 10;

    public static void main(String[] args) {
        int width, height;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width of matrix: ");
        width = scanner.nextInt();

        System.out.println("Enter height of matrix: ");
        height = scanner.nextInt();

        if (width <= 0 || width > 20 || height <= 0 || height > 20) {
            System.out.println("Wrong matrix size");
            return;
        }

        System.out.println("Would you like to create matrix manually or randomly? (m/r)");
        if (scanner.next().equals("m")) {
            matrix = createMatrixManually(width, height);
        } else {
            matrix = createMatrixRandomly(width, height);
        }

        showMatrix(matrix);

        int minValue = getMinValue(matrix);
        int maxValue = getMaxValue(matrix);
        double averageArithmeticValue = getAverageArithmeticValue(matrix);
        double averageGeometricValue = getAverageGeometricValue(matrix);

        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Average arithmetic value: " + averageArithmeticValue);
        System.out.println("Average geometric value: " + averageGeometricValue);
    }

    private static int[][] createMatrixManually(int width, int height) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[width][height];

        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        int[][] matrix = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = generateRandomValue();
            }
        }

        return matrix;
    }

    private static int generateRandomValue() {
        return (int) (Math.random() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1)) + MIN_RANDOM_VALUE;
    }

    private static void showMatrix(int[][] matrix) {
        int width = matrix.length;
        int height = matrix[0].length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getMinValue(int[][] matrix) {
        int minValue = matrix[0][0];
        int width = matrix.length;
        int height = matrix[0].length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }

        return minValue;
    }

    private static int getMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        int width = matrix.length;
        int height = matrix[0].length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }

        return maxValue;
    }

    private static double getAverageArithmeticValue(int[][] matrix) {
        double averageArithmeticValue = 0;
        int width = matrix.length;
        int height = matrix[0].length;
        int elementsCount = 0;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                averageArithmeticValue += matrix[i][j];
                elementsCount++;
            }
        }
        averageArithmeticValue /= elementsCount;

        return averageArithmeticValue;
    }

    private static double getAverageGeometricValue(int[][] matrix) {
        double averageGeometricValue = 1;
        int width = matrix.length;
        int height = matrix[0].length;
        int elementsCount = 0;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                averageGeometricValue *= matrix[i][j];
                elementsCount++;
            }
        }
        averageGeometricValue = Math.pow(averageGeometricValue, 1.0 / elementsCount);

        return averageGeometricValue;
    }
}
