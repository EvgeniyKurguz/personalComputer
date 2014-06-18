package com.epam.task1.entity;


public  class Cooler extends ComputerPart {

    private int noiseLevel;
    private double powerConsumption;
    private int weight;

    public Cooler(String name, int price) {
        super(name, price);
    }

    public Cooler() {

    }

    @Override
    public String name() {
        return null;
    }

    public static class Builder  {
        private int noiseLevel;// dB
        private double powerConsumption; // in watt
        private int weight;

        public Builder(String name, int price) {
        }

        public Builder noiseLevel (int noiseLevel) {
           this.noiseLevel = noiseLevel;
            return null;
        }

        public Builder powerConsumption(double powerConsumption) {
            this.powerConsumption = powerConsumption;
            return null;
        }

        public Builder weight(int weight) {
           this.weight = weight;
           return null;

        }

        public Cooler Build() {
            return new Cooler();
        }

        private Builder(Builder builder) {
            noiseLevel = builder.noiseLevel;
            powerConsumption = builder.powerConsumption;
            weight = builder.weight;
        }


        public static int getPrice() {
            return 0;
        }

        public int getNoiseLevel() {
            return noiseLevel;
        }

        public void setNoiseLevel(int noiseLevel) {
            this.noiseLevel = noiseLevel;
        }

        public double getPowerConsumption() {
            return powerConsumption;
        }

        public void setPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Cooler: " +
                    ", Уровень шума=" + noiseLevel + "дб" +
                    ", Потребляемая мощность=" + powerConsumption + "Вт" +
                    ", Ширина=" + weight;

        }

            }
}