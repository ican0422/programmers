class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        while (age >= 0) {
            answer.insert(0, (char) ('a' + (age % 10)));
            age = age / 10;
            if (age == 0) {
                break;
            }
        }
        return answer.toString();
    }
}