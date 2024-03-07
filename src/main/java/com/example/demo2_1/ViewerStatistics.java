package com.example.demo2_1;

import java.util.List;

public class ViewerStatistics {

    public static double  averageAge(List list){
        int sr = 0;
        int count = 0;
        for(Object s: list){
            sr += ((Viewer)s).getAge();
            count ++;
        }
        return sr/count;
    }
}
