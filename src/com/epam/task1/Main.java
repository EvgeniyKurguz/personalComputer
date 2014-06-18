package com.epam.task1;


import com.epam.task1.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        {
            ComputerPart computerPart = new ComputerPart("", 0) {

                public String name() {
                    return null;
                }
            };
            computerPart.setName("Videocard");
            computerPart.setPrice(45000);
            ComputerPart copy = computerPart.createCopy();
            System.out.println("copy: " + copy + "\n");
        }
        {
         List<ComputerComparator> computerComparator = new ArrayList<ComputerComparator>();

        computerComparator.add(new ComputerComparator("Videocard ", 45000));
        computerComparator.add(new ComputerComparator("Motherboard ", 24000));
        computerComparator.add(new ComputerComparator("CPU ", 42000));
        computerComparator.add(new ComputerComparator("PSU ", 12000));

        Collections.sort(computerComparator,new ComputerComparator());

        for (ComputerComparator f : computerComparator) {
            System.out.println(f.getName() + f.getPrice());

            // System.out.println(computerComparator);
            //  Collections.sort(computerComparator, (o1, o2) -> o1.getName() - o2.getName());
        }
            {
        Cooler.Builder builder = new Cooler.Builder("Cooler: ", 4200);
        builder.noiseLevel(30);
        builder.weight(95);
        builder.powerConsumption(1.2);
        ComputerPart cooler = builder.Build();
        System.out.println(builder + "\n");

        StationaryComputer stationaryComputer = new StationaryComputer();
        System.out.println(stationaryComputer);
}}}}









