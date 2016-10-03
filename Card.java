/**
 * Created by Steven-1 on 2/10/2016.
 */
public class Card {

    private int id;
    private double hardness;
    private double gravity;
    private double cleavage;
    private double abundance;
    private double value;
    private String name;


    public Card(int id){
        this.id = id;
        this.hardness = 0;
        this.gravity = 0;
        this.cleavage = 0;
        this.abundance = 0;
        this.value = 0;
        this.name = "";

    }
    public String toString(){
        return "NAME: " + name + " ID:" + id + " H:" + hardness + " G:" + gravity + " C:" + cleavage + " A:" + abundance + " V:" + value;
    }

    public double getCardCategory(String category){
        if (category.equals("H")){
            return this.hardness;
        }
        if (category.equals("G")){
            return this.gravity;
        }
        if (category.equals("C")){
            return this.cleavage;
        }
        if (category.equals("A")){
            return this.abundance;
        }
        if (category.equals("V")){
            return this.value;
        }
        return 0;
    }

    public void AssignCardValues(){

        //testing
        ///////////////

        //This is where i assign each individual cards' there respective values.
        //Check dictionary to see what cleavage, abundance and value values are.


        ///////////////
        if (this.id == 0){
            this.hardness = 7;
            this.gravity = 2.65;
            this.cleavage = 2;
            this.abundance = 5;
            this.value = 3;
            this.name = "Quartz";
        }
        if (this.id == 1){
            this.hardness = 6.5;
            this.gravity = 2.8;
            this.cleavage = 10;
            this.abundance = 6;
            this.value = 3;
            this.name = "Plagioclase";
        }
        if (this.id == 2){
            this.hardness = 6.5;
            this.gravity = 2.6;
            this.cleavage = 10;
            this.abundance = 5;
            this.value = 3;
            this.name = "Orthoclase";
        }
        if (this.id == 3){
            this.hardness = 3;
            this.gravity = 3.3;
            this.cleavage = 9;
            this.abundance = 4;
            this.value = 2;
            this.name = "Biotite";
        }
        if (this.id == 4){
            this.hardness = 3;
            this.gravity = 2.9;
            this.cleavage = 9;
            this.abundance = 4;
            this.value = 3;
            this.name = "Muscovite";
        }
        if (this.id == 5){
            this.hardness = 6;
            this.gravity = 3.5;
            this.cleavage = 7;
            this.abundance = 4;
            this.value = 1;
            this.name = "Hornblende";
        }
        if (this.id == 6){
            this.hardness = 6;
            this.gravity = 3.5;
            this.cleavage = 7;
            this.abundance = 3;
            this.value = 2;
            this.name = "Actinolite";
        }
        if (this.id == 7){
            this.hardness = 6;
            this.gravity = 3.2;
            this.cleavage = 7;
            this.abundance = 3;
            this.value = 1;
            this.name = "Glaucophane";
        }
        if (this.id == 8){
            this.hardness = 7;
            this.gravity = 4.4;
            this.cleavage = 4;
            this.abundance = 5;
            this.value = 2;
            this.name = "Olivine";
        }
        if (this.id == 9){
            this.hardness = 7.5;
            this.gravity = 4.3;
            this.cleavage = 1;
            this.abundance = 4;
            this.value = 3;
            this.name = "Garnet";
        }
        if (this.id == 10){
            this.hardness = 5.5;
            this.gravity = 3.6;
            this.cleavage = 8;
            this.abundance = 3;
            this.value = 2;
            this.name = "Titanite";
        }
        if (this.id == 11){
            this.hardness = 7.5;
            this.gravity = 4.7;
            this.cleavage = 4;
            this.abundance = 2;
            this.value = 3;
            this.name = "Zircon";
        }
        if (this.id == 12){
            this.hardness = 6.5;
            this.gravity = 3.6;
            this.cleavage = 4;
            this.abundance = 5;
            this.value = 1;
            this.name = "Augite";
        }
        if (this.id == 13){
            this.hardness = 6;
            this.gravity = 3.9;
            this.cleavage = 4;
            this.abundance = 5;
            this.value = 1;
            this.name = "Orthopyroxene";
        }
        if (this.id == 14){
            this.hardness = 3;
            this.gravity = 3.3;
            this.cleavage = 9;
            this.abundance = 4;
            this.value = 2;
            this.name = "Chlorite";
        }
        if (this.id == 15){
            this.hardness = 4;
            this.gravity = 2.6;
            this.cleavage = 9;
            this.abundance = 3;
            this.value = 2;
            this.name = "Antigorite";
        }
        if (this.id == 16){
            this.hardness = 1;
            this.gravity = 2.8;
            this.cleavage = 9;
            this.abundance = 3;
            this.value = 3;
            this.name = "Talc";
        }
        if (this.id == 17){
            this.hardness = 2.5;
            this.gravity = 2.7;
            this.cleavage = 9;
            this.abundance = 4;
            this.value = 4;
            this.name = "Kaolinite";
        }
        if (this.id == 18){
            this.hardness = 7;
            this.gravity = 3.15;
            this.cleavage = 7;
            this.abundance = 3;
            this.value = 3;
            this.name = "Andalusite";
        }
        if (this.id == 19){
            this.hardness = 7;
            this.gravity = 3.7;
            this.cleavage = 10;
            this.abundance = 2;
            this.value = 3;
            this.name = "Kyanite";
        }
        if (this.id == 20){
            this.hardness = 7.5;
            this.gravity = 3.25;
            this.cleavage = 10;
            this.abundance = 3;
            this.value = 2;
            this.name = "Sillimanite";
        }
        if (this.id == 21){
            this.hardness = 7;
            this.gravity = 3.8;
            this.cleavage = 5;
            this.abundance = 2;
            this.value = 2;
            this.name = "Staurolite";
        }
        if (this.id == 22){
            this.hardness = 6.5;
            this.gravity = 3.5;
            this.cleavage = 9;
            this.abundance = 4;
            this.value = 1;
            this.name = "Epidote";
        }
        if (this.id == 23){
            this.hardness = 7.5;
            this.gravity = 3.2;
            this.cleavage = 4;
            this.abundance = 2;
            this.value = 3;
            this.name = "Tourmaline";
        }
        if (this.id == 24){
            this.hardness = 8;
            this.gravity = 3.6;
            this.cleavage = 9;
            this.abundance = 1;
            this.value = 2;
            this.name = "Topaz";
        }
        if (this.id == 25){
            this.hardness = 8;
            this.gravity = 2.9;
            this.cleavage = 3;
            this.abundance = 2;
            this.value = 3;
            this.name = "Beryl";
        }
        if (this.id == 26){
            this.hardness = 6.5;
            this.gravity = 5;
            this.cleavage = 4;
            this.abundance = 3;
            this.value = 3;
            this.name = "Pyrite";
        }
        if (this.id == 27){
            this.hardness = 4.5;
            this.gravity = 4.6;
            this.cleavage = 1;
            this.abundance = 3;
            this.value = 3;
            this.name = "Pyrrhotite";
        }
        if (this.id == 28){
            this.hardness = 4;
            this.gravity = 4.3;
            this.cleavage = 4;
            this.abundance = 3;
            this.value = 5;
            this.name = "Chalcopyrite";
        }
        if (this.id == 29){
            this.hardness = 2.5;
            this.gravity = 7.6;
            this.cleavage = 13;
            this.abundance = 2;
            this.value = 4;
            this.name = "Galena";
        }
        if (this.id == 30){
            this.hardness = 4;
            this.gravity = 4.1;
            this.cleavage = 15;
            this.abundance = 2;
            this.value = 4;
            this.name = "Sphalerite";
        }
        if (this.id == 31){
            this.hardness = 1.5;
            this.gravity = 4.7;
            this.cleavage = 9;
            this.abundance = 2;
            this.value = 4;
            this.name = "Molybdenite";
        }
        if (this.id == 32){
            this.hardness = 3;
            this.gravity = 19.3;
            this.cleavage = 1;
            this.abundance = 1;
            this.value = 6;
            this.name = "Gold";
        }
        if (this.id == 33){
            this.hardness = 10;
            this.gravity = 3.5;
            this.cleavage = 14;
            this.abundance = 1;
            this.value = 6;
            this.name = "Diamond";
        }
        if (this.id == 34){
            this.hardness = 2;
            this.gravity = 2.2;
            this.cleavage = 9;
            this.abundance = 2;
            this.value = 3;
            this.name = "Graphite";
        }
        if (this.id == 35){
            this.hardness = 2.5;
            this.gravity = 2.2;
            this.cleavage = 13;
            this.abundance = 2;
            this.value = 3;
            this.name = "Halite";
        }
        if (this.id == 36){
            this.hardness = 4;
            this.gravity = 3.2;
            this.cleavage = 14;
            this.abundance = 2;
            this.value = 3;
            this.name = "Flourite";
        }
        if (this.id == 37){
            this.hardness = 2;
            this.gravity = 2.3;
            this.cleavage = 11;
            this.abundance = 2;
            this.value = 4;
            this.name = "Gypsum";
        }
        if (this.id == 38){
            this.hardness = 3.5;
            this.gravity = 4.5;
            this.cleavage = 12;
            this.abundance = 2;
            this.value = 3;
            this.name = "Barite";
        }
        if (this.id == 39){
            this.hardness = 5;
            this.gravity = 3.2;
            this.cleavage = 4;
            this.abundance = 3;
            this.value = 4;
            this.name = "Apatite";
        }
        if (this.id == 40){
            this.hardness = 5;
            this.gravity = 5.3;
            this.cleavage = 6;
            this.abundance = 2;
            this.value = 3;
            this.name = "Monazite";
        }
        if (this.id == 41){
            this.hardness = 3;
            this.gravity = 2.7;
            this.cleavage = 13;
            this.abundance = 4;
            this.value = 4;
            this.name = "Calcite";
        }
        if (this.id == 42){
            this.hardness = 4;
            this.gravity = 2.9;
            this.cleavage = 13;
            this.abundance = 3;
            this.value = 2;
            this.name = "Dolomite";
        }
        if (this.id == 43){
            this.hardness = 4;
            this.gravity = 3;
            this.cleavage = 13;
            this.abundance = 3;
            this.value = 3;
            this.name = "Magnesite";
        }
        if (this.id == 44){
            this.hardness = 4.5;
            this.gravity = 4;
            this.cleavage = 13;
            this.abundance = 2;
            this.value = 3;
            this.name = "Siderite";
        }
        if (this.id == 45){
            this.hardness = 6;
            this.gravity = 5.2;
            this.cleavage = 1;
            this.abundance = 4;
            this.value = 5;
            this.name = "Magnetite";
        }
        if (this.id == 46){
            this.hardness = 6;
            this.gravity = 5.3;
            this.cleavage = 1;
            this.abundance = 2;
            this.value = 4;
            this.name = "Hematite";
        }
        if (this.id == 47){
            this.hardness = 5.5;
            this.gravity = 5.1;
            this.cleavage = 1;
            this.abundance = 3;
            this.value = 4;
            this.name = "Chromite";
        }
        if (this.id == 48){
            this.hardness = 6;
            this.gravity = 4.8;
            this.cleavage = 1;
            this.abundance = 3;
            this.value = 3;
            this.name = "Ilmenite";
        }
        if (this.id == 49){
            this.hardness = 6.5;
            this.gravity = 4.3;
            this.cleavage = 7;
            this.abundance = 3;
            this.value = 4;
            this.name = "Rutile";
        }
        if (this.id == 50){
            this.hardness = 9;
            this.gravity = 4;
            this.cleavage = 1;
            this.abundance = 2;
            this.value = 3;
            this.name = "Corundum";
        }
        if (this.id == 51){
            this.hardness = 7;
            this.gravity = 7.1;
            this.cleavage = 6;
            this.abundance = 2;
            this.value = 4;
            this.name = "Cassiterite";
        }
        if (this.id == 52){
            this.hardness = 3.5;
            this.gravity = 2.4;
            this.cleavage = 9;
            this.abundance = 3;
            this.value = 4;
            this.name = "Gibbsite";
        }
        if (this.id == 53){
            this.hardness = 5.5;
            this.gravity = 4.3;
            this.cleavage = 10;
            this.abundance = 4;
            this.value = 3;
            this.name = "Goethite";
        }
        if (this.id == 54){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Miner";
        }
        if (this.id == 55){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Petrologist";
        }
        if (this.id == 56){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Gemmologist";
        }
        if (this.id == 57){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Mineralogist";
        }
        if (this.id == 58){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Geophysicist";
        }
        if (this.id == 59){
            this.hardness = 0;
            this.gravity = 0;
            this.cleavage = 0;
            this.abundance = 0;
            this.value = 0;
            this.name = "The Geologist";

            //because i cant read plist/xml files.
        }
    }
}
