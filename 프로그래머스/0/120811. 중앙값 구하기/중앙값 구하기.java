import java.util.*;
class Solution {
    public int solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : array) {
            list.add(num);
        }
        
        Collections.sort(list);
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        int answer = arr[arr.length/2];
        
        return answer;
    }
}