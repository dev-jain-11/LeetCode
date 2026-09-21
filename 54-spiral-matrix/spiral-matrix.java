class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List <Integer> res = new ArrayList<>();
        int tr = 0 , br = nums.length-1 , fc = 0 , lc = nums[0].length-1;

        while(tr<=br && fc<=lc){
            res.addAll(returnBoundaryElement(nums , tr, br, fc , lc));
            tr++;
            br--;
            fc++;
            lc--;
        }
        return res;
    }

    public List<Integer> returnBoundaryElement(int [][] nums , int tr , int br , int fc , int lc){
        List <Integer> res = new ArrayList<>();

        for (int i = fc; i <= lc; i++)
    res.add(nums[tr][i]);

tr++;

for (int i = tr; i <= br; i++)
    res.add(nums[i][lc]);

lc--;

if (tr <= br) {
    for (int i = lc; i >= fc; i--)
        res.add(nums[br][i]);

    br--;
}

if (fc <= lc) {
    for (int i = br; i >= tr; i--)
        res.add(nums[i][fc]);

    fc++;
}

        return res;
    }
}