package company_product_purchase;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Utilities {

    // 2. Wylistuj wszystkie firmy które są z Detroit
    void zad_2_wylistujFirmyZDetroit(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));
    }

    // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
    void zad_3_wylistujFirmyZLondynuIPosortujRosnacoPoIlosciPracownikow(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("London"))
                .sorted(Comparator.comparingInt(Company::getEmployees))
                .forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters() + " - " + company.getEmployees()));
    }

    // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
    void zad_4_wylistujFirmyZWarszawyPosortujRosnacoPoIlosciZakupowIMalejacoPoIlosciPracownikow(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("London"))
                .sorted((o1, o2) -> {
                    if (o1.getPurchaseList().size() > o2.getPurchaseList().size()) {
                        return 1;
                    }
                    if (o1.getPurchaseList().size() < o2.getPurchaseList().size()) {
                        return -1;
                    }
                    return Integer.compare(o2.getEmployees(), o1.getEmployees());
                })
                .forEach(company -> System.out.println(company.getName() + " - "
                        + company.getCityHeadquarters() + " - " + company.getPurchaseList().size()
                        + " - " + company.getEmployees()));
    }

    // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
    Optional<Company> zad_5_firmaZKijowaZNajwiekszaIlosciaPracownikow(List<Company> companies) {
        return companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Kijev"))
                .max(Comparator.comparingInt(Company::getEmployees));
    }

    // 6. Zwróć firmę z najkrótszą nazwą
    Optional<Company> zad_6_firmaZNajkrotszaNazwa(List<Company> companies) {
        return companies.stream()
                .min(Comparator.comparingInt(value -> value.getName().length()));
    }

    // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
    Optional<Company> zad_7_firmaNieKijevLondonDetroitZNajmniejszaIlosciaKupionychProduktow(List<Company> companies) {
        return companies.stream()
                .filter(company -> !company.getCityHeadquarters().equals("Kijev") && !company.getCityHeadquarters().equals("London") && !company.getCityHeadquarters().equals("Detroit"))
                .min(Comparator.comparingInt(value -> value.getPurchaseList().size()));
    }

    // 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
    void zad_8_firmieZKijevIDetroitdodaj1Pracownika(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Kijev") || company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters() + " - " + company.getEmployees()));

        System.out.println();

        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Kijev") || company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> company.setEmployees(company.getEmployees() + 1));

        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Kijev") || company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters() + " - " + company.getEmployees()));
    }

    // 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
