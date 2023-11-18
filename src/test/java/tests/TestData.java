package tests;

import com.github.javafaker.Faker;
import java.util.Locale;

public class TestData {
    Faker faker = new Faker(new Locale("en"));
    Faker fakerRU = new Faker(new Locale("ru"));

    public String
            firstName = fakerRU.name().firstName(),
            lastName = fakerRU.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = faker.options().option("Male", "Female", "Other"),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.valueOf(faker.number().numberBetween(1,28)),
            month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            year = String.valueOf(faker.number().numberBetween(1923,2023)),
            subject = faker.options().option("Maths", "History", "English"),
            hobbies = faker.options().option("Sports", "Reading", "Music"),
            address = fakerRU.address().streetAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = setRandomCity(state);

            public String setRandomCity(String state) {
                switch (state) {
                    case "NCR":
                        return faker.options().option("Delhi", "Gurgaon", "Noida");
                    case "Uttar Pradesh":
                        return faker.options().option("Agra", "Lucknow", "Merrut");
                    case "Haryana":
                        return faker.options().option("Karnal", "Panipat");
                    case "Rajasthan":
                        return faker.options().option("Jaipur", "Jaiselmer");
                    default:
                        return null;
                }


            }

}

