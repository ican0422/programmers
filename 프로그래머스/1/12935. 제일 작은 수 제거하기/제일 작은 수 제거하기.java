class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int small = 0;
        if(arr.length <= 1){
            return new int[] {-1};
        }
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[small]){
                small = i;
            }
        }
        
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != small){
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}