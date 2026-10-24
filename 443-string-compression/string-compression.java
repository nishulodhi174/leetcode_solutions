class Solution {
    public int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        if(chars.length == 1){
            return sb.length();
        }
        int count = 1;
        int s = 0;

        for(int i = 1;i<chars.length;i++){
            if(chars[s] == chars[i]){
                count++;
            }else if(chars[s] != chars[i]){
                s=i;
                if(count != 1){
                    sb.append(Integer.toString(count));
                }
                sb.append(chars[s]);
                count = 1;
            }
        }
        if(count != 1){
            sb.append(Integer.toString(count));
        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}

// class Solution {
//     public int compress(char[] chars) {

//         StringBuilder sb = new StringBuilder();
//         int count = 1;

//         int s = 0, e = 1;

//         // ["a","a","b","b","c","c","c"]

//         while(e<chars.length){
//             if(chars[s] != chars[e]){
//                 sb.append(chars[s]);
//                 s=e;
//                 e++;
//                 sb.append(Integer.toString(e-s+1));
//             }else{
//                 e++;
//             }
//         }
//         System.out.println("sb is : " +sb);
//         System.out.println(sb.length());

//         return sb.length();
//     }
// }