package com.company;

import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Przedmiot> przedmioty =new ArrayList<Przedmiot>();
    public void dodaj (Przedmiot przedmiot) {
        przedmioty.add(przedmiot);
    }
    public ArrayList<Przedmiot> pobierzPrzedmioty(){
        return przedmioty;
    }
}
