package in.surjitsingh.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        imageView = findViewById(R.id.img);
        imageView.setBackgroundResource(R.drawable.back);
        animationDrawable = (AnimationDrawable) imageView.getBackground();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animationDrawable.isRunning()) animationDrawable.stop();
                else animationDrawable.start();
            }
        });
    }
}
