/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Labour;

import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class SkilledLabourDirectory {

    private ArrayList<SkilledLabour> skilledLabourList;

    public SkilledLabourDirectory() {
        skilledLabourList = new ArrayList<>();
    }

    public ArrayList<SkilledLabour> getSkilledLabourList() {
        return skilledLabourList;
    }

    public void setSkilledLabourList(ArrayList<SkilledLabour> skilledLabourList) {
        this.skilledLabourList = skilledLabourList;
    }

    public SkilledLabour addSkilledLabour() {
        SkilledLabour skilledLabour = new SkilledLabour();
        skilledLabourList.add(skilledLabour);
        return skilledLabour;
    }

    //Removing an Employee from the Directory
    public void removeSkilledLabour(SkilledLabour skilledLabour) {
        skilledLabourList.remove(skilledLabour);
    }

}
