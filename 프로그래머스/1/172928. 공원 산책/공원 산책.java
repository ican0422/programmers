class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length; // 공원의 세로 길이
        int width = park[0].length(); // 공원의 가로 길이
        int[] position = new int[2]; // 로봇 강아지의 현재 위치 [세로, 가로]

        // 공원에서 로봇 강아지의 초기 위치 찾기
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') { // 'S'는 로봇 강아지의 위치
                    position[0] = i;
                    position[1] = j;
                }
            }
        }

        // 명령 수행
        for (String route : routes) {
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            // 새로운 위치 계산
            int newRow = position[0];
            int newCol = position[1];
            boolean canMove = true;

            // 방향에 따라 새로운 좌표 계산하면서 장애물 체크
            for (int d = 0; d < distance; d++) {
                if (direction.equals("E")) {
                    newCol++;
                } else if (direction.equals("W")) {
                    newCol--;
                } else if (direction.equals("S")) {
                    newRow++;
                } else if (direction.equals("N")) {
                    newRow--;
                }

                // 공원을 벗어나는지 체크
                if (newRow < 0 || newRow >= height || newCol < 0 || newCol >= width) {
                    canMove = false;
                    break;
                }

                // 장애물 체크
                if (park[newRow].charAt(newCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            // 이동 가능할 경우 위치 업데이트
            if (canMove) {
                position[0] = newRow;
                position[1] = newCol;
            }
        }

        return position; // 최종 위치 반환
    }
}