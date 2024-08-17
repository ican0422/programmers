import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
         // 각 문자에 대해 필요한 최소 키 누름 횟수를 저장하는 HashMap
        HashMap<Character, Integer> keyPressCount = new HashMap<>();
        
        // keymap을 순회하며 각 문자의 최소 누름 횟수를 계산
        for (int i = 0; i < keymap.length; i++) {
            String keys = keymap[i];
            for (int j = 0; j < keys.length(); j++) {
                char c = keys.charAt(j);
                // 해당 문자가 이미 존재하면 최소 값으로 업데이트
                keyPressCount.put(c, Math.min(keyPressCount.getOrDefault(c, Integer.MAX_VALUE), j + 1));
            }
        }
        
        // 결과를 저장할 배열
        int[] result = new int[targets.length];
        
        // targets를 순회하며 각 문자열을 작성하는 데 필요한 키 누름 횟수를 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean canType = true;
            
            for (char c : target.toCharArray()) {
                if (!keyPressCount.containsKey(c)) {
                    canType = false; // 해당 문자를 입력할 수 없는 경우
                    break;
                }
                totalPresses += keyPressCount.get(c);
            }
            
            result[i] = canType ? totalPresses : -1;
        }
        
        return result;
    }
}