import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            String strNum = intStrs[i];
            String focus = strNum.substring(s, (s + l));
            int num = Integer.parseInt(focus);
            if (num > k) {
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}