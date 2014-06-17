package com.epam.task1.entity;


public class CPU extends ComputerPart  {

    private int quantityCore;
    private int version;
    private double frequency; // in Hz;
    private int cacheMemory;

    public CPU(String name, int version, int quantityCore,  double frequency, int cacheMemory, int price) {
        super(name, price);

        this.setQuantityCore(quantityCore);
        this.setVersion(version);
        this.setFrequency(frequency);
        this.setCacheMemory(cacheMemory);

    }

    @Override
    public String name() {
        return null;
    }

    public static int getPrice() {
        return 0;
    }

    public int getQuantityCore() {
        return quantityCore;
    }

    public void setQuantityCore(int quantityCore) {
        this.quantityCore = quantityCore;
        System.out.print(" " + quantityCore + " ядра,");
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
        System.out.print(" Версия " + version + ",");
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.print(" Частота " + frequency + "Ггц,");
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
        System.out.print(" Кэшь " + cacheMemory + " Mb,");
    }

   }
