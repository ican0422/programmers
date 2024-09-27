import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        // 0 1 2 3
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        // [2, 2, 2, 2]
        if (arr[0] == arr[3]) {
            answer = 1111 * arr[0];
        }
        
        // [1, 4, 4, 4] or [1, 1, 1, 4]
        else if (arr[1] == arr[3] || arr[0] == arr[2]) {
            int p = arr[1];
            int q = arr[3] + arr[0] - arr[1];
            answer = (10 * p + q) * (10 * p + q);
        }
        
        // [3, 3, 6, 6]
        else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            int p = arr[0];
            int q = arr[2];
            answer = (p + q) * (q - p);
        }
        
        // [2, 2, 5, 6] or [2, 5, 5, 6] or [2, 5, 6, 6]
        else if (arr[0] == arr[1]) {
            int q = arr[2];
            int r = arr[3];
            answer = q * r;
        }
        else if (arr[1] == arr[2]) {
            int q = arr[0];
            int r = arr[3];
            answer = q * r;
        }
        else if (arr[2] == arr[3]) {
            int q = arr[0];
            int r = arr[1];
            answer = q * r;
        }
        else {
            answer = arr[0];
        }
        
        return answer;
    }
}