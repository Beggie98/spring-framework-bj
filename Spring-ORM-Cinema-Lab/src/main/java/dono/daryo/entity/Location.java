package dono.daryo.entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity {


    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String country;
    private String city;
    private String state;
    private Integer postalCode;
    private String address;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Cinema> cinema;

}
