import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] nums = String.valueOf(n).split("");
        
        for(String num : nums){
            answer += Integer.parseInt(num);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}