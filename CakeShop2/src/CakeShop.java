
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kabir
 */
public class CakeShop {
    private List<Cake> cakes;
    private int soldCount;
    
    public CakeShop() {
        this.cakes = new ArrayList<>();
        this.soldCount = 0;
    }
        
    public void registerCake(Cake c) {
     cakes.add(c);
    }
    public boolean sellCake(Cake c){
      if (cakes.remove(c)) {
       soldCount++;
       return true;
        }
       return false;
        }
    public Cake findFirstCakeWithColor(String color) {
       for (Cake cake : cakes) {
       if (cake.color.equals(color)) {
        return cake;
        }
        }
      return null;
    }
    public Cake findLargestCake(){
       if(cakes.isEmpty()){
        return null;
        }
        Cake largest = cakes.get(0);
        for (Cake cake : cakes) {

            if (cake.weight > largest.weight) {
                largest = cake;
            }
        }

        return largest;
    }
    public Cake findCheapestCake(){
       if(cakes.isEmpty()){
        return null;
       }
        
       Cake cheapest = cakes.get(0);
       
        for (Cake cake : cakes) {

        if (cake.cost < cheapest.cost) {
                cheapest = cake;
            }
        }

        return cheapest;
    }
    public int countCakes(String color){
        
        int c = 0;

        for (Cake cake : cakes) {

            if (cake.color.equals(color)) {
                    c++;
            }
        }
        return c;
    }
    public double calculateTotalWorth() {

        double total = 0;

        for (Cake cake : cakes) {
            total += cake.cost;
        }

        return total;
    }
    public int totalSoldCakes() {
        return soldCount;
    }
    }