package com.Bogdan;

import java.util.TreeMap;

/**yy
 * Created by klass on 16.11.2019.
 */
public class LocalTreeSet
{
    public static long mainMenu(int key)
    {
        TreeMap list1 = new TreeMap();

        User user = new User("Name", 0);
        switch (key)
        {
            case 1:
            {
                long time1 = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++)
                {
                    list1.put(user.getName(), user.getAge());
                }
                long time2 = System.currentTimeMillis();
                return (time2 - time1);
            }
            case 2:
            {
                long time1 = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++)
                {
                    list1.remove(user.getName());
                    list1.remove(user.getAge());
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
