package hqu.cst.androidinterfaceprogramming;

/**
 * Created by 不处朋友 on 2018/5/1.
 */
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class Uc3Activity extends ActionBarActivity {

    private ViewPager viewpager;
    private int[] imgs = {R.mipmap.ic_launcher, R.drawable.ic_colorize_24dp, R.drawable.ic_backup_24dp, R.drawable.ic_favorite_outline_24dp, R.drawable.ic_language_24dp}; //图片集合
    private List<ImageView> imageViewList;
    protected int lastPosition;

    private TimeCount time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);
        initViews();
        initData();


        Button bn3_1 = (Button) findViewById(R.id.bn3_1);

        //给btn3_1绑定点击事件
        bn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt3_1添加点击响应事件
        bn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Uc3Activity.this, MainActivity.class);
                startActivity(b);
            }
        });
    }


            private void initViews() {  //加载布局
                viewpager = (ViewPager) findViewById(R.id.viewpager);
            }

            private void initData() {    //加载数据
                time = new TimeCount(3000,1000);   //3秒倒计时
                imageViewList = new ArrayList<>();
                for (int img : imgs) {
                    ImageView imageView = new ImageView(this);
                    imageView.setImageResource(img);
                    imageViewList.add(imageView);
                }



                //触摸的时候停止定时器，松开就开始计时
                viewpager.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            time.start();
                        } else {
                            time.cancel();
                        }
                        return false;
                    }
                });

                MyPageAdapter adapter = new MyPageAdapter();
                viewpager.setAdapter(adapter);
                viewpager.setCurrentItem(Integer.MAX_VALUE / 2); //默认在中间，使用户看不到边界
                time.start();
            }


            Handler handler = new Handler(){    //时间到就自动进行轮播
                @Override
                public void handleMessage(Message msg) {
                    viewpager.setCurrentItem(viewpager.getCurrentItem() + 1);
                    time.start();
                }
            };

            class MyPageAdapter extends PagerAdapter {

                @Override
                public int getCount() {
                    return Integer.MAX_VALUE;
                }

                @Override
                public boolean isViewFromObject(View view, Object object) {
                    return view == object;
                }

                @Override
                public Object instantiateItem(ViewGroup container, int position) {
                    container.addView(imageViewList.get(position % imageViewList.size()));
                    return imageViewList.get(position % imageViewList.size());
                }

                @Override
                public void destroyItem(ViewGroup container, int position, Object object) {
                    container.removeView((View) object);
                }
            }

            /* 定义一个倒计时的内部类 */
            class TimeCount extends CountDownTimer {
                public TimeCount(long millisInFuture, long countDownInterval) {
                    super(millisInFuture, countDownInterval);// 参数依次为总时长,和计时的时间间隔
                }

                @Override
                public void onFinish() {// 计时完毕时触发
                    time.cancel();
                    handler.sendEmptyMessage(0);   //简单发了个消息过去
                }

                @Override
                public void onTick(long millisUntilFinished) {// 计时过程显示
                }





    }
}
