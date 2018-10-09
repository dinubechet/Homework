import java.util.ArrayList;
import java.util.*;

public class MeanMedian {
    ArrayList<Integer> myNumbers = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    ListIterator<Integer> iterator = myNumbers.listIterator();

    public void takingTheNumbers() {
        int counter = 0;
        int sum = 0;
        double mean;
        double median = 0.00;

        for (counter = 0; counter < 5; counter++) {
            System.out.println("please add a number : ");
            myNumbers.add(scan.nextInt());
            System.out.println(myNumbers.toString());
            sum += myNumbers.get(counter);
        }

        /*do {
            System.out.println("please add a number : ");
            myNumbers.add(scan.nextInt());
            System.out.println(myNumbers.toString());
            counter++;
            if (myNumbers.add(-1)) {
                break;
            }
        }
        while (iterator.hasNext());*/
        getMedianAndMean(sum);
    }

    private void getMedianAndMean(int sum) {
        double mean;
        double median;
        Collections.sort(myNumbers);

        mean = (sum / myNumbers.size());
        System.out.println("The mean is : " + mean);
        if (myNumbers.get((myNumbers.size() / 2)) == 0) {
            median = myNumbers.get((myNumbers.size() / 2) + myNumbers.get((myNumbers.size() / 2) - 1) / 2);
        } else
            median = myNumbers.get((myNumbers.size() / 2));

        System.out.println("Median is : " + median);

    }
}
