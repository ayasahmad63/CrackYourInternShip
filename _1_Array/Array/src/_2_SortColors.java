public class _2_SortColors {

//    First Optimized one pass Solution
//    We Use three pointer 1)Smaller pointer 2) Traversal Pointer 3) Larger Pointer
//    In this we Use three case :-
//         Case 1:-arr[i]==0 then swap(i,j) ,i++,j++
//         Case 2:-arr[i]==1 then i++
//         Case 3:-arr[i]==2 then swap(i,k) ,k--


//    Youtube link:-https://www.youtube.com/watch?v=MbV26HWqxrs

    class Solution {
        public void sortColors(int[] nums) {


            int i=0,j=0;
            int k=nums.length-1;

            while(i<=k){

                if(nums[i]==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                    i++;
                    j++;
                }
                else if(nums[i]==2)
                {
                    int temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;


                    k--;
                }else{
                    i++;
                }




            }




        }
    }







//     Non Optimizes Solution
//    Two way traversal approach

    class Solution2 {
        public void sortColors(int[] nums) {
            int zero=0,one=0,two=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){zero++;
                }else if(nums[i]==1){

                    one++;
                }else {two ++;
                }
            }

            for(int i=0;i<nums.length;i++){
                if(zero>0) {
                    nums[i]=0;
                    zero--;
                }
                else if(one>0){
                    nums[i]=1;
                    one--;
                }else{
                    nums[i]=2;
                }

            }
        }
    }



}
