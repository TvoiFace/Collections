package com.Bogdan;

import java.util.ArrayList;

/**
 * Created by klass on 16.11.2019.
 */
public class LocalArrayList
{

    public static long mainMenu(int key)
    {
        ArrayList list1 = new ArrayList<>();

        User user = new User("Name", 0);
        switch (key)
        {
            case 1:
            {
                long time1 = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++)
                {
                    list1.add(user);
                }
                long time2 = System.currentTimeMillis();
                return (time2 - time1);
            }
            case 2:
            {
                long time1 = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++)
                {
                    list1.remove(user);
                }
                long time2 = System.currentTimeMillis();
                return (time2 - time1);
            }
            case 3:
            {
                long time1 = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++)
                {
                    list1.getClass();
                }
                long time2 = System.currentTimeMillis();
                return (time2 - time1);
            }
        }
        return 0;
    }
}











