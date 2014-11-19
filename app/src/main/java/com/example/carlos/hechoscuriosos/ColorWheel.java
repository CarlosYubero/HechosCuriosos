package com.example.carlos.hechoscuriosos;

import android.graphics.Color;
import android.widget.RelativeLayout;

/**
 * Created by Carlos on 19/11/2014.
 */
public class ColorWheel {
    String[] Colores = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7" // light gray
    };

    public int NumAlAzar(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public int getColorAleatorio() {
        int NumAlAzar = NumAlAzar(0, Colores.length-1);
        return Color.parseColor(Colores[NumAlAzar]);
    }

    public void changeBackgroundColor (RelativeLayout Rl) {
        Rl.setBackgroundColor(getColorAleatorio());
    }
}
