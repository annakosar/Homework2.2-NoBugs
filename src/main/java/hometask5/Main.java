package hometask5;

public class Main {
    public static void main (String[] args) {

        MusicTrack musicTrack1 = new MusicTrack ("Shape Of You", "Ed Sheeran", "Pop");
        MusicTrack musicTrack2 = new MusicTrack ("Bohemian Rhapsody", "Queen", "Rock");
        MusicTrack musicTrack3 = new MusicTrack ("Bad Guy", "Billie Eilish", "Pop");
        MusicTrack musicTrack4 = new MusicTrack ("Take On Me", "a-ha", "Pop");
        MusicTrack musicTrack5 = new MusicTrack ("Hotel California", "Eagles", "Rock");


        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addTrackToLibrary(musicTrack1);
        musicLibrary.addTrackToLibrary(musicTrack2);
        musicLibrary.addTrackToLibrary(musicTrack3);
        musicLibrary.addTrackToLibrary(musicTrack4);
        musicLibrary.addTrackToLibrary(musicTrack5);

        System.out.println("Список всех треков:");
        System.out.println(musicLibrary.getTracksAndGenre());

        musicLibrary.removeTrack(musicTrack1);
        System.out.println("Список после удаления трека:");
        System.out.println(musicLibrary.getTracksAndGenre());

        musicLibrary.getTrackByGenre("Pop");




    }
}
