/* 
 * @(#)Idle.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system.cpus.cpu.state;

import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.nokia.eml.yang.openconfigTypes.OcTypes;
import com.nokia.eml.yang.openconfigTypes.Percentage;
import com.nokia.eml.yang.openconfigTypes.StatInterval;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/cpus/cpu/state/idle"
 * <p>
 * See line 880 in
 * /root/nokia-yang/system/openconfig-system.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Idle extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Idle object.
     */
    public Idle() {
        super(OcSys.NAMESPACE, "idle");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Idle clone() {
        return (Idle)cloneContent(new Idle());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Idle cloneShallow() {
        return (Idle)cloneShallowContent(new Idle());
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
            "instant",
            "avg",
            "min",
            "max",
            "interval",
        };
    }

    /* Access methods for optional leaf child: "instant". */

    /**
     * Gets the value for child leaf "instant".
     * @return The value of the leaf.
     */
    public Percentage getInstantValue() throws JNCException {
        return (Percentage)getValue("instant");
    }

    /**
     * Sets the value for child leaf "instant",
     * using a JNC type value.
     * @param instantValue The value to set.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(Percentage instantValue) throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "instant",
            instantValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "instant",
     * using Java primitive values.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(short instantValue) throws JNCException {
        setInstantValue(new Percentage(instantValue));
    }

    /**
     * Sets the value for child leaf "instant",
     * using a String value.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(String instantValue) throws JNCException {
        setInstantValue(new Percentage(instantValue));
    }

    /**
     * Unsets the value for child leaf "instant".
     */
    public void unsetInstantValue() throws JNCException {
        delete("instant");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "instant" leaf will not have a value.
     */
    public void addInstant() throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "instant",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "instant" with operation "replace".
     */
    public void markInstantReplace() throws JNCException {
        markLeafReplace("instant");
    }

    /**
     * Marks the leaf "instant" with operation "merge".
     */
    public void markInstantMerge() throws JNCException {
        markLeafMerge("instant");
    }

    /**
     * Marks the leaf "instant" with operation "create".
     */
    public void markInstantCreate() throws JNCException {
        markLeafCreate("instant");
    }

    /**
     * Marks the leaf "instant" with operation "delete".
     */
    public void markInstantDelete() throws JNCException {
        markLeafDelete("instant");
    }

    /* Access methods for optional leaf child: "avg". */

    /**
     * Gets the value for child leaf "avg".
     * @return The value of the leaf.
     */
    public Percentage getAvgValue() throws JNCException {
        return (Percentage)getValue("avg");
    }

    /**
     * Sets the value for child leaf "avg",
     * using a JNC type value.
     * @param avgValue The value to set.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(Percentage avgValue) throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "avg",
            avgValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "avg",
     * using Java primitive values.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(short avgValue) throws JNCException {
        setAvgValue(new Percentage(avgValue));
    }

    /**
     * Sets the value for child leaf "avg",
     * using a String value.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(String avgValue) throws JNCException {
        setAvgValue(new Percentage(avgValue));
    }

    /**
     * Unsets the value for child leaf "avg".
     */
    public void unsetAvgValue() throws JNCException {
        delete("avg");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "avg" leaf will not have a value.
     */
    public void addAvg() throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "avg",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "avg" with operation "replace".
     */
    public void markAvgReplace() throws JNCException {
        markLeafReplace("avg");
    }

    /**
     * Marks the leaf "avg" with operation "merge".
     */
    public void markAvgMerge() throws JNCException {
        markLeafMerge("avg");
    }

    /**
     * Marks the leaf "avg" with operation "create".
     */
    public void markAvgCreate() throws JNCException {
        markLeafCreate("avg");
    }

    /**
     * Marks the leaf "avg" with operation "delete".
     */
    public void markAvgDelete() throws JNCException {
        markLeafDelete("avg");
    }

    /* Access methods for optional leaf child: "min". */

    /**
     * Gets the value for child leaf "min".
     * @return The value of the leaf.
     */
    public Percentage getMinValue() throws JNCException {
        return (Percentage)getValue("min");
    }

    /**
     * Sets the value for child leaf "min",
     * using a JNC type value.
     * @param minValue The value to set.
     * @param minValue used during instantiation.
     */
    public void setMinValue(Percentage minValue) throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "min",
            minValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "min",
     * using Java primitive values.
     * @param minValue used during instantiation.
     */
    public void setMinValue(short minValue) throws JNCException {
        setMinValue(new Percentage(minValue));
    }

    /**
     * Sets the value for child leaf "min",
     * using a String value.
     * @param minValue used during instantiation.
     */
    public void setMinValue(String minValue) throws JNCException {
        setMinValue(new Percentage(minValue));
    }

    /**
     * Unsets the value for child leaf "min".
     */
    public void unsetMinValue() throws JNCException {
        delete("min");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "min" leaf will not have a value.
     */
    public void addMin() throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "min",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "min" with operation "replace".
     */
    public void markMinReplace() throws JNCException {
        markLeafReplace("min");
    }

    /**
     * Marks the leaf "min" with operation "merge".
     */
    public void markMinMerge() throws JNCException {
        markLeafMerge("min");
    }

    /**
     * Marks the leaf "min" with operation "create".
     */
    public void markMinCreate() throws JNCException {
        markLeafCreate("min");
    }

    /**
     * Marks the leaf "min" with operation "delete".
     */
    public void markMinDelete() throws JNCException {
        markLeafDelete("min");
    }

    /* Access methods for optional leaf child: "max". */

    /**
     * Gets the value for child leaf "max".
     * @return The value of the leaf.
     */
    public Percentage getMaxValue() throws JNCException {
        return (Percentage)getValue("max");
    }

    /**
     * Sets the value for child leaf "max",
     * using a JNC type value.
     * @param maxValue The value to set.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(Percentage maxValue) throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "max",
            maxValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max",
     * using Java primitive values.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(short maxValue) throws JNCException {
        setMaxValue(new Percentage(maxValue));
    }

    /**
     * Sets the value for child leaf "max",
     * using a String value.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(String maxValue) throws JNCException {
        setMaxValue(new Percentage(maxValue));
    }

    /**
     * Unsets the value for child leaf "max".
     */
    public void unsetMaxValue() throws JNCException {
        delete("max");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "max" leaf will not have a value.
     */
    public void addMax() throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "max",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "max" with operation "replace".
     */
    public void markMaxReplace() throws JNCException {
        markLeafReplace("max");
    }

    /**
     * Marks the leaf "max" with operation "merge".
     */
    public void markMaxMerge() throws JNCException {
        markLeafMerge("max");
    }

    /**
     * Marks the leaf "max" with operation "create".
     */
    public void markMaxCreate() throws JNCException {
        markLeafCreate("max");
    }

    /**
     * Marks the leaf "max" with operation "delete".
     */
    public void markMaxDelete() throws JNCException {
        markLeafDelete("max");
    }

    /* Access methods for optional leaf child: "interval". */

    /**
     * Gets the value for child leaf "interval".
     * @return The value of the leaf.
     */
    public StatInterval getIntervalValue() throws JNCException {
        return (StatInterval)getValue("interval");
    }

    /**
     * Sets the value for child leaf "interval",
     * using a JNC type value.
     * @param intervalValue The value to set.
     * @param intervalValue used during instantiation.
     */
    public void setIntervalValue(StatInterval intervalValue)
            throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "interval",
            intervalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "interval",
     * using Java primitive values.
     * @param intervalValue used during instantiation.
     */
    public void setIntervalValue(BigInteger intervalValue) throws JNCException {
        setIntervalValue(new StatInterval(intervalValue));
    }

    /**
     * Sets the value for child leaf "interval",
     * using a String value.
     * @param intervalValue used during instantiation.
     */
    public void setIntervalValue(String intervalValue) throws JNCException {
        setIntervalValue(new StatInterval(intervalValue));
    }

    /**
     * Unsets the value for child leaf "interval".
     */
    public void unsetIntervalValue() throws JNCException {
        delete("interval");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "interval" leaf will not have a value.
     */
    public void addInterval() throws JNCException {
        setLeafValue(OcTypes.NAMESPACE,
            "interval",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "interval" with operation "replace".
     */
    public void markIntervalReplace() throws JNCException {
        markLeafReplace("interval");
    }

    /**
     * Marks the leaf "interval" with operation "merge".
     */
    public void markIntervalMerge() throws JNCException {
        markLeafMerge("interval");
    }

    /**
     * Marks the leaf "interval" with operation "create".
     */
    public void markIntervalCreate() throws JNCException {
        markLeafCreate("interval");
    }

    /**
     * Marks the leaf "interval" with operation "delete".
     */
    public void markIntervalDelete() throws JNCException {
        markLeafDelete("interval");
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
