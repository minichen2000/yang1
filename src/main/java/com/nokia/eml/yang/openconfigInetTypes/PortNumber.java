/* 
 * @(#)PortNumber.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-inet-types", revision: "2017-08-24".
 */

package com.nokia.eml.yang.openconfigInetTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigInetTypes/port-number"
 * <p>
 * See line 304 in
 * /root/nokia-yang/types/openconfig-inet-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class PortNumber extends YangUInt16 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for PortNumber object from a string.
     * @param value Value to construct the PortNumber from.
     */
    public PortNumber(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for PortNumber object from a int.
     * @param value Value to construct the PortNumber from.
     */
    public PortNumber(int value) throws YangException {
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
     * Sets the value using a value of type int.
     * @param value The value to set.
     */
    public void setValue(int value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
