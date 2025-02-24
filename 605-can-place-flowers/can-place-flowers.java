class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 1;

        while(end < flowerbed.length) {
            if(flowerbed[end] == 0) {
                count++;
                end++;
            } else{
                sum += (count -1)/2; 
                count = 0;
                start = end;
                end++;

                if(sum >= n) return true;
            }
        }

        sum += count/2;
        if(sum >= n) return true;  

        return false;
    }
}