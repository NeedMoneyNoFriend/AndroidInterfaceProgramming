package hqu.cst.androidinterfaceprogramming;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //view层的控件和业务层的控件，靠id关联和映射  给btn1赋值，即设置布局文件中的Button按钮id进行关联
        Button bn1=(Button)findViewById(R.id.bn1);

        //给btn1绑定点击事件
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt1添加点击响应事件
        bn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
//page1为先前已添加的类，并已在AndroidManifest.xml内添加活动事件(<activity android:name="page1"></activity>),在存放资源代码的文件夹下下，
                Intent i = new Intent(MainActivity.this , Uc1Activity.class);
////启动
                startActivity(i);
            }
        });

        Button bn2=(Button)findViewById(R.id.bn2);

        //给btn2绑定点击事件
        bn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //给bnt2添加点击响应事件
        bn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent m = new Intent(MainActivity.this , Uc2Activity.class);
                startActivity(m);
            }
        });

        Button bn3=(Button)findViewById(R.id.bn3);

        //给btn3绑定点击事件
        bn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //给bnt3添加点击响应事件
        bn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent n = new Intent(MainActivity.this , Uc3Activity.class);
                startActivity(n);
            }
        });

        Button bn4=(Button)findViewById(R.id.bn4);

        //给btn4绑定点击事件
        bn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //给bnt4添加点击响应事件
        bn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent q = new Intent(MainActivity.this , Uc4Activity.class);
                startActivity(q);
            }
        });

        Button bn5=(Button)findViewById(R.id.bn5);

        //给btn5绑定点击事件
        bn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //给bnt5添加点击响应事件
        bn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent r = new Intent(MainActivity.this , Uc5Activity.class);
                startActivity(r);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
