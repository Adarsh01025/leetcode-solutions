class Solution {
    public String reverseStr(String s, int k) {
        int step = k * 2;
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i += step){
            int start = i;
            int end = Math.min(i + k - 1, arr.length - 1);
            while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}

// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] str = s.toCharArray();
//         int n = str.length;
//         for(int i = 0 ; i <= n-1; i += 2*k){
//             if(i+k-1 <= n-1){
//                 reverseK(i,i+k-1,str);
//             }else{
// 				//for fewer than k characters left (edge case)
//                 reverseK(i,n-1,str);
//             }
//         }
//         String ans = new String(str);
//         return ans;
//     }
//     public void reverseK(int i, int j, char[] str){
//         while(i < j){
//             char temp = str[i];
//             str[i] = str[j];
//             str[j] = temp;
//             i++;
//             j--;
//         }
//     }
// }