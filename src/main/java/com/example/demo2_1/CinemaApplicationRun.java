package com.example.demo2_1;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args){
        Viewer a1 = new Viewer();
        Viewer a2 = new Viewer();
        Viewer a3 = new Viewer();
        Viewer a4 = new Viewer();
        Viewer a5 = new Viewer();

        List<Viewer> ab = new ArrayList<Viewer>();
        ab.add(a1);
        ab.add(a2);
        ab.add(a3);
        ab.add(a4);
        ab.add(a5);

        ViewerStatistics.averageAge(ab);
    }
}
