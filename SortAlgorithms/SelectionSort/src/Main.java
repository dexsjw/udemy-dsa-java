public class Main {
    /*
        Characteristics of Selection Sort:
        1. In-place algorithm
        2. O(n^2) time complexity - quadratic
        3. Doesn't require as much swapping as Bubble Sort
        4. Unstable algorithm
    */

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int indexOfLargest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                }
            }

            swap(intArray, indexOfLargest, lastUnsortedIndex);
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}