package com.epam.task1.entity;


public class RAM extends ComputerPart {

    private int memory;
    private int frequency;
    private String typeRam; // DDR I; DDR II; DDR III.
    private double voltage;


    public RAM( String name, int memory,int frequency, String typeRam,double voltage,int price  ) {
        super(name, price);
        this.setMemory(memory);
        this.setFrequency(frequency);
        this.setTypeRam(typeRam);
        this.setVoltage(voltage);

}
    @Override
    public String name() {
        return null;
    }

    public static int getPrice() {
        return 0;
    }



    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getTypeRam() {
        return typeRam;
    }

    public void setTypeRam(String typeRam) {
        this.typeRam = typeRam;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "RAM: " +
                ", Объём памяти=" + memory +"ГБ 2x8" +
                ", frequency=" + frequency +" МГц" +
                ", typeRam='" + typeRam + '\'' +
                ", Вольтаж=" + voltage ;

    }
}
