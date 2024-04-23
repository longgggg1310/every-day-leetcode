public class merge_sorted_array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            insert_into_array(i, nums1, m);
            m++;
        }
    }

    private static void insert_into_array(int x, int[] a, int m) {
        boolean found_value = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                found_value = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (found_value == false) {
            a[m] = x;

        }
    }

    public static void main(String[] args) {
        int[] n1 = { 2, 3, 4, 5, 0, 0, 0 };
        int[] n2 = { 0, 3, 6 };
        merge(n1, 4, n2, 3);

    }
}
