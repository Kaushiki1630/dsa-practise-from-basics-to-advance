// Brute force

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + ", " + j);
                    return;
                }
            }
        }
    }
}


// OPTIMIZED SOLUTION USING HASHMAP

// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         HashMap<Integer, Integer> map= new HashMap<>();
//         for(int i=0; i<nums.length; i++){
//             int compliment = target - nums[i];
//             if(map.containsKey(compliment)){
//                 return new int[]{map.get(compliment), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }