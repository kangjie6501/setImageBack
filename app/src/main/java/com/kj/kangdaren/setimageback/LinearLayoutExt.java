package com.kj.kangdaren.setimageback;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;



/**
 * Created by kangjie on 2016/11/4.
 */

public class LinearLayoutExt extends LinearLayout {


    private int mHeight;
    private Paint paint = new Paint();
    /**
     * border
     */
    private int colorBorder =10086;//border颜色
    private String colorBorde = "0,0,0,0";//border颜色 字符串
    private int borderWidth;//border 宽度
    private int borderCorner;


    /**
     * back
     */
    private Bitmap backBottomBitmap;//底图
    private Bitmap backTopBitmap;//上图
    private Bitmap backZhongBitmap;//中图
    private int backLiftWidth ;//左侧宽
    private int backTopWidth ;//
    private int backRightWidth ;//
    private int backBottomWidth ;//
    private int backTopBitmapWidth;
    private int backTopBitmapHeight;
    private int backBottomBitmapWidth;
    private int backBottomBitmapHeight;

    private int backZhongBitmapHeight;
    private int backZhongBitmapWidth;

    private int zhongCount ;

    private int backClor = 10086;
    private int zhongBackHeight;

    /**
     * content

     */
    private int contentWidth;

    private int alpha = (int) (0.85*255);

    public int getAlpha1() {
        return alpha;
    }

    public void setAlpha1(int alpha) {
        this.alpha = alpha;
    }

    public int getBorderCorner() {
        return borderCorner;
    }

    public void setBorderCorner(int borderCorner) {
        this.borderCorner = borderCorner;
    }

    public int getBackZhongBitmapHeight() {
        return backZhongBitmapHeight;
    }

    public void setBackZhongBitmapHeight(int backZhongBitmapHeight) {
        this.backZhongBitmapHeight = backZhongBitmapHeight;
    }

    public int getBackZhongBitmapWidth() {
        return backZhongBitmapWidth;
    }

    public void setBackZhongBitmapWidth(int backZhongBitmapWidth) {
        this.backZhongBitmapWidth = backZhongBitmapWidth;
    }

    public int getBackBottomBitmapWidth() {
        return backBottomBitmapWidth;
    }

    public void setBackBottomBitmapWidth(int backBottomBitmapWidth) {
        this.backBottomBitmapWidth = backBottomBitmapWidth;
    }

    public int getBackBottomBitmapHeight() {
        return backBottomBitmapHeight;
    }

    public void setBackBottomBitmapHeight(int backBottomBitmapHeight) {
        this.backBottomBitmapHeight = backBottomBitmapHeight;
    }

    public int getBackTopBitmapHeight() {
        return backTopBitmapHeight;
    }

    public void setBackTopBitmapHeight(int backTopBitmapHeight) {
        this.backTopBitmapHeight = backTopBitmapHeight;
    }

    public int getBackTopBitmapWidth() {
        return backTopBitmapWidth;
    }

    public void setBackTopBitmapWidth(int backTopBitmapWidth) {
        this.backTopBitmapWidth = backTopBitmapWidth;
    }

    public int getZhongBackHeight() {
        return zhongBackHeight;
    }

    public void setZhongBackHeight(int zhongBackHeight) {
        this.zhongBackHeight = zhongBackHeight;
    }

    public int getZhongCount() {
        return zhongCount;
    }

    public void setZhongCount(int zhongCount) {
        this.zhongCount = zhongCount;
    }

