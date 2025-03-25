class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));
        int units = 0;
        int i = 0;
        while(i<boxTypes.length && boxTypes[i][0] < truckSize) {
            truckSize -= boxTypes[i][0];
            units += boxTypes[i][0] * boxTypes[i][1];
            i++;
        }

        if(i < boxTypes.length)
            units += truckSize*boxTypes[i][1];

        return units;
    }
}