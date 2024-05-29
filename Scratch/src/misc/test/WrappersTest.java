package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "57";
        int age = Integer.parseInt(ageInput);  // takes "57" -> returns int 57
        Integer ageInteger = Integer.valueOf(ageInput);  // returns an Integer with 57 inside

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);    // returns primitive long
        Long populationLong = Long.valueOf(populationInput);  // returns Long object

        String sizeInput = "9.5";
        double size = Double.parseDouble(sizeInput);  // returns primitive double
        Double sizeDouble = Double.valueOf(sizeInput);// returns Double object

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);
        Boolean isRainingBoolean = Boolean.valueOf(isRainingInput);

    }
}