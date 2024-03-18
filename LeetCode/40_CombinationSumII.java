class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
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
            if(i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]){
                continue;
            }
            used[i] = true;

            path.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates, target, sum, i+1);
            sum -= candidates[i];
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}