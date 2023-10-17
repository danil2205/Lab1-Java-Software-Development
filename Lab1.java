package com.oop.lab1;

import java.util.Scanner;

/*

1131 - zalikova
1131 % 2 = 1 => O1 = -
1131 % 3 = 0 => C = 0
1131 % 5 = 1 => O2 = /
1131 % 7 = 4 => char i, char j

 */

public class Lab1 {
  public static void main(String[] args) {
    double sum = 0.0;
    final double C = 0.0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the value of a: ");
      int a = scanner.nextInt();

      System.out.print("Enter the value of n: ");
      int n = scanner.nextInt();

      System.out.print("Enter the value of b: ");
      int b = scanner.nextInt();

      System.out.print("Enter the value of m: ");
      int m = scanner.nextInt();

      if (a <= 2) {
        throw new IllegalArgumentException("Invalid input: a must be greater than 2.");
      }

      if (b <= 0) {
        throw new IllegalArgumentException("Invalid input: b must be positive.");
      }

      if (a > n || b > m) {
        throw new IllegalArgumentException("Invalid input: upper limit must be greater than lower.");
      }

      for (char i = (char) a; i <= n; i++) {
        double innerSum = 0.0;
        for (char j = (char) b; j <= m; j++) {
          innerSum += ((double) i / j) / (i - C);
        }
        sum += innerSum;
      }
      System.out.println("Result: " + sum);

    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
