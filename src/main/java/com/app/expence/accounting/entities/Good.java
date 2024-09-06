package com.app.expence.accounting.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "goods")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Good {

    @Id
    @Column(name = "id_goods")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "good_Title",unique = true)
    String title;
    @Column(name = "good_price")
    double price;
    LocalDate dateOfCreate;
    @ManyToMany
    @JoinTable(
            name = "purchase_composition",
            joinColumns = {@JoinColumn(name = "id_goods")},
            inverseJoinColumns = {@JoinColumn(name = "id_cheque")},
    )

}
