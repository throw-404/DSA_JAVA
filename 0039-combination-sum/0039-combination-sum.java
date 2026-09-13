class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, 0, candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int i, int[] arr, int target, int total, List<Integer> comb){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(total > target || i >= arr.length) return;

        comb.add(arr[i]);
        backtrack(res, i, arr, target, total + arr[i], comb);
        comb.remove(comb.size() - 1);
        backtrack(res, i+1, arr, target, total, comb);
    }
}