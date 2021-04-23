package android.example.musicplayer;

public class Song {

    private final String mName;
    private final String mAlbum;
    private final String mArtist;
    private int mImage = R.drawable.songimage;


    public Song(String name, String artist, String album) {
        mName = name;
        mArtist = artist;
        mAlbum = album;
    }

    public Song(String name, String artist, String album, int image) {
        mName = name;
        mArtist = artist;
        mAlbum = album;
        mImage = image;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public String getmArtist() {
        return mArtist;
    }

    public String getmName() {
        return mName;
    }

    public int getmImage(){ return mImage; }

}
