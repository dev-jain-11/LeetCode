class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        List <Integer> res = new ArrayList<>();
        Map <Integer , Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >len/3) res.add(entry.getKey());
        }

        return res;
    }
}