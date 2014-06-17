package com.epam.task1.entity;


public class Videocard extends ComputerPart {

    private String extensionBoard;
    private int dataBus; //quantity bit
    private double versionShader;
    private int videoMemory;


    public Videocard(String name, String extensionBoard,
                     int dataBus, double versionShader, int videoMemory, int price) {
        super(name, price);

        this.setExtensionBoard(extensionBoard);
        this.setDataBus(dataBus);
        this.setVersionShader(versionShader);
        this.setVideoMemory(videoMemory);

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

         @Override
    public String name() {
        return null;
    }

    public static int getPrice() {
        return 0;
    }


}
