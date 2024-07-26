class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeigth = 0;
        int answer = 0;
        for(int[] size : sizes){
            int width = Math.max(size[0], size[1]);
            int heigth = Math.min(size[0], size[1]);
            
            maxWidth = Math.max(maxWidth, width);
            maxHeigth = Math.max(maxHeigth, heigth);
        }
        answer = maxWidth * maxHeigth;
        
        return answer;
    }
}