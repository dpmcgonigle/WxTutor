package mcgonigleapps.wxtutor;

import java.util.List;
import java.util.UUID;

/**
 * Created by Dan on 11/28/2017.
 */

public class Menu {
    private List<MenuItem> mMenuList;

    //Constructors
    public Menu() {
    }

    public Menu(List<MenuItem> mMenuList) {
        this.mMenuList = mMenuList;
        for(int x=0;x<mMenuList.size();x++) {
            if(x%2==0) {
                mMenuList.get(x).setmEven(true);
            }
            else {
                mMenuList.get(x).setmEven(false);
            }
        }
    }

    //Getter and setter
    public List<MenuItem> getmMenuList() {
        return mMenuList;
    }

    public void setmMenuList(List<MenuItem> mMenuList) {
        this.mMenuList = mMenuList;
    }

    public MenuItem get(int position) {
/*        for(int x=0;x<mMenuList.size();x++) {
            if(mMenuList.get(x).getmID()==id) {
                return mMenuList.get(x);
            }
        }
        return null;
    }*/
        return mMenuList.get(position);
    }

    public int size() {
        return mMenuList.size();
    }

}
