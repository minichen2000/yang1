/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-platform", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigPlatform.components.component.transceiver.physicalChannels.channel;

import com.nokia.eml.yang.openconfigPlatformTransceiver.OcTransceiver;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangDecimal64;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;

import java.math.BigDecimal;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/platform
 * generated to "src/com/nokia/eml/yang/openconfigPlatform/components/component/transceiver/physicalChannels/channel/config"
 * <p>
 * See line 209 in
 * /root/nokia-yang/platform/openconfig-platform-transceiver.yang
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
        super(OcTransceiver.NAMESPACE, "config");
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
            "index",
            "description",
            "tx-laser",
            "target-output-power",
        };
    }

    /* Access methods for optional leaf child: "index". */

    /**
     * Gets the value for child leaf "index".
     * @return The value of the leaf.
     */
    public YangUInt16 getIndexValue() throws JNCException {
        return (YangUInt16)getValue("index");
    }

    /**
     * Sets the value for child leaf "index",
     * using instance of generated typedef class.
     * @param indexValue The value to set.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(YangUInt16 indexValue) throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "index",
            indexValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "index",
     * using Java primitive values.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(int indexValue) throws JNCException {
        setIndexValue(new YangUInt16(indexValue));
    }

    /**
     * Sets the value for child leaf "index",
     * using a String value.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(String indexValue) throws JNCException {
        setIndexValue(new YangUInt16(indexValue));
    }

    /**
     * Unsets the value for child leaf "index".
     */
    public void unsetIndexValue() throws JNCException {
        delete("index");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "index" leaf will not have a value.
     */
    public void addIndex() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "index",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "index" with operation "replace".
     */
    public void markIndexReplace() throws JNCException {
        markLeafReplace("index");
    }

    /**
     * Marks the leaf "index" with operation "merge".
     */
    public void markIndexMerge() throws JNCException {
        markLeafMerge("index");
    }

    /**
     * Marks the leaf "index" with operation "create".
     */
    public void markIndexCreate() throws JNCException {
        markLeafCreate("index");
    }

    /**
     * Marks the leaf "index" with operation "delete".
     */
    public void markIndexDelete() throws JNCException {
        markLeafDelete("index");
    }

    /* Access methods for optional leaf child: "description". */

    /**
     * Gets the value for child leaf "description".
     * @return The value of the leaf.
     */
    public YangString getDescriptionValue() throws JNCException {
        return (YangString)getValue("description");
    }

    /**
     * Sets the value for child leaf "description",
     * using instance of generated typedef class.
     * @param descriptionValue The value to set.
     * @param descriptionValue used during instantiation.
     */
    public void setDescriptionValue(YangString descriptionValue)
            throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "description",
            descriptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "description",
     * using a String value.
     * @param descriptionValue used during instantiation.
     */
    public void setDescriptionValue(String descriptionValue)
            throws JNCException {
        setDescriptionValue(new YangString(descriptionValue));
    }

    /**
     * Unsets the value for child leaf "description".
     */
    public void unsetDescriptionValue() throws JNCException {
        delete("description");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "description" leaf will not have a value.
     */
    public void addDescription() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "description",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "description" with operation "replace".
     */
    public void markDescriptionReplace() throws JNCException {
        markLeafReplace("description");
    }

    /**
     * Marks the leaf "description" with operation "merge".
     */
    public void markDescriptionMerge() throws JNCException {
        markLeafMerge("description");
    }

    /**
     * Marks the leaf "description" with operation "create".
     */
    public void markDescriptionCreate() throws JNCException {
        markLeafCreate("description");
    }

    /**
     * Marks the leaf "description" with operation "delete".
     */
    public void markDescriptionDelete() throws JNCException {
        markLeafDelete("description");
    }

    /* Access methods for optional leaf child: "tx-laser". */

    /**
     * Gets the value for child leaf "tx-laser".
     * @return The value of the leaf.
     */
    public YangBoolean getTxLaserValue() throws JNCException {
        return (YangBoolean)getValue("tx-laser");
    }

    /**
     * Sets the value for child leaf "tx-laser",
     * using instance of generated typedef class.
     * @param txLaserValue The value to set.
     * @param txLaserValue used during instantiation.
     */
    public void setTxLaserValue(YangBoolean txLaserValue) throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "tx-laser",
            txLaserValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "tx-laser",
     * using Java primitive values.
     * @param txLaserValue used during instantiation.
     */
    public void setTxLaserValue(Boolean txLaserValue) throws JNCException {
        setTxLaserValue(new YangBoolean(txLaserValue));
    }

    /**
     * Sets the value for child leaf "tx-laser",
     * using a String value.
     * @param txLaserValue used during instantiation.
     */
    public void setTxLaserValue(String txLaserValue) throws JNCException {
        setTxLaserValue(new YangBoolean(txLaserValue));
    }

    /**
     * Unsets the value for child leaf "tx-laser".
     */
    public void unsetTxLaserValue() throws JNCException {
        delete("tx-laser");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "tx-laser" leaf will not have a value.
     */
    public void addTxLaser() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "tx-laser",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "tx-laser" with operation "replace".
     */
    public void markTxLaserReplace() throws JNCException {
        markLeafReplace("txLaser");
    }

    /**
     * Marks the leaf "tx-laser" with operation "merge".
     */
    public void markTxLaserMerge() throws JNCException {
        markLeafMerge("txLaser");
    }

    /**
     * Marks the leaf "tx-laser" with operation "create".
     */
    public void markTxLaserCreate() throws JNCException {
        markLeafCreate("txLaser");
    }

    /**
     * Marks the leaf "tx-laser" with operation "delete".
     */
    public void markTxLaserDelete() throws JNCException {
        markLeafDelete("txLaser");
    }

    /* Access methods for optional leaf child: "target-output-power". */

    /**
     * Gets the value for child leaf "target-output-power".
     * @return The value of the leaf.
     */
    public YangDecimal64 getTargetOutputPowerValue() throws JNCException {
        return (YangDecimal64)getValue("target-output-power");
    }

    /**
     * Sets the value for child leaf "target-output-power",
     * using instance of generated typedef class.
     * @param targetOutputPowerValue The value to set.
     * @param targetOutputPowerValue used during instantiation.
     */
    public void setTargetOutputPowerValue(YangDecimal64 targetOutputPowerValue)
            throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "target-output-power",
            targetOutputPowerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "target-output-power",
     * using Java primitive values.
     * @param targetOutputPowerValue used during instantiation.
     */
    public void setTargetOutputPowerValue(BigDecimal targetOutputPowerValue)
            throws JNCException {
        setTargetOutputPowerValue(new YangDecimal64(targetOutputPowerValue, 2));
    }

    /**
     * Sets the value for child leaf "target-output-power",
     * using a String value.
     * @param targetOutputPowerValue used during instantiation.
     */
    public void setTargetOutputPowerValue(String targetOutputPowerValue)
            throws JNCException {
        setTargetOutputPowerValue(new YangDecimal64(targetOutputPowerValue, 2));
    }

    /**
     * Unsets the value for child leaf "target-output-power".
     */
    public void unsetTargetOutputPowerValue() throws JNCException {
        delete("target-output-power");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "target-output-power" leaf will not have a value.
     */
    public void addTargetOutputPower() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "target-output-power",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "target-output-power" with operation "replace".
     */
    public void markTargetOutputPowerReplace() throws JNCException {
        markLeafReplace("targetOutputPower");
    }

    /**
     * Marks the leaf "target-output-power" with operation "merge".
     */
    public void markTargetOutputPowerMerge() throws JNCException {
        markLeafMerge("targetOutputPower");
    }

    /**
     * Marks the leaf "target-output-power" with operation "create".
     */
    public void markTargetOutputPowerCreate() throws JNCException {
        markLeafCreate("targetOutputPower");
    }

    /**
     * Marks the leaf "target-output-power" with operation "delete".
     */
    public void markTargetOutputPowerDelete() throws JNCException {
        markLeafDelete("targetOutputPower");
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