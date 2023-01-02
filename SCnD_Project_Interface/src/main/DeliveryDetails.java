/**
 * DeliveryDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class DeliveryDetails  implements java.io.Serializable {
    private java.lang.String riderName;

    private long phoneNumber;

    private java.lang.String vehicalid;

    private int riderid;

    public DeliveryDetails() {
    }

    public DeliveryDetails(
           java.lang.String riderName,
           long phoneNumber,
           java.lang.String vehicalid,
           int riderid) {
           this.riderName = riderName;
           this.phoneNumber = phoneNumber;
           this.vehicalid = vehicalid;
           this.riderid = riderid;
    }


    /**
     * Gets the riderName value for this DeliveryDetails.
     * 
     * @return riderName
     */
    public java.lang.String getRiderName() {
        return riderName;
    }


    /**
     * Sets the riderName value for this DeliveryDetails.
     * 
     * @param riderName
     */
    public void setRiderName(java.lang.String riderName) {
        this.riderName = riderName;
    }


    /**
     * Gets the phoneNumber value for this DeliveryDetails.
     * 
     * @return phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this DeliveryDetails.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the vehicalid value for this DeliveryDetails.
     * 
     * @return vehicalid
     */
    public java.lang.String getVehicalid() {
        return vehicalid;
    }


    /**
     * Sets the vehicalid value for this DeliveryDetails.
     * 
     * @param vehicalid
     */
    public void setVehicalid(java.lang.String vehicalid) {
        this.vehicalid = vehicalid;
    }


    /**
     * Gets the riderid value for this DeliveryDetails.
     * 
     * @return riderid
     */
    public int getRiderid() {
        return riderid;
    }


    /**
     * Sets the riderid value for this DeliveryDetails.
     * 
     * @param riderid
     */
    public void setRiderid(int riderid) {
        this.riderid = riderid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryDetails)) return false;
        DeliveryDetails other = (DeliveryDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riderName==null && other.getRiderName()==null) || 
             (this.riderName!=null &&
              this.riderName.equals(other.getRiderName()))) &&
            this.phoneNumber == other.getPhoneNumber() &&
            ((this.vehicalid==null && other.getVehicalid()==null) || 
             (this.vehicalid!=null &&
              this.vehicalid.equals(other.getVehicalid()))) &&
            this.riderid == other.getRiderid();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRiderName() != null) {
            _hashCode += getRiderName().hashCode();
        }
        _hashCode += new Long(getPhoneNumber()).hashCode();
        if (getVehicalid() != null) {
            _hashCode += getVehicalid().hashCode();
        }
        _hashCode += getRiderid();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "DeliveryDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "riderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicalid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "vehicalid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riderid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "riderid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
