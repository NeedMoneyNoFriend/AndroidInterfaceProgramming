package hqu.cst.androidinterfaceprogramming;

/**
 * Created by 不处朋友 on 2018/5/1.
 */
import android.graphics.LinearGradient;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Uc1Activity extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1);
        //获取界面上的LinearLayout
        LinearLayout layout1 = (LinearLayout)findViewById(R.id.layout1);
        //获取界面上的Button
        final Button bn1_1 = (Button)findViewById(R.id.bn1_1);

        //给btn1_1绑定点击事件
        bn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt1_1添加点击响应事件
        bn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //TODO
                LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
                layout1.setOrientation(LinearLayout.HORIZONTAL);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.CENTER_HORIZONTAL;
               //View.setLayoutParams(layoutParams);




            }
        });

        Button bn1_2 = (Button)findViewById(R.id.bn1_2);

        //给btn1_2绑定点击事件
        bn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt1_2添加点击响应事件
        bn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
               // layout1.gravity = Gravity.CENTER_VERTICAL;
                LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
               // layout1.setOrientation(LinearLayout.VERTICAL);
                layout1.setHorizontalGravity(Gravity.CENTER_VERTICAL);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.CENTER_VERTICAL;

            }
        });

        Button bn1_3 = (Button)findViewById(R.id.bn1_3);

        //给btn1_3绑定点击事件
        bn1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt1_3添加点击响应事件
        bn1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
                LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
                layout1.setHorizontalGravity(Gravity.LEFT);// = Gravity.LEFT;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity = Gravity.LEFT;

            }
        });

        Button bn1_4=(Button)findViewById(R.id.bn1_4);

        //给btn1_4绑定点击事件
        bn1_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //给bnt1_4添加点击响应事件
        bn1_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent b = new Intent(Uc1Activity.this , MainActivity.class);
                startActivity(b);
            }
        });
    }
}
