package com.app.expence.accounting.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Puchase_Compositions")
public class PuchaseComposition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "id_goods")
    Good good;

    @ManyToOne
    @JoinColumn(name = "id_cheque")
    Cheque cheque;
    int amount;
    LocalDate dateOfPurchase;

}
