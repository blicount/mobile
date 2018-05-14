package bentihon.licount.com.myfiratapp.recyclerView;

import android.app.DatePickerDialog;
import android.arch.persistence.room.Room;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import bentihon.licount.com.myfiratapp.R;
import bentihon.licount.com.myfiratapp.storage.BirthDayDB;
import bentihon.licount.com.myfiratapp.storage.BirthDayEntity;

import java.util.Calendar;
public class BirthDayActivity extends AppCompatActivity {


    EditText Name ;
    BirthDayDB db;
    String date;
    DatePickerDialog.OnDateSetListener mDate;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_birth_day);
        Name = findViewById(R.id.bdName);
        mText = findViewById(R.id.select);
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal  = Calendar.getInstance();
                int year =  cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day =  cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(BirthDayActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDate,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDate = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month += 1;
//                 date = dayOfMonth + "/" + month  + "/" + year ;
                date = year +"-"+month+"-"+dayOfMonth;
                mText.setText(date);
            }
        };

        db = Room.databaseBuilder(getApplicationContext(),BirthDayDB.class, "mydb8.db").allowMainThreadQueries().build();
    }

    public void addtodb(View view) {
        String check = mText.getText().toString();
        if(check.equals("select date") || Name.getText().toString().equals(""))
            return;
        db.bdDao().insertAll(new BirthDayEntity(Name.getText().toString(),mText.getText().toString()));
    }

    public void gotolist(View view) {
        Intent intent = new Intent(this, BirthDayList.class);
        startActivity(intent);
    }
}
