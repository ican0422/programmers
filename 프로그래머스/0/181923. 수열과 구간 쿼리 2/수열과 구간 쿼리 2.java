import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int minValue = Integer.MAX_VALUE;
            boolean found = false;

            // s <= i <= e 범위에서 k보다 큰 값을 찾기
            for (int i = s; i <= e && i < arr.length; i++) {
                if (arr[i] > k) {
                    found = true;
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                    }
                }
            }

            // 결과 추가
            if (found) {
                result.add(minValue);
            } else {
                result.add(-1);
            }
        }

        // List를 int 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}