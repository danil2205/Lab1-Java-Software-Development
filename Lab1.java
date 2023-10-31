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

      if (n >= 65535 || m >= 65535) {
        throw new IllegalArgumentException("Invalid input: upper limits must be positive and be less than 65535.");
      }

      if (a <= 0 || a >= 65535) {
        throw new IllegalArgumentException("Invalid input: a must be positive and be less than 65535.");
      }

      if (b <= 0 || b >= 65535) {
        throw new IllegalArgumentException("Invalid input: b must be positive and be less than 65535.");
      }

      if (a > n || b > m) {
        throw new IllegalArgumentException("Invalid input: upper limit must be greater than lower.");
      }

      for (char i = (char) a; i <= n; i++) {
        for (char j = (char) b; j <= m; j++) {
          sum += ((double) i / j) / (i - C);
        }
      }
      System.out.println("Result: " + sum);

    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
