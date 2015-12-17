package app1.sid.com.gradientshaders;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private FrameLayout flTextContainer;
    private RainbowTextView rainbowTextView;
    private TextView txtBitShader2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        loadShaderColor();
    }

    private void initialize() {
        flTextContainer = (FrameLayout)findViewById(R.id.flTextContainer);
        rainbowTextView = new RainbowTextView(this);
        flTextContainer.addView(rainbowTextView);
        txtBitShader2 = (TextView)findViewById(R.id.txtBitShader2);
    }

    private void loadShaderColor() {
        rainbowTextView.setTypeface(Typeface.DEFAULT_BOLD);
        rainbowTextView.setTextSize(35);
        rainbowTextView.setGravity(Gravity.CENTER);
        rainbowTextView.setText("this is Shader Example");

    }

        private void loadBitmapShader1() {
            Bitmap bitmap = BitmapFactory.decodeResource(
                    getResources(), R.drawable.img);
            Shader shader = new BitmapShader(bitmap,
                    Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            txtBitShader2.getPaint().setShader(shader);
        }
    private void loadBitmapShader2() {
        Bitmap bitmap = BitmapFactory.decodeResource(
                getResources(), R.drawable.img2);
        Shader shader = new BitmapShader(bitmap,
                Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        txtBitShader2.getPaint().setShader(shader);
    }

        public void onBtn1Click(View view)
        {
            loadBitmapShader2();
            txtBitShader2.setText("Change Text Color to Bitmap Color. :-)");
        }

        public void onBtn2Click(View view)
        {
            loadBitmapShader1();
            txtBitShader2.setText("Change Text Color to Bitmap Color. :-)");
        }

}
