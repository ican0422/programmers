class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String ab = a1 + b1;
        String ba = b1 + a1;
        int ab1 = Integer.parseInt(ab);
        int ba1 = Integer.parseInt(ba);
        if (ab1 == ba1) {
            answer = ab1;
        }
        if (ab1 > ba1) {
            answer = ab1;
        }
        if (ab1 < ba1) {
            answer = ba1;
        }
        return answer;
    }
}