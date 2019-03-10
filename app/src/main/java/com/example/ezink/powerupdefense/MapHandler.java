package com.example.ezink.powerupdefense;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class MapHandler {

    private Color[][] Map;



    public MapHandler()
    {
        Map = new Color[100][100];
        for(int i=47; i<50; i++)
        {
            for(int o=0; o<Map[i].length; o++)
            {
                Map[i][o] = Color.valueOf(175,150,50);
            }
        }
        for(int i=0; i<Map.length; i++)
        {
            for(int o=0; o<Map[i].length; o++)
            {
                if(o<47 || o>50)
                {
                    Map[i][o] = Color.valueOf(125,100,25);
                }
            }
        }
    }
}
