package android.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_play_song extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        TextView nameElement = (TextView) findViewById(R.id.name);
        TextView artistElement = (TextView) findViewById(R.id.artist);
        TextView albumElement = (TextView) findViewById(R.id.album);
        ImageView imageElement = (ImageView) findViewById(R.id.image);

        Intent intent = getIntent();
        String name = intent.getStringExtra("message_name");
        String artist = intent.getStringExtra("message_artist");
        String album = intent.getStringExtra("message_album");
        //String image = intent.getStringExtra("image_resource");

        nameElement.setText(name);
        artistElement.setText(artist);
        albumElement.setText(album);
        //imageElement.setImageResource(image);
    }
}