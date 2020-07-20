package com.truiton.mobile.vision.ocr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class datab extends SQLiteOpenHelper {
    private static final String TABLE_USER="patientdb";
    private static final String KEY_ID = "id";
    private static final String Name= "name";
    private static final String COLUMN_NAME = "age";
    private static final String disease= "user_email";

    // public datab() {

SQLiteDatabase sqldb;
    public datab(Context context) {
        super(context, TABLE_USER, null, 1);
        sqldb = getWritableDatabase();

    }
    String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
            + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + Name + " TEXT,"
            + COLUMN_NAME + " TEXT," + disease + " TEXT" + ")";
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //db.execSQL("DROP TABLE IF EXISTS patientdb");
        onCreate(db);
    }
}
