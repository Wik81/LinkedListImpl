package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>lista = new LinkedList<>();

        lista.add("Adam");
        lista.add("Jola");
        lista.add("Karol");

        for(String l: lista){
            System.out.println(l);
        }
    }
}
