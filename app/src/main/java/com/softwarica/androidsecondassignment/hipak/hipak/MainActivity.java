package com.softwarica.androidsecondassignment.hipak.hipak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.hipak.fragments.area;
import com.softwarica.androidsecondassignment.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnArea, btnPalindrome, btnSI, btnArmstrong, btnAuto, btnSwapping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArea = findViewById(R.id.btnArea);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAuto = findViewById(R.id.btnAutomorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnArea.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAuto.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btnArea:
                area area = new area();
                fragmentTransaction.replace(R.id.fragmentContainer, area);
                fragmentTransaction.commit();
                break;


        }
    }
}