class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        StringBuilder res=new StringBuilder();
        String[] str=path.split("/");
        for(int i=0;i<str.length;i++){
            if(!s.isEmpty() && str[i].equals("..")){
                s.pop();
            }
            else if(!str[i].equals("..")&& !str[i].equals("") && !str[i].equals(".")){
                s.push(str[i]);
            }
        }
            if(s.isEmpty()) return "/";
            while(!s.isEmpty()){
                res.insert(0,s.pop()).insert(0,"/");
            }
        
        return res.toString();
    }
}