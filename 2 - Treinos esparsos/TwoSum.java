import java.util.HashMap;
import java.util.Map;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
    
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++){
           map.put(nums[i], i);
        }
        for (int i=0; i < nums.length; i++){
            int complemento= target - nums[i];
            if(map.containsKey(complemento) && map.get(complemento)!=i){
                return new int[]{i, map.get(complemento)};
            }
        }
        return null;
    }
}