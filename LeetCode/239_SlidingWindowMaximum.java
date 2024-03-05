class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums.length == 1){
            return nums;
        }
        int len = nums.length - k + 1;
        int[] newN = new int[len];
        int index = 0;
        MyQueue myQueue = new MyQueue();
        for(int i = 0; i < k; i++){
            myQueue.add(nums[i]);
        }
        newN[index++] = myQueue.peek();
        for(int i = k; i < nums.length; i++){
            myQueue.poll(nums[i - k]);
            myQueue.add(nums[i]);
            newN[index++] = myQueue.peek();
        }
        return newN;

    }

    
}
class MyQueue{

    Deque<Integer> deque = new LinkedList<>();

    void poll(int val){
        if(!deque.isEmpty() && val == deque.peek()){
            deque.poll();
        }
        
    }

    void add(int val){
        while(!deque.isEmpty() && val > deque.getLast()){
            deque.removeLast();
        }
        deque.add(val);
    }
    int peek(){
        return deque.peek();
    }


}
