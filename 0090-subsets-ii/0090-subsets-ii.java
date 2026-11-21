class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;

        
    }
    void backtrack(int[] nums, int i,List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j] ==nums[j-1]) continue;
            temp.add(nums[j]);
            backtrack(nums, j+1, temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}