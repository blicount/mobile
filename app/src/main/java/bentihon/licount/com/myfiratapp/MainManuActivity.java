package bentihon.licount.com.myfiratapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bentihon.licount.com.myfiratapp.recyclerView.BirthDayActivity;
import bentihon.licount.com.myfiratapp.recyclerView.BirthDayList;


public class MainManuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_manu);


    }

    public void launch_calc(View view) {
        Intent intent = new Intent(this, CalcActivity.class);
        startActivity(intent);
    }


    public void launch_birth(View view) {
        Intent intent = new Intent(this, BirthDayList.class);
        startActivity(intent);
    }
}




