package toong.vn.androidcornerradius;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.layout);

        view.getBackground();

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.GREEN);
        setCornerRadius(gradientDrawable, 20f);
        //or setCornerRadius(gradientDrawable, 20f, 40f, 60f, 80f);
        //        setCornerRadii(a, 100f,0,0,0);
        //        setCornerRadii(a, 0,150f,0,0);
        //        setCornerRadii(a, 0,0,200f,0);
        //        setCornerRadii(a, 0,0,0,250f);

        setCornerRadius(gradientDrawable, 50, 10, 150, 200f);

        view.setBackground(gradientDrawable);
    }

    static void setCornerRadius(GradientDrawable drawable, float topLeft, float topRight,
            float bottomRight, float bottomLeft) {
        drawable.setCornerRadii(new float[] {
                topLeft, topLeft, topRight, topRight, bottomRight, bottomRight, bottomLeft,
                bottomLeft
        });
    }

    static void setCornerRadius(GradientDrawable drawable, float radius) {
        drawable.setCornerRadius(radius);
    }
}
