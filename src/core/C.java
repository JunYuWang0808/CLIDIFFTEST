package core;

import java.util.concurrent.ThreadLocalRandom;

public class C {
    public String getStringNumber() {
        int number = ThreadLocalRandom.current().nextInt(0, 100);
        return number + "";
    }

    public int getIntNumber() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }
}
