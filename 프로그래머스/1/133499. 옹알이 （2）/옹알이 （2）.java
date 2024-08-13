class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 허용되는 발음
        String[] allowedSounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String modifiedWord = word;

            // 각 발음을 치환하여 연속된 발음을 제거
            for (String sound : allowedSounds) {
                modifiedWord = modifiedWord.replace(sound, " ");
            }

            // 공백이 남아 있지 않고, 길이가 0보다 크면 유효한 발음
            if (modifiedWord.trim().isEmpty() && !word.contains("ayaaya") 
                && !word.contains("yeye") && !word.contains("woowo") && !word.contains("mama")) {
                answer++;
            }
        }
        return answer;
    }
}