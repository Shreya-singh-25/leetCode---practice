class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        backtrack(nums, 0,new ArrayList<>(), ans);
        return ans;

        
    }
    void backtrack(int[] nums, int i,List<Integer> temp, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        backtrack(nums,i+1,temp, ans);
        temp.add(nums[i]);
        backtrack(nums, i+1,temp, ans);
        temp.remove(temp.size() -1);
        
    }
}