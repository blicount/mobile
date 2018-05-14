package bentihon.licount.com.myfiratapp.storage;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

    @Dao
    public interface BirthDayDao {
        @Query("SELECT * FROM birthdayentity ORDER BY SUBSTR(DATE('NOW'), 6)>SUBSTR(date, 6), SUBSTR(date, 6) DESC"   )
        List<BirthDayEntity> getallbirthdate();

        @Insert
        void insertAll(BirthDayEntity birthday);

}
