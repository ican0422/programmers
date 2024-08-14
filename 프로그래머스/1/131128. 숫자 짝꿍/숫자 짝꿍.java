import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String X, String Y) {
        // 두 수를 문자열로 변환
        String strX = String.valueOf(X);
        String strY = String.valueOf(Y);
        
        // 각 숫자의 개수를 저장할 맵
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();
        
        // X의 숫자 개수 세기
        for (char c : strX.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }
        
        // Y의 숫자 개수 세기
        for (char c : strY.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }
        
        // 공통 숫자를 저장할 StringBuilder
        StringBuilder commonDigits = new StringBuilder();
        
        // 공통 숫자 찾기
        for (char c = '0'; c <= '9'; c++) {
            if (countX.containsKey(c) && countY.containsKey(c)) {
                // 공통된 숫자의 개수를 구하고 추가
                int commonCount = Math.min(countX.get(c), countY.get(c));
                for (int i = 0; i < commonCount; i++) {
                    commonDigits.append(c);
                }
            }
        }
        
        // 짝꿍이 없을 경우 -1 반환
        if (commonDigits.length() == 0) {
            return "-1";
        }
        
        // 짝꿍이 0으로만 구성되어 있는 경우
        if (commonDigits.toString().chars().allMatch(c -> c == '0')) {
            return "0";
        }
        
        // 가장 큰 정수로 만들기 위해 내림차순 정렬
        char[] resultArray = commonDigits.toString().toCharArray();
        java.util.Arrays.sort(resultArray);
        String answer = new StringBuilder(new String(resultArray)).reverse().toString();
        
        return answer;
    }
}