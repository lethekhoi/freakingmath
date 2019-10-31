package lethekhoi.ltk.hcmus.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        for(int i=0;i<30;i++){
            //random trong khoang mim max
           // int number = random.nextInt(max-min+1)+min;
            int number= random.nextInt(5);
            Log.d("BBB",number+"");
        }


        //Context
                // BaseActivity
                    //Activity
                        //Fragment
        //this nó tượng trưng cho thằng gọi nó,
        //thấy context=> truyền tên màn hình vào
        //cach xem tham so trong method: ctrl+pgit
        //cách gợi ý code : ctrl+ space
        int number= random.nextInt(5);
       Toast.makeText(this,String.valueOf(number), Toast.LENGTH_SHORT).show();

    }
}
