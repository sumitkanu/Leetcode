class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();

        for(int num : nums1) {
            arr1.add(num);
        }

        for(int num: nums2) {
            arr2.add(num);
            if(arr1.contains(num)) {
                arr1.remove(num);
            }
        }
        
        for(int num : nums1) {
            if(arr2.contains(num)) arr2.remove(num);
        }

        answer.add(new ArrayList<>(arr1));
        answer.add(new ArrayList<>(arr2));

        return answer;
    }
}