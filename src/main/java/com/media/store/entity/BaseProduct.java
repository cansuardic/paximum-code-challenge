package com.media.store.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public class BaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String name;
    String genre;
    String releaseDate;
    String basePrice;
    String finalPrice;

}
