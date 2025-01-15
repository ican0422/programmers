import java.util.*;
class Solution {
    public int solution(int[] array) {
        // 빈도수를 저장할 Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 배열에서 각 숫자의 빈도수 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값 계산
        int maxFrequency = 0;
        int answer = -1;
        boolean isUnique = true; // 최빈값이 유일한지 확인
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = number;
                isUnique = true; // 새 최빈값 발견
            } else if (frequency == maxFrequency) {
                isUnique = false; // 최빈값이 여러 개인 경우
            }
        }
        
        // 최빈값이 여러 개인 경우 -1 반환
        if (!isUnique) {
            return -1;
        }
        
        return answer;
    }
}