//    Map<String, Integer> zad_9_zwrocMapeKNazwaFirmyVIloscPracownikow(List<Company> companies) {
//
//        companies.forEach(company -> company.setName(company.getName().concat(" ").concat(company.getCityHeadquarters())));
//
//        return companies.stream()
//                .collect(Collectors.toMap(Company::getName, Company::getEmployees));
//    }

    Map<String, Integer> zad_9_2_zwrocMapeKNazwaFirmyVIloscPracownikow(List<Company> companies) {

        Map<String, List<Company>> map = companies.stream()
                .collect(Collectors.groupingBy(Company::getCityHeadquarters, Collectors.toList()));

        return map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, o -> o.getValue().stream().mapToInt(Company::getEmployees).sum()));
    }

    // 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
    Map<String, List<Company>> zad_10_mapaMiejscowoscListaFirmZTejMiejscowosci(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.groupingBy(Company::getCityHeadquarters));
    }

    Map<String, List<Company>> zad_10_2_mapaMiejscowoscListaFirmZTejMiejscowosci(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.groupingBy(Company::getCityHeadquarters, Collectors.toList()));
    }

    // 11. Zwróć firmę która dokonała zakupów na największą kwotę
    Optional<Company> zad_11_firmKtoraDokonalaZakupowNaNajwiekszaKwote(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                        .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity()).sum()));

    }

    // 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
    Optional<Company> zad_12_firmaKtoraKupilaNajwiecejProduktowZaKwoteWiekszaNiz10k(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                        .mapToDouble(Purchase::getQuantity).sum()));
    }

    // 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość, a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości
    Map<String, Double> zad_13_stworzMapeNazwaMiejscowosciKwotaWydanaPrzezFirmyZTejMiejscowosci(List<Company> companies) {
        Set<String> stringSet = companies.stream()
                .map(Company::getCityHeadquarters).collect(Collectors.toSet());

        return stringSet.stream().collect(Collectors.toMap(
                o -> o,
                o -> companies.stream()
                        .filter(company -> company.getCityHeadquarters().equals(o))
                        .mapToDouble(value -> value.getPurchaseList().stream()
                                .mapToDouble(value1 -> value1.getQuantity() * value1.getProduct().getPrice())
                                .sum())
                        .sum()
        ));
    }

    // 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
    void zad_14_wypiszFirmyKtoreKupily15Stycznia2018NetworkSwitch(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getPurchaseList().stream()
                        .anyMatch(purchase -> purchase.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15)) && purchase.getProduct().getName().equals("Network Switch")))
                .forEach(company -> System.out.println(company.getName()));
    }

    // 15. Znajdź firmę która kupuje najwięcej kawy
    Optional<Company> zad_15_firmaKtoraKupujeNajwiecejKawy(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                        .mapToDouble(Purchase::getQuantity)
                        .sum()));
    }

    // 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
    double zad_16_zakupKawyArabicaWStyczniu(List<Company> companies) {
        return companies.stream()
                .flatMap(company -> company.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getName().equals("Coffe, Arabica")
                                && purchase.getPurchaseDate().getMonth().getValue() == 1))
                .mapToDouble(Purchase::getQuantity).sum();
    }

    // 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.
    double zad_17_ileRazemKawyArabicaIRobustaKupionoWDniParzyste(List<Company> companies) {
        return companies.stream()
                .flatMap(company -> company.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Coff")
                                && (purchase.getPurchaseDate().getDayOfMonth() % 2) == 0))
                .mapToDouble(Purchase::getQuantity).sum();
    }

    // 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły podaną kawę chociaż raz.
    Map<Product, Set<Company>> zad_18_mapaTypKawySetFirmKupujacychKaweChocRaz(List<Company> companies) {
        Set<Product> products = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream()
                        .map(Purchase::getProduct)
                        .filter(product -> product.getName().startsWith("Coff")))
                .collect(Collectors.toSet());

        return products.stream().collect(Collectors.toMap(
                o -> o,
                o -> companies.stream()
                        .filter(company -> company.getPurchaseList().stream()
                                .anyMatch(purchase -> purchase.getProduct().getName().startsWith("Coff")))
                        .collect(Collectors.toSet())));

    }

    // 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
    Optional<Company> zad_19_bad_firmaKtoraWStyczniuKupilaNajwiecejPaliwaRopy(List<Company> companies) {
        return companies.stream()
                .filter(company -> company.getPurchaseList().stream()
                        .anyMatch(purchase -> purchase.getProduct().getName().equals("Fuel, oil")
                                && purchase.getPurchaseDate().getMonthValue() == 1))
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream().mapToDouble(Purchase::getQuantity).sum()));
    }

    Optional<Company> zad_19_firmaKtoraWStyczniuKupilaNajwiecejPaliwaRopy(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(
                        value -> value.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Fuel, oil")
                                        && purchase.getPurchaseDate().getMonthValue() == 1)
                                .mapToDouble(Purchase::getQuantity).sum()
                ));
    }

    // 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa
    Optional<Company> zad_20_firmaOnajwiekszejProporcjiWydanychPienedzyDoIlosciPracownikow(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                        .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice()).sum() / value.getEmployees()));
    }

    // 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe
    Optional<Company> zad_21_firmaKtoraNajwiecejWydajeNaArtykulyBiurowe(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(
                        value -> value.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Pen")
                                        || purchase.getProduct().getName().equals("Pencil")
                                        || purchase.getProduct().getName().equals("Clip")
                                        || purchase.getProduct().getName().equals("Puncher")
                                        || purchase.getProduct().getName().equals("Paper")
                                        || purchase.getProduct().getName().equals("Paper"))
                                .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity()).sum()
                ));
    }

    // 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo (wydruk oraz mapa Map<Company, Double>

    void zad_22_A_firmyPosortowanePoIlosciWydanychPieniedzyNaPaliwo(List<Company> companies) {
        companies.stream()
                .sorted(Comparator.comparingDouble(
                        value -> value.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel"))
                                .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity()).sum()
                )).forEach(company -> System.out.println(company.getName() + " - " + company.getCityHeadquarters()));
    }

    Map<Company, Double> zad_22_B_firmyPosortowanePoIlosciWydanychPieniedzyNaPaliwo(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel"))
                                .mapToDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity()).sum()))
                .entrySet()
                .stream()
