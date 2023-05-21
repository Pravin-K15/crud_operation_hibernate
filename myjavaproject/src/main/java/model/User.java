package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="users")
//@NoArgsConstructor
//@RequiredArgsConstructor
public class User {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="user_id")
private Long user_id;

@Column(name="username")
private String username;
	
@Column(name="password")
private String password;

@Column(name="fullname")
private String fullname;

@Column(name="email")
private String email;

@Override
public String toString() {
    return "User{" +
            "user_id=" + user_id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", fullname='" + fullname + '\'' +
            ", email=" + email +
            '}';
}

}
