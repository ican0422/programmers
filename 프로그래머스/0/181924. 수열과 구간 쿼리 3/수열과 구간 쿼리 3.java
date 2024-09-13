class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int index1 = 0;
        int index2 = 0;
        
        int num = 0;
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length - 1; j++) {
                index1 = queries[i][j];
                index2 = queries[i][j + 1];
            }
            num = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = num;
        }
        
        for (int k = 0; k < arr.length; k++) {
            answer[k] = arr[k];
        }
        
        return answer;
    }
}