package bentihon.licount.com.myfiratapp.recyclerView;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import bentihon.licount.com.myfiratapp.recyclerView.UserAdapter;
import bentihon.licount.com.myfiratapp.R;
import bentihon.licount.com.myfiratapp.storage.BirthDayDB;
import bentihon.licount.com.myfiratapp.storage.BirthDayEntity;
import bentihon.licount.com.myfiratapp.recyclerView.BirthDayActivity;

import java.util.List;

public class BirthDayList extends AppCompatActivity {

    RecyclerView mylist;
    RecyclerView.Adapter adapter;
    BirthDayDB db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_day);
        mylist = findViewById(R.id.bday_list);

        db = Room.databaseBuilder(getApplicationContext(),BirthDayDB.class, "mydb8.db").allowMainThreadQueries().build();

        List<BirthDayEntity> birthDay = db.bdDao().getallbirthdate();

        mylist.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(birthDay);
        mylist.setAdapter(adapter);

    }
    public void newBirthDay(View view){
        Intent intent = new Intent(this, BirthDayActivity.class);
        startActivity(intent);
    }
}