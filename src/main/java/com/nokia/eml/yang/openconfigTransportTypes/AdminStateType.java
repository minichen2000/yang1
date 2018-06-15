/* 
 * @(#)AdminStateType.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-transport-types", revision: "2017-08-16".
 */

package com.nokia.eml.yang.openconfigTransportTypes;

import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangException;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "src/com/nokia/eml/yang/openconfigTransportTypes/admin-state-type"
 * <p>
 * See line 47 in
 * /root/nokia-yang/optical-transport/openconfig-transport-types.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class AdminStateType extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for AdminStateType object from a string.
     * @param value Value to construct the AdminStateType from.
     */
    public AdminStateType(String value) throws YangException {
        super(value,
            new String[] {
                "ENABLED",
                "DISABLED",
                "MAINT",
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
