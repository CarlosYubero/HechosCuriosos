package com.example.carlos.hechoscuriosos;

import android.content.Context;

/**
 * Created by Carlos on 19/11/2014.
 */
public class HechoCurioso {

    public int NumAlAzar(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public String getHechoCurioso(Context context) {
        String[] mTestArray =   context.getResources().getStringArray(R.array.HechosCuriosos);
        System.out.println(mTestArray.length);
        int NumAlAzar = NumAlAzar(1, mTestArray.length);
        return mTestArray[NumAlAzar-1];
    }
}
