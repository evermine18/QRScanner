package com.evermine.qrscanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static MainActivity context;
    private TextView scannedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scannedText=findViewById(R.id.scanned_text);
        context=this;
        Button qrScan = findViewById(R.id.button);

        qrScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQR();
            }
        });
    }

    public void startQR(){

        Intent intent = new Intent(this, QRScan.class);
        startActivity(intent);
    }

    public void setScannedText(String text){
        scannedText.setText("Scanned text: "+text);
    }

    public static MainActivity getContext(){
        return context;
    }
}
