/* 
 * @(#)PhysAddress.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-yang-types", revision: "2017-07-30".
 */

package com.nokia.eml.yang.openconfigYangTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigYangTypes/phys-address"
 * <p>
 * See line 140 in
 * /root/nokia-yang/openconfig-yang-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class PhysAddress extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for PhysAddress object from a string.
     * @param value Value to construct the PhysAddress from.
     */
    public PhysAddress(String value) throws YangException {
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
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
