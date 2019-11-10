package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Width of rectangle: ");
        Integer width = input.nextInt();
        System.out.println("Length of rectangle: ");
        Integer length = input.nextInt();
        Integer area = width*length;
        System.out.println("Area of rectangle: "+ area);
    }
}
