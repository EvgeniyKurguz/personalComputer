package com.epam.task1.entity;


public class RAM extends ComputerPart {
    private String name;
    private int memory;
    private int frequency;
    private String typeRam; // DDR I; DDR II; DDR III.
    private double voltage;
    private int price;

    public RAM(String componentParts, String name, int memory,int frequency, String typeRam,double voltage,int price  ) {
        super(componentParts);
        this.setName(name);
        this.setMemory(memory);
        this.setFrequency(frequency);
        this.setTypeRam(typeRam);
        this.setVoltage(voltage);
        this.setPrice(price);
}



public String getPeripherals() {
        return "";
        }

@Override
public String componentParts() {
        return "";
        }


   public static int getPrice() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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



    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RAM: " +
                "Производитель='" + name + '\'' +
                ", Объём памяти=" + memory +"ГБ 2x8" +
                ", frequency=" + frequency +" МГц" +
                ", typeRam='" + typeRam + '\'' +
                ", Вольтаж=" + voltage +
                ", price=" + price + " Тенге;";
    }
}
