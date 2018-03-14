package com.handwriter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Paint.Style;
import android.util.Log;
import android.view.View;

public class EraserDraw extends View {
	// public类型，子类需要用到
	public Point downPoint, movePoint, upPoint;
	public Paint paint;// 声明画笔
	public Canvas canvas;// 画布
	public Bitmap bitmap;// 位图
	public int downState;
	public int moveState;

	public EraserDraw(Context context) {
		super(context);
		// TODO Auto-generated constructor stub

		paint = new Paint(Paint.DITHER_FLAG);// 创建一个画笔
		bitmap = Bitmap.createBitmap(480, 700, Bitmap.Config.ARGB_8888); // 设置位图的宽高
		canvas = new Canvas(bitmap);

		// 设置画笔
		paint.setStyle(Style.STROKE);// 设置非填充
		paint.setStrokeWidth(20);// 笔宽20像素
		paint.setColor(Color.WHITE);// 设置白笔
		paint.setAntiAlias(true);// 锯齿不显示

		downPoint = new Point();
		movePoint = new Point();
		upPoint = new Point();

		Log.i("MyDraw", "bitmap::::::::::::::::::" + bitmap);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(bitmap, 0, 0, null);
	}

}
