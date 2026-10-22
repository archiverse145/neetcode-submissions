class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->             Integer.compare(b[0],a[0]));

        int m=0;
        int left=0;
        int right=0;
        int ans[]=new int[nums.length-k+1];
        while(right<nums.length){
            pq.add(new int[]{nums[right],right});
            if(right-left +1 == k){
                while(pq.peek()[1]<left){
                    pq.poll();
                }
                ans[m]=pq.peek()[0];
                m++;
                left++;
            }
            right++;
        }
        return ans;
    }
}
