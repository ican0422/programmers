import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        
        DayOfWeek day = date.getDayOfWeek();
            
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        return days[day.getValue() - 1];
    }
}