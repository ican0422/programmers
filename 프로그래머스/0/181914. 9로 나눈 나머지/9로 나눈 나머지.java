class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String strNum = String.valueOf(number);
        char[] cNum = strNum.toCharArray();
        
        for (char c : cNum) {
            sum += c - '0';
        }
        
        answer = sum % 9;
        
        return answer;
    }
}