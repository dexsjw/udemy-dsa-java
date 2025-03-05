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

        6. NOT an in-place algorithm
        7. O(n) time complexity - can achieve this because we're making assumptions about the data we're sorting
        8. If we want the sort to be stable, we have to do some extra steps
        9. Length of counting array depends on range of values we have in input array
        10. Best used when range of values in input array is around same length as input array
    */

    public static void main(String[] args) {

    }
}