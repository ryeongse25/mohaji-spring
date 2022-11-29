package sesac.mohaji.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    private String password;
    private String email;
}
