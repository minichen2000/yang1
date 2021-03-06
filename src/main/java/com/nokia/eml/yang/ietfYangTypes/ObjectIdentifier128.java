/* 
 * @(#)ObjectIdentifier128.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-yang-types", revision: "2013-07-15".
 */

package com.nokia.eml.yang.ietfYangTypes;

import com.nokia.eml.yang.ietfYangTypes.ObjectIdentifier;
import com.tailf.jnc.YangException;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/ietfYangTypes/object-identifier-128"
 * <p>
 * See line 262 in
 * /root/pyang-pyang-1.7.5/modules/ietf/ietf-yang-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class ObjectIdentifier128 extends ObjectIdentifier {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for ObjectIdentifier128 object from a string.
     * @param value Value to construct the ObjectIdentifier128 from.
     */
    public ObjectIdentifier128(String value) throws YangException {
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
