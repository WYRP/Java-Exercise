import java.util.ArrayList;
import java.util.Scanner;

/**
This class is created to find the integers that are larger than all the integers to their right.
for example: 
input: 1 4 3 5 6 3
output: 3 6 (order does not matter)
 */

public class LineUp {

    public static ArrayList<Integer> FindWit(ArrayList<Integer> lineUp) {
        ArrayList<Integer> witness = new ArrayList<>();
        System.out.println(lineUp);
        Integer r_most = lineUp.get(lineUp.size() - 1);
        witness.add(r_most);
        //add the first object in the line to witness
        Integer tmp_max = r_most;
        //set a temporally maximum for reference

        for (int i = lineUp.size() - 1; i >= 0; i--) {
            if (lineUp.get(i) > tmp_max) {
                //if lineUp.get(i) is larger than any previous integer
                // it must be a witness
                tmp_max = lineUp.get(i);
                witness.add(lineUp.get(i));
            }
        }
        return witness;
    }

    public static void main(String[] args) {
        System.out.println("Please enter integers and separate each number by space, enter any non-integer to stop:");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lineUp = new ArrayList<>();
        while (sc.hasNextInt()) {
            lineUp.add(sc.nextInt());
        }
        System.out.println(FindWit(lineUp));

    }
}
