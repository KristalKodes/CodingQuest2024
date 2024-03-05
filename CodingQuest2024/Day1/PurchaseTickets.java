package Day1;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class PurchaseTickets{
    public static void main(String[] args) throws IOException{

        List<String> ticketDetails = new ArrayList<String>();
        ticketDetails = Files.readAllLines(Paths.get("CodingQuest2024/Day1/TicketPriceDetails.txt"));
        
        int solarSkiesPrice = 0;
        int celestialFlierPrice = 0;
        int ryanSpacePrice = 0;
        int novaWingsPrice = 0;
        int neptuneExpressPrice = 0;
        int spaceZPrice = 0;
        int astroWingsPrice = 0;
        int cathayGalacticPrice = 0;
        int martianSpacelinesPrice = 0;
        int cosmoAirPrice = 0;
        int orionAirPrice = 0;
        int auroraSpacePrice = 0;
        int stellarJetPrice = 0;
        int lunaLinePrice = 0;
        int qantasSpacePrice = 0;
        int starCruizerPrice = 0;
        int voyagerPrice = 0;
        int galaxyExpressPrice = 0;
        int nebulaAirPrice = 0;
        int cometAirPrice = 0;

        for(int t = 0; t < ticketDetails.size(); t++){
            String airline = ticketDetails.get(t).substring(0, ticketDetails.get(t).indexOf(":"));
            boolean priceReduction = false;
            int price = Integer.parseInt(ticketDetails.get(3).substring(ticketDetails.get(3).length()-4).trim());
            if((ticketDetails.get(t).indexOf("Rebate") > 0) || (ticketDetails.get(t).indexOf("Discount") > 0)){
                priceReduction = true;
            }if(airline.equals("SolarSkies")){
                if(priceReduction){
                    solarSkiesPrice -= price;
                }else{
                    solarSkiesPrice += price;
                }
            }else if(airline.equals("CelestialFlier")){
                if(priceReduction){
                    celestialFlierPrice -= price;
                }else{
                    celestialFlierPrice += price;
                }
            }else if(airline.equals("RyanSpace")){
                if(priceReduction){
                    ryanSpacePrice -= price;
                }else{
                    ryanSpacePrice += price;
                }
            }else if(airline.equals("NovaWings")){
                if(priceReduction){
                    novaWingsPrice -= price;
                }else{
                    novaWingsPrice += price;
                }
            }else if(airline.equals("NeptuneExpress")){
                if(priceReduction){
                    neptuneExpressPrice -= price;
                }else{
                    neptuneExpressPrice += price;
                }
            }else if(airline.equals("SpaceZ")){
                if(priceReduction){
                    spaceZPrice -= price;
                }else{
                    spaceZPrice += price;
                }
            }else if(airline.equals("AstroWings")){
                if(priceReduction){
                    astroWingsPrice -= price;
                }else{
                    astroWingsPrice += price;
                }
            }else if(airline.equals("CathayGalactic")){
                if(priceReduction){
                    cathayGalacticPrice -= price;
                }else{
                    cathayGalacticPrice += price;
                }
            }else if(airline.equals("MartianSpacelines")){
                if(priceReduction){
                    martianSpacelinesPrice -= price;
                }else{
                    martianSpacelinesPrice += price;
                }
            }else if(airline.equals("CosmoAir")){
                if(priceReduction){
                    cosmoAirPrice -= price;
                }else{
                    cosmoAirPrice += price;
                }
            }else if(airline.equals("OrionAir")){
                if(priceReduction){
                    orionAirPrice -= price;
                }else{
                    orionAirPrice += price;
                }
            }else if(airline.equals("AuroraSpace")){
                if(priceReduction){
                    auroraSpacePrice -= price;
                }else{
                    auroraSpacePrice += price;
                }
            }else if(airline.equals("StellarJet")){
                if(priceReduction){
                    stellarJetPrice -= price;
                }else{
                    stellarJetPrice += price;
                }
            }else if(airline.equals("LunaLine")){
                if(priceReduction){
                    lunaLinePrice -= price;
                }else{
                    lunaLinePrice += price;
                }
            }else if(airline.equals("QantasSpace")){
                if(priceReduction){
                    qantasSpacePrice -= price;
                }else{
                    qantasSpacePrice += price;
                }
            }else if(airline.equals("StarCruizer")){
                if(priceReduction){
                    starCruizerPrice -= price;
                }else{
                    starCruizerPrice += price;
                }
            }else if(airline.equals("Voyager")){
                if(priceReduction){
                    voyagerPrice -= price;
                }else{
                    voyagerPrice += price;
                }
            }else if(airline.equals("GalaxyExpress")){
                if(priceReduction){
                    galaxyExpressPrice -= price;
                }else{
                    galaxyExpressPrice += price;
                }
            }else if(airline.equals("NebulaAir")){
                if(priceReduction){
                    nebulaAirPrice -= price;
                }else{
                    nebulaAirPrice += price;
                }
            }else{
                if(priceReduction){
                    cometAirPrice -= price;
                }else{
                    cometAirPrice += price;
                }
            }
        }
        ArrayList<Integer> airlinePrices = new ArrayList<Integer>();
    
        airlinePrices.add(solarSkiesPrice);
        airlinePrices.add(celestialFlierPrice);
        airlinePrices.add(ryanSpacePrice);
        airlinePrices.add(novaWingsPrice);
        airlinePrices.add(neptuneExpressPrice);
        airlinePrices.add(spaceZPrice);
        airlinePrices.add(astroWingsPrice);
        airlinePrices.add(cathayGalacticPrice);
        airlinePrices.add(martianSpacelinesPrice);
        airlinePrices.add(cosmoAirPrice);
        airlinePrices.add(orionAirPrice);
        airlinePrices.add(auroraSpacePrice);
        airlinePrices.add(stellarJetPrice);
        airlinePrices.add(lunaLinePrice);
        airlinePrices.add(qantasSpacePrice);
        airlinePrices.add(starCruizerPrice);
        airlinePrices.add(voyagerPrice);
        airlinePrices.add(galaxyExpressPrice);
        airlinePrices.add(nebulaAirPrice);
        airlinePrices.add(cometAirPrice);

        for(int a = 0; a < airlinePrices.size(); a++){
            System.out.println(airlinePrices.get(a));
        }
    }
}