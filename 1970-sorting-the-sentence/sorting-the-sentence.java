class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String ans[]=new String[arr.length];

        for(int i=0;i<arr.length;i++){
            int idx=Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
            //System.out.print(arr[i]+" "+idx);
            idx--;
            ans[idx]=arr[i].substring(0,arr[i].length()-1)+" ";
        }
        //System.out.println(arr.length);
        String r="";
        for(int i=0;i<ans.length;i++){
            //System.out.print(ans[i]+" ");
            r+=ans[i];
        }
        r=r.trim();
        return r;
    }
}