import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수들의 현재 순서를 HashMap에 저장합니다.
        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        // 각 호출에 대해 선수의 순위를 업데이트합니다.
        for (String calling : callings) {
            int index = playerIndexMap.get(calling); // 호출된 선수의 현재 인덱스
            if (index > 0) { // 만약 1등이 아니면
                String frontPlayer = players[index - 1]; // 앞선 선수의 이름
                // 순위 변경
                players[index] = frontPlayer; // 호출된 선수를 앞선 선수의 위치로 이동
                players[index - 1] = calling; // 앞선 선수는 호출된 선수의 위치로 이동
                
                // 인덱스 업데이트
                playerIndexMap.put(calling, index - 1);
                playerIndexMap.put(frontPlayer, index);
            }
        }

        return players; // 최종 순위를 반환
    }
}