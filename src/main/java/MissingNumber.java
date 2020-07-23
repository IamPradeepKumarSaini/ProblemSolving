public class MissingNumber {
    public static void main (String args[]){

        int arr[] = { 1, 2, 4, 5, 6 };
        int arr_length = arr.length;
        System.out.println(arr_length);
        int missing = getMissedNumber(arr, arr_length);
        System.out.println("Missing number is"+missing);

    }

    private static int getMissedNumber(int[] arr, int arr_length) {
        int i;
        int total;
        total= ((arr_length+1)*(arr_length+2))/2; // formula is n*(n+1)/2
        System.out.println(total);
        for(i=0;i<arr_length;i++)
            total = total - arr[i];
        return total;
    }
}
