/**
 * Created by cclapp on 08/03/2017.
 */
/*
so if certain condition met, will return TRUE for 3 secs, but
then will return false again
 */

public class TimingTest {


    public static void main(String[] args){
        public long lastTrueTime;
        private boolean timedBoolean() {
            long now = System.currentTimeMillis();
            //remember time is in millis

            if (true) {
                long lastTrueTime = now;
                return true;

            }
        if (lastTrueTime+3000<now)
            return false;

        return true;
        }

    }

}
