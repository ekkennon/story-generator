package com.ernielee.storyideas3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CharacterHelper extends SQLiteOpenHelper {
    public static final String TABLE_CHARACTERS = "character";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CHARACTER = "character";

    private static final String DATABASE_CREATE = "create table "
            + TABLE_CHARACTERS
            + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_CHARACTER + " text not null"
            + ");";

    public CharacterHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
