import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            int s = 0;
            String str = my_string.substring(s, 1+i);
            list.add(str);
        }
        
        for (String string : list) {
            if (is_prefix.equals(string)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}