package com.company;

import java.util.ArrayList;

public class Risers {
    ArrayList<Riser> lots;

    public Risers() {
        lots = new ArrayList<Riser>();
    }


    @Override
    public String toString() {
        return "Risers{" +
                "lots=" + lots +
                '}';
    }
}
