package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity(name = "users")
@Table(name = "tb_user")
public class User extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String firstname;

    @Column(nullable = false)
    public String lastname;

    @Column(unique = true, nullable = false)
    public String document;

    public Double balance;
}
