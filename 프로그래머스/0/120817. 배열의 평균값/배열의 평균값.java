class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        if (numbers.length < 1 || numbers.length > 100){
            System.out.println("numbers의 길이가 1이상 100이하여야 합니다.");
        }
        for(int number : numbers) {
            if(number < 0 || number > 1000){
                System.out.println("number의 길이가 0이상 1000이하여야 합니다.");
            }
            sum += number;
        }
        answer = sum/numbers.length;
        
        return answer;
    }
}