package com.epam.task1.entity;


public class CPU extends ComputerPart  {
   private String name;
    private int quantityCore;
    private int version;
    private double frequency; // in Hz;
    private int cacheMemory;
    private int price;

    public CPU(String componentParts, String name, int version, int quantityCore,  double frequency, int cacheMemory, int price) {
        super(componentParts);
        this.setName(name);
        this.setQuantityCore(quantityCore);
        this.setVersion(version);
        this.setFrequency(frequency);
        this.setCacheMemory(cacheMemory);
        this.setPrice(price);
        this.setComponentParts(componentParts);
    }

       @Override
   public String componentParts() {
        return componentParts;
    }
    public void setComponentParts(String componentParts) {
        this.componentParts = componentParts;
        System.out.print(componentParts + "\n");
    }


  public static int getPrice() {
        return 0;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
        System.out.print(name + " ");
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

    public void setPrice(int price) {
        this.price = price;
        System.out.print(" Цена: " + price + " тенге. ");
    }
}
