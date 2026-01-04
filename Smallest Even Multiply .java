class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        if(n % 2 == 0){
            ans = n * 1;
        }
        else{
            ans = 2 * n;
        }
        return ans;
    }
}
