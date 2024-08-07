import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int box = score.length / m;
        
        for (int i = 0; i < box; i++){
            int minBox = score[score.length - (i + 1) * m];
            
            answer += minBox * m;
        }
        
        return answer;
    }
}