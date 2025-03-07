public class Main {
    /*
        Characteristics of Counting Sort:
        1. Makes assumptions about the data
        2. Don't use comparisons
        3. Counts the number of occurrences of each value
        4. Only works with non-negative discrete values (can't work with floats, strings etc)
        5. Values must be within a specific range

        6. NOT an in-place algorithm
        7. O(n) time complexity - can achieve this because we're making assumptions about the data we're sorting
        8. If we want the sort to be stable, we have to do some extra steps
        9. Length of counting array depends on range of values we have in input array
        10. Best used when range of values in input array is around same length as input array
        11. Unstable algorithm
    */

    /*
        Characteristics of STABLE Counting Sort:
        1. Requires extra steps
        2. Can calculate where values should be written back to the original array
        3. Writing the values into the array in backwards order ensures stability

        4. Only works with non-negative discrete values (can't work with floats, strings etc)
        5. Values must be within a specific range

        6. NOT an in-place algorithm
        7. O(n) time complexity - can achieve this because we're making assumptions about the data we're sorting
        8. If we want the sort to be stable, we have to do some extra steps
        9. Length of counting array depends on range of values we have in input array
        10. Best used when range of values in input array is around same length as input array
    */

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSort(intArray, 1, 10);

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        // count the number of times a value appear in input array
        // sum of counts = length of input array
        for (int i = 0; i < input.length; i++) {
            // input[i] - min
            // -> to find out the index in counting array for the element at position "i" in input array
            countArray[input[i] - min]++;
        }

        int j = 0;
        // for the values from the range (e.g. 1 to 10, 10 to 20)
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                // j++
                // -> assumes that we know for sure that we will not exceed the length of input array
                // -> i.e. total sum of counts in counting array = length of input array
                // -> i.e. { 0, 2, 1, 1, 1, 0, 1, 2, 1, 1 } = intArray.length = 10
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}