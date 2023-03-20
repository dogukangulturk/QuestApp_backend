package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private Long id;

    private String userName;

    private String password;
}
