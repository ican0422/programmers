import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> sorted = new ArrayList<>();
        for (int n : emergency) {
            sorted.add(n);
        }
        Collections.sort(sorted, Collections.reverseOrder()); // 내림 차순
        
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < sorted.size(); i++) {
            intMap.put(sorted.get(i), i + 1);
        }
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = intMap.get(emergency[i]);
        }
        return answer;
    }
}