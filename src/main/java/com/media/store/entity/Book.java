package com.media.store.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("book")
public class Book extends BaseProduct{

    String ISBN;
    String writerName;
}
