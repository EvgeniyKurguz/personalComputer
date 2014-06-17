package com.epam.task1;


import com.epam.task1.entity.*;

public class Main {
       public static void main(String[] args){
         ComputerPart cooler = new Cooler.Builder("Cooler: ", 4200)
           .noiseLevel(30)
           .weight(90)
           .powerConsumption(1.2)
          .Build();

           StationaryComputer stationaryComputer = new StationaryComputer();
           System.out.println(stationaryComputer);

       }




    /**   ComputerPart partOne = new CPU( "AMD FX", 8350, 8, 3.2, 3, 31600);
           ComputerPart partTwo = new Videocard( "Radeon HD6990,"," PCI Ex 2.0, ", 256, 5.0, 2, 28600);

           ComputerPart partThree = new Drive( "Blu Ray", "SATA", "Внутренний", 8600  );
           String s2 = partThree.name();
           System.out.println(partThree);

           ComputerPart partFour = new PSU( "FSP Group", "SATA", 600, 15200 );
           String s3 = partFour.name();
           System.out.println(partFour);

           ComputerPart partFive = new Motheboard("MSI 990FXA-GD80","Socket AM3+","2xPCI Express x16",
                                      "4xSTA-II RAID 0,1", "4xDDRIII", 32, "DDR III", "1xGigabit Ethernet 1000/100/10 Marvell 88E1111",
                                      "Creative Sound Blaster Live! 24-bit, 8 каналов",36520);
           String s4 = partFour.name();
           System.out.println(partFive);

           ComputerPart partSix = new RAM( "Transcend" ,16, 1333, "DDR III", 1.35, 21450);
           String s5 = partFour.name();
           System.out.println(partSix);

           ComputerPart partSeven = new Cooler(" Socket - S1155", 30, 1.2, 95, 4000);
           String s6 = partFour.name();
          System.out.println(partSeven);
           **/

                 }



