package mcgonigleapps.wxtutor;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map;

/*
 *
 *               WxTutor - SingletonSubMenu.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This class is used in conjunction with SubMenuActivity/Fragment to display the sub menu options.
 *
 */

public class SingletonSubMenu {
    //note the s prefix rather than m (static vs member), which allows the object to retain its state
    private static SingletonSubMenu sSingletonSubMenu;
    private Map<UUID, MenuItem> mMenuItems;
    private static int previousParentMenu=-1;

    //This is a "Singleton" class, allows only one instance of itself to be created. get() returns it if exists, creates it if not
    //Singletons are good for storing a global object that can be used across activities and fragments
    //The get() method effectively acts as a constructor for this class, as the actual constructor is private
    public static SingletonSubMenu get(Context context, int parentMenu) {
        if(sSingletonSubMenu==null||previousParentMenu!=parentMenu) {
            sSingletonSubMenu=new SingletonSubMenu(context, parentMenu);
        }
        previousParentMenu=parentMenu;
        return sSingletonSubMenu;
    }

    //The constructor for SingletonMainMenu is private
    //The for loop generates all of the Crimes in the list, then sets each equal Crime to "solved" and each 5th Crime to "Requires Police"
    private SingletonSubMenu(Context context, int parentMenu) {
        mMenuItems=new LinkedHashMap<>();
        List<String> mTitles;

        //This is to test whether the variable is assuming the correct value
        Log.d("ADebugTag", "Value: " + Integer.toString(parentMenu));

        //This decide which of the three menus to display
        switch (parentMenu) {
            case 0:
                mTitles=Arrays.asList("A Bunch of Hot Air", "Atmos. Cells", "Atmos. Lapse Rate", "Atmos. Layers", "Pressure and Gradient", "Coriolis Force", "Highs and Lows", "Convergence and Divergence");
                break;

            case 1:
                mTitles=Arrays.asList("Macroscale Features", "Long Wave Pattern", "Jet Streams", "Air Masses", "Synoptic Scale Systems", "Baroclinic Systems", "Barotropic Systems", "Mesoscale Effects");
                break;

            case 2:
                mTitles=Arrays.asList("Precipitation", "Hail", "Tornadoes", "Down Bursts", "Icing", "Turbulence", "Tropical Weather", "Space Weather");
                break;

            default:
                mTitles=Arrays.asList("sup1", "sup2", "sup3");
                break;
        }


        //= {"Atmos. Physics/Dynamics", "Basic Meteorology", "Weather Phenomena", "Conversion Tools", "Test Your Knowledge!"};
        for(int i=0;i<mTitles.size();i++) {
            MenuItem item = new MenuItem();
            item.setmTitle(mTitles.get(i));
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

