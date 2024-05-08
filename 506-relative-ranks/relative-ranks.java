class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sc = new int[score.length];
        for(int i=0;i<score.length;i++){
            sc[i] = score[i];
        }
        Arrays.sort(sc);
        int var = sc[sc.length-1];
        String[] rank = new String[sc.length];
        int ranks = 4;

        HashMap<Integer,String> map = new HashMap<>();
        for(int i = sc.length-1;i>=0;i--){
            if(i == sc.length-1){
                System.out.print(sc[i]);
                map.put(sc[i],"Gold Medal");
            }else if(i == sc.length-2){
                map.put(sc[i],"Silver Medal");
            }else if(i == sc.length-3){
                map.put(sc[i],"Bronze Medal");
            }else{
                int pos = sc.length - i;
                map.put(sc[i],Integer.toString(pos));
            }
        }
        for(int i=0;i<rank.length;i++){
            rank[i] = map.get(score[i]);
        }
        return rank;
    }
}