public class Main {
    public static void main(String[] args) {
        int result = fibSeq(8);
        System.out.println(result);
    }

    private static int fibSeq(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        int[] fibSeqArr = new int[n];

        fibSeqArr[0] = 0;
        fibSeqArr[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeqArr[i] = fibSeqArr[i - 1] + fibSeqArr[i - 2];
        }

        for (int j : fibSeqArr) {
            System.out.println(j);
        }

        return fibSeqArr[n - 1];
    }
}