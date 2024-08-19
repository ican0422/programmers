import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int hamburgerCount = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            // 스택의 크기가 4 이상일 경우 햄버거 조합 확인
            if (stack.size() >= 4) {
                // 최근 4개의 재료가 "빵 - 야채 - 고기 - 빵"인지 확인
                if (stack.get(stack.size() - 1) == 1 &&  // 빵
                    stack.get(stack.size() - 2) == 3 &&  // 고기
                    stack.get(stack.size() - 3) == 2 &&  // 야채
                    stack.get(stack.size() - 4) == 1) {  // 빵
                    // 햄버거가 완성됨, 스택에서 제거
                    stack.pop(); // 빵
                    stack.pop(); // 고기
                    stack.pop(); // 야채
                    stack.pop(); // 빵
                    hamburgerCount++; // 햄버거 개수 증가
                }
            }
        }

        return hamburgerCount;
    }
}