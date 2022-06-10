package com.api.kakeibo_api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    /**
     * User Entity
     */
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> role = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Expense> expenses = new ArrayList<>();

}
