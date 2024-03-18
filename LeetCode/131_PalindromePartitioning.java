class Solution {
    List<List<String>> result = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return result;

    }
    private void backTracking(String s, int index){
        if(index >= s.length()){
            result.add(new ArrayList<>(deque));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                String str = s.substring(index, i + 1);
                deque.addLast(str);
            }else{
                continue;
            }
            backTracking(s, i + 1);
            deque.removeLast();
        }
    }

    private boolean isPalindrome(String s, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;

    }
}