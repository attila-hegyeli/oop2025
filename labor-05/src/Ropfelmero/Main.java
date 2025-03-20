package Ropfelmero;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Rectangle> rectangles = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                rectangles.add(new Rectangle(i,i+1));
        }
            for (Rectangle r : rectangles)
            {
                System.out.println(r);
                System.out.println(r.Area());
            }
        for (int i = 0; i < 10; i++) {


        }


    }
}
