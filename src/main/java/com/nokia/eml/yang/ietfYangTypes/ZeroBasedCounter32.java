/* 
 * @(#)ZeroBasedCounter32.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-yang-types", revision: "2013-07-15".
 */

package com.nokia.eml.yang.ietfYangTypes;

import com.nokia.eml.yang.ietfYangTypes.Counter32;
import com.tailf.jnc.YangException;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/ietfYangTypes/zero-based-counter32"
 * <p>
 * See line 90 in
 * /root/pyang-pyang-1.7.5/modules/ietf/ietf-yang-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class ZeroBasedCounter32 extends Counter32 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for ZeroBasedCounter32 object from a string.
     * @param value Value to construct the ZeroBasedCounter32 from.
     */
    public ZeroBasedCounter32(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for ZeroBasedCounter32 object from a long.
     * @param value Value to construct the ZeroBasedCounter32 from.
     */
    public ZeroBasedCounter32(long value) throws YangException {
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
     * Sets the value using a value of type long.
     * @param value The value to set.
     */
    public void setValue(long value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
