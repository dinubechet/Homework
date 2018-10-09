import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class DuplicateElimination {
    private int[] inputNumbers = new int[5];

    public void input() {
        Scanner scan = new Scanner(System.in);
        int[] finalArray;

        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            boolean contains = false;
            for (int num : inputNumbers) {
                if (num == number) {
                    contains = true;
                    break;
                }
            }
            if (contains == false) {
                inputNumbers[i] = number;
            }

        }

        System.out.println(Arrays.toString(inputNumbers));
    }


    public void checkDupe() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            if (!numbers.contains(number)){
                numbers.add(number);
            }
        }
        System.out.println(numbers.toString());
    }
}