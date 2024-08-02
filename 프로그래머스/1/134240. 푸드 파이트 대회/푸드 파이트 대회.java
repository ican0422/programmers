class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder rigth = new StringBuilder();
        
        for (int i = 0; i < food.length; i++){
            int count = food[i] / 2;
            for (int j = 0; j < count; j++){
                left.append(i);
                rigth.insert(0 , i);
            }
        }
        
        left.append(0).append(rigth);
        
        return left.toString();
    }
}