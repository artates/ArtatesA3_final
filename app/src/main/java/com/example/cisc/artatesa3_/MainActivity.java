package com.example.cisc.artatesa3_;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button button_go;
    Button button2_go;
    TextView TextView_Please;
    TextView TextView_Mesa;
    TextView TextView_Google;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_go = (Button) findViewById(R.id.button_go);
        button2_go = (Button) findViewById(R.id.button2_go);
        TextView_Please = (TextView) findViewById(R.id.textview_please);
        TextView_Mesa = (TextView) findViewById(R.id.textView_Mesa);
        TextView_Google = (TextView) findViewById(R.id.textView_Google);

        button_go.setOnClickListener(this);
        button2_go.setOnClickListener(this);





    }

    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.button2_go:
            Intent googleIntent = new Intent(MainActivity.this,
                Google.class);
            startActivity(googleIntent);

            case R.id.button_go:
                Intent mesaIntent = new Intent(MainActivity.this,
                        Activity_Mesa.class);
                startActivity(mesaIntent);

        }


    }

}
