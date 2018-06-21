package tikunaproject.mockup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AudioUploadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_upload);
        configureBackButton();
        configureUploadButton();


    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.audio_upload_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureUploadButton(){
        Button textButton = (Button) findViewById(R.id.audio_upload_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
