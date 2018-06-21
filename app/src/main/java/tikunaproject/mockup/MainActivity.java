package tikunaproject.mockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureTextButton();
        configureImageButton();
        configureAudioButton();
    }

    private void configureTextButton(){
        Button textButton = (Button) findViewById(R.id.text_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TextActivity.class));
            }
        });
    }

    private void configureImageButton(){
        Button textButton = (Button) findViewById(R.id.image_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ImageActivity.class));
            }
        });
    }

    private void configureAudioButton(){
        Button textButton = (Button) findViewById(R.id.audio_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AudioActivity.class));
            }
        });
    }
}
