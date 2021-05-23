package kodlama.io.northwind.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    int id;

    @Column(name = "category_id")
    int categoryId;

    @Column(name = "product_name")
    String productName;

    @Column(name = "unit_price")
    double unitPrice;

    @Column(name = "units_in_stock")
    short unitsInStock;

    @Column(name = "quantityPerUnit")
    String quantityPerUnit;

}
