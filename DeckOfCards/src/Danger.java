public class Danger {
    static void modify(int[] a) {
        a[0] = -1; // modifies object referenced by x
    }

    public static void main(String[] args) {
        int[] x = { 42 };

        System.out.println(x[0]);

        modify(x);

        System.out.println(x[0]);
    }
}
