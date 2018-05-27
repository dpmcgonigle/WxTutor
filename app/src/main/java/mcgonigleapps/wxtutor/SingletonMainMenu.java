package mcgonigleapps.wxtutor;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map;

/*
 *
 *               WxTutor - SingletonMainMenu.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description:  This class is used in conjunction with MainMenuActivity/Fragment to display the main menu options.
 *
 */

public class SingletonMainMenu {
    //note the s prefix rather than m (static vs member), which allows the object to retain its state
    private static SingletonMainMenu sSingletonMainMenu;
    private static final int MENU_ITEMS=6;
    private Map<UUID, MenuItem> mMenuItems;

    //This is a "Singleton" class, allows only one instance of itself to be created. get() returns it if exists, creates it if not
    //Singletons are good for storing a global object that can be used across activities and fragments
    //The get() method effectively acts as a constructor for this class, as the actual constructor is private
    public static SingletonMainMenu get(Context context) {
        if(sSingletonMainMenu==null) {
            sSingletonMainMenu=new SingletonMainMenu(context);
        }
        return sSingletonMainMenu;
    }

    //The constructor for SingletonMainMenu is private
    //The for loop generates all of the Crimes in the list, then sets each equal Crime to "solved" and each 5th Crime to "Requires Police"
    private SingletonMainMenu(Context context) {
        mMenuItems=new LinkedHashMap<>();
        String[] mTitles = {"Atmos. Physics/Dynamics", "Basic Meteorology", "Weather Phenomena", "Conversion Tools", "Test Your Knowledge!", "About / Contact"};
        for(int i=0;i<MENU_ITEMS;i++) {
            MenuItem item = new MenuItem();
            item.setmTitle(mTitles[i]);
            item.setmEven(i%2==0);
            item.setmPointsTo(i);
            mMenuItems.put(item.getmID(), item);
        }
    }

    //Get entire list
    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(mMenuItems.values());
    }

    //Get a specific Crime
    public MenuItem getMenuItem(UUID id) {
        return mMenuItems.get(id);
    }
}
