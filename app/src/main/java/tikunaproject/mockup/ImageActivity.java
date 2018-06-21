package tikunaproject.mockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        configureBackButton();
        configureUploadButton();
        configureValidateButton();
        configureConfirmButton();
    }

    private void configureBackButton(){
        Button textButton = (Button) findViewById(R.id.image_back_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureUploadButton(){
        Button textButton = (Button) findViewById(R.id.image_upload_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ImageActivity.this, ImageUploadActivity.class));
            }
        });
    }

    private void configureValidateButton(){
        Button textButton = (Button) findViewById(R.id.image_validate_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(ImageActivity.this, ImageValidateActivity.class));
            }
        });

    }

    private void configureConfirmButton(){
        Button textButton = (Button) findViewById(R.id.image_confirm_button);
        textButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
