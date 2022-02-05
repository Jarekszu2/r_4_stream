package company_product_purchase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Purchase {
    private Product product;        // produkt zakupiony
    private LocalDate purchaseDate; // data dokonania zakupu
    private double quantity;        // zakupiona ilość produktu
    private UNIT unit;              // jednostka zakupu (np. w gramach)
}
