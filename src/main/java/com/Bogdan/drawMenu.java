package com.Bogdan;

/**
 * Created by klass on 16.11.2019.
 */
public class drawMenu
{
    public static void mainMenu()
    {
        System.out.println( "MENU\n" +
                "1 - Work with LocalArrayList\n" +
                "2 - Work with LinkedList\n" +
                "3 - Work with HashList\n" +
                "4 - Work with TreeSet\n" +
                "5 - Work with HashMap\n" +
                "6 - Print Diagnostic\n" +
                "7 - Exit\n" +
                "-> ");
    }

    public static void subMenu()
    {
        System.out.println( "SUBMENU\n" +
                "1 - Add elements\n" +
                "2 - Remove elements\n" +
                "3 - Get elements\n" +
                "-> ");
    }
}
