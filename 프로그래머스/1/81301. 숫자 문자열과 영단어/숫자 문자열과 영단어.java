class Solution {
    public int solution(String s) {
        int answer;
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < words.length; i++){
            s = s.replaceAll(words[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}