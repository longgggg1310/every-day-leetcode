public class merge_sorted_array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
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
                    a[i + i] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (found_value == false) {
            a[m] = x;
        }
    }
}
