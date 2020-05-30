public class PrimeNumbers {
    public static void main (String[] args){

        int maxCheck = 31; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;
        int i;
        String primenumebersfound = "";
        for(i=2;i<=maxCheck;i++){
            isPrime = checkPrimeNumbers(i);
            if(isPrime){
                primenumebersfound = primenumebersfound + i + " ";
            }
        }
        System.out.println(primenumebersfound);

    }

    private static boolean checkPrimeNumbers(int number) {
        int remiander;
        for(int i=2; i<=number/2;i++){
            remiander = number % i;
            if(remiander==0) {
                return false;
            }
        }
        return true;
    }

}
