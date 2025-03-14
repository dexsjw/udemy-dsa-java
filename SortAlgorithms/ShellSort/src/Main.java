public class Main {
    /*
        Characteristics of Shell Sort:
        1. In-place algorithm
        2. Difficult to nail down the time complexity because it will depend on the gap.
           Worst case: O(n^2),
           but it can perform much better than that
        3. Doesn't require as much shifting as Insertion Sort, so it usually performs better
        4. Unstable algorithm
        5. Can be used to improve Bubble Sort

        Notes:
        - Variation of Insertion Sort
        - Insertion Sort chooses which element to insert using a gap of 1
        - Shell Sort starts out using a larger gap value
        - As the algorithm runs, the gap is reduced
        - Goal is to reduce the amount of shifting required
        - As the algorithm progresses, the gap is reduced
        - The last gap value is always 1
        - A gap value of 1 is equivalent to Insertion Sort
        - So, the algorithm does some preliminary work (using gap values greater than 1), and then becomes Insertion Sort
        - By the time we get to Insertion Sort, the array has been partially sorted, so there's less shifting required
        - Knuth Sequence is one of the more common sequence used to calculate the gap value
            k   |   Gap (interval)
            1   |   1
            2   |   4
            3   |   13
            4   |   40
            5   |   121
            > Gap is calculated using (3^k - 1) / 2
            > We set k based on the length of the array
            > We want the gap to be as close as possible to the length of the array we want to sort,
              without being greater than the length

        - For the below example, we'll be using another common way to calculate the gap / interval
        - We'll base our gap on the array's length. We'll initialise the gap (or interval) to array.length / 2
        - On each iteration, we'll divide the gap value by 2 to get the next gap value
        - For our array, the gap will be initialised to 3
        - On the next iteration, it will be 1 - i.e. Insertion Sort
    */

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            // "i" is used to indicate the starting index for comparison with index 0
            // e.g. comparing elements at position 3 and 0, then incrementing "i" by 1
            // and comparing elements at position 4 and 1, 5 and 2 etc
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                // using another variable "j" so that it will not affect the count of "i"
                // "j" is used to track if there are any more elements at gap distance away
                // e.g. { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } with gap = 3
                // starting at index j = 9,
                // 1. compare 9 and 6
                // 2. compare 6 and 3
                // 3. compare 3 and 0
                // 4. next iteration after i++, j = 10
                // Also, if "intArray[j - gap] > newElement == false" it means that elements to the left are smaller than newElement
                // and no point in checking further
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }

        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}