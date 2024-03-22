package ardijanla;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class TESTING {
    public static void main(String[] args) {

        Calendar cnd = Calendar.getInstance();
        cnd.add(Calendar.DAY_OF_WEEK,2);
        System.out.println(cnd.getTime());

        LocalDateTime lT = LocalDateTime.now();
        LocalDateTime lTChanged = lT.plusDays(2);
        System.out.println(lTChanged);

        LocalDate lT1 = LocalDate.now();


    }
}
