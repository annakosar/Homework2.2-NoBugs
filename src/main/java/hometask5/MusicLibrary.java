package hometask5;

import java.util.HashMap;
import java.util.HashSet;

public class MusicLibrary {
    private HashSet <MusicTrack> musicTracks;
    private HashMap <String, HashSet <MusicTrack>> tracksAndGenre;

    public MusicLibrary (HashSet <MusicTrack> musicTracks) {
        this.musicTracks = musicTracks;
    }
    public MusicLibrary (HashMap <String, HashSet <MusicTrack>> tracksByGenre) {
        this.tracksAndGenre = tracksByGenre;
    }

    public MusicLibrary () {
        this.tracksAndGenre = new HashMap<>();
        this.musicTracks = new HashSet<>();
    }

    public void addTrack (MusicTrack newTrack) {
        this.musicTracks.add (newTrack);
    }

    public HashSet <MusicTrack> getMusicTracks () {
        return this.musicTracks;
    }

    //добавить трек к жанру или создать новый жанр, если ранее его не было
    public void addTrackToLibrary (MusicTrack newMusicTrack) {
        String genre = newMusicTrack.getGenre();
        this.tracksAndGenre.putIfAbsent (genre, new HashSet<>());
        this.tracksAndGenre.get(genre).add(newMusicTrack);
    }
    public HashMap <String, HashSet <MusicTrack>> getTracksAndGenre() {
        return this.tracksAndGenre;
    }

    public void removeTrack (MusicTrack oldTrack) {
        this.musicTracks.remove(oldTrack);
        String genre = oldTrack.getGenre ();
        if (this.tracksAndGenre.containsKey(genre)) {
            this.tracksAndGenre.get(genre).remove(oldTrack);
            if (this.tracksAndGenre.get(genre).isEmpty()) {  // Если после удаления трека в жанре больше нет треков
                this.tracksAndGenre.remove(genre);  // Удаляем сам жанр из коллекции
            }
        }

    }

    //получение всех треков заданного жанра
    public void getTrackByGenre (String genreName) {
        if (this.tracksAndGenre.containsKey(genreName)) {
            System.out.println(genreName + " tracks: " + this.tracksAndGenre.get (genreName));
        }
        else {
            System.out.println(genreName + " tracks not found");
        }
    }


}
