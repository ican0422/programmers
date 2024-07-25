class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pNum = p.length();
        
        for(int i = 0; i <= t.length() - pNum; i++){
            String s = t.substring(i , i + pNum);
            if(s.compareTo(p) <= 0){
                answer++;
            }
        }
        return answer;
    }
}