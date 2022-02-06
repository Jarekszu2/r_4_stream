package company_product_purchase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
}
