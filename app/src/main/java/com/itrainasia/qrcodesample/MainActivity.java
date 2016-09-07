package com.itrainasia.qrcodesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(this);

      //  mScannerView = new ZXingScannerView(this);
       //
    }

    @Override
    public void onClick(View view) {
switch(view.getId()){
    case R.id.button:
        Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
        startActivity(intent);

        break;
}
    }
    

}
