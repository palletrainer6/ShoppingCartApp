package in.bharat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "product_id")
    private Integer id;
    @Column(name= "product_name", nullable = false)
    private String name;
    @Column(name= "product_price", nullable = false)
    private Long price;
    @Column(name= "product_description", nullable = false)
    private String description;
    @Column(name= "product_brand", nullable = false)
    private String brand;
}
