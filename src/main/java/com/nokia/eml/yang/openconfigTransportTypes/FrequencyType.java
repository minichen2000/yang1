/* 
 * @(#)FrequencyType.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-transport-types", revision: "2017-08-16".
 */

package com.nokia.eml.yang.openconfigTransportTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangUInt64;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigTransportTypes/frequency-type"
 * <p>
 * See line 40 in
 * /root/nokia-yang/optical-transport/openconfig-transport-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class FrequencyType extends YangUInt64 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for FrequencyType object from a string.
     * @param value Value to construct the FrequencyType from.
     */
    public FrequencyType(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for FrequencyType object from a BigInteger.
     * @param value Value to construct the FrequencyType from.
     */
    public FrequencyType(BigInteger value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Sets the value using a value of type BigInteger.
     * @param value The value to set.
     */
    public void setValue(BigInteger value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
