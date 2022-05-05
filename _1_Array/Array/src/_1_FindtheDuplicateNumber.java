import java.util.HashMap;

public class _1_FindtheDuplicateNumber {

//     Using HashMap Technique
//          Time Complexity:-O(n)
//          Space Complexity:-O(n)

    class Solution {
        public int findDuplicate(int[] nums) {

            HashMap<Integer,Integer> has=new HashMap<>();

            for(int i=0;i<nums.length;i++){

                if(has.containsKey(nums[i]))return nums[i];
                else has.put(nums[i],i);

            }



            return -1;
        }
    }






//    Using Cyclic Sort

//          Time Complexity:- O(n)
//          Space Complexity:- O(1)


    class Solution2 {
        public int findDuplicate(int[] nums) {

            HashMap<Integer,Integer> has=new HashMap<>();

            for(int i=0;i<nums.length;i++){

                if(has.containsKey(nums[i]))return nums[i];
                else has.put(nums[i],i);

            }



            return -1;
        }
    }










}
