class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x1x2 = isBoolean(x1, x2);
        boolean x3x4 = isBoolean(x3, x4);
        
        if (x1x2 && x3x4) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
    
    private boolean isBoolean(boolean b1, boolean b2) {
        if (!b1 && !b2) {
            return false;
        } else {
            return true;
        }
    }
}