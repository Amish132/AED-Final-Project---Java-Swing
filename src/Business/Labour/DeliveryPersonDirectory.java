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
public class DeliveryPersonDirectory {

    private ArrayList<DeliveryPerson> deliveryPersonList;

    public DeliveryPersonDirectory() {
        deliveryPersonList = new ArrayList<>();
    }

    public ArrayList<DeliveryPerson> getDeliveryPersonList() {
        return deliveryPersonList;
    }

    public void setDeliveryPersonList(ArrayList<DeliveryPerson> skilledLabourList) {
        this.deliveryPersonList = skilledLabourList;
    }

    public DeliveryPerson addDeliveryPerson() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPersonList.add(deliveryPerson);
        return deliveryPerson;
    }

    //Removing an Employee from the Directory
    public void removeDeliveryPerson(DeliveryPerson deliveryPerson) {
        deliveryPersonList.remove(deliveryPerson);
    }

}
