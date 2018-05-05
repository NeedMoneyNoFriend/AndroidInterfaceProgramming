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
public class Uc4Activity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc4);

        Button bn4_5=(Button)findViewById(R.id.bn4_5);

        //给btn4_5绑定点击事件
        bn4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt4_5添加点击响应事件
        bn4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Uc4Activity.this, MainActivity.class);
                startActivity(b);
            }
        });
    }
}