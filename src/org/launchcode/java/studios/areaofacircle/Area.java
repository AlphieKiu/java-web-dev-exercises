package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of circle: ");
        double radius = input.nextInt();
        double pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("Area of circle of radius " + radius + " is: " + area);
    }
}
