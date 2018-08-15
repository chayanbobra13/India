package graycap.india;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView quoteImage = findViewById(R.id.quote);
        ImageView songImage = findViewById(R.id.song);

        quoteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quoteIntend = new Intent(MainActivity.this, quote.class);
                startActivity(quoteIntend);
            }
        });


        songImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntend = new Intent(MainActivity.this, song.class);
                startActivity(songIntend);
            }
        });
    }
}
