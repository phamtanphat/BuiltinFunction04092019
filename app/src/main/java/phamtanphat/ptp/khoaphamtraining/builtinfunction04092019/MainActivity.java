package phamtanphat.ptp.khoaphamtraining.builtinfunction04092019;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Random
        // 0 - 5
        for (int i = 0 ; i < 10 ; i++){
            double value = Math.round(Math.random() * 5);
            Log.d("BBB",value + "");
        }
        // lam tron gia tri
//        Math.floor() : lam tron xuong
//        Math.ceil() : lam tron len
        double number1 = Math.floor(4.9999999);
        double number2 = Math.ceil(4.01);
        double number3 = Math.round(4.5);
        Log.d("BBB",number3 + "");
    }

}
