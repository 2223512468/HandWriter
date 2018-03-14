package com.handwriter;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	private DrawPath dPath;
	private EraserPath eraserPath;
	Paint p = new Paint();
	Button draw_btn;// 选择图形的按钮
	Button eraser_btn;

	/*
	 * 设置每个view的布局大小 This set of layout parameters defaults the width and the
	 * height
	 *
	 * LayoutParams.MATCH_PARENT和xml中定义控件大小的match_parent属性一样
	 * height：设置为700，如果设置为match_parent、wrap_content则view画占满全屏挡住draw_btn按钮控件
	 */
	LayoutParams lParams = new LayoutParams(LayoutParams.MATCH_PARENT, 700);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		draw_btn = (Button) findViewById(R.id.draw_button);
		eraser_btn = (Button) findViewById(R.id.eraser_button);

		draw_btn.setOnClickListener(new OnClickListener() {
										public void onClick(View v) {

											dPath = new DrawPath(getApplicationContext());
											addContentView(dPath, lParams);
										}
									}

		);

		eraser_btn.setOnClickListener(new OnClickListener() {
										  public void onClick(View v) {
											  eraserPath = new EraserPath(getApplicationContext());
											  addContentView(eraserPath, lParams);
										  }
									  }

		);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
