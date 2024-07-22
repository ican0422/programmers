class Solution {
    public int solution(int n) {
        String s = Integer.toString(n , 3);
        String re = new StringBuilder(s).reverse().toString();
        
        int answer = Integer.parseInt(re , 3);
        return answer;
    }
}