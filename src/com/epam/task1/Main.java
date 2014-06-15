package com.epam.task1;


import com.epam.task1.entity.*;

public class Main {
       public static void main(String[] args){

           ComputerPart partOne = new CPU("ЦПУ ", "AMD FX", 8350, 8, 3.2, 3, 31600);
           ComputerPart partTwo = new Videocard(" Видеокарта\n ", "Radeon HD6990,"," PCI Ex 2.0, ", 256, 5.0, 2, 28600);

           ComputerPart partThree = new Drive("Дисковод ", "Blu Ray", "SATA", "Внутренний", 8600  );
           String s2 = partThree.componentParts();
           System.out.println(partThree);

           ComputerPart partFour = new PSU("Блок питания ", "FSP Group", "SATA", 600, 15200 );
           String s3 = partFour.componentParts();
           System.out.println(partFour);

           ComputerPart partFive = new Motheboard("Материнская плата: ","MSI 990FXA-GD80","Socket AM3+","2xPCI Express x16",
                                      "4xSTA-II RAID 0,1", "4xDDRIII", 32, "DDR III", "1xGigabit Ethernet 1000/100/10 Marvell 88E1111",
                                      "Creative Sound Blaster Live! 24-bit, 8 каналов",36520);
           String s4 = partFour.componentParts();
           System.out.println(partFive);

           ComputerPart partSix = new RAM("Оперативная память ", "Transcend" ,16, 1333, "DDR III", 1.35, 21450);
           String s5 = partFour.componentParts();
           System.out.println(partSix);

           ComputerPart partSeven = new Cooler("Кулер ", " Socket - S1155", 30, 1.2, 95, 4000);
           String s6 = partFour.componentParts();
           System.out.println(partSeven);

           StationaryComputer stationaryComputer = new StationaryComputer();
           stationaryComputer.addComputerPart(partOne);
           stationaryComputer.addComputerPart(partTwo);
           System.out.println("\n" + "Цена компьютера: ");
           stationaryComputer.printCompozition();
           System.out.println("равна " + stationaryComputer.getPrice());
       }


}
