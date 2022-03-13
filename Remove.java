
import java.util.Scanner;

/**
 * @author Yongru Pan
 * An element removal class for a Singly Linked List and an integer k
 *
 */

public class Remove {

    public static SLinkedList Remove_k(SLinkedList linkedLs, int k) {
        //make sure k is within the range of the singly linked list
        if (k < linkedLs.size()) {
            /*
            linkedLs.size() is a method in the SLinkedList
            class that returns the size of the list
             */
            int index = linkedLs.size() - k;
            /*linkedLs.remove(int i) is a method in the SLinkedList
            class that remove an element at index i in 0 to the list size*/
            linkedLs.remove(index);
            /*
            linkedLs.display() is a method in the SLinkedList class that
            iterate over all nodes in the list and print them out
             */
            return linkedLs.display();
        } else {
            return null;
                }
    }

    public static void main(String[] args) {
        //input integer k
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int k = sc.nextInt();

        //input the SinglyLinkedList
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your SinglyLinkedList and stop by entering any non-integer: ");
        SLinkedList linkedLs = new SLinkedList();
        while (scanner.hasNextInt()) {
            linkedLs.addLast(scanner.nextInt());
        }
        //the above code are input handling. If they are not needed
        //they can be ignored

        System.out.println(Remove_k(linkedLs, k));

    }
}
