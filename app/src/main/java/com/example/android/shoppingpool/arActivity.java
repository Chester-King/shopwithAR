package com.example.android.shoppingpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android.shoppingpool.activities.MainActivity;


public class arActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        ImageView bed=(ImageView) findViewById(R.id.bed);
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"bed Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(arActivity.this, MainActivity.class);
                intent.putExtra("object","bed");
                startActivity(intent);

            }
        });

        ImageView couch=(ImageView) findViewById(R.id.couch);
        couch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"couch Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(arActivity.this, MainActivity.class);
                intent.putExtra("object","couch");
                startActivity(intent);

            }
        });

        ImageView computer=(ImageView) findViewById(R.id.computer);
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"computer Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(arActivity.this, MainActivity.class);
                intent.putExtra("object","computer");
                startActivity(intent);
            }
        });

        ImageView rchair=(ImageView) findViewById(R.id.rchair);
        rchair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"rchair Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(arActivity.this, MainActivity.class);
                intent.putExtra("object","rchair");
                startActivity(intent);
            }
        });

    }
}