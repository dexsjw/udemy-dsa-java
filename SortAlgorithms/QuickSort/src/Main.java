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

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}