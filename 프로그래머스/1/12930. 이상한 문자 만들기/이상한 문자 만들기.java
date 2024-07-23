class Solution {
    public String solution(String s) {
        String[] words = s.split(" " , -1);
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            StringBuilder word = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                char c = words[i].charAt(j);
                if(j % 2 == 0){
                    word.append(Character.toUpperCase(c));
                } else {
                    word.append(Character.toLowerCase(c));
                }
            }
            answer.append(word);
            if(i < words.length - 1){
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}