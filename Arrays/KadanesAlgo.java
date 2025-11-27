// BRUTE FORCE FOR THE KADANE'S ALGORITHM  : O{N^3} but a slight optimised version will be having a complexity of O(n^2)

// public class KadanesAlgo{
//     public static void main(String[] args){
//         int[] nums = {0,-1,2,3,-4,5};

//         int n= nums.length;
//         int maxSum = Integer.MIN_VALUE;

//         for(int start=0; start< n; start++){
//             int sum =0;
//             for(int end = start; end<n; end++){
//                 sum +=nums[end];

//                 if(sum> maxSum){
//                     maxSum=sum;
//                 }
//             }
//         }

//         System.out.println(maxSum);
//     }
// }


// OPTIMISED MAXIMUM SUBARRAY SUM : O(N)


public class KadanesAlgo{
    public static void main(String[] args){
        int[] nums = {3,-4,5,4,-1,7,-8};

        int n= nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i< n; i++){
            currSum+=nums[i];

            maxSum=Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum=0;
            }
        }

        System.out.println(maxSum);
    }
}
