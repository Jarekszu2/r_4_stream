package company_product_purchase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
}
