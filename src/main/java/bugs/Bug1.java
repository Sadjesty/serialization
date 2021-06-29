package bugs;

import java.util.Date;

/**
 * Необходимо объяснить и решить проблему - почему здесь идет зацикленность;заканчивается память
 */
public class Bug1 {
    public static void main(String[] args) {
        for (int i = 0; i < 129; i++) {
            System.out.println("Current time is " + new Date().getTime());
        }
    }
}
