package com.cp.provider;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Handler;

import com.cp.utils.CustomLoader;

/**
 * Created by T430 on 2018/3/19.
 */

public class DatabaseHelper extends SQLiteOpenHelper implements LoaderManager.LoaderCallbacks<CustomLoader>{

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    @Override
    public Loader<CustomLoader> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<CustomLoader> loader, CustomLoader data) {

    }

    @Override
    public void onLoaderReset(Loader<CustomLoader> loader) {

    }

}
