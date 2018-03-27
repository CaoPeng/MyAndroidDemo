package com.cp.utils;

import android.content.AsyncTaskLoader;
import android.content.Context;

/**
 * Created by T430 on 2018/3/20.
 */

public class CustomLoader extends AsyncTaskLoader<String> {
    public CustomLoader(Context context) {
        super(context);
    }

    @Override
    public String loadInBackground() {
        return loadData();
    }
    private String loadData(){
        return "Hello this is loader";
    }
}
