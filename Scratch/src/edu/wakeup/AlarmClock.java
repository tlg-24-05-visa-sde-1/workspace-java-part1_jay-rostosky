package edu.wakeup;

/*
 * Class definition to model the workings of an alarm clock.
 * This is sometimes called a "business" class, "system" class, or "application" class.
 * It has NO main() method - classes like these don't.
 */
class AlarmClock {
    // class ("static") variables
    // There is only one copy of these, they live up in that "shared" area, NOT in each object
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - called "fields" or "instance variables"
    private int snoozeInterval = 5;  // default value when client doesn't specify (instead of 0)

    // constructors - like "methods" that get called when clients say "new"
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  // delegate to setter for validation/conversion
    }

    // functions or behaviors - called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // "accessor" methods - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    /*
     * Implement a business data constraint - must be between 1 and 20 (inclusive)
     */
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {  // valid -> assign to field
            this.snoozeInterval = snoozeInterval;
        }
        else {                                              // invalid -> error message
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                    ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    /*
     * Returns a string representation of this AlarmClock object, describing it in a sentence.
     * Generally includes the name of the class (its type) and the values of its fields.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}