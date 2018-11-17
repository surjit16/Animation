package in.surjitsingh.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button drawBtn, viewBtn, scaleBtn, rotateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        drawBtn = findViewById(R.id.draw_anim);
        viewBtn = findViewById(R.id.view_anim);
        scaleBtn = findViewById(R.id.scale_anim);
        rotateBtn = findViewById(R.id.rotate_anim);

        drawBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, DrawableAnimationActivity.class));
            }
        });

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, ViewAnimActivity.class));
            }
        });

        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, ScaleAnimActivity.class));
            }
        });
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, RotateAnimActivity.class));
            }
        });
    }
}
