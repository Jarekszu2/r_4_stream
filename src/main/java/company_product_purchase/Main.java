package company_product_purchase;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Utilities utilities = new Utilities();

        Product productFiat = new Product("Fiat Fullback", 82000);
        Product productSkoda = new Product("Skoda Octavia", 45000);
        Product productAudi = new Product("Audi A4", 90000);
        Product productFord = new Product("Ford mustang", 20000);
        Product productFiatTipo = new Product("Fiat Tipo", 52000);
        Product productCatering = new Product("Catering for event", 1300);
        Product productOfficeRent = new Product("Office rent", 25000);
        Product productFuelGasoline = new Product("Fuel, gasoline 95", 5.13);
        Product productFuelON = new Product("Fuel, oil", 5.02);
        Product productScrew = new Product("Screw", 3.2);
        Product productHammer = new Product("Hammer", 15.99);
        Product productPowerbank = new Product("Power bank", 15.99);
        Product productPhoneSamsung = new Product("Samsung Phone", 999.0);
        Product productPhoneApple = new Product("Apple Phone", 1299.99);
        Product productLaptopDell = new Product("Laptop, Dell Latitude", 1399.0);
        Product productLaptopApple = new Product("Laptop, Apple MacBook Pro", 1799.0);
        Product productServerDellPrecision = new Product("Server, Server Dell Precision", 2490.0);
        Product productPC = new Product("PC, Asus", 790.0);
        Product productCase = new Product("Case", 500.0);
        Product productSwitch = new Product("Network Switch", 130.0);
        Product productCoffeA = new Product("Coffe, Arabica", 29.99);
        Product productCoffeR = new Product("Coffe, Robusta", 39.99);
        Product productMug = new Product("Mug", 5.00);
        Product productPen = new Product("Pen", 0.99);
        Product productPencil = new Product("Pencil", 0.50);
        Product productClip = new Product("Clip", 2.49);
        Product productPuncher = new Product("Puncher", 0.79);
        Product productPaper = new Product("Paper", 9.99);
        Product productScisors = new Product("Scisors", 0.99);
        Product productFlour = new Product("Flour", 1.39);
        Product productSugar = new Product("Sugar", 1.87);
        Product productChocolate = new Product("Chocolate", 1.99);

        Company companyFallen = new Company("Fallen", "Detroit", 320, new ArrayList<>(Arrays.asList(
                new Purchase(productFiat, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 4), 18.1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 23.9, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 18), 41.8, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 37.2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 7.3, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 29), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 2), 21.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 43.3, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 10), 13.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 25.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 38.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 111.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 59.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 230.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 26), 18.3, UNIT.UNIT),

                new Purchase(productCoffeA, LocalDate.of(2018, 2, 15), 10.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 20), 10.0, UNIT.UNIT)
        )));

        Company companyPetersWifesCookies = new Company("Peters wifes cookies", "London", 12, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 25, UNIT.KILOGRAM),

                new Purchase(productFlour, LocalDate.of(2018, 1, 7), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 14), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 21), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 21), 25, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 7), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 14), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 21), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 28), 7, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 15), 25, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 28), 25, UNIT.KILOGRAM)
        )));

        Company companyTheOffice = new Company("Dunder Mifflin", "Detroit", 17, new ArrayList<>(Arrays.asList(
                new Purchase(productPaper, LocalDate.of(2018, 1, 1), 20.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 4), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 5), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 6), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 7), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productScisors, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 11), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 12), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 14), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 18), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 19), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 13.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 1, 21), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 25), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 26), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 27), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 28), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 29), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 30), 20.0, UNIT.UNIT),

                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 4), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 5), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 6), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 7), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 10), 20.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 2, 11), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 12), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 13), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 14), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 18), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 19), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 20), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 21), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 25), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 26), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 27), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT)
        )));

        Company transporting = new Company("Take me home", "London", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productSkoda, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFiatTipo, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productAudi, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 330.32, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 5), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 7), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 325.13, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 29), 325.13, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 1), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 7), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 9), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 325.13, UNIT.UNIT)
        )));

        Company companyTonysHardware = new Company("Tony's hardware", "Detroit", 2, new ArrayList<>(Arrays.asList(
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productScrew, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productFord, LocalDate.of(2018, 2, 20), 2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 70.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 20.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 35.0, UNIT.UNIT)
        )));

        Company companyTailor = new Company("Tailor Swift", "New York City", 3, new ArrayList<>(Arrays.asList(
                new Purchase(productScisors, LocalDate.of(2018, 1, 1), 3, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 2, UNIT.KILOGRAM),

                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 13), 3, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 18), 3, UNIT.UNIT)
        )));

        Company companyGoogleDublin = new Company("Google", "Dublin", 91, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 91, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 91, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 3), 20, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 91, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 5, UNIT.UNIT)
        )));


        Company companyGoogleLondon = new Company("Google", "London", 76, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 20, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 76, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 76, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 4, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 4, UNIT.UNIT)
        )));


        Company companyGoogleKijev = new Company("Google", "Kijev", 23, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 23, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 30.0, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));


        Company companyFintech = new Company("Fintech", "London", 9, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 5), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));

        Company companyFintechNewYork = new Company("Fintech", "New York City", 19, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 7, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productPowerbank, LocalDate.of(2018, 1, 1), 10, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 15.0, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 10), 3, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 1, 15), 2, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT)
        )));

        Company bakeryDetroit = new Company("Detroit Bakery", "Detroit", 11, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 200, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 50, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 132.53, UNIT.UNIT),
                new Purchase(productFlour, LocalDate.of(2018, 2, 1), 190, UNIT.KILOGRAM),
//                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 1), 79, UNIT.KILOGRAM)
        )));

        Company baltimoreFishing = new Company("Fisz", "Baltimore", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 500, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 500, UNIT.UNIT)
        )));

        Company solwit = new Company("Solwit", "Kijev", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productAudi, LocalDate.of(2018, 1, 2), 2, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 2), 89, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 12), 73.13, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 29), 67.33, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 13), 91.44, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 2), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 3), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 4), 1, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT)

        )));

        Company solwitGda = new Company("Solwit", "Gdansk", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 7), 1.0, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT)
        )));

        Company intelD = new Company("Intel", "Detroit", 755, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 10), 10, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 23.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 2, 20), 10, UNIT.UNIT)
        )));

        Company intelGda = new Company("Intel", "Gdansk", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        Company intelKij = new Company("Intel", "Kijev", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        List<Company> companies = new ArrayList<>(Arrays.asList(
                companyFallen,
                companyPetersWifesCookies,
                companyTheOffice,
                transporting,
                companyTonysHardware,
                companyTailor,
                companyGoogleDublin,
                companyGoogleLondon,
                companyGoogleKijev,
                companyFintech,
                companyFintechNewYork,
                bakeryDetroit,
                baltimoreFishing,
                solwitGda,
                solwit,
                intelD,
                intelGda,
                intelKij
        ));

        System.out.println(companies);
        System.out.println();
        companies.forEach(System.out::println);

        System.out.println();
        System.out.println("Zad. 1");
        zad_1_wylistujWszystkieFirmy(companies);

        System.out.println();
        System.out.println("Zad. 2");
        utilities.zad_2_wylistujFirmyZDetroit(companies);

        System.out.println();
        System.out.println("Zad. 3");
        utilities.zad_3_wylistujFirmyZLondynuIPosortujRosnacoPoIlosciPracownikow(companies);

        System.out.println();
        System.out.println("Zad. 4");
        utilities.zad_4_wylistujFirmyZWarszawyPosortujRosnacoPoIlosciZakupowIMalejacoPoIlosciPracownikow(companies);

        System.out.println();
        System.out.println("Zad. 5");
        Optional<Company> zad_5 = utilities.zad_5_firmaZKijowaZNajwiekszaIlosciaPracownikow(companies);
        if (zad_5.isPresent()) {
            Company company_zad_5 = zad_5.get();
            System.out.println(company_zad_5.getName() + " - " + company_zad_5.getCityHeadquarters()
            + " - " + company_zad_5.getEmployees());
        }

        System.out.println();
        System.out.println("Zad. 6");
        Optional<Company> opt_zad_6 =  utilities.zad_6_firmaZNajkrotszaNazwa(companies);
        if (opt_zad_6.isPresent()) {
            Company zad_6 = opt_zad_6.get();
            System.out.println(zad_6.getName());
        }

        System.out.println();
        System.out.println("Zad. 7");
        Optional<Company> opt_zad_7 =  utilities.zad_7_firmaNieKijevLondonDetroitZNajmniejszaIlosciaKupionychProduktow(companies);
        if (opt_zad_7.isPresent()) {
            Company zad_7 = opt_zad_7.get();
            System.out.println(zad_7.getName());
        }

        System.out.println();
        System.out.println("Zad. 8");
        utilities.zad_8_firmieZKijevIDetroitdodaj1Pracownika(companies);

        System.out.println();
        System.out.println("Zad. 9");
//        Map<String, Integer> zad_9 = utilities.zad_9_zwrocMapeKNazwaFirmyVIloscPracownikow(companies);
//        zad_9.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println();
        System.out.println("Zad. 9/2");
        Map<String, Integer> zad_9_2 = utilities.zad_9_2_zwrocMapeKNazwaFirmyVIloscPracownikow(companies);
        for (Map.Entry<String, Integer> entry : zad_9_2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value);
        }


        System.out.println();
        System.out.println("Zad. 10");
        Map<String, List<Company>> zad_10 = utilities.zad_10_mapaMiejscowoscListaFirmZTejMiejscowosci(companies);
        zad_10.forEach((k, v) -> System.out.println(k + " - " + v.size()));

        System.out.println();
        System.out.println("Zad. 10/2");
        Map<String, List<Company>> zad_10_2 = utilities.zad_10_2_mapaMiejscowoscListaFirmZTejMiejscowosci(companies);
        zad_10_2.forEach((k, v) -> System.out.println(k + " - " + v.size()));

        System.out.println();
        System.out.println("Zad. 11");
        Optional<Company> opt_zad_11 = utilities.zad_11_firmKtoraDokonalaZakupowNaNajwiekszaKwote(companies);
        if (opt_zad_11.isPresent()) {
            Company zad_11_comp = opt_zad_11.get();
            System.out.println(zad_11_comp.getName() + " - " + zad_11_comp.getCityHeadquarters());
        }

        System.out.println();
        System.out.println("Zad. 12");
        Optional<Company> opt_zad_12 = utilities.zad_11_firmKtoraDokonalaZakupowNaNajwiekszaKwote(companies);
        if (opt_zad_12.isPresent()) {
            Company zad_12_comp = opt_zad_12.get();
            System.out.println(zad_12_comp.getName() + " - " + zad_12_comp.getCityHeadquarters());
        }

        System.out.println();
        System.out.println("Zad. 13");
        Map<String, Double> map_zad_13 = utilities.zad_13_stworzMapeNazwaMiejscowosciKwotaWydanaPrzezFirmyZTejMiejscowosci(companies);
        map_zad_13.forEach((k, v) -> System.out.println(k + " - " + v));

        Set<Map.Entry<String, Double>> entrySet = map_zad_13.entrySet();
        OptionalDouble opt_zad_13 = entrySet.stream()
                .mapToDouble(Map.Entry::getValue)
                .max();

        System.out.println();
        if (opt_zad_13.isPresent()) {
            System.out.println(opt_zad_13.getAsDouble());

            for (Map.Entry<String, Double> stringDoubleEntry : entrySet) {
                if (stringDoubleEntry.getValue() == opt_zad_13.getAsDouble()) {
                    System.out.println(stringDoubleEntry.getKey() + " - " + stringDoubleEntry.getValue());
                }
            }
        }

        System.out.println();
        Optional<Double> opt_zad_13_2 = map_zad_13.values().stream()
                .max(Double::compareTo);
        opt_zad_13_2.ifPresent(System.out::println);

        System.out.println();
        System.out.println("Zad. 14");
        utilities.zad_14_wypiszFirmyKtoreKupily15Stycznia2018NetworkSwitch(companies);

        System.out.println();
        System.out.println("Zad. 15");
        Optional<Company> opt_zad_15 = utilities.zad_15_firmaKtoraKupujeNajwiecejKawy(companies);
        opt_zad_15.ifPresent(company -> System.out.println(company.getName()));

        System.out.println();
        System.out.println("Zad. 16");
        System.out.println(utilities.zad_16_zakupKawyArabicaWStyczniu(companies));

        System.out.println();
        System.out.println("Zad. 17");
        System.out.println(utilities.zad_17_ileRazemKawyArabicaIRobustaKupionoWDniParzyste(companies));

        System.out.println();
        System.out.println("Zad. 18");
        Map<Product, Set<Company>> map_zad_18 = utilities.zad_18_mapaTypKawySetFirmKupujacychKaweChocRaz(companies);
        map_zad_18.forEach((k, v) -> System.out.println(k + " - " + v.size()));

        System.out.println();
        System.out.println("Zad. 19");
        Optional<Company> opt_zad_19_bad = utilities.zad_19_bad_firmaKtoraWStyczniuKupilaNajwiecejPaliwaRopy(companies);
        opt_zad_19_bad.ifPresent(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));

        System.out.println();
        Optional<Company> opt_zad_19 = utilities.zad_19_firmaKtoraWStyczniuKupilaNajwiecejPaliwaRopy(companies);
        opt_zad_19.ifPresent(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));

        System.out.println();
        System.out.println("Zad. 20");
        Optional<Company> opt_zad_20 = utilities.zad_20_firmaOnajwiekszejProporcjiWydanychPienedzyDoIlosciPracownikow(companies);
        opt_zad_20.ifPresent(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));

        System.out.println();
        System.out.println("Zad. 21");
        Optional<Company> opt_zad_21 = utilities.zad_21_firmaKtoraNajwiecejWydajeNaArtykulyBiurowe(companies);
        opt_zad_21.ifPresent(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));

        System.out.println();
        System.out.println("Zad. 22_A");
        utilities.zad_22_A_firmyPosortowanePoIlosciWydanychPieniedzyNaPaliwo(companies);

        System.out.println();
        Map<Company, Double> zad_22_B = utilities.zad_22_B_firmyPosortowanePoIlosciWydanychPieniedzyNaPaliwo(companies);
        zad_22_B.forEach((k, v) -> System.out.println(k.getName() + " - " + k.getCityHeadquarters() + " - " + v));

        System.out.println();
        System.out.println("Zad. 23");
        Set<Product> zad_23 = utilities.zad_23_produktyKupioneNaKilogramy(companies);
        zad_23.forEach(System.out::println);

        System.out.println();
        System.out.println("Zad. 24");
        List<Purchase> zad_24 = utilities.zad_24_zakupyKupionePrzezFirmyZDetroitWLutymPosortowanePoKwocie(companies);
        zad_24.forEach(purchase -> System.out.println(purchase.getProduct().getName() + " - " + purchase.getProduct().getPrice() * purchase.getQuantity()));

        System.out.println();
        System.out.println("Zad. 25");
        System.out.println(utilities.zad_25_iloscBiurWynajetychWLutym(companies));

        System.out.println();
        System.out.println("Zad. 26");
        Map<Company, Double> zad_26 = utilities.zad_26_mapaFirmaIloscWynajetychBiur(companies);
        zad_26.forEach((k, v) -> System.out.println(k.getName() + " - " + k.getCityHeadquarters() + " - " + v));

        System.out.println();
        System.out.println("Zad. 27");
        utilities.zad_27_wypiszFirmyZamawiajaceTelefonyAppleOrazIlosciTychTelefonowPosortowaneMalejaco(companies);

        System.out.println();
        System.out.println("Zad. 28");
        utilities.zad_28_wypiszFirmyMajacesiedzibeWWiecejNizJednymMiesciePosortowanePoIlosciSiedzibGdyJestIchWiecejNiz1(companies);

        System.out.println();
        System.out.println("Zad. 29");
        System.out.println(utilities.zad_29_iloscKG_CukruZuzytaPrzezDetroitBakery(companies));

        System.out.println();
        System.out.println("Zad. 30");
        utilities.zad_30_wypiszZakupyFirmySolwit(companies);

        System.out.println();
        System.out.println("Zad. 31");
        utilities.zad_31_wypiszProduktyTanszeNiz3$(companies);

        System.out.println();
        System.out.println("Zad. 32");
        utilities.zad_32_wypiszIleSprzedanoNajtanszegoProduktu(companies);

        System.out.println();
        System.out.println("Zad. 33");
        utilities.zad_33_obliczIleSrednioPaliwaZuzylySamochodyFirmyTakeMeHome(companies);

        System.out.println();
        System.out.println("Zad. 35");
        utilities.zad_35_firmaKtorawydajeNajwiecejNaPapier(companies).ifPresent(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));

        System.out.println();
        System.out.println("Zad. 36");
        utilities.zad_36_produktyKupowaneWIlosciachWiekszychNiz50UnitKg(companies);

        System.out.println();
        System.out.println("Zad. 37");
        Map<String, Double> zad_37 = utilities.zad_37_mapaNazwaFirmyIleWydalaNaKawe(companies);
        zad_37.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println();
        System.out.println("Zad. 38");
        utilities.zad_38_wypiszSrednieZuzycieKawyNaPracownika(companies);

        System.out.println();
        System.out.println("Zad. 39");
        Optional<Map.Entry<Product, Double>> opt_zad_39 = utilities.zad_39_produktONajwiekszejPopularnosci(companies);
        if (opt_zad_39.isPresent()) {
            Map.Entry<Product, Double> m_e = opt_zad_39.get();
            System.out.println(m_e.getKey());
        }

        System.out.println();
        System.out.println("Zad. 40");
        Set<Product> zad_40 = utilities.zad_40_produktyKupowaneWKgIUnitach(companies);
        zad_40.forEach(System.out::println);

