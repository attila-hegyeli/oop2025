package oop.labor10.lab10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MyDate> dates = new ArrayList<>();
        Random random = new Random();
        while (dates.size()!=10)
        {
            int year = 2025;
            int month = random.nextInt(12)+1; /// 1 -- > 12
            int day=random.nextInt(31)+1;
            if (DateUtil.isValidDate(year,month,day))
            {
                dates.add(new MyDate(year,month,day));
            }
        }
        for (MyDate date : dates)
        {
            System.out.println(date);
        }

        Collections.sort(dates);
        System.out.println("Rendezett  sorrend !");
        for (MyDate date : dates)
        {
            System.out.println(date);
        }
        Collections.sort(dates,(MyDate o1, MyDate o2 )-> {
            return o2.compareTo(o1);
        });
        System.out.println("Forditott  sorrend !");
        for (MyDate date: dates)
        {
            System.out.println(date);
        }
    }

}