//                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    // 23. Zwróć wszystkie produkty które kupione były na kilogramy
    Set<Product> zad_23_produktyKupioneNaKilogramy(List<Company> companies) {
        return companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM))
                .map(Purchase::getProduct)
                .collect(Collectors.toSet());
    }

    // 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.
    List<Purchase> zad_24_zakupyKupionePrzezFirmyZDetroitWLutymPosortowanePoKwocie(List<Company> companies) {
        return companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
                .sorted(Comparator.comparingDouble(value -> value.getProduct().getPrice() * value.getQuantity()))
                .collect(Collectors.toList());
    }

    // 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
    double zad_25_iloscBiurWynajetychWLutym(List<Company> companies) {
        return companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().equals("Office rent")
                        && purchase.getPurchaseDate().getMonthValue() == 2)
                .mapToDouble(Purchase::getQuantity)
                .sum();
    }

    // 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.
    Map<Company, Double> zad_26_mapaFirmaIloscWynajetychBiur(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Office rent"))
                                .mapToDouble(Purchase::getQuantity)
                                .sum()));
    }

    // 26.2 Jak 26 tylko kluczem jest nazwa firmy (klucz ma kilka wartości)
    Map<String, Double> zad_26_2_mapaNazwaFirmy_iloscWynajetychBiur(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Office rent"))
                                .mapToDouble(Purchase::getQuantity)
                                .sum(), (o, o2) -> o + o2));    // merging, gdy jakiś klucz ma kilka wartości
                                                                // (o, o2) -> o + o2) - kryterium, co zrobić z wartościami, dany klucz ma wiecej niż jedną wartość
    }

    // 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X" dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej).
    void zad_27_wypiszFirmyZamawiajaceTelefonyAppleOrazIlosciTychTelefonowPosortowaneMalejaco(List<Company> companies) {
        Map<Company, Double> map = companies.stream()
                // filtr, który przepuszcza tylko firmy spełniające warunek - zakup tel. Apple
                // .filter(company -> company.getPurchaseList().stream().anyMatch(purchase -> purchase.getProduct().getName().equals("Apple Phone"))) // na wydruku wyniku nie trzeba robić seta z warunkiem value != 0
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getName().equals("Apple Phone"))
                                .mapToDouble(Purchase::getQuantity)
                                .sum()
                )).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        map.forEach((k, v) -> System.out.println(k.getName() + " - " + v));

        System.out.println();
        Set<Map.Entry<Company, Double>> entrySet = map.entrySet();
        for (Map.Entry<Company, Double> e : entrySet) {
            if (e.getValue() != 0) {
                System.out.println(e.getKey().getName() + " - " + e.getValue());
            }
        }
    }

    // 28. Znajdź firme która posiada siedzibę w więcej niż jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te które mają więcej niż 1 siedzibę.
    void zad_28_wypiszFirmyMajacesiedzibeWWiecejNizJednymMiesciePosortowanePoIlosciSiedzibGdyJestIchWiecejNiz1(List<Company> companies) {
        Set<String> set = companies.stream()
                .map(Company::getName)
                .collect(Collectors.toSet());
//        set.forEach(System.out::println);

        Map<String, Integer> map = set.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> (int) companies.stream().filter(company -> company.getName().equals(s)).count()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
//        System.out.println();
//        map.forEach((k, v) -> System.out.println(k + " - " + v));

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " - " + e.getValue());
            }
        }
    }

    // 29. Wypisz ilość kilogramów cukru zużywaną przez "Detroit Bakery"
    double zad_29_iloscKG_CukruZuzytaPrzezDetroitBakery(List<Company> companies) {
        return companies.stream()
                .filter(company -> company.getName().equals("Detroit Bakery"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().equals("Sugar"))
                .mapToDouble(Purchase::getQuantity).sum();
    }

    // 30. Wypisz wszystkie zakupy firmy "Solwit".
    void zad_30_wypiszZakupyFirmySolwit(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getName().equals("Solwit"))
                .flatMap(company -> company.getPurchaseList().stream())
                .forEach(System.out::println);
    }

    // 31. Wypisz wszystkie produkty które są tańsze (jednostkowo) niż 3$.
    void zad_31_wypiszProduktyTanszeNiz3$(List<Company> companies) {
        companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(Purchase::getProduct)
                .filter(product -> product.getPrice() < 3)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    // 32. Wypisz ile sprzedano najtańszego produktu
    void zad_32_wypiszIleSprzedanoNajtanszegoProduktu(List<Company> companies) {
        Optional<Product> opt_zad_32 = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(Purchase::getProduct)
                .min(Comparator.comparingDouble(Product::getPrice));

        if (opt_zad_32.isPresent()) {
            System.out.println(opt_zad_32.get());

            double how_many =  companies.stream()
                    .flatMap(company -> company.getPurchaseList().stream())
                    .filter(purchase -> purchase.getProduct().equals(opt_zad_32.get()))
                    .mapToDouble(Purchase::getQuantity).sum();

//            System.out.println();
            System.out.println(how_many);
        }
    }

    // 33. Firma "Take me home" zajmuje się transportem. Na początku działalności kupiła wiele samochodów do użytku. Oblicz ile litrów paliwa (średnio) spalają ich samochody (zakładamy że wszystkie palą benzynę i że tankowane są wszystkie.
    void zad_33_obliczIleSrednioPaliwaZuzylySamochodyFirmyTakeMeHome(List<Company> companies) {
        double ileSamochodow = companies.stream()
                .filter(company -> company.getName().startsWith("Take"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().equals("Fiat Fullback")
                || purchase.getProduct().getName().equals("Skoda Octavia")
                || purchase.getProduct().getName().equals("Audi A4")
                || purchase.getProduct().getName().equals("Ford mustang")
                || purchase.getProduct().getName().equals("Fiat Tipo"))
                .mapToDouble(Purchase::getQuantity).sum();

        System.out.println("cars: " + ileSamochodow );

        double ilePaliwa = companies.stream()
                .filter(company -> company.getName().startsWith("Take"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().equals("Fuel, gasoline 95"))
                .mapToDouble(Purchase::getQuantity).sum();

        System.out.println("gasoline: " + ilePaliwa);
        System.out.println("average: " + ilePaliwa / ileSamochodow);
    }

    // 34. Wypisz firmę która zużywa najwięcej kawy
    Optional<Company> zad_34_firmaKtoraZuzywaNajwiecejKawy(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                .mapToDouble(Purchase::getQuantity).sum()));
    }

    // 35. Wypisz firmę która zużywa najwięcej na papier.
    Optional<Company> zad_35_firmaKtorawydajeNajwiecejNaPapier(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                .filter(purchase -> purchase.getProduct().getName().equals("Paper"))
                .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity())
                .sum()));
    }

    // 36. Wypisz wszystkie produkty które były kupowane w większych ilościach niż 50 (jednostek/kilogramów)
    void zad_36_produktyKupowaneWIlosciachWiekszychNiz50UnitKg(List<Company> companies) {
        companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getQuantity() > 50)
                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM) || purchase.getUnit().equals(UNIT.UNIT))
                .map(Purchase::getProduct)
                .collect(Collectors.toSet())
                .forEach(product -> System.out.println(product.getName()));
    }

    // 37. Wypisz ile każda z firm zużywa na kawę (ile pieniędzy wydaje) (jako wynik zwróć mapę Map<String, Double> gdzie kluczem jest nazwa firmy, wartością jest ilość pieniędzy wydawanej na kawę
    Map<String, Double> zad_37_mapaNazwaFirmyIleWydalaNaKawe(List<Company> companies) {
        Set<String> stringSet = companies.stream()
                .map(Company::getName)
                .collect(Collectors.toSet());

        return stringSet.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> companies.stream().filter(company -> company.getName().equals(s))
                            .flatMap(company -> company.getPurchaseList().stream())
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(value -> value.getProduct().getPrice() * value.getQuantity())
                            .sum()
                ));
    }

    // 38. Wypisz średnie zużycie kawy na pracownika (wypisz w postaci proporcji. Jeśli firma kupiła 30 kilogramów i ma 20 pracowników to ma 1.5 kg / pracownika [w całości okresu])
    void zad_38_wypiszSrednieZuzycieKawyNaPracownika(List<Company> companies) {
                companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(Purchase::getQuantity).sum() / c.getEmployees()))
                        .forEach((k, v) -> System.out.println(k.getName() + " " + k.getCityHeadquarters() + " - " + v));
    }

    // 39. Wypisz jaki produkt poza paliwem cieszy się największą popularnością (zwróć go) (find first)
