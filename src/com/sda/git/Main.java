package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomList<String>customList = new CustomLinkedList<>();

        customList.addTail("Jeden");
        customList.addTail("Dwa");
        customList.addTail("Trzy");
        customList.addTail("Cztery");
        customList.addTail("Piec");
        customList.addTail("Szesc");

        customList.printList();

    }
}
