class Solution {
    public int integerReplacement(int n) {
        long num=n;
        int steps=0;
        while(num!=1){
            if(num%2==0) num=num/2;
            else {
                if(num%4==1 || num==3) num--;
                else if(num%4==3) num++;
            }
            steps++;
        }
        return steps;
    }
}