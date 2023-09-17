public class MissingNumber {

    public static int findMissingNumber(int max_num, int[] numbers) {
        int sum1 = max_num * (max_num + 1) / 2;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum1 - sum;
    }



    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int max_num = 10;

        int result = findMissingNumber(max_num, numbers);
        System.out.println(result);
    }
}
