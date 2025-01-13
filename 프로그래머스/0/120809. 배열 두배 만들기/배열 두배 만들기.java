import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int num : numbers) {
            num *= 2;
            list.add(num);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}