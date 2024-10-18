class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s, e+1);
        String reverseStr = new StringBuilder(str).reverse().toString();
        answer = new StringBuilder(my_string).replace(s, e+1, reverseStr).toString();
        return answer;
    }
}