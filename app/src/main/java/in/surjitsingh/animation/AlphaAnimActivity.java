package in.surjitsingh.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AlphaAnimActivity extends AppCompatActivity {

    ImageView imageView;
    Animation set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_anim);
        imageView = findViewById(R.id.img);
        set = AnimationUtils.loadAnimation(this, R.anim.my_anim_alpha);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.startAnimation(set);
            }
        });
    }
}
