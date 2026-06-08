class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int  num= x;

        while (num!= 0) {
            rev= rev*10 + num%10;
            num=num/10;
        }

        return (rev == x);
    }
}




// class Solution {
//     //best soluction
//     public boolean isPalindrome(int x) {

//         // Negative numbers and numbers ending in 0 are not palindromes
//         if (x < 0 || (x % 10 == 0 && x != 0)) {
//             return false;
//         }

//         int reversedHalf = 0;

//         while (x > reversedHalf) {

//             reversedHalf = reversedHalf * 10 + x % 10;
//             x /= 10;
//         }

//         // Even digits: x == reversedHalf
//         // Odd digits: x == reversedHalf / 10
//         return x == reversedHalf || x == reversedHalf / 10;
//     }
// }