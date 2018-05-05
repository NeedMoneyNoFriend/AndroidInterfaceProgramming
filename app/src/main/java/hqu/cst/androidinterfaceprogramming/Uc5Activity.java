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
public class Uc5Activity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc5);

        Button bn5_1=(Button)findViewById(R.id.bn5_1);

        //给btn5_1绑定点击事件
        bn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        //给bnt5_1添加点击响应事件
        bn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Uc5Activity.this, MainActivity.class);
                startActivity(b);
            }
        });
    }
}