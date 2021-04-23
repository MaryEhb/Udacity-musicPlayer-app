package android.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Songs Classes
//        The Playlist I am Listening To :)
        ArrayList<Song> songsListArray = new ArrayList<>();
        songsListArray.add(new Song("A Sky Full Of Stars", "Coldplay", "Ghost Stories",R.drawable.sky_full_of_stars));
        songsListArray.add(new Song("Adore You", "Harry Styles", "Fine Line",R.drawable.harry_styles_adore_you));
        songsListArray.add(new Song("All Star", "Smash Mouth", "Astro Lounge",R.drawable.all_star));
        songsListArray.add(new Song("Call Out My Name", "The Weeknd", "My Dear Melancholy", R.drawable.call_out_my_name));
        songsListArray.add(new Song("Cellophane", "Sia", "1000 Forms of Fear", R.drawable.sia));
        songsListArray.add(new Song("Chan Chan", "Buena Vista Social Club", "Buena Vista Social Club", R.drawable.buena_chan));
        songsListArray.add(new Song("Everything I Wanted", "Billie Eilish", "Everything I Wanted", R.drawable.billie_eilish_everything_i_wanted));
        songsListArray.add(new Song("Faith", "The Weekend", "After Hours", R.drawable.faith_weekend));
        songsListArray.add(new Song("Fire On Fire", "Sam Smith", "Love Goes", R.drawable.fire_on_fire_sam_smith));
        songsListArray.add(new Song("Glassy Sky", "Amalee", "Total Coverage, Vol.3", R.drawable.glassy_sky));
        songsListArray.add(new Song("One Last Time", "Ariana Grande", "My Everything"));
        songsListArray.add(new Song("Maak Alby", "Amr Diab", "Ahla W Ahla"));
        songsListArray.add(new Song("Baila Conmigo", "Selena Gomez", "Cuelgo Tu"));
        songsListArray.add(new Song("Sabah Wu Masaa", "Fairuz", "Wala Keef"));
        songsListArray.add(new Song("The End Of The World", "Billie Eilish", "(Single)"));
        songsListArray.add(new Song("Thief", "Ansel Elgort", "(single)"));
        songsListArray.add(new Song("Wehyat Eneek", "Amr Diab", "(Single)"));

//      The Adaptor that will add the songs classes to the ListView In The MainActivity
        SongListAdaptor adaptor = new SongListAdaptor(this, songsListArray);

//      The ListView In the MainActivity
        ListView listview = (ListView) findViewById(R.id.songs_list);
        listview.setAdapter(adaptor);

//      Adding ClickEventListener To Each ListView Item In The MainActivity
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // song info
                String name = adaptor.getItem(position).getmName();
                String artist = adaptor.getItem(position).getmArtist();
                String album = adaptor.getItem(position).getmAlbum();
                int image = adaptor.getItem(position).getmImage();

                // Intent That Will Send Song Info To PlaySongActivity and Start It
                Intent intent = new Intent(getApplicationContext(), activity_play_song.class);
                intent.putExtra("message_name", name);
                intent.putExtra("message_artist", artist);
                intent.putExtra("message_album", album);
                intent.putExtra("image_resource",image);
                startActivity(intent);
            }
        });
    }
}