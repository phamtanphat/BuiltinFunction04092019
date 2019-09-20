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
        int ketqua = tinhTong(5,10);
        Log.d("BBB",ketqua +"");
    }
    // Thuong duoc tao trong class
    // 1 : Access modifier : Pham vi truy cap
    // public : O dau cung thay duoc het
    // private : tao ra dau thi dung o do
    // 2 : Gia tri tra ve
    //3 : ten phuong thuc
    private Integer tinhTong(int a , int b){
        int tong = a + b;
        return tong;
    }
}
