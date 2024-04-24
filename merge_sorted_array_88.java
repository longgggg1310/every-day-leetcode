public class merge_sorted_array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index of last element in nums1
        int j = n - 1; // Index of last element in nums2
        int k = (m + n) - 1; // Index of last position in nums1
        while (k >= 0) {
            if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] n1 = { 1, 2, 3, 0, 0, 0 };
        int[] n2 = { 2, 3, 6 };
        merge(n1, 3, n2, 3);
        System.out.print("1`23");

    }
}
