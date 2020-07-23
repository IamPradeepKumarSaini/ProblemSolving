import java.util.HashMap;
import java.util.Map;
public class TwoSum {

    public static void main(String[] args){
        int arr[] = {2, 7, 11, 15};
        int target =9;
        int[] result= twoSum(arr,target);
        String indices="";
        for(int i=0;i<result.length;i++){
            indices += String.valueOf(result[i])+" ,";
        }
        System.out.println("Indices are:-"+indices);
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for(int i = 0; i < nums.length; i++)
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
                return new int[] {i, map.get(target - nums[i])};

        return new int[2];
    }

}
