package com.example.progreesbar;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private ImageView imgview;
    private SeekBar seekbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.toggleButton);
        imgview=findViewById(R.id.imageView);
        seekbar=findViewById(R.id.seekBar1);
        textView=findViewById(R.id.textViewbar);


        //1.yol
       /* toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    imgview.setVisibility(View.VISIBLE);
                else
                    imgview.setVisibility(View.INVISIBLE);
            }
        }); */

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                System.out.println("seekbar hareket edebilir");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                System.out.println("seekbar durdu");
            }
        });




    }
}