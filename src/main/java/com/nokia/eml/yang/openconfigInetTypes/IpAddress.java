/* 
 * @(#)IpAddress.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-inet-types", revision: "2017-08-24".
 */

package com.nokia.eml.yang.openconfigInetTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigInetTypes/ip-address"
 * <p>
 * See line 168 in
 * /root/nokia-yang/types/openconfig-inet-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class IpAddress extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpAddress object from a string.
     * @param value Value to construct the IpAddress from.
     */
    public IpAddress(String value) throws YangException {
        super(value,
            new String[] {
                "com.nokia.eml.yang.openconfigInetTypes.Ipv4Address",
                "com.nokia.eml.yang.openconfigInetTypes.Ipv6Address",
            }
        );
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
