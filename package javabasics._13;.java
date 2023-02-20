package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here

         for (int item : itemsA) {
        sumForA += item;
    }
    System.out.println("Sum for A: " +sumForA);

    System.out.println("Exercise 1b:");
    int[] itemsB = new int[]{1, 56, 23};

    int sumForB = 0;

    for (int item : itemsB){
        sumForB += item;
    }
    System.out.println("Sum for B: " + sumForB);

    System.out.println("Exercise 1c:");
    List<Integer>itemsC = new ArrayList<>(Arrays.asList(1, 56, 23));

    int sumForC = 0;

     for (int i = 0; i < itemsC.size(); i++) {
        sumForC += itemsC.get(i);
    }
    System.out.println("Sum for C: " + sumForC);

    if (sumForA =!sumForB || sumForB != sumForC) {
        System.out.println("Failed, sums are different!");
    } else {
        System.out.println("Success, sums are the same!");
    }



    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        for (int i = 0; i < 8; i++) {
            numbers.add((int) (Math.random() * 100));
            System.out.println("First item: " + numbers.get(0));

            numbers.remove(0);
            numbers.remove(0);
            numbers.remove(0);

            System.out.println("First remaining item: " + numbers.get(0));
    }

    List<String> menuItems =Arrays.asList("Cheeseburger", "Fries", "Soda", "Salad");
    List<Double> menuPrices =arrays.asList(7.99, 2.99, 1.99, 5.99);

    for (int i = 0; i < menuItems.size(); i++){
        String menuItem = menuItems.get(i);
        double menuPrice = menuPrices.get(i);
        System.out.println(menuItem + ": $" + menuPrice);
    }