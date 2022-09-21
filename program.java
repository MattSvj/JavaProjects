public class program {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int sum = 0, sum2 = 0;
        for (int i = 0; i < 6; i++) {
            sum += arr[i];
        }
        for (int j = 0; j < 6; j++) {
            if (sum - arr[j] == sum2) {
                System.out.println(j);
                System.out.println(arr[j]);
                break;
            }
            else {
                sum2 += arr[j];
                sum -= arr[j];
            }
        }
    }
    
}