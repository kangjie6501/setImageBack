package com.kj.kangdaren.setimageback;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 贴图实现复杂背景
 * 待优化
 */

public class MainActivity extends Activity implements OnClickListener {
    private LinearLayoutExt linearLayout ;//自定义LinearLayout  待优化
    private ImageView imageView;
    private Button button ;
    private Bitmap bitmap1;//顶部图片
    private Bitmap bitmap2;//中部图片
    private Bitmap bitmap3;//底部图片
    private boolean isShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        linearLayout = (LinearLayoutExt) findViewById(R.id.content_ll);
        imageView = (ImageView) findViewById(R.id.content_iv);
        button =(Button) findViewById(R.id.content_btn);
        //点击监听
        button.setOnClickListener(this);
        //设置主图片
        imageView.setImageResource(R.drawable.image);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.content_btn:
                if (isShowing){//去掉背景
                    isShowing = false;
                    linearLayout.setBackBiemapBottom(null);
                    linearLayout.invalidate();
                }else {//显示背景
                    isShowing = true;
                    setBack();//为自定义view设置一些属性
                    setImage();//设置属性
                   linearLayout.invalidate();//刷新自定义view
                }
                break;
        }
    }

    /**
     * 记载图片
     */
    private void setBack() {
        //加载图片
        bitmap1  = BitmapFactory.decodeResource(getResources(),R.drawable.back1);
        bitmap2  = BitmapFactory.decodeResource(getResources(),R.drawable.back2);
        bitmap3  = BitmapFactory.decodeResource(getResources(),R.drawable.back3);
    }

    /**
     * 设置属性
     */
    private void setImage() {
        //设置三个bitmap
        linearLayout.setBackTopBitmap(bitmap1);

        linearLayout.setBackZhongBitmap(bitmap2);

        linearLayout.setBackBiemapBottom(bitmap3);
        //设置三个图片的高宽  用于缩放
        linearLayout.setZhongBackHeight(bitmap2.getHeight());
        linearLayout.setBackTopBitmapHeight(bitmap1.getHeight());
        linearLayout.setBackTopBitmapWidth(bitmap1.getWidth());
        linearLayout.setBackBottomBitmapHeight(bitmap3.getHeight());
        linearLayout.setBackBottomBitmapWidth(bitmap3.getWidth());
        linearLayout.setBackZhongBitmapHeight(bitmap2.getHeight());
        linearLayout.setBackZhongBitmapWidth(bitmap2.getWidth());
        linearLayout.setPadding(100,100,100,100);
        linearLayout.setAlpha1(255);
    }
}
