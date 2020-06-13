package com.ishikilab.chromiumdxplayer.model;

import android.graphics.Bitmap;

public class Song {
    private String title;
    private String artist;
    private long library_id;
    private long duration;
    private String lastKnownPath;
    private boolean isFav;
    private Bitmap album_image;
    public Song() {
        title = "Undefined";
        artist = "Ishiki Lab";
        library_id = -1;
        duration = 0;
        lastKnownPath = null;
        isFav = false;
    }
    public Song(String title,
                String artist,
                long library_id,
                long duration,
                String lastKnownPath,
                boolean isFav,
                Bitmap album_image)
    {
        this.title = title;
        this.artist = artist;
        this.library_id = library_id;
        this.duration = duration;
        this.lastKnownPath = lastKnownPath;
        this.isFav = isFav;
        this.album_image = album_image;
    }

    public void setTitle(String title) { this.title = title; }

    public void setArtist(String artist) { this.artist = artist; }

    public void setLibrary_id(long library_id) { this.library_id = library_id; }

    public void setDuration(long duration) { this.duration = duration; }

    public void setLastKnownPath(String lastKnownPath) { this.lastKnownPath = lastKnownPath; }

    public void setFav(boolean isFav) { this.isFav = isFav; }

    public void setAlbum_image(Bitmap album_image) { this.album_image = album_image; }

    public String getTitle() { return this.title; }

    public String getArtist() { return this.artist; }

    public long getLibrary_id() { return this.library_id; }

    public long getDuration() { return this.duration; }

    public String getLastKnownPath() { return this.lastKnownPath; }

    public boolean isFav() { return this.isFav; }

    public Bitmap getAlbum_image() { return this.album_image; }

}
