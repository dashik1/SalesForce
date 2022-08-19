package utilits;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {

    public static String generateAccountName() {
        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateWebsite() {
        return new Faker().internet().url();
    }

    public static String generateQuantity() {
        return String.valueOf(new Faker().number().numberBetween(0, 1000000));
    }

    public static String generateDescription() {
        return new Faker().lorem().paragraph(4);
    }

    public static String generateCity() {
        return new Faker().address().city();
    }

    public static String generateCountry() {
        return new Faker().address().country();
    }

    public static String generateState() {
        return new Faker().address().state();
    }

    public static String generateZipCode() {
        return new Faker().address().zipCode();
    }


}
