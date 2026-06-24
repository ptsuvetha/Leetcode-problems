class OrderedStream {
    List<String> lis;
    int p;
    public OrderedStream(int n) {
         lis=new ArrayList<>(Collections.nCopies(n+1,null));
         p=1;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> res=new ArrayList<>();
        lis.set(idKey,value);
        while(p<lis.size() && lis.get(p)!=null){
            res.add(lis.get(p));
            p++;
        }
        return res;

    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */