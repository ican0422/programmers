import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        int num = 0;
        
        while (n != 1) {
            num = (n % 2 == 0) ? (n /= 2) : (3 * n + 1);
            list.add(num);
            n = num;
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}