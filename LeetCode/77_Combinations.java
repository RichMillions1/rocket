class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return result;
    }
    private void backTracking(int n, int k, int index){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backTracking(n, k, i + 1);
            path.removeLast();
        }
    }
}