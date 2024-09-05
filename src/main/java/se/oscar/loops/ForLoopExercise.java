package se.oscar.loops;

public class ForLoopExercise {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
