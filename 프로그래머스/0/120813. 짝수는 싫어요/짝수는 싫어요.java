import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}