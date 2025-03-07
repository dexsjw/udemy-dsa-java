public class Main {
    /*
        Characteristics of Radix Sort:
        1. Makes assumptions about the data
        2. Data must have same radix and width
           Radix - the number of unique digits or values in the case of characters that a numbering system or alphabet has
           E.g.
           - Radix for decimal system = 10 -> 10 possible digits in the decimal system, 0-9
           - Radix for binary numbers = 2 -> 2 digits in the binary system, 0 and 1
           - Radix for English alphabet = 26 -> 26 letters in the alphabet
           Width - the number of digits and letters
           E.g.
           - 1235 -> width = 4
           - hello -> width = 5
           - 10 -> width = 2
        3. Because of this, data must be integers or strings
        4. Sort based on each individual digit or letter position
        5. Start at the rightmost position
        6. Must use a stable sort algorithm at each stage

        6. Counting sort is often used as the sort algorithm for radix sort - must be stable counting sort
        7. O(n) time complexity - can achieve this because we're making assumptions about the data we're sorting
        8. Even so, it often runs slower than O(n*logn) algorithms because of the overhead involved
        9. In-place depends on which sort algorithm you use
        10. Stable algorithm - key to making Radix Sort work
    */

    /*
        Characteristics of STABLE Counting Sort:
        1. Requires extra steps
        2. Can calculate where values should be written back to the original array
        3. Writing the values into the array in backwards order ensures stability
        4. This works because we traverse the input array from right to left, and we write duplicate values into the
           temp array from right to left
        5. If we know that duplicate values will go into positions 3 and 4, we write the rightmost value in the
           input array into position 4, and the leftmost value into position 3
        6. This preserves the relative positioning of duplicate values
        7. By adjusting the counting array after the initial pass, we can map values to indices in the temp array
        8. Can also use linked lists to make counting sort stable
    */

    public static void main(String[] args) {

    }
}