package com.app.expence.accounting.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="cheques")
public class Cheque {
    @Id
    @Column(name = "id_cheque")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long checkId;
    LocalDate dateOfPurchase;

    @OneToMany(mappedBy = "cheque")
    Set<PuchaseComposition> puchaseCompositions;


}