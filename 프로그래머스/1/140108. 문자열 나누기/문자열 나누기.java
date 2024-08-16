class Solution {
    public int solution(String s) {
        int count = 0; // 분해된 문자열의 개수
        int index = 0; // 현재 문자열의 인덱스

        while (index < s.length()) {
            char x = s.charAt(index); // 첫 글자
            int xCount = 0; // x의 개수
            int nonXCount = 0; // x가 아닌 글자의 개수
            
            // 문자열을 읽어나가며 xCount와 nonXCount 세기
            while (index < s.length()) {
                if (s.charAt(index) == x) {
                    xCount++;
                } else {
                    nonXCount++;
                }
                
                // 두 개수가 같아지는 순간
                if (xCount == nonXCount) {
                    count++; // 분해된 문자열 개수 증가
                    index++; // 다음 문자로 이동
                    break; // 현재 while 루프 종료
                }
                index++; // 다음 문자로 이동
            }

            // 남은 문자열이 없고, 두 개수가 같지 않으면 종료
            if (index >= s.length()) {
                if (xCount != nonXCount) {
                    count++; // 마지막 남은 문자열에 대해 카운트
                }
                break;
            }
        }

        return count;
    }
}