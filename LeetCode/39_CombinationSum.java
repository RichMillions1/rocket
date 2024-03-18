class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0, 0);
        return result;
    }
    private void backTracking(int[] candidates, int target, int sum, int index){
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(sum + candidates[i] > target){
                break;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            
            backTracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
            
        }
    }
}