package com.media.store.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("music_album")
public class MusicAlbum extends BaseProduct{

    String singerName;
    String numberOfSongs;
}
