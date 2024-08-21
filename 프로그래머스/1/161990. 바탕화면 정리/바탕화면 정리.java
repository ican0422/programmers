class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE; // 드래그 시작점의 x좌표 (최소값)
        int luy = Integer.MAX_VALUE; // 드래그 시작점의 y좌표 (최소값)
        int rdx = Integer.MIN_VALUE; // 드래그 끝점의 x좌표 (최대값)
        int rdy = Integer.MIN_VALUE; // 드래그 끝점의 y좌표 (최대값)
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 파일이 있는 경우 (i, j)
                    lux = Math.min(lux, i); // 최소 y좌표
                    luy = Math.min(luy, j); // 최소 x좌표
                    rdx = Math.max(rdx, i); // 최대 y좌표
                    rdy = Math.max(rdy, j); // 최대 x좌표
                }
            }
        }
        
        // 드래그의 끝점은 rdx + 1, rdy + 1로 설정
        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}