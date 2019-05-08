package cs2c.tku.hw3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView tr,tg,tb,tout;
    EditText red,green,blue;
    String to=" ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tr=(TextView)findViewById(R.id.textView2);
        tg=(TextView)findViewById(R.id.textView3);
        tb=(TextView)findViewById(R.id.textView4);
        tout=(TextView)findViewById(R.id.textViews);
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                red=(EditText) findViewById(R.id.editText1);
                green=(EditText)findViewById(R.id.editText2);
                blue=(EditText)findViewById(R.id.editText3);
                int r,g,b;
                r=Integer.parseInt(red.getText().toString());
                g=Integer.parseInt(green.getText().toString());
                b=Integer.parseInt(blue.getText().toString());
                tr.setTextColor(getResources().getColor(R.color.red));
                tg.setTextColor(getResources().getColor(R.color.green));
                tb.setTextColor(getResources().getColor(R.color.blue));
                to+=red.getText().toString()+","+green.getText().toString()+","+blue.getText().toString()+"\n";
                tout.setText(to);
                tout.setMovementMethod(new ScrollingMovementMethod());
                tout.setBackgroundColor(Color.rgb(r,g,b));
            }
        });
    }
}
