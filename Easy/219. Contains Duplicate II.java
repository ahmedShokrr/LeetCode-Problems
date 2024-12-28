import java.util.;

class Solution {
    public static void main(String[] args) {

         Test cases
        int[] arr1 = {1,2,3,1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(arr1,k1));  Output true

        int[] arr2 = {1,2,3,1,2,3};
        int k2 = 2;
        System.out.println(containsNearbyDuplicate(arr2,k2));  Output false

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMapInteger,Integer map=new HashMap();

        for (int i = 0; i  nums.length; i++) {
            if (map.containsKey(nums[i])){
                int prevIndex=map.get(nums[i]);
                if (i-prevIndex=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }

        return false;

    }
}