// Polecenie 1:
// Dane to Firmy oraz ich zakupy z miesi??ca stycze??/luty 2018.

// Wszystkie rozwi??zania zapisz w oddzielnych metodach statycznych w klasie Main.
// 1. Wylistuj (system out println) wszystkie firmy
// 2. Wylistuj wszystkie firmy kt??re s?? z Detroit
// 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilo??ci pracownik??w (rosn??co).
// 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilo??ci zakup??w (rosn??co) i ilo??ci pracownik??w (malej??co).
// 5. Zwr???? firm?? z najwi??ksz?? ilo??ci?? pracownik??w, kt??ra pochodzi z Kijowa.
// 6. Zwr???? firm?? z najkr??tsz?? nazw??
// 7. Zwr???? firm?? kt??ra nie pochodzi z Kijowa, Londynu i Detroit, kt??ra ma najmniej kupionych produkt??w.
// 8. Ka??dej firmie dodaj po 1 pracowniku, je??li pochodzi z Kijowa lub Detroit
// 9. ** Zwr???? MAP?? w kt??rej kluczem jest nazwa firmy, a warto??ci?? ilo???? pracownik??w w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
// 10.** Zwr???? Map?? w kt??rej kluczem jest miejscowo??????a warto??ci?? jest LISTA FIRM z tamtej miejscowo??ci (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
// 11. Zwr???? firm?? kt??ra dokona??a zakup??w na najwi??ksz?? kwot??
// 12. Zwr???? firm?? kt??ra kupi??a najwi??cej produkt??w za kwot?? wy??sz?? ni?? 10 k
// 13. *Zwr???? miejscowo??????kt??ra wyda??a najwi??cej pieni??dzy. Stw??rz map?? Map<String, Double> gdzie kluczem jest miejscowo????, a warto??ci?? jest kwota wydana przez firmy pochodz??ce z tamtej miejscowo??ci
// 14. Wypisz firmy kt??re 15 stycznia 2018 kupi??y "Network Switch"
// 15. Znajd?? firm?? kt??ra kupuje najwi??cej kawy
// 16. Wypisz ile ????cznie zosta??o kupionej kawy Arabica w miesi??cu styczniu
// 17. Wypisz ile ????cznie kawy (Arabica i Roubsta) zosta??o kupionej w dni parzyste.
// 18. Zwr???? Map?? (Map<Product, Set<Company>>) w kt??rej kluczem jest typ kawy (powinny by?? dwie, Arabica i Robusta) i warto??ci?? s????listy firm kt??re kupi??y podan?? kaw?? chocia?? raz.
// 19. Zwr???? firm?? kt??ra w styczniu kupi??a najwi??cej paliwa (ropy)
// 20. Zwr???? firm?? kt??rej proporcja wydanych pieni??dzy do ilo??ci pracownik??w jest najwy??sza
// 21. Zwr???? firm????kt??ra najwi??cej wydaje na artyku??y biurowe
// 22. Zwr???? firmy posortowane po ilo??ci wydanych pieni??dzy na paliwo (wydruk oraz mapa Map<Company, Double>)
// 23. Zwr???? wszystkie produkty kt??re kupione by??y na kilogramy
// 24. Zwr???? list?? zakup??w (obiekt??w purchase) kupionych przez firmy z Detroit w miesi??cu lutym. posortuj je po kwocie.
// 25. Zwr???? ilo???? biur kt??re wynaj??te by??y w miesi??cu lutym.
// 26. Zwr???? Map?? (Map<Company, Integer>). w mapie umie???? wpisy Firma - > ilo???? biur kt??re wynaj????y w dowolnym okresie.
// 27. *Wypisz "Nazwa firmy: XYZ, ilo???? zakupionych telefon??w apple: X" dla ka??dej firmy kt??ra kupi??a telefon apple. Wypisy powinny by?? posortowane (na szczycie powinna by?? firma kt??ra kupi??a ich najwi??cej).
// 28. Znajd?? firme??kt??ra posiada siedzib?? w wi??cej ni?? jednym mie??cie. Posortuj firmy po ilo??ci siedzib, wypisz tylko te kt??re maj?? wi??cej ni?? 1 siedzib??.
// 29. Wypisz ilo???? kilogram??w cukru zu??ywan?? przez "Detroit Bakery"
// 30. Wypisz wszystkie zakupy firmy "Solwit".
// 31. Wypisz wszystkie produkty kt??re s?? ta??sze (jednostkowo) ni?? 3$.
// 32. Wypisz ile sprzedano najta??szego produktu
// 33. Firma "Take me home" zajmuje si????transportem. Na pocz??tku dzia??alno??ci kupi??a wiele samochod??w do u??ytku. Oblicz ile litr??w paliwa (??rednio) spalaj?? ich samochody (zak??adamy ??e wszystkie pal?? benzyn?? i ??e tankowane s?? wszystkie.
// 34. Wypisz firm?? kt??ra zu??ywa najwi??cej kawy
// 35. Wypisz firm????kt??ra zu??ywa najwi??cej na papier.
// 36. Wypisz wszystkie produkty kt??re by??y kupowane w wi??kszych ilo??ciach ni?? 50 (jednostek/kilogram??w)
// 37. Wypisz ile ka??da z firm zu??ywa na kaw?? (ile pieni??dzy wydaje) (jako wynik zwr???? map?? Map<String, Double> gdzie kluczem jest nazwa firmy, warto??ci?? jest ilo???? pieni??dzy wydawanej na kaw??
// 38. Wypisz ??rednie zu??ycie kawy na pracownika (wypisz w postaci proporcji. Je??li firma kupi??a 30 kilogram??w i ma 20 pracownik??w to ma 1.5 kg / pracownika [w ca??o??ci okresu])
// 39. Wypisz jaki produkt poza paliwem cieszy si?? najwi??ksz????popularno??ci?? (zwr???? go) (find first)
// 40. Znajd?? produkty kt??re by??y kupowane zar??wno w kilogramach jak i w sztukach
// 40. Wymy??l 5 ciekawych zapyta?? i spr??buj je zrealizowa??. Najciekawsze polecenie otrzyma nagrod??-niespodziank?? z Baltimore :P


    }

    // 1. Wylistuj (system out println) wszystkie firmy
    private static void zad_1_wylistujWszystkieFirmy(List<Company> companies) {
        companies.forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters() + " - " + company.getPurchaseList().size()));
    }


}
