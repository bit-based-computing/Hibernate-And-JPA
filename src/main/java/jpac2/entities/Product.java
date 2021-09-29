package jpac2.entities;

import javax.persistence.*;
import java.time.LocalDate;

//@Entity
public class Product {

    @Id
    @TableGenerator(name = "key_generator",
            table = "key_generator",
            pkColumnName = "sequence_name",
            pkColumnValue = "product",
            valueColumnName = "next_val",
            allocationSize = 50
    )
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
    private Integer id;

    private String name;
    private Double price;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
