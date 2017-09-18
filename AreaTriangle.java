/* AreaTriangle.java
 * Names: Emily Van Laarhoven & Violet Kozloff
 * CS230, Assignment 1, Task 3
 * Due: Monday, 9/12/16 11:59pm
 */

import java.util.Scanner;

public class AreaTriangle{
  public static boolean checkTriangle (double side1, double side2, double side3){
    return (((side1+side2)>side3)&&((side2+side3)>side1)&&((side3+side1)>side2));
  }
  public static boolean checkIsosceles (double side1, double side2, double side3){
    return (side1==side2||side2==side3||side3==side1);
  }
  public static double computeArea (double side1, double side2, double side3){
    double s=(side1+side2+side3)/2;
    double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
  }
  public static void main(String [] args) {
    // Ask for the three sides of the triangle; store as variables side1, side2, side3
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the length of the first side of a triangle:");
    Double side1=scan.nextDouble(); 
    System.out.println("Please enter the length of the second side of a triangle:");
    Double side2=scan.nextDouble();
    System.out.println("Please enter the length of the third side of a triangle:");
    Double side3=scan.nextDouble();
    if (checkTriangle(side1,side2,side3)) { // verify that side lengths actually form a triangle, if not, skip to print "invalid input"
      if (checkIsosceles(side1,side2,side3)) { // print whether the triangle is isosceles
        System.out.println("Triangle is isosceles.");
      }else {
          System.out.println("Triangle is NOT isosceles.");
        }
      System.out.println("The area of the triangle is "+computeArea(side1,side2,side3)); // print the area of the triangle
    } else {
      System.out.println("Invalid input");
      }
    }
  }
