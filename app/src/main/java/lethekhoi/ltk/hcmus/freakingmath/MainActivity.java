package lethekhoi.ltk.hcmus.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTxtSothu1, mTxtSothu2, mTxtPhepTinh, mTxtKetQua;
    ImageButton mImgDung, mImgSai;
    Random mRandom;
    int mRandomSt1 = 0;
    int mRandomSt2 = 0;
    int mIndex = 0;
    int mKetQua = 0;
    boolean mIsTrue = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        mapView();
        event();


    }

    //init : khoi tạo
    private void init() {
        //anh xa
        mTxtSothu1 = findViewById(R.id.textviewSothu1);
        mTxtSothu2 = findViewById(R.id.textviewSothu2);
        mTxtPhepTinh = findViewById(R.id.textviewPheptinh);
        mTxtKetQua = findViewById(R.id.textviewKetqua);
        mImgDung = findViewById(R.id.imagebuttonTrue);
        mImgSai = findViewById(R.id.imagebuttonFalse);
        mRandom = new Random();
    }

    //mapView gan du lieu
    private void mapView() {
        //handle Random caculator
        handleRandom();
    }

    private void handleRandom() {
        mRandomSt1 = mRandom.nextInt(9) + 1;
        mRandomSt2 = mRandom.nextInt(9) + 1;
        mIndex = mRandom.nextInt(3);
        mIsTrue = mRandom.nextBoolean();


        switch (mIndex) {

            case 0:
                mKetQua = mRandomSt1 + mRandomSt2;
                mTxtPhepTinh.setText("+");
                break;
            case 1:
                mKetQua = mRandomSt1 - mRandomSt2;
                mTxtPhepTinh.setText("-");
                break;
            case 2:
                mKetQua = mRandomSt1 / mRandomSt2;
                mTxtPhepTinh.setText("/");
                break;
            default:
                mKetQua = mRandomSt1 * mRandomSt2;
                mTxtPhepTinh.setText("*");
                break;
        }
        if (!mIsTrue) {
            mKetQua += mRandom.nextInt(5);
        }
        mTxtSothu1.setText(mRandomSt1 + "");
        mTxtSothu2.setText(mRandomSt2 + "");
        mTxtKetQua.setText("= " + mKetQua + "");


    }

    private void event() {
        mImgDung.setOnClickListener(MainActivity.this);
        mImgSai.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        String thongbao = "";
        switch (v.getId()) {
            case R.id.imagebuttonTrue:

                thongbao = mIsTrue ? "Chinh xac" : "Sai roi";
                Toast.makeText(this, thongbao, Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagebuttonFalse:

                thongbao = !mIsTrue ? "Chinh xac" : "Sai roi";
                Toast.makeText(this, thongbao, Toast.LENGTH_SHORT).show();
                break;
        }
        handleRandom();
    }
}
