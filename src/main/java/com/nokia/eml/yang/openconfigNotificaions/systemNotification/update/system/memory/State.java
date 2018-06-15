/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.memory;

import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt64;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/systemNotification/update/system/memory/state"
 * <p>
 * See line 817 in
 * /root/nokia-yang/system/openconfig-system.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class State extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty State object.
     */
    public State() {
        super(OcSys.NAMESPACE, "state");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public State clone() {
        return (State)cloneContent(new State());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public State cloneShallow() {
        return (State)cloneShallowContent(new State());
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
            "physical",
            "reserved",
        };
    }

    /* Access methods for optional leaf child: "physical". */

    /**
     * Gets the value for child leaf "physical".
     * @return The value of the leaf.
     */
    public YangUInt64 getPhysicalValue() throws JNCException {
        return (YangUInt64)getValue("physical");
    }

    /**
     * Sets the value for child leaf "physical",
     * using instance of generated typedef class.
     * @param physicalValue The value to set.
     * @param physicalValue used during instantiation.
     */
    public void setPhysicalValue(YangUInt64 physicalValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "physical",
            physicalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "physical",
     * using Java primitive values.
     * @param physicalValue used during instantiation.
     */
    public void setPhysicalValue(BigInteger physicalValue) throws JNCException {
        setPhysicalValue(new YangUInt64(physicalValue));
    }

    /**
     * Sets the value for child leaf "physical",
     * using a String value.
     * @param physicalValue used during instantiation.
     */
    public void setPhysicalValue(String physicalValue) throws JNCException {
        setPhysicalValue(new YangUInt64(physicalValue));
    }

    /**
     * Unsets the value for child leaf "physical".
     */
    public void unsetPhysicalValue() throws JNCException {
        delete("physical");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "physical" leaf will not have a value.
     */
    public void addPhysical() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "physical",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "physical" with operation "replace".
     */
    public void markPhysicalReplace() throws JNCException {
        markLeafReplace("physical");
    }

    /**
     * Marks the leaf "physical" with operation "merge".
     */
    public void markPhysicalMerge() throws JNCException {
        markLeafMerge("physical");
    }

    /**
     * Marks the leaf "physical" with operation "create".
     */
    public void markPhysicalCreate() throws JNCException {
        markLeafCreate("physical");
    }

    /**
     * Marks the leaf "physical" with operation "delete".
     */
    public void markPhysicalDelete() throws JNCException {
        markLeafDelete("physical");
    }

    /* Access methods for optional leaf child: "reserved". */

    /**
     * Gets the value for child leaf "reserved".
     * @return The value of the leaf.
     */
    public YangUInt64 getReservedValue() throws JNCException {
        return (YangUInt64)getValue("reserved");
    }

    /**
     * Sets the value for child leaf "reserved",
     * using instance of generated typedef class.
     * @param reservedValue The value to set.
     * @param reservedValue used during instantiation.
     */
    public void setReservedValue(YangUInt64 reservedValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "reserved",
            reservedValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "reserved",
     * using Java primitive values.
     * @param reservedValue used during instantiation.
     */
    public void setReservedValue(BigInteger reservedValue) throws JNCException {
        setReservedValue(new YangUInt64(reservedValue));
    }

    /**
     * Sets the value for child leaf "reserved",
     * using a String value.
     * @param reservedValue used during instantiation.
     */
    public void setReservedValue(String reservedValue) throws JNCException {
        setReservedValue(new YangUInt64(reservedValue));
    }

    /**
     * Unsets the value for child leaf "reserved".
     */
    public void unsetReservedValue() throws JNCException {
        delete("reserved");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "reserved" leaf will not have a value.
     */
    public void addReserved() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "reserved",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "reserved" with operation "replace".
     */
    public void markReservedReplace() throws JNCException {
        markLeafReplace("reserved");
    }

    /**
     * Marks the leaf "reserved" with operation "merge".
     */
    public void markReservedMerge() throws JNCException {
        markLeafMerge("reserved");
    }

    /**
     * Marks the leaf "reserved" with operation "create".
     */
    public void markReservedCreate() throws JNCException {
        markLeafCreate("reserved");
    }

    /**
     * Marks the leaf "reserved" with operation "delete".
     */
    public void markReservedDelete() throws JNCException {
        markLeafDelete("reserved");
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