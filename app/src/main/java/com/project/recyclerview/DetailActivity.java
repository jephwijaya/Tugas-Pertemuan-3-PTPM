package com.project.recyclerview;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView iv_logo;
    TextView tv_title,tv_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        iv_logo=(ImageView)findViewById(R.id.desc_img);
        tv_title=(TextView)findViewById(R.id.desc_header);
        tv_desc=(TextView)findViewById(R.id.desc_desc);

        iv_logo.setImageResource(getIntent().getIntExtra("IV_LOGO",0));
        tv_title.setText(getIntent().getStringExtra("TITLE"));
        tv_desc.setText(getIntent().getStringExtra("DESC"));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
