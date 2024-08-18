class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        boolean[] skipSet = new boolean[26];

        // skip 문자열에 있는 알파벳을 true로 표시
        for (char c : skip.toCharArray()) {
            skipSet[c - 'a'] = true;
        }

        for (char c : s.toCharArray()) {
            char newChar = c;
            int count = 0;

            // index만큼 이동
            while (count < index) {
                newChar++;

                // 'z'를 넘으면 'a'로 돌아감
                if (newChar > 'z') {
                    newChar = 'a';
                }

                // skip에 있는 알파벳은 건너뜀
                if (!skipSet[newChar - 'a']) {
                    count++;
                }
            }

            result.append(newChar);
        }

        return result.toString();
    }
}