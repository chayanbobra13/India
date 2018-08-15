package graycap.india;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class song extends AppCompatActivity {
    ImageView playImage,playImage2;
    VideoView videoView,videoView2;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        playImage = findViewById(R.id.playImage);
        videoView = findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        playImage2 = findViewById(R.id.playImage2);
        videoView2 = findViewById(R.id.videoView2);


    }

    public void videoplay(View v) {
        String videopath = "android.resource://graycap.india/" + R.raw.aayemerevatan;
        Uri uri = Uri.parse(videopath);
        playImage.setImageResource(R.drawable.playagain);
        playImage.setMaxHeight(50);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void videoplay2(View v) {
        String videopath = "android.resource://graycap.india/" + R.raw.vandematram;
        Uri uri = Uri.parse(videopath);
        playImage2.setImageResource(R.drawable.playagain);
        playImage2.setMaxHeight(50);
        videoView2.setVideoURI(uri);
        videoView2.setMediaController(mediaC);
        mediaC.setAnchorView(videoView2);
        videoView2.start();
    }
}
