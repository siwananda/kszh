package models;

/**
 * This class holds food's name, photo, spicy level, etc
 * kszh = Krazeh Spizeh
 * By: W, R, H
 * Date: 17/12/2014
 * Time: 10:01 PM
 * Class Name: Menu
 */
public class Menu {
    private int menuId;
    private String name;
    private String photo;
    private int spicyLevel;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(int spicyLevel) {
        this.spicyLevel = spicyLevel;
    }
}
