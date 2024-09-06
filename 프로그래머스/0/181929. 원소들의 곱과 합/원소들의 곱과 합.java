class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int addNum = 0;
        int multiNum = 1;
        for (int n : num_list) {
            addNum += n;
        }
        addNum *= addNum;
        
        for (int n : num_list) {
            multiNum *= n;
        }
        
        if (multiNum < addNum) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}