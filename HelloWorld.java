package Lesson_3_work_on_mistakes;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] Args) {


        int arr[] = {12, 12, 7, 55, 12, 8, 12, 8, 32, 55};
        int[] arrayOfRepeats = new int[10];

        int counts = 1;
        int digit = 0;
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++) {
            if (arr[i] != digit) {
                for (int j = i + 1; j < 10; j++) {
                    if (arr[i] == arr[j]) {
                        counts++;
                        digit = arr[i];
                    }
                }
                if (counts != 1) {
                    System.out.println("[" + digit + "]" + " repeats " + counts + " times");
                }
            }
            counts = 1;

        }
    }
}






