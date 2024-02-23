/*
Name: Dinh Thanh Cong Nguyen
Date: January 31, 2024
Descrition: This program will generate Username.
*/

import java.util.Scanner;

public class UserName {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Please enter your full name: ");
    String name = scan.nextLine();

    // Lowercase, remove space, remove capital letters
    String lowercase_name = name.toLowerCase();
    // Get the first letter of the first name
    String first_initial = lowercase_name.substring(0, 1);

    // Delete letters from beginning to the first space
    int first_space_index = lowercase_name.indexOf(" ");
    String name_without_first_initial = lowercase_name.substring(first_space_index + 1);

    String result_name = name_without_first_initial.replace(" ", "");
    // Generate randome 2 digits number
    int random = (int) (Math.random() * 99) + 1;
    System.out.printf("Your username is: %s%s%d", first_initial, result_name, random);

    scan.close();
  }
}