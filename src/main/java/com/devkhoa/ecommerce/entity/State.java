package com.devkhoa.ecommerce.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class State {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
}
