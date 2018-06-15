/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-interfaces", revision: "2018-01-05".
 */

package com.nokia.eml.yang.openconfigInterfaces.interfaces.interface_.holdTime;

import com.nokia.eml.yang.openconfigInterfaces.OcIf;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/interfaces
 * generated to "src/com/nokia/eml/yang/openconfigInterfaces/interfaces/interface_/holdTime/config"
 * <p>
 * See line 396 in
 * /root/nokia-yang/interfaces/openconfig-interfaces.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Config extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Config object.
     */
    public Config() {
        super(OcIf.NAMESPACE, "config");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Config clone() {
        return (Config)cloneContent(new Config());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Config cloneShallow() {
        return (Config)cloneShallowContent(new Config());
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "up",
            "down",
        };
    }

    /* Access methods for optional leaf child: "up". */

    /**
     * Gets the value for child leaf "up".
     * @return The value of the leaf.
     */
    public YangUInt32 getUpValue() throws JNCException {
        YangUInt32 up = (YangUInt32)getValue("up");
        if (up == null) {
            up = new YangUInt32("0");  // default
        }
        return up;
    }

    /**
     * Sets the value for child leaf "up",
     * using instance of generated typedef class.
     * @param upValue The value to set.
     * @param upValue used during instantiation.
     */
    public void setUpValue(YangUInt32 upValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "up",
            upValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "up",
     * using Java primitive values.
     * @param upValue used during instantiation.
     */
    public void setUpValue(long upValue) throws JNCException {
        setUpValue(new YangUInt32(upValue));
    }

    /**
     * Sets the value for child leaf "up",
     * using a String value.
     * @param upValue used during instantiation.
     */
    public void setUpValue(String upValue) throws JNCException {
        setUpValue(new YangUInt32(upValue));
    }

    /**
     * Unsets the value for child leaf "up".
     */
    public void unsetUpValue() throws JNCException {
        delete("up");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "up" leaf will not have a value.
     */
    public void addUp() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "up",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "up" with operation "replace".
     */
    public void markUpReplace() throws JNCException {
        markLeafReplace("up");
    }

    /**
     * Marks the leaf "up" with operation "merge".
     */
    public void markUpMerge() throws JNCException {
        markLeafMerge("up");
    }

    /**
     * Marks the leaf "up" with operation "create".
     */
    public void markUpCreate() throws JNCException {
        markLeafCreate("up");
    }

    /**
     * Marks the leaf "up" with operation "delete".
     */
    public void markUpDelete() throws JNCException {
        markLeafDelete("up");
    }

    /* Access methods for optional leaf child: "down". */

    /**
     * Gets the value for child leaf "down".
     * @return The value of the leaf.
     */
    public YangUInt32 getDownValue() throws JNCException {
        YangUInt32 down = (YangUInt32)getValue("down");
        if (down == null) {
            down = new YangUInt32("0");  // default
        }
        return down;
    }

    /**
     * Sets the value for child leaf "down",
     * using instance of generated typedef class.
     * @param downValue The value to set.
     * @param downValue used during instantiation.
     */
    public void setDownValue(YangUInt32 downValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "down",
            downValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "down",
     * using Java primitive values.
     * @param downValue used during instantiation.
     */
    public void setDownValue(long downValue) throws JNCException {
        setDownValue(new YangUInt32(downValue));
    }

    /**
     * Sets the value for child leaf "down",
     * using a String value.
     * @param downValue used during instantiation.
     */
    public void setDownValue(String downValue) throws JNCException {
        setDownValue(new YangUInt32(downValue));
    }

    /**
     * Unsets the value for child leaf "down".
     */
    public void unsetDownValue() throws JNCException {
        delete("down");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "down" leaf will not have a value.
     */
    public void addDown() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "down",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "down" with operation "replace".
     */
    public void markDownReplace() throws JNCException {
        markLeafReplace("down");
    }

    /**
     * Marks the leaf "down" with operation "merge".
     */
    public void markDownMerge() throws JNCException {
        markLeafMerge("down");
    }

    /**
     * Marks the leaf "down" with operation "create".
     */
    public void markDownCreate() throws JNCException {
        markLeafCreate("down");
    }

    /**
     * Marks the leaf "down" with operation "delete".
     */
    public void markDownDelete() throws JNCException {
        markLeafDelete("down");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}
