public class Main {
    /*
        Characteristics of Merge Sort:
        1. Divide and conquer algorithm
        2. Recursive algorithm
        3. Two phases: Splitting and Merging
        4. Splitting phase leads to faster sorting during the Merging phase
        5. Splitting is logical. We don't create new arrays
        6. O(n^2) time complexity - quadratic?
        7. Stable algorithm?

        Notes:
        1. Splitting Phase
            - Start with an unsorted array
            - Divide the array into two arrays, which are unsorted.
              The first array is the left array, and the second array is the right array.
            - Split the left and right arrays into two arrays each
            - Keep splitting until all the arrays have only one element each - these arrays are sort
            - In-place

        2. Merging Phase
            - Merge every left-right pair of sibling arrays into a sorted array
            - After the first merge, we'll have a bunch of 2-element sorted arrays
            - Then merge those sorted arrays (left-right siblings) to end up with a bunch of 4-element sorted arrays
            - Repeat until you have a single sorted array
            - Not in-place, uses temporary arrays
    */

    public static void main(String[] args) {

    }
}