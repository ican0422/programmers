import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = (int) Arrays.stream(lottos).filter(num -> num == 0).count();
        
        int match = (int) Arrays.stream(lottos)
            .filter(num -> Arrays.stream(win_nums).anyMatch(win -> win == num)).count();
        
        int max = getRank(match + zero);
        
        int min = getRank(match);
        
        return new int[] {max, min};
    }
    
    private static int getRank(int count) {
        switch(count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}