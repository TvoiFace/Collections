package com.Bogdan;

import java.io.IOException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException {

        Scanner in = new Scanner(System.in);
        long [][] array = new long[5][3];
        int i = 0;
        int key;
        do
        {
            //Runtime.getRuntime().exec("cls");
            drawMenu.mainMenu();
            key = in.nextInt();

            switch (key)
            {
                case 1:
                {
                    for(int o = 0; o < 3; o++)
                    {
                        drawMenu.subMenu();
                        int tempKey = in.nextInt();
                        array[0][tempKey - 1] = LocalArrayList.mainMenu(tempKey);
                    }
                    break;
                }
                case 2:
                {
                    for(int o = 0; o < 3; o++)
                    {
                        drawMenu.subMenu();
                        int tempKey = in.nextInt();
                        array[1][tempKey - 1] = LocalLinkedList.mainMenu(tempKey);
                    }
                    break;
                }
                case 3:
                {
                    for(int o = 0; o < 3; o++)
                    {
                        drawMenu.subMenu();
                        int tempKey = in.nextInt();
                        array[2][tempKey - 1] = LocalHashSet.mainMenu(tempKey);
                    }
                    break;
                }
                case 4:
                {
                    for(int o = 0; o < 3; o++)
                    {
                        drawMenu.subMenu();
                        int tempKey = in.nextInt();
                        array[3][tempKey - 1] = LocalTreeSet.mainMenu(tempKey);
                    }
                    break;
                }
                case 5:
                {
                    for(int o = 0; o < 3; o++)
                    {
                        drawMenu.subMenu();
                        int tempKey = in.nextInt();
                        array[4][tempKey - 1] = LocalHashMap.mainMenu(tempKey);
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("ArrayList " + array[0][0] + " " + array[0][1] + " " + array[0][2]);

                    System.out.println("LinkedList " + array[1][0] + " " + array[1][1] + " " + array[1][2]);

                    System.out.println("HashSet " + array[2][0] + " " + array[2][1] + " " + array[2][2]);

                    System.out.println("TreeSett " + array[3][0] + " " + array[3][1] + " " + array[3][2]);

                    System.out.println("HashMap " + array[4][0] + " " + array[4][1] + " " + array[4][2]);
                }

            }
        }while(key != 7);
    }
}
