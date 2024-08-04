import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];
        PriorityQueue<Integer> h = new PriorityQueue<>(k);
        
        for (int i = 0; i < scores.length; i++){
            int score = scores[i];
            
            if (h.size() < k){
                h.offer(score);
            } else if (score > h.peek()) {
                h.poll();
                h.offer(score);
            }
            answer[i] = h.peek();
        }
        return answer;
    }
}