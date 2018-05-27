package mcgonigleapps.wxtutor;

import java.util.UUID;

/**
 * Created by Dan on 11/28/2017.
 */

public class MenuItem {
    private String mTitle;
    private boolean ismEven;
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

    public UUID getmID() {
        return mID;
    }

    public void setmID(UUID mID) {
        this.mID = mID;
    }
}
