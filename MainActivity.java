package com.example.user.a3d;

        import android.content.Context;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;

class MyView extends View {
    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        // Bitmap image1 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow3);
        //canvas.drawBitmap(image1, 550, 450, null);
        //Bitmap image2 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow3);
        //canvas.drawBitmap(image1, 1550, 450, null);
        Bitmap arrow1 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow1);
        canvas.drawBitmap(arrow1, 20, 250, null);
        Bitmap arrow2 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow2);
        canvas.drawBitmap(arrow2, 1300, 250, null);
        Bitmap arrow3 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow3);
        canvas.drawBitmap(arrow3, 660, 250, null);
        Bitmap arrow4 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow4);
        canvas.drawBitmap(arrow4, 1940, 250, null);
        Bitmap arrow5 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow5);
        canvas.drawBitmap(arrow5, 170, 800, null);
        Bitmap arrow6 = BitmapFactory.decodeResource(getResources(), R.mipmap.arrow6);
        canvas.drawBitmap(arrow6, 1450, 800, null);

    }
}

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w);

    }
}
