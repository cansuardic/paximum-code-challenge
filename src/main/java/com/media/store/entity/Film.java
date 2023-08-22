package com.media.store.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("film")
public class Film extends BaseProduct{

    String directorName;
    String rate;
}
