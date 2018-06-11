package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main mainClass = new Main();
        mainClass.testingLists(); //you can only have one data type per list

    }

    private void testingLists() {

        nameList = new ArrayList<String>(); //4 types of Lists

        nameList.add("Kamyah");
        nameList.add("Chris");
        nameList.add("Bin");
        nameList.add("Luke");



        System.out.println("See a single item in the Array List");
        System.out.println(nameList.get(2)); //java starts counting at zero so bins slot is at 2


        System.out.println("Remove a single item and view what remains in the Array List");
        nameList.remove(0);

        //For each loop to see all items in array list
        System.out.println("See All Items in the Array List");
        for (String name: nameList) {
            System.out.println(name);
        }

        System.out.println("Viewing ArrayList using Iteration Loop with Numbers");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i+1) + " " + nameList.get(i));
        }

        System.out.println("Which number would you like to remove?");
        int numberToRemove = input.nextInt() -1;

        if (numberToRemove >= nameList.size() || numberToRemove <0) {
            nameList.remove(numberToRemove);
        }

        System.out.println("List after take out selected number");
        for (int i=0; i < nameList.size(); i++) {
            System.out.println((1+1) + " " + nameList.get(i));
        }

    }
}
