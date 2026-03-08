class MedianFinder {
    private PriorityQueue<Integer> maxheap,minheap;
    public MedianFinder() {
        minheap=new PriorityQueue<Integer>();
        maxheap=new PriorityQueue<Integer>(Collections.reverseOrder());
    
        
    
        
    }
    
    public void addNum(int num) {
        if(minheap.size()==maxheap.size()){
            minheap.offer(num);
            maxheap.offer(minheap.poll());
        }
        else{
            maxheap.offer(num);
            minheap.offer(maxheap.poll());
        }
    }
    
    public double findMedian() {
        if(minheap.size()==maxheap.size()){
            return ((maxheap.peek()+minheap.peek())/2.0);
        }
        
        return maxheap.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */