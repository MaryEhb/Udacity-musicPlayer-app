package android.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongListAdaptor extends ArrayAdapter<Song> {

    public SongListAdaptor(Context context, List<Song> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song songClass = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        nameTextView.setText(songClass.getmName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(songClass.getmArtist());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_name);
        albumTextView.setText(songClass.getmAlbum());

        return listItemView;
    }
}