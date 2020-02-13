package com.com490.expiredteam.expired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScanningPage extends AppCompatActivity {

    public static TextView barcode_txt;
    Button scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning_page);

        barcode_txt = (TextView)findViewById(R.id.barcodenum_text);
        scan_btn = (Button)findViewById(R.id.scan_bt);

        scan_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                startActivity(new Intent(getApplicationContext(), ScanCodeActivity.class));
            }
            });

    }
}
