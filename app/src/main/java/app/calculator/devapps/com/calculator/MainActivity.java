package app.calculator.devapps.com.calculator;

import android.media.audiofx.Equalizer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private TextView textView;
//    private Button btnModify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        btnPlus.setOnClickListener(listener);
//        btnMinus.setOnClickListener(listener);
//        btnMul.setOnClickListener(listener);
//        btnDiv.setOnClickListener(listener);
//        Num7.setOnClickListener(listener);
//        Num8.setOnClickListener(listener);
//        Num9.setOnClickListener(listener);
//        Clear.setOnClickListener(listener);
//        Num4.setOnClickListener(listener);
//        Num5.setOnClickListener(listener);
//        Num6.setOnClickListener(listener);
//        Num0.setOnClickListener(listener);
//        Num1.setOnClickListener(listener);
//        Num2.setOnClickListener(listener);
//        Num3.setOnClickListener(listener);
//        Equal.setOnClickListener(listener);







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

//    public void onClick(View view) {
//        textView.setText("버튼 눌렸음.");
//    }
}
