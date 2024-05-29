import java.util.Arrays;

class TelevisionClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage =
                    "Usage:   java TelevisionClientArgs <brand> <volume> <display>\n" +
                    "Example: java TelevisionClientArgs Samsung 32 PLASMA\n" +
                    "Notes:\n" +
                    " 1. Available brands are " + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                    " 2. Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + " (inclusive)\n" +
                    " 3. Supported displays are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            return;  // early return from main(), application exits
        }

        // process argument strings into proper types for a Television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());  // upper it for them

        // create the Television object from these 3 values
        Television tv = new Television(brand, volume, display);

        // print the result
        System.out.println("Thank you for your order!");
        System.out.println("Your custom television is on its way:");
        System.out.println("\t" + tv);
    }
}