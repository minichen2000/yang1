/* 
 * @(#)Ipv6AddressZoned.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-inet-types", revision: "2017-08-24".
 */

package com.nokia.eml.yang.openconfigInetTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigInetTypes/ipv6-address-zoned"
 * <p>
 * See line 113 in
 * /root/nokia-yang/types/openconfig-inet-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Ipv6AddressZoned extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv6AddressZoned object from a string.
     * @param value Value to construct the Ipv6AddressZoned from.
     */
    public Ipv6AddressZoned(String value) throws YangException {
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