    public int getmHeight() {
        return mHeight;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public int getBackClor() {
        return backClor;
    }

    public void setBackClor(int backClor) {
        this.backClor = backClor;
    }

    public Bitmap getBackZhongBitmap() {
        return backZhongBitmap;
    }

    public void setBackZhongBitmap(Bitmap backZhongBitmap) {
        this.backZhongBitmap = backZhongBitmap;
    }

    public int getContentWidth() {
        return contentWidth;
    }

    public void setContentWidth(int contentWidth) {
        this.contentWidth = contentWidth;
    }

    public Bitmap getBackTopBitmap() {
        return backTopBitmap;
    }

    public void setBackTopBitmap(Bitmap backTopBitmap) {
        this.backTopBitmap = backTopBitmap;
    }


    public int getBackBottomWidth() {
        return backBottomWidth;
    }

    public void setBackBottomWidth(int backBottomWidth) {
        this.backBottomWidth = backBottomWidth;
    }

    public int getBackRightWidth() {
        return backRightWidth;
    }

    public void setBackRightWidth(int backRightWidth) {
        this.backRightWidth = backRightWidth;
    }

    public int getBackTopWidth() {
        return backTopWidth;
    }

    public void setBackTopWidth(int backTopWidth) {
        this.backTopWidth = backTopWidth;
    }

    public int getBackLiftWidth() {
        return backLiftWidth;
    }

    public void setBackLiftWidth(int backLiftWidth) {
        this.backLiftWidth = backLiftWidth;
    }

    public Bitmap getBackBiemapBottom() {
        return backBottomBitmap;
    }

    public void setBackBiemapBottom(Bitmap backBiemapBottom) {
        this.backBottomBitmap = backBiemapBottom;
    }

    public int getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(int colorBorder) {
        this.colorBorder = colorBorder;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public int getWidthBorder() {
        return borderWidth;
    }

    public void setWidthBorder(int widthBorder) {
        this.borderWidth = widthBorder;
    }

    public LinearLayoutExt(Context context) {
        super(context);
    }
    private int canvasWidth;
    private int canvasHeight;

    public LinearLayoutExt(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackground(new ColorDrawable(Color.TRANSPARENT));
        setWillNotDraw(false);
    }


    private Canvas canvas;

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * 新属性
     * @param canvas
     */
    private int proBackTopBitmapHeight;
    private int proBackBottomBitmapHeight;
    private int proBackZhongBitmapHeight;
    private int proBackZhongHeight;
    private int proBackZhongCount = 0;

    private int proBackZhongLastBitmapHeight;


    /**
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        paint.setAlpha(alpha);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);

        if (backZhongBitmap!=null&&backBottomBitmap!=null&&backTopBitmap!=null) {
            proBackZhongCount = 0;
            //绘制back
            //计算
            //计算 图片预 大小
            proBackTopBitmapHeight = backTopBitmapHeight * canvas.getWidth() / backTopBitmapWidth;
            proBackBottomBitmapHeight = backBottomBitmapHeight * canvas.getWidth() / backBottomBitmapWidth;
            proBackZhongBitmapHeight = backZhongBitmapHeight * canvas.getWidth() / backZhongBitmapWidth;
            //如果高度不足容下 top bottom and 一个中图 那么top bottom 平分区域
            if (canvas.getHeight() < proBackTopBitmapHeight + proBackBottomBitmapHeight + proBackZhongBitmapHeight) {
                proBackTopBitmapHeight = canvas.getHeight() / 2;
                proBackBottomBitmapHeight = canvas.getHeight() - proBackTopBitmapHeight;
                proBackZhongCount = 0;
            } else {  //可以容下top bottom and 至少 一个中图
                //预计算 上下图大小 确定中间 预区域高
                proBackZhongHeight = canvas.getHeight() - proBackTopBitmapHeight - proBackBottomBitmapHeight;
                //根据预中间区域高与预中图预高 确定中图数量
                proBackZhongCount = proBackZhongHeight / proBackZhongBitmapHeight;
                //计算中间准确高度    计算 与预中间区域高的差
                int de = proBackZhongHeight - proBackZhongCount * proBackZhongBitmapHeight;
                //把差值均分给 最后一个中图
              //  proBackZhongLastBitmapHeight = de+proBackZhongHeight;
                int dde = de/proBackZhongCount;
                if (/*dde!=0*/false){
                    proBackZhongHeight += dde;

                    int dde1 = 0;
                    dde1 = de - dde*proBackZhongCount;
                    if (dde1 % 2 == 0) {
                        proBackTopBitmapHeight += dde1 / 2;
                        proBackBottomBitmapHeight += dde1 / 2;
                    } else {
                        proBackTopBitmapHeight += (dde1 + 1) / 2;
                        proBackBottomBitmapHeight += dde1 / 2;
                    }
                }else {
                    if (de % 2 == 0) {
                        proBackTopBitmapHeight += de / 2;
                        proBackBottomBitmapHeight += de / 2;
                    } else {
                        proBackTopBitmapHeight += (de + 1) / 2;
                        proBackBottomBitmapHeight += de / 2;
                    }
                }

            }
            //生成图片
            try {
                backTopBitmap = Bitmap.createScaledBitmap(backTopBitmap, canvas.getWidth(), proBackTopBitmapHeight, true);
                if (proBackZhongCount!=0){
                    backZhongBitmap = Bitmap.createScaledBitmap(backZhongBitmap, canvas.getWidth(), proBackZhongBitmapHeight, true);
                }
                backBottomBitmap = Bitmap.createScaledBitmap(backBottomBitmap, canvas.getWidth(), proBackBottomBitmapHeight, true);

            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
            //绘制
            //画top
            canvas.drawBitmap(backTopBitmap, 0, 0, paint);
            //绘制中图
            for (int i = 0; i < proBackZhongCount; i++) {
                canvas.drawBitmap(backZhongBitmap, 0, i * proBackZhongBitmapHeight + proBackTopBitmapHeight, paint);
            }
            //画bottom
            canvas.drawBitmap(backBottomBitmap, 0, canvas.getHeight() - proBackBottomBitmapHeight, paint);
        }
        //绘制border

