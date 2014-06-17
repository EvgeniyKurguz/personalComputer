package com.epam.task1.entity;


public class Motheboard extends ComputerPart {

    private String chipset;
    private String expansionSlots;
    private String interfaces;
    private String quantityNestsRam;
    private int maximumValue;
    private String typeRam;
    private String ethernetController;
    private String soundController;


    public Motheboard(String name, String chipset, String expansionSlots,String interfaces,
                      String quantityNestsRam, int maximumValue,String typeRam,
                      String ethernetController, String soundController, int price  ) {
        super(name, price);
        this.setChipset(chipset);
        this.setExpansionSlots(expansionSlots);
        this.setInterfaces(interfaces);
        this.setQuantityNestsRam(quantityNestsRam);
        this.setMaximumValue(maximumValue);
        this.setTypeRam(typeRam);
        this.setEthernetController(ethernetController);
        this.setSoundController(soundController);

    }

    public String getExpansionSlots() {
        return expansionSlots;
    }

    public void setExpansionSlots(String expansionSlots) {
        this.expansionSlots = expansionSlots;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getQuantityNestsRam() {
        return quantityNestsRam;
    }

    public void setQuantityNestsRam(String quantityNestsRam) {
        this.quantityNestsRam = quantityNestsRam;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        this.maximumValue = maximumValue;
    }

    public String getTypeRam() {
        return typeRam;
    }

    public void setTypeRam(String typeRam) {
        this.typeRam = typeRam;
    }

    public String getEthernetController() {
        return ethernetController;
    }

    public void setEthernetController(String ethernetController) {
        this.ethernetController = ethernetController;
    }

    public String getSoundController() {
        return soundController;
    }

    public void setSoundController(String soundController) {
        this.soundController = soundController;
    }

     @Override
    public String toString() {
        return "Материнская плата: " +
                ", Чипсет='" + chipset + '\'' +
                ", expansionSlots='" + expansionSlots + '\'' +
                ", Интерфейс='" + interfaces + '\'' + "\n\t\t\t\t" +
                " Количество слотов для оперативной памяти='" + quantityNestsRam + '\'' +
                ", Максимальный объём памяти=" + maximumValue +
                ", Тип ОЗУ='" + typeRam + '\'' + "\n\t\t\t\t" +
                "  Сетевой контроллер='" + ethernetController + '\'' +
                ", Звуковой контроллер='" + soundController + '\'';

    }

    @Override
    public String name() {
        return null;
    }
}
