package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // String @bd take BirthDate
        String bd = "1997-01-18";

        //String @ad take CurrentDate
        String ad = "2020-05-13";

        LocalDate dateBefore = LocalDate.parse(bd);
        LocalDate afterBefore = LocalDate.parse(ad);

        //long varialbe to store days difference betwwen two Dates
        long noOfDaysInBetween = ChronoUnit.DAYS.between(dateBefore ,afterBefore);

        //Printing no. of days
        System.out.println("Days count since you birth are : " + noOfDaysInBetween);
    }
}
