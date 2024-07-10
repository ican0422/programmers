class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char secret = '*';
        int numChar = 4;
        int length = phone_number.length();
        
        for(int i = 0; i < length; i++){
            if(i < length - numChar){
                answer += secret;
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}