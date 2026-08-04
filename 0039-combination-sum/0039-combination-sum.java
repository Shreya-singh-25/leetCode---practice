class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void dfs(int[] a, int target, int start, List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < a.length; i++) {
            if (a[i] <= target) {
                list.add(a[i]);
                dfs(a, target - a[i], i, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
}