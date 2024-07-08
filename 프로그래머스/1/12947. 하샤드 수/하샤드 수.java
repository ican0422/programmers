class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] tmp = Integer.toString(x).split("");
        
        for(String s : tmp){
            sum += Integer.parseInt(s);
        }
        
        if(x % sum == 0){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}