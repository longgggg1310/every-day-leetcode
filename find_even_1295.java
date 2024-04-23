public class find_even_1295 {
    public static int find_even_1295(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int total_numer = find_total_number(nums[i]);
            if (total_numer % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int find_total_number(int a) {
        int count = 0;
        int result = a;
        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(find_even_1295(nums));
    }

}
