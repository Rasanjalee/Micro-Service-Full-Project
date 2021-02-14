package com.wathsala.microService.authorizationserver.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author acer on 2/10/2021
 */
@Entity
@Table(name = "permission")
@Data
public class Permission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;
}
