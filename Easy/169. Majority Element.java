import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {

    public static int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=1;

        for (int i = 1; i < nums.length; i++) {

            if(count==0){
                candidate=nums[i];
                count=1;
            } else if (candidate==nums[i]) {
                count++;
            }else{
                count--;
            }
        }
        return candidate;   
    }
//    public static int majorityElement(int[] nums) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int n=nums.length;
//        for (int i = 0; i < n; i++) {
//            int number=nums[i];
//            if (map.containsKey(number)){
//                map.put(number,map.get(number)+1);
//            }else {
//                map.put(number,1);
//            }
//        }
//        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//
//    }



    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

}
