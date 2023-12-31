package dono.daryo.entity;

import dono.daryo.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AccountDetails")
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity {


    private String name;
    private String address;
    private String country;
    private String city;
    private String state;

    private Integer age;
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;



    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;


    public AccountDetails(String name, String address, String country, String city, String state, Integer age, String postalCode, Role role) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.state = state;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }
}