//    największa popularność - tzn. kupiony w najwiekszej ilości
    Optional<Map.Entry<Product, Double>> zad_39_produktONajwiekszejPopularnosci(List<Company> companies) {
        Set<Product> products = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> !purchase.getProduct().getName().startsWith("Fuel"))
                .map(Purchase::getProduct)
                .collect(Collectors.toSet());

        Map<Product, Double> map = products.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .flatMap(company -> company.getPurchaseList().stream())
                            .filter(purchase -> purchase.getProduct().equals(p))
                            .mapToDouble(Purchase::getQuantity)
                            .sum()));

        Map<Product, Double> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        sortedMap.forEach((k, v) -> System.out.println(k.getName() + " - " + v));
        System.out.println();

        return map.entrySet().stream().min(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    }

    // 40. Znajdź produkty które były kupowane zarówno w kilogramach jak i w sztukach
    Set<Product> zad_40_produktyKupowaneWKgIUnitach(List<Company> companies) {
        Set<Product> productSet = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(Purchase::getProduct)
                .collect(Collectors.toSet());

        Map<Product, Set<UNIT>> map = productSet.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .flatMap(company -> company.getPurchaseList().stream())
                            .filter(purchase -> purchase.getProduct().equals(p))
                            .map(Purchase::getUnit)
                            .collect(Collectors.toSet())));

        Map<Product, Set<UNIT>> sortedMap = map.entrySet().stream()
                .filter(productSetEntry -> productSetEntry.getValue().size() > 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new
                ));

        return sortedMap.keySet();
    }
}
