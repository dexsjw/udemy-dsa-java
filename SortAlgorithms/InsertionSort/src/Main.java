public class Main {
    /*
        Characteristics of Insertion Sort
        1. In-place algorithm
        2. O(n^2) time complexity - quadratic
        3. Stable algorithm
    */
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}