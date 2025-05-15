class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int ans = 0;
        while (x > 0) {
            int r = x % 10;
            ans = ans * 10 + r;
            x = x / 10;
        }
        if (n == ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return n == ans;
    }
}
