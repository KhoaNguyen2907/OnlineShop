package com.devkhoa.ecommerce.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "country")
    private Set<State> states;

}
