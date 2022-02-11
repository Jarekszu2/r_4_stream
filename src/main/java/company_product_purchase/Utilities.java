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
                .forEach(company -> System.out.println(company.getName()+ " - "
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
    Map<String, Integer> zad_9_zwrocMapeKNazwaFirmyVIloscPracownikow(List<Company> companies) {

        companies.forEach(company -> company.setName(company.getName().concat(" ").concat(company.getCityHeadquarters())));

        return companies.stream()
                .collect(Collectors.toMap(Company::getName, Company::getEmployees));
    }

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

}
