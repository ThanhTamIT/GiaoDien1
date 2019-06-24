package com.example.anthanhtam.giaodien1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtHoTen, edtSDT, edtEmail, edtCongty, edtKey1, edtKey2, edtKey3, edtKey4, edtKey5, edtKey6, edtKey7, edtKey8,
    edtKeySave1, edtkeySave2, edtKeySave3, edtUnique1, edtUnique2, edtUnique3, edtOS, edtNguoidung, edtMayTinh, edtSoLanCL, edtSoLanGH;
    Button btnMoRes, btnTaoLicense;
    ImageButton imgButonUp, imgButtonDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        btnMoRes.setOnClickListener(this);
        btnTaoLicense.setOnClickListener(this);
        imgButonUp.setOnClickListener(this);
        imgButtonDown.setOnClickListener(this);
    }

    private void Init() {
        edtHoTen=(EditText) findViewById(R.id.edtHoten);
        edtSDT=(EditText) findViewById(R.id.edtSDT);
        edtEmail=(EditText) findViewById(R.id.edtEmail);
        edtCongty=(EditText) findViewById(R.id.edtCty);
        edtKey1=(EditText) findViewById(R.id.edtKey1);
        edtKey2=(EditText) findViewById(R.id.edtKey2);
        edtKey3=(EditText) findViewById(R.id.edtKey3);
        edtKey4=(EditText) findViewById(R.id.edtKey4);
        edtKey5=(EditText) findViewById(R.id.edtKey5);
        edtKey6=(EditText) findViewById(R.id.edtKey6);
        edtKey7=(EditText) findViewById(R.id.edtKey7);
        edtKey8=(EditText) findViewById(R.id.edtKey8);
        edtKeySave1=(EditText) findViewById(R.id.edtKSave1);
        edtkeySave2=(EditText) findViewById(R.id.edtKSave2);
        edtKeySave3=(EditText) findViewById(R.id.edtKSave3);
        edtUnique1=(EditText)findViewById(R.id.edtUnique1);
        edtUnique2=(EditText)findViewById(R.id.edtUnique2);
        edtUnique3=(EditText)findViewById(R.id.edtUnique3);
        edtOS=(EditText)findViewById(R.id.edtOS);
        edtNguoidung=(EditText)findViewById(R.id.edtNguoidung);
        edtMayTinh=(EditText)findViewById(R.id.edtMaytinh);
        edtSoLanCL=(EditText)findViewById(R.id.edtSolanCL);
        edtSoLanGH=(EditText)findViewById(R.id.edtSoLanGH);
        btnMoRes=(Button) findViewById(R.id.btnMo);
        btnTaoLicense=(Button) findViewById(R.id.btnTao);
        imgButonUp=(ImageButton) findViewById(R.id.buttonUp);
        imgButtonDown=(ImageButton) findViewById(R.id.buttonDown);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMo:
                Toast.makeText(this, "hihi", Toast.LENGTH_SHORT).show();
                //.......
                break;
            case R.id.btnTao:
                //....
                break;
            case R.id.buttonUp:
                //....
                break;
            case R.id.buttonDown:
                break;
        }
    }
}
