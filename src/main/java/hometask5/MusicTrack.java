package hometask5;

import java.util.Objects;

public class MusicTrack {
    private String track;
    private String artist;
    private String genre;

    public MusicTrack () {

    }

    MusicTrack (String track, String artist, String genre) {
        this.track = track;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTrack () {
        return this.track;
    }
    public String getArtist () {
        return this.artist;
    }
    public String getGenre () {
        return this.genre;
    }

    @Override
    public String toString () {
        return track + " - " + artist;
    }

    @Override
    public boolean equals (Object o) {
        return o instanceof MusicTrack musicTrack &&
                Objects.equals(track, musicTrack.track) &&
                Objects.equals(artist, musicTrack.artist) &&
                Objects.equals(genre, musicTrack.genre);
    }
    @Override
    public int hashCode () {
        return Objects.hash (track, artist, genre);
    }
}
