/* 
 * @(#)PreFecBer.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice.logicalChannels.channel.otn.state;

import com.nokia.eml.yang.openconfigTerminalDevice.OcOptTerm;
import com.nokia.eml.yang.openconfigTransportTypes.OcOptTypes;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangDecimal64;
import com.tailf.jnc.YangElement;

import java.math.BigDecimal;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/terminalDeviceNotification/update/terminalDevice/logicalChannels/channel/otn/state/pre-fec-ber"
 * <p>
 * See line 245 in
 * /root/nokia-yang/optical-transport/openconfig-terminal-device.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class PreFecBer extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty PreFecBer object.
     */
    public PreFecBer() {
        super(OcOptTerm.NAMESPACE, "pre-fec-ber");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public PreFecBer clone() {
        return (PreFecBer)cloneContent(new PreFecBer());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public PreFecBer cloneShallow() {
        return (PreFecBer)cloneShallowContent(new PreFecBer());
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
        };
    }

    /* Access methods for optional leaf child: "instant". */

    /**
     * Gets the value for child leaf "instant".
     * @return The value of the leaf.
     */
    public YangDecimal64 getInstantValue() throws JNCException {
        return (YangDecimal64)getValue("instant");
    }

    /**
     * Sets the value for child leaf "instant",
     * using instance of generated typedef class.
     * @param instantValue The value to set.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(YangDecimal64 instantValue) throws JNCException {
        setLeafValue(OcOptTypes.NAMESPACE,
            "instant",
            instantValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "instant",
     * using Java primitive values.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(BigDecimal instantValue) throws JNCException {
        setInstantValue(new YangDecimal64(instantValue, 18));
    }

    /**
     * Sets the value for child leaf "instant",
     * using a String value.
     * @param instantValue used during instantiation.
     */
    public void setInstantValue(String instantValue) throws JNCException {
        setInstantValue(new YangDecimal64(instantValue, 18));
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
        setLeafValue(OcOptTypes.NAMESPACE,
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
    public YangDecimal64 getAvgValue() throws JNCException {
        return (YangDecimal64)getValue("avg");
    }

    /**
     * Sets the value for child leaf "avg",
     * using instance of generated typedef class.
     * @param avgValue The value to set.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(YangDecimal64 avgValue) throws JNCException {
        setLeafValue(OcOptTypes.NAMESPACE,
            "avg",
            avgValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "avg",
     * using Java primitive values.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(BigDecimal avgValue) throws JNCException {
        setAvgValue(new YangDecimal64(avgValue, 18));
    }

    /**
     * Sets the value for child leaf "avg",
     * using a String value.
     * @param avgValue used during instantiation.
     */
    public void setAvgValue(String avgValue) throws JNCException {
        setAvgValue(new YangDecimal64(avgValue, 18));
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
        setLeafValue(OcOptTypes.NAMESPACE,
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
    public YangDecimal64 getMinValue() throws JNCException {
        return (YangDecimal64)getValue("min");
    }

    /**
     * Sets the value for child leaf "min",
     * using instance of generated typedef class.
     * @param minValue The value to set.
     * @param minValue used during instantiation.
     */
    public void setMinValue(YangDecimal64 minValue) throws JNCException {
        setLeafValue(OcOptTypes.NAMESPACE,
            "min",
            minValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "min",
     * using Java primitive values.
     * @param minValue used during instantiation.
     */
    public void setMinValue(BigDecimal minValue) throws JNCException {
        setMinValue(new YangDecimal64(minValue, 18));
    }

    /**
     * Sets the value for child leaf "min",
     * using a String value.
     * @param minValue used during instantiation.
     */
    public void setMinValue(String minValue) throws JNCException {
        setMinValue(new YangDecimal64(minValue, 18));
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
        setLeafValue(OcOptTypes.NAMESPACE,
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
    public YangDecimal64 getMaxValue() throws JNCException {
        return (YangDecimal64)getValue("max");
    }

    /**
     * Sets the value for child leaf "max",
     * using instance of generated typedef class.
     * @param maxValue The value to set.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(YangDecimal64 maxValue) throws JNCException {
        setLeafValue(OcOptTypes.NAMESPACE,
            "max",
            maxValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "max",
     * using Java primitive values.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(BigDecimal maxValue) throws JNCException {
        setMaxValue(new YangDecimal64(maxValue, 18));
    }

    /**
     * Sets the value for child leaf "max",
     * using a String value.
     * @param maxValue used during instantiation.
     */
    public void setMaxValue(String maxValue) throws JNCException {
        setMaxValue(new YangDecimal64(maxValue, 18));
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
        setLeafValue(OcOptTypes.NAMESPACE,
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
