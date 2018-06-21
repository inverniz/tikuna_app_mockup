package tikunaproject.mockup;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AudioValidateActivity extends AppCompatActivity {

    MediaPlayer myAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_validate);
        configureBackButton();
        configureConfirmButton();
        configurePlayButton();

        myAudio = MediaPlayer.create(this, R.raw.sample2);
    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.audio_validate_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
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

    private void configureConfirmButton(){
        Button textButton = (Button) findViewById(R.id.audio_validate_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
