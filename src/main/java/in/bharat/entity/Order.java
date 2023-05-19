package in.bharat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "payment_mode", nullable = false)
    private String paymentMode;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    @Column(name = "product_price", nullable = false)
    private Long price;
}
