package app1.sid.com.gradientshaders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.widget.TextView;

/**
 * Created by BLUEHORSE 123 on 12/17/2015.
 */
public class BitmapTextView extends TextView {
    public BitmapTextView(Context context) {
        super(context);
    }

    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        int[] rainbow = getRainbowColors();
        Shader shader = new LinearGradient(0, 0, 0, w, rainbow,
                null, Shader.TileMode.MIRROR);

        Matrix matrix = new Matrix();
        matrix.setRotate(90);
        shader.setLocalMatrix(matrix);

        getPaint().setShader(shader);




    }

    public int[] getRainbowColors() {
        return new int[]{
                getResources().getColor(R.color.red),
                getResources().getColor(R.color.blue),
                getResources().getColor(R.color.white),

        };
    }
}
