package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        Integer miles = input.nextInt();
        System.out.println("Gallons of gas consumed: ");
        Integer gallons = input.nextInt();
        Integer milesPerGallon = miles/gallons;
        System.out.println("Miles per gallon: "+ milesPerGallon);
    }
}
