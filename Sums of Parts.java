public class SumParts {
    public static int[] sumParts(int[] arr) {
        int n = arr.length;
        int[] result = new int[n + 1];
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Calculate the sums of parts
        for (int i = 0; i < n; i++) {
            result[i] = totalSum;
            totalSum -= arr[i];
        }

        result[n] = 0; // Last element is always 0

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sums = sumParts(arr);

        System.out.println("Sums of Parts:");
        for (int sum : sums) {
            System.out.println(sum);
        }
    }
}