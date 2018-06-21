package tikunaproject.mockup;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TextValidateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_validate);
        configureBackButton();
        configureConfirmButton();
    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.text_validate_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    private void configureConfirmButton(){
        Button textButton = (Button) findViewById(R.id.text_validate_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
