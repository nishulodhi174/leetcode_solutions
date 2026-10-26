class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int xount=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(map.containsKey(k-num) && map.get(num) > 0 ){
                map.put(num,map.get(num)-1);
                if(map.get(k-num) > 0){
                    xount++;
                    map.put(k-num,map.get(k-num)-1);
                }
            }
        }
        return xount;
    }
}

// nums = [2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2]  k =3
