package com.project.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView iv_logo;
    TextView tv_title,tv_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_logo=(ImageView)findViewById(R.id.desc_img);
        tv_title=(TextView)findViewById(R.id.desc_header);
        tv_desc=(TextView)findViewById(R.id.desc_desc);

        iv_logo.setImageResource(getIntent().getIntExtra("IV_LOGO",0));
        tv_title.setText(getIntent().getStringExtra("TITLE"));
        tv_desc.setText(getIntent().getStringExtra("DESC"));
    }
}
