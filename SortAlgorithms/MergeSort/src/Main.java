public class Main {
    /*
        Characteristics of Merge Sort:
        1. Divide and conquer algorithm
        2. Recursive algorithm
        3. Two phases: Splitting and Merging
        4. Splitting phase leads to faster sorting during the Merging phase
        5. Splitting is logical. We don't create new arrays
        6. NOT an in-place algorithm
        7. O(n*logn) time complexity - base 2. We're repeatedly dividing the array in half during the splitting phase
        8. Stable algorithm

        Notes:
        1. Splitting Phase
            - Start with an unsorted array
            - Divide the array into two arrays, which are unsorted.
              The first array is the left array, and the second array is the right array.
            - Split the left and right arrays into two arrays each
            - Keep splitting until all the arrays have only one element each - these arrays are sorted
            - In-place

        2. Merging Phase
            - Merge every left-right pair of sibling arrays into a sorted array
            - After the first merge, we'll have a bunch of 2-element sorted arrays
            - Then merge those sorted arrays (left-right siblings) to end up with a bunch of 4-element sorted arrays
            - Repeat until you have a single sorted array
            - Not in-place, uses temporary arrays
    */

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        // Break condition
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        // 1. First optimisation
        // (Largest of left partition) is already smaller than (smallest of right partition) -> no action required
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            // less than and EQUAL -> allows for Merge Sort to be a stable algorithm
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // 2. Second optimisation
        // Only need to copy if there are leftover elements in left partition
        // If it's right partition, the remaining elements are already in their correct position -> no action required
        // i.e. finish traversing left partition -> mid - i = 0, this line of code will do nothing
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // copy temp array into input array
        System.arraycopy(temp, 0, input, start, tempIndex);

        // Cannot change the order of line 73 and line 76
        // line 76 would have caused the element at position "i" to change
    }
}