class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int tn = 1;
        int tn1 = 1;
        int tn2 = 0;
        int i = 3;
        while(i <= n) {
            int temp = tn;
            tn = tn + tn1 + tn2;
            tn2 = tn1;
            tn1 = temp;
            i++;
        }

        return tn;
    }
}