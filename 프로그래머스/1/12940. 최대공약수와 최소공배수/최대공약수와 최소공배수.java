class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n , m);
        int lcm = (n * m) / gcd;
        
        int[] answer = new int[]{gcd , lcm};
        
        return answer;
    }
    
    private int gcd(int n, int m){
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}