public class ReferenceByValue {
    static void modify(int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i]++;

        a = new int[a.length];  // has no effect on variable x in main

        for (int i = 0; i < a.length; i++)
            a[i] = -1;  // this array is different from the one x references
    }

    static void printArray(String message, int[] a) {
        System.out.printf("%s: ", message);
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int[] x = new int[5];

        printArray("x new", x);
        for (int i = 0; i < x.length; i++)
            x[i] = i;
        printArray("x initialized", x);

        modify(x);

        printArray("x modified", x);
    }

}
