package dono.daryo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "UserAccount")
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity {



    private String email;
    private String password;
    private String username;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;



    public UserAccount(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
