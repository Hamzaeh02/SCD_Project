/**
 * Information.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Information extends java.rmi.Remote {
    public main.ItemDetails[] getOrderItems(int orderID) throws java.rmi.RemoteException;
    public main.OrderDetails getOrderDetails(int orderID) throws java.rmi.RemoteException;
    public main.DeliveryDetails getDeliveryDetails(int orderID) throws java.rmi.RemoteException;
}
