package com.app.expence.accounting.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
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
    @Column(name = "good_Title")
    String title;
    @Column(name = "good_price")
    double price;
    LocalDate dateOfCreate;

    @OneToMany(mappedBy = "good")
    Set<PuchaseComposition> puchaseCompositions = new HashSet<>();
}
