
package com.test.apachecxf.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.3.5
 * Sun Mar 22 11:03:34 IST 2020
 * Generated source version: 3.3.5
 */

@XmlRootElement(name = "getGreeting", namespace = "http://service.apachecxf.test.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGreeting", namespace = "http://service.apachecxf.test.com/")

public class GetGreeting {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}
