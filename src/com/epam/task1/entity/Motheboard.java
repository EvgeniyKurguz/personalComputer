package com.epam.task1.entity;


public class Motheboard extends ComputerPart {
    private String name;
    private String chipset;
    private String expansionSlots;
    private String interfaces; // ATA, SATA, RAID
    private String quantityNestsRam;
    private int maximumValue;
    private String typeRam;
    private String ethernetController;
    private String soundController;
    private int price;

    public Motheboard(String componentParts,String name, String chipset, String expansionSlots,String interfaces,
                      String quantityNestsRam, int maximumValue,String typeRam,
                      String ethernetController, String soundController, int price  ) {
        super(componentParts);
        this.setName(name);
        this.setChipset(chipset);
        this.setExpansionSlots(expansionSlots);
        this.setInterfaces(interfaces);
        this.setQuantityNestsRam(quantityNestsRam);
        this.setMaximumValue(maximumValue);
        this.setTypeRam(typeRam);
        this.setEthernetController(ethernetController);
        this.setSoundController(soundController);
        this.setPrice(price);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setPrice(int price) {
        this.price = price;
    }

    String getPeripherals() {
        return null;
    }

    @Override
    public String componentParts() {
        return null;
    }

    @Override
    public String toString() {
        return "Материнская плата: " +
                "Модель='" + name + '\'' +
                ", Чипсет='" + chipset + '\'' +
                ", expansionSlots='" + expansionSlots + '\'' +
                ", Интерфейс='" + interfaces + '\'' + "\n\t\t\t\t" +
                " Количество слотов для оперативной памяти='" + quantityNestsRam + '\'' +
                ", Максимальный объём памяти=" + maximumValue +
                ", Тип ОЗУ='" + typeRam + '\'' + "\n\t\t\t\t" +
                "  Сетевой контроллер='" + ethernetController + '\'' +
                ", Звуковой контроллер='" + soundController + '\'' +
                ", Цена=" + price +" Тенге;" ;
    }
}
