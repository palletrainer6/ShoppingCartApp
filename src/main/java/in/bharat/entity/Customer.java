package in.bharat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="customers")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Integer id;
    @Column(name="customer_name", nullable = false)
    private String name;
    @Column(name="customer_email", nullable = false)
    private String email;
    @Column(name="customer_mobile", nullable = false)
    private Long mobile;
    @Column(name="customer_address", nullable = false)
    private String address;

   /*
   public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
    }
    public Customer(String name, String email, Long mobile, String address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }
    public Customer(Integer id, String name, String email, Long mobile, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(mobile, customer.mobile) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, mobile, address);
    }*/
}
