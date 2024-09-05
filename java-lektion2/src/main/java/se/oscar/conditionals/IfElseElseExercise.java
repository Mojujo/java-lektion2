package se.oscar.conditionals;
import java.util.Scanner;

public class IfElseElseExercise {
    public static void main(String[] args) {
        Scanner scoreInt  = new Scanner(System.in);
        int score = scoreInt.nextInt();

        if (score >= 90) {
            System.out.println("Du fick betyget A");
        } else if (score >= 80) {
            System.out.println("Du fick betyget B");
        } else if (score >= 70) {
            System.out.println("Du fick betyget C");
        } else {
            System.out.println("Du fick betyget F");
        }
    }
}
