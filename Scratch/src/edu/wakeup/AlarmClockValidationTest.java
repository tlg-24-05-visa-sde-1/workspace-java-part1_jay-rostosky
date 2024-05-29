package edu.wakeup;

/*
 * Main-class focused on testing setter validation logic.
 *
 * Here, we are doing BVT (Boundary Value Testing) on setSnoozeInterval().
 * That is, we check the values on the edges of the valid range, and just outside it.
 *  0,1   and   20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);    // should "stick," i.e., the value should be stored
        System.out.println(clock);     // should show a 1 for snoozeInterval

        clock.setSnoozeInterval(20);   // should "stick"
        System.out.println(clock);     // should show a 20

        clock.setSnoozeInterval(0);    // error message, and value not set
        System.out.println(clock);     // should still be 20, from before

        clock.setSnoozeInterval(21);   // error message, and value not set
        System.out.println(clock);     // should still be 20
    }
}