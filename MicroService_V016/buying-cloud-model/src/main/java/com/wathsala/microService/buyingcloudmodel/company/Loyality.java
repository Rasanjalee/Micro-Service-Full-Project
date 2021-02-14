package com.wathsala.microService.buyingcloudmodel.company;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author acer on 2/13/2021
 */
@Entity
@Table(name = "loyalityPoint")
@Data
public class Loyality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int transactionId;
    @ManyToOne
    @JoinColumn
    Company company;
    int point;
    LocalDateTime expireDate;
}
