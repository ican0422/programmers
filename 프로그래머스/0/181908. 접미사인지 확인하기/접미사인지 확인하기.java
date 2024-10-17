import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        String str = my_string;
        list.add(str);
        
        for (int i = 0; i < my_string.length(); i++) {
            String s = str.substring(1);
            list.add(s);
            str = s;
        }
        
        for (String string : list) {
            if (is_suffix.equals(string)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}