package com.entertainment;

import java.util.Arrays;

/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
public class Television {
    // class ("static") variables - one copy, stored in the class-wide common shared area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // properties or attributes - called "instance variables" or "fields"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;  // for muting behavior
    private int oldVolume;    // for muting behavior

    // Television HAS-A Tuner (for all tasks related to channel-changing)
    private final Tuner tuner = new Tuner();  // instantiated internally, NOT exposed

    // constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();              // delegate to no-arg ctor for the increment
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);         // delegate to brand ctor above me for handling brand
        setVolume(volume);   // handle volume myself by delegating directly to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume); // delegate to brand-volume ctor for handling those
        setDisplay(display); // delegate to the setter for display
    }

    // business methods - these perform business functions
    public void changeChannel(String channel) {
        tuner.setChannel(channel);  // delegate to Tuner object for the actual work
    }

    public String getCurrentChannel() {
        return tuner.getChannel();  // delegate to Tuner object for the actual work
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) {    // not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {               // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // accessor methods - these provide "controlled access" to the object's fields
    public String getBrand() {
        return brand;
    }

    // VALID_BRANDS looks like this: ["Samsung", "LG", "Sony", "Toshiba"]
    public void setBrand(String brand) {
        boolean isValid = false;

        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                this.brand = brand;
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.printf("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;  // clear the 'isMuted' flag, in case we were muted
        }
        else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume: " + volume + ". " +
//                    "Valid range is [" + MIN_VOLUME + "-" + MAX_VOLUME + "].");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s, currentChannel=%s",
                getBrand(), volumeString, getDisplay(), getCurrentChannel());

//        return "Television: brand=" + getBrand() + ", volume=" + volumeString +
//                ", display=" + getDisplay();
    }
}