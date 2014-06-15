package com.epam.task1.entity;


public class Videocard extends ComputerPart {
    private String name;
    private String extensionBoard; // PCI, PCI-E, AGP, ISA
    private int dataBus; //quantity bit
    private double versionShader;
    private int videoMemory;
    private int price;

    public Videocard(String componentParts, String name, String extensionBoard,
                     int dataBus, double versionShader, int videoMemory, int price) {
        super(componentParts);
        this.setName(name);
        this.setExtensionBoard(extensionBoard);
        this.setDataBus(dataBus);
        this.setVersionShader(versionShader);
        this.setVideoMemory(videoMemory);
        this.setPrice(price);
        this.setComponentParts(componentParts);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.print(name);
    }

    public String getExtensionBoard() {
        return extensionBoard;
    }

    public void setExtensionBoard(String extensionBoard) {
        this.extensionBoard = extensionBoard;
        System.out.print(" Плата расширения " + extensionBoard);
    }

    public int getDataBus() {
        return dataBus;
    }

    public void setDataBus(int dataBus) {
        this.dataBus = dataBus;
        System.out.print(" Шина " + dataBus + " bit,");
    }

    public double getVersionShader() {
        return versionShader;
    }

    public void setVersionShader(double versionShader) {
        this.versionShader = versionShader;
        System.out.print(" Версия шейдера " + versionShader + ",");
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
        System.out.print(" Видеопамять " + videoMemory + "Гб,");
    }


    public void setPrice(int price) {
        this.price = price;
        System.out.print(" Цена " + price + " Тенге.");
    }


    String getPeripherals() {
        return "";
    }

    @Override
    public String componentParts() {
        return null;
    }


   public static int getPrice() {
        return 0;
    }

    public void setComponentParts(String componentParts) {
        this.componentParts = componentParts;
        System.out.print(componentParts);
    }
}
