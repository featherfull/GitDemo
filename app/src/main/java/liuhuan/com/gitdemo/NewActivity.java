package liuhuan.com.gitdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ahrz7 on 2018/10/11.
 * lhh修改的
 */

public class NewActivity extends AppCompatActivity {
    private TextView next;

    public static void open(Context context,String text){
        Intent intent=new Intent(context,NewActivity.class);
        intent.putExtra("text",text);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        next=(TextView)findViewById(R.id.next);
        if(getIntent().getStringExtra("text")!=null) {
            next.setText(getIntent().getStringExtra("text"));
        }

    }
}
