/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kabir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CakeShop shop = new CakeShop();

        Cake c1 = new Cake("Chocolate Brownie", "Brownish", 2.3, 15);
        Cake c2 = new Cake("Vanilla sponge", "Whitish", 1.9, 30);
        Cake c3 = new Cake("ButterScotch", "Yellow", 3.2, 20);

        shop.registerCake(c1);
        shop.registerCake(c2);
        shop.registerCake(c3);

        IO.println("Largest cake:" + shop.findLargestCake().name);
        IO.println("Cheapest cake:" +shop.findCheapestCake().name);
        IO.println("Count:"+ shop.countCakes("Whitish"));
        IO.println("Total worth:" + shop.calculateTotalWorth());
    }
    
}
