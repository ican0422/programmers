class Solution {
    public int[] solution(int[] num_list) {
        // 짝수
        int eNum = 0;
        // 홀수
        int oNum = 0;
        // 배열 길이
        int len = num_list.length;
        
        int num = 0;
        // 짝수, 홀수 개수 찾기
        for (int i = 0; i < num_list.length; i++) {
            num = num_list[i];
            if (num % 2 == 0) {
                eNum += 1;
            }
            if (num % 2 == 1) {
                oNum += 1;
            }
        }
        int[] answer = {eNum, oNum};
        return answer;
    }
}