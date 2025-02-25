class Solution {
    public int[] solution(int[] num_list) {
        // 원소를 순서대로 거꾸로 뒤집기
        // 12345 -> 54321 정렬이 아닌 뒤집기
        int len = num_list.length;
        int[] answer = new int[len];
        int j = 0;
        
        for (int i = len - 1; i >= 0; i--) {
            answer[j] = num_list[i];
            j++;
        }
        
        return answer;
    }
}