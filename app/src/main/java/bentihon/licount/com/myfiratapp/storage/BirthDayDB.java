package bentihon.licount.com.myfiratapp.storage;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

    @Database(entities = {BirthDayEntity.class},version = 1)
    public abstract class BirthDayDB extends RoomDatabase {
        public abstract BirthDayDao bdDao();
    }

