public class LargestNumber {
    // Function to print the largest possible number with digit sum 's'
    // and 'm' number of digits
    static void findLargest(int digits, int sum) {
        // If sum of digits is 0, then a number is possible
        // only if number of digits is 1
        if (sum == 0) {
            System.out.print(digits == 1 ? "Largest number is 0" : "Not possible");
            return ;
        }

        // Sum greater than the maximum possible sum
        if (sum > 9*digits) {
            System.out.println("Not possible");
            return ;
        }

        // Create an array to store digits of result
        int[] res = new int[digits];

        // Fill from most significant digit to least
        // significant digit
        for (int i=0; i<digits; i++) {
            // Fill 9 first to make the number largest
            if (sum >= 9) {
                res[i] = 9;
                sum -= 9;
            } else {
                res[i] = sum;
                sum = 0;
            }
        }

        System.out.print("Largest number is ");
        for (int i=0; i<digits; i++)
            System.out.print(res[i]);
    }

    // driver program
    public static void main (String[] args) {
        int sum = 24, digits = 3;
        findLargest(digits, sum);
    }
}
