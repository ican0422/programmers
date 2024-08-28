class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String ab1 = a1 + b1;
        
        int ab2 = 2 * a * b;
        int ab = Integer.parseInt(ab1);
        
        if (ab == ab2) {
            answer = ab;
        }
        if (ab > ab2) {
            answer = ab;
        }
        if (ab < ab2) {
            answer = ab2;
        }
        
        return answer;
    }
}