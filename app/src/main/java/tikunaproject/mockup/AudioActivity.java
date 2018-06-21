package tikunaproject.mockup;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer myAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        myAudio = MediaPlayer.create(this, R.raw.sample);

        configureBackButton();
        configureUploadButton();
        configureConfirmButton();
        configurePlayButton();
        configureValidateButton();
    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.audio_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureUploadButton(){
        Button textButton = (Button) findViewById(R.id.audio_upload_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(AudioActivity.this, AudioUploadActivity.class));
            }
        });
    }
    private void configurePlayButton(){
        Button textButton = (Button) findViewById(R.id.audio_start_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(myAudio.isPlaying()){
                    myAudio.pause();
                }
                else{
                    myAudio.start();

                }
            }
        });
    }

    private void configureValidateButton(){
        Button textButton = (Button) findViewById(R.id.audio_validate_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(AudioActivity.this, AudioValidateActivity.class));
            }
        });

    }
    private void configureConfirmButton(){
        Button textButton = (Button) findViewById(R.id.audio_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
