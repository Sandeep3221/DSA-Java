class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        if(set.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}