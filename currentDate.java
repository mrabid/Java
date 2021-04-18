package BeginnerJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class currentDate {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat dateformat = new SimpleDateFormat("DD/MM/YYYY");
        String currentDate = dateformat.format(date);
        System.out.println(currentDate);
    }
}
