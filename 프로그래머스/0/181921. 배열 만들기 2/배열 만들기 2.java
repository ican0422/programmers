import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        Pattern pattern = Pattern.compile("^[05]+$");
        
        for (int i = l; i <= r; i++) {
            String strNum = String.valueOf(i);
            if (pattern.matcher(strNum).matches()) {
                answer.add(i);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        int[] arr = new int[answer.size()];
        
        for (int j = 0; j < arr.length; j++) {
            arr[j] = answer.get(j);
        }
        
        return arr;
    }
}