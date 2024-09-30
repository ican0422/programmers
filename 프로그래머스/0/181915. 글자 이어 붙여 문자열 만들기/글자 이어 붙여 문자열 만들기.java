class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char[] c = my_string.toCharArray();
        
        for (int n : index_list) {
            answer.append(c[n]);
        }
        
        return answer.toString();
    }
}