        if (backClor!=-1){//背景颜色
            if (backClor!=10086){
                Rect rectBack = new Rect(0,0,canvas.getWidth(),canvas.getHeight());

                paint.setColor(backClor);//设置颜色
                paint.setStrokeWidth(borderWidth*2);//设置画笔的宽度
                paint.setStyle(Style.STROKE);//设置画笔的风格-不能设成填充FILL否则看不到图片了
                canvas.drawRect(rectBack,paint);
            }
        }
        if (borderWidth!=0&&colorBorder!=10086){//边框颜色
            RectF rectBorder = new RectF(borderWidth/2,
                    borderWidth/2,
                    canvas.getWidth()-borderWidth/2,
                    getMeasuredHeight()-borderWidth/2);

            int[] colo = parseColorFromString(colorBorde);
            paint.setARGB(alpha,colo[0],colo[1],colo[2]);//设置颜色与透明度
            //     paint.setColor(colorBorder);//设置颜色
            paint.setStrokeWidth(borderWidth);//设置画笔的宽度
            if (borderCorner==0){
                paint.setStyle(Style.STROKE);//设置画笔的风格-不能设成填充FILL否则看不到图片了
            }else {
                paint.setStyle(Style.STROKE);//设置画笔的风格-不能设成填充FILL否则看不到图片了
            }

            canvas.drawRoundRect(rectBorder,borderCorner,borderCorner,paint);//Rect(rectBorder,paint);
        }
        super.onDraw(canvas);
    }

    /**
     * 从字符串 获取颜色
     */
    private int[] parseColorFromString(String str){
        if (str!=null){
            str = str.trim();
        }
        if(str.equals("")){
            return new int[]{0,0,0,0};
        }
        String[] distances = str.split(",");
        int[] distances1 =new int[4];
        for (int i = 0;i<4;i++){
            distances1[i] = (int) Float.parseFloat(distances[i]);
            //            distances1[i] = (int) Float.parseFloat(distances[i]);
        }
        return distances1;
    }



    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}