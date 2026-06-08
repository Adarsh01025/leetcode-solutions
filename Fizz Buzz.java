class Solution {
    public List fizzBuzz(int n) {
        List ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ans.add(
                i % 15 == 0 ? "FizzBuzz" :
                i % 5 == 0  ? "Buzz" :
                i % 3 == 0  ? "Fizz" :
                String.valueOf(i)
            );
        }
        // for(int i=1; i<=n; i++) {
        //     if(i%15 ==0) {
        //         ans.add("FizzBuzz");
        //     }
        //     else if(i%3==0) {
        //         ans.add("Fizz");
        //     }
        //     else if(i%5==0) {
        //         ans.add("Buzz");
        //     }
        //     else {
        //         ans.add(Integer.toString(i));
        //     }
        // }
        return ans;
    }
}