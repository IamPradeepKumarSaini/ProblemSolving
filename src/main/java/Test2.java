class Test {

    public static void main (String args[]){

        int starray [] = {10,20,23,7,9,56,90,100,23,456};
        System.out.println("Largest Number is "+getLargestNumber(starray));

    }

    private static int getLargestNumber(int[] starray) {
        int firstLargest = 0,secondLargest = 0;
        for (int i=0; i<starray.length;i++)
            if(starray[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = starray[i];
            } else if (starray[i] > secondLargest && starray[i]!=firstLargest){
                secondLargest = starray[i];
            }
        return secondLargest;
    }

}