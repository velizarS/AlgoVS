package algo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Velizar
 */
public class Algo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("enter first array   = ");
        int firstArraySize = scan.nextInt();
        int[] firstArray = new int[firstArraySize];
        for (int i = 0; i < firstArraySize; i++) {
            System.out.println("enter a value");
            firstArray[i] = scan.nextInt();
            System.out.println();

        }
        System.out.println("enter second array size = ");
        int secondArraySize = scan.nextInt();
        int[] secondArray = new int[secondArraySize];
        for (int i = 0; i < secondArraySize; i++) {
            System.out.println("enter a value");
            secondArray[i] = scan.nextInt();
            System.out.println();

        }
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    arr.add(firstArray[i]);
                }

            }

        }
        if (arr.isEmpty()) {
            System.out.println(-1);

        } else {
            System.out.println(arr.toString());
        }

    }

}
