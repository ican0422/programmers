class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string);
        
        String str = "";
        String reverseStr = "";
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            str = answer.substring(s, e+1);
            reverseStr = new StringBuilder(str).reverse().toString();
            answer.replace(s, e+1, reverseStr);
            
        }
        
        return answer.toString();
    }
}