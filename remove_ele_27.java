public class remove_ele_27 {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            if (nums[i] == val) {
                for (int j = i; j < (n - 1); j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;

    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 2, 3 };
        System.out.println(removeElement(a, 3));
    }

}
