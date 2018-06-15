/* 
 * @(#)IpVersion.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-inet-types", revision: "2017-08-24".
 */

package com.nokia.eml.yang.openconfigInetTypes;

import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangException;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigInetTypes/ip-version"
 * <p>
 * See line 186 in
 * /root/nokia-yang/types/openconfig-inet-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class IpVersion extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpVersion object from a string.
     * @param value Value to construct the IpVersion from.
     */
    public IpVersion(String value) throws YangException {
        super(value,
            new String[] {
                "UNKNOWN",
                "IPV4",
                "IPV6",
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
        super.check();
    }

}