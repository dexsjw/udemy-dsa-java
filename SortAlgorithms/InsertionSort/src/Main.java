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
//            System.out.println("newElement: " + newElement);

            // Initial Solution:
//            int i;
//            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
//                intArray[i] = intArray[i - 1];
//            }
//            System.out.println("i: " + i);
//            intArray[i] = newElement;

            // Alternate Solution:
//            System.out.println("firstUnsortedIndex: " + firstUnsortedIndex);
            for (int i = firstUnsortedIndex; i > 0; i--) {
//                System.out.println("i: " + i);
//                System.out.println("Start: Current Array State:");
//                for (int j : intArray) {
//                    System.out.println(j);
//                }

                if (intArray[i - 1] > newElement) {
                    intArray[i] = intArray[i - 1];
                    // Need to handle the case where newElement needs to be inserted in index == 0
                    // Because the condition for "for" loop is "i > 0", thus "i" will never be 0
                    if (i - 1 == 0) {
                        intArray[i - 1] = newElement;
                    }
                } else {
                    intArray[i] = newElement;
                    break;
                }

//                System.out.println("End: Current Array State:");
//                for (int j : intArray) {
//                    System.out.println(j);
//                }
            }
        }

//        System.out.println("~~~ End ~~~");
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}