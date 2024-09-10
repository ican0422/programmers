import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        ArrayList<Integer> newList = new ArrayList<>();
        int len = num_list.length - 1;
        int lastLen = num_list.length;
        int num = 0;
        int lastNum = 0;
        int addNum = 0;
        
        for (int i = 0; i < lastLen; i++) {
            if (len == i + 1) {
                num = num_list[i];
            }
            if (lastLen == i + 1) {
                lastNum = num_list[i];
            }
        }
        
        if (lastNum > num) {
            addNum = lastNum - num;
        }
        if (lastNum <= num) {
            addNum = lastNum * 2;
        }
        
        for (int n : num_list) {
            newList.add(n);
        }
        newList.add(addNum);
        
        for (int j = 0; j < newList.size(); j++) {
            answer[j] = newList.get(j);
        }
        
        return answer;
    }
}