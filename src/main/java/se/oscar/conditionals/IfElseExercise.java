package se.oscar.conditionals;
import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner ageInt = new Scanner(System.in);
        int age = ageInt.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig");
        }
        else {
            System.out.println("Du är inte myndig");
        }
    }
}
