class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, prefix = 0;

        for(int n : nums){
            prefix += n;

            int num = prefix % k;

            if(num < 0){
                num += k;
            }

            count += map.getOrDefault(num, 0);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}