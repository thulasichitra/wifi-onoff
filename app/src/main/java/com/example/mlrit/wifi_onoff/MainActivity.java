package com.example.mlrit.wifi_onoff;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    TextView tv1;
    BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw=(Switch)findViewById(R.id.switch1);
        tv1=(TextView)findViewById(R.id.tv1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    ba.enable();
                    tv1.setText("ON");
                } else {
                    tv1.setText("OFF");
                    ba.disable();
                }
            }


        });
    }
}
