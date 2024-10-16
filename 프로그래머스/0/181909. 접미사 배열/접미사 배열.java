import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] answer = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(i);
            list.add(str);
        }
        Collections.sort(list);
        
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}