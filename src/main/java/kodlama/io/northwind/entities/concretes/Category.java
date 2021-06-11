package kodlama.io.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
@Entity
@JsonIgnoreProperties({"hibernateLazInitializer", "handler", "products"})
// sorgu loopa girmesin(productun categorysi var categoriynin product list i var) diye tembel yükleme mimarisi
public class Category {
    @Id
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private int name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
