package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {//implements View.OnClickListener
    private ImageView imageView;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==200&&resultCode==RESULT_OK){
            String returnData =data.getStringExtra("return data");
            Log.d("return data",returnData);
        }
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        Log.d("onCreate","onCreate:正在执行");
        imageView = (ImageView)  findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        final ImageSwitcher imageSwitcher =findViewById(R.id.imgSwitch);
       imageSwitcher.setOutAnimation(MainActivity.this,android.R.anim.fade_out);
       imageSwitcher.setInAnimation(MainActivity.this,android.R.anim.fade_in);
       imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
           @Override
           public View makeView() {
               ImageView imageView = new ImageView(MainActivity.this);
               imageView.setImageResource(R.drawable.img3);
               return imageView;
           }
       });
       imageSwitcher.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ((ImageSwitcher)v).setImageResource(R.drawable.img4);
           }
       });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //显式intent

//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                intent.putExtra("extra data","SecondActivity");
//                Bundle bundle = new Bundle();
//                EditText editText = (EditText) findViewById(R.id.editText);
//                String login = editText.getText().toString();
//                EditText editText1 = (EditText)findViewById(R.id.editText2);
//                bundle.putString("login",login);
//                String password = editText1.getText().toString();
//                bundle.putString("password",password);
//                intent.putExtras(bundle);
//                Toast.makeText(MainActivity.this,"You clicked Button 1",Toast.LENGTH_SHORT).show();
//                startActivityForResult(intent,200);
//
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(MainActivity.this,"You clicked Button 1",Toast.LENGTH_LONG).show();
            imageView.setImageResource(R.drawable.jin);

            }
        });

    }

//    @Override
//    public void onClick(View v) {
//
//    }
//    public void click(View v){
//
//    }
}
