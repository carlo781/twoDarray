/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodarray;

/**
 *
 * @author PC3
 */
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Create a 2D array based on the input dimensions
        int[][] table = new int[rows][cols];
        
        // Populate the 2D array with i * j (row index * column index)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                table[i][j] = i * j;
            }
        }
        
        // Print the 2D array (multiplication table)
        System.out.println("Multiplication Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
