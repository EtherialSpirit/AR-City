package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.first_screen);
        setContentView(imageView);

        imageView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, OcrCaptureActivity.class);
        startActivity(intent);
    }
}
