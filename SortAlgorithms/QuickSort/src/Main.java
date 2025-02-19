import java.util.Arrays;

public class Main {
    /*
        Characteristics of Quick Sort:
        1. Divide and conquer algorithm
        2. Recursive algorithm
        3. Uses a pivot element to partition the array into two parts
        4. Elements < pivot to its left, elements > pivot to its right
        5. Pivot will then be in its correct sorted position
        6. Process is now repeated for the left array and right array
        7. Eventually, every element has been the pivot, so every element will be in its correct sorted position
        8. As with Merge Sort, we'll end up partitioning the array into a series of 1-element arrays
        9. Does this in-place (unlike Merge Sort)
        10. In-place algorithm
        11. O(n*logn) time complexity - base 2. We're repeatedly partitioning the array into two halves
            -> Worst case, performance is a O(n^2) time complexity - quadratic
            -> Average case, performance is a O(n*logn) time complexity - base 2
        12. Unstable algorithm
    */

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    // Initial Implementation
//    public static int partition(int[] input, int start, int end) {
//        // This is using the first element as the pivot
//        int pivot = input[start];
//        int i = start;
//        int j = end;
//
//        while (i < j) {
//            System.out.println("j: " + j);
//            // NOTE: empty loop body
//            while (i < j && input[--j] >= pivot);
//            if (i < j) {
//                input[i] = input[j];
//            }
//
//            System.out.println("i: " + i);
//            // NOTE: empty loop body
//            while (i < j && input[++i] <= pivot);
//            if (i < j) {
//                input[j] = input[i];
//            }
//        }
//
//        input[j] = pivot;
//        System.out.println("i: " + i + ", j: " + j);
//        System.out.println(Arrays.toString(input));
//        return j;
//
////        input[i] = pivot;
////        System.out.println("i: " + i + ", j: " + j);
////        System.out.println(Arrays.toString(input));
////        return i;
//
////        Returning "i" or "j" will have no difference for this implementation
////        -> because "--j" or "++i" is in the "while" loop conditional check
////        -> the increment or decrement will not occur once i == j
////        -> i == j always true when exiting outer "while" loop
//    }

    // Alternate Implementation 1
//    public static int partition(int[] input, int start, int end) {
//        // This is using the first element as the pivot
//        int pivot = input[start];
//        int i = start;
//        int j = end;
//
//        while (i < j) {
//            System.out.println("j: " + j);
//            --j;
//            while (i < j && input[j] >= pivot) {
//                j--;
//            }
//            if (i < j) {
//                input[i] = input[j];
//            }
//
//            System.out.println("i: " + i);
//            ++i;
//            while (i < j && input[i] <= pivot) {
//                i++;
//            }
//            if (i < j) {
//                input[j] = input[i];
//            }
//        }
//
//        input[j] = pivot;
//        System.out.println("i: " + i + ", j: " + j);
//        System.out.println(Arrays.toString(input));
//        return j;
//
////        input[i] = pivot;
////        System.out.println("i: " + i + ", j: " + j);
////        System.out.println(Arrays.toString(input));
////        return i;
//
////        Returning "i" or "j" will have different results for this implementation
////        -> because the "--j" or "++i" is outside the "while" loop conditional check
////        -> the increment or decrement will always occur
////        -> i == j NOT always true when exiting outer "while" loop
////        -> always select the first incremented / decremented index to return i.e. "j" in this case
//    }

    // Alternate Implementation 2
    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end - 1;

        while (i < j) {
            System.out.println("j: " + j);
            while (i < j && input[j] >= pivot) {
                --j;
            }
            if (i < j) {
                input[i] = input[j];
            }

            System.out.println("i: " + i);
            while (i < j && input[i] <= pivot) {
                ++i;
            }
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        System.out.println("i: " + i + ", j: " + j);
        System.out.println(Arrays.toString(input));
        return j;

//        input[i] = pivot;
//        System.out.println("i: " + i + ", j: " + j);
//        System.out.println(Arrays.toString(input));
//        return i;

//        Returning "i" or "j" will have no difference for this implementation
//        -> because "--j" or "++i" is inside the "while" loop
//        -> the increment or decrement will not occur once i == j
//        -> i == j always true when exiting outer "while" loop
//        Note:
//        - This implementation will still check for the elements in the replaced position
//        - However, it should not have any impact because the replaced position would have already been checked for
//          greater / lesser than the pivot element value
//        - e.g.
//          For the first iteration,
//          after -22 has been placed in index 0, -22 will be checked again
//          after  35 has been placed in index 6,  35 will be checked again
    }
}