package tikunaproject.mockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        configureBackButton();
        configureUploadButton();
        configureValidateButton();
        configureConfirmButton();
    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.text_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureUploadButton(){
        Button textButton = (Button) findViewById(R.id.text_upload_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(TextActivity.this, TextUploadActivity.class));
            }
        });
    }

    private void configureValidateButton(){
        Button textButton = (Button) findViewById(R.id.text_validate_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(TextActivity.this, TextValidateActivity.class));
            }
        });

    }
    private void configureConfirmButton(){
        Button textButton = (Button) findViewById(R.id.text_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
