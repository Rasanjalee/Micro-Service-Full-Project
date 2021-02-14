package com.wathsala.microService.buyingcloudmodel.transaction;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author acer on 2/13/2021
 */
@Entity
@Table(name = "buying")
@Data
public class Buying {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int buyingId;
    int companyId;
    int itemId;
    String buyingLocation;
    LocalDateTime buyingDate;
    int amount;


}
