import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        // 각 성격 유형 점수를 저장할 맵 초기화
        Map<String, Integer> scores = new HashMap<>();
        scores.put("R", 0);
        scores.put("T", 0);
        scores.put("C", 0);
        scores.put("F", 0);
        scores.put("J", 0);
        scores.put("M", 0);
        scores.put("A", 0);
        scores.put("N", 0);
        
        for (int i = 0; i < survey.length; i++) {
            String pair = survey[i];
            int choice = choices[i];
            
            // 선택지에 따른 점수 계산
            int score = choice - 4; // 4가 모르겠음이므로, -4를 해서 -3 ~ +3으로 변환
            
            if (score > 0) {
                // 동의 및 약간 동의인 경우
                char type = pair.charAt(1); // 두 번째 문자 (후보 성격)
                scores.put(String.valueOf(type), scores.get(String.valueOf(type)) + score);
            } else if (score < 0) {
                // 비동의 및 약간 비동의인 경우
                char type = pair.charAt(0); // 첫 번째 문자 (기본 성격)
                scores.put(String.valueOf(type), scores.get(String.valueOf(type)) + Math.abs(score));
            }
        }
        
        // 최종 성격 유형 결정
        StringBuilder result = new StringBuilder();
        result.append(getType(scores, "R", "T"));
        result.append(getType(scores, "C", "F"));
        result.append(getType(scores, "J", "M"));
        result.append(getType(scores, "A", "N"));
        
        return result.toString();
    }
    
    // 두 성격 유형의 점수를 비교하여 결과를 반환하는 메서드
    private String getType(Map<String, Integer> scores, String type1, String type2) {
        int score1 = scores.get(type1);
        int score2 = scores.get(type2);
        
        if (score1 > score2) {
            return type1;
        } else if (score1 < score2) {
            return type2;
        } else {
            return type1.compareTo(type2) < 0 ? type1 : type2; // 사전 순 비교
        }
    }
}