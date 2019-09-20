package phamtanphat.ptp.khoaphamtraining.builtinfunction04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // method == function
        // Giai quyet van de lap code
        //unboxing
        // auto boxing
        // Task :
            // 1 : Chay 0 - 100
            // 2 : Dieu dung thi in ra log
        // function insochan
        //function insole
        //function insochia3du1
        insoChan();
    }
    // Thuong duoc tao trong class
    // 1 : Access modifier : Pham vi truy cap
    // public : O dau cung thay duoc het
    // private : tao ra dau thi dung o do
    // 2 : Gia tri tra ve
    //3 : ten phuong thuc
    private void insoChan(){
        for (int i = 0 ; i<= 100 ; i++){
            if (i % 2 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insoLe(){
        for (int i = 0 ; i<= 100 ; i++){
            if (i % 2 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insoChia3du1(){
        for (int i = 0 ; i<= 100 ; i++){
            if (i % 3 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
}
