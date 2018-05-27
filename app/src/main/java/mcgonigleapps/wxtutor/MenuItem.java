package mcgonigleapps.wxtutor;

import java.util.UUID;

/*
 *
 *               WxTutor - MenuItem.java
 *               Created by Dan McGonigle
 *               Last Updated: 5/26/2018
 *               Description: This class defines a MenuItem object, which is used by the RecyclerView MainMenuFragments and SubMenuFragments
 *
 */

public class MenuItem {
    private String mTitle;
    private boolean ismEven;
    private int pointsTo;
    private UUID mID;

    //constructors
    public MenuItem(String mTitle) {
        this.mTitle = mTitle;
        mID=UUID.randomUUID();
    }

    public MenuItem() {
        mID=UUID.randomUUID();
    }

    //Getters and setters
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public boolean getmEven() {
        return ismEven;
    }

    public void setmEven(boolean even) {
        ismEven = even;
    }

    public int getmPointsTo() { return pointsTo; }

    public void setmPointsTo(int pointsTo) { this.pointsTo = pointsTo; }

    public UUID getmID() {
        return mID;
    }

}
