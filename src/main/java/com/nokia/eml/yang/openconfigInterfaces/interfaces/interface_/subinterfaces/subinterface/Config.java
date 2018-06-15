/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-interfaces", revision: "2018-01-05".
 */

package com.nokia.eml.yang.openconfigInterfaces.interfaces.interface_.subinterfaces.subinterface;

import com.nokia.eml.yang.openconfigInterfaces.OcIf;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/interfaces
 * generated to "src/com/nokia/eml/yang/openconfigInterfaces/interfaces/interface_/subinterfaces/subinterface/config"
 * <p>
 * See line 912 in
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
            "index",
            "description",
            "enabled",
        };
    }

    /* Access methods for optional leaf child: "index". */

    /**
     * Gets the value for child leaf "index".
     * @return The value of the leaf.
     */
    public YangUInt32 getIndexValue() throws JNCException {
        YangUInt32 index = (YangUInt32)getValue("index");
        if (index == null) {
            index = new YangUInt32("0");  // default
        }
        return index;
    }

    /**
     * Sets the value for child leaf "index",
     * using instance of generated typedef class.
     * @param indexValue The value to set.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(YangUInt32 indexValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "index",
            indexValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "index",
     * using Java primitive values.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(long indexValue) throws JNCException {
        setIndexValue(new YangUInt32(indexValue));
    }

    /**
     * Sets the value for child leaf "index",
     * using a String value.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(String indexValue) throws JNCException {
        setIndexValue(new YangUInt32(indexValue));
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
        setLeafValue(OcIf.NAMESPACE,
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
        setLeafValue(OcIf.NAMESPACE,
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
        setLeafValue(OcIf.NAMESPACE,
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

    /* Access methods for optional leaf child: "enabled". */

    /**
     * Gets the value for child leaf "enabled".
     * @return The value of the leaf.
     */
    public YangBoolean getEnabledValue() throws JNCException {
        YangBoolean enabled = (YangBoolean)getValue("enabled");
        if (enabled == null) {
            enabled = new YangBoolean("true");  // default
        }
        return enabled;
    }

    /**
     * Sets the value for child leaf "enabled",
     * using instance of generated typedef class.
     * @param enabledValue The value to set.
     * @param enabledValue used during instantiation.
     */
    public void setEnabledValue(YangBoolean enabledValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "enabled",
            enabledValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enabled",
     * using Java primitive values.
     * @param enabledValue used during instantiation.
     */
    public void setEnabledValue(Boolean enabledValue) throws JNCException {
        setEnabledValue(new YangBoolean(enabledValue));
    }

    /**
     * Sets the value for child leaf "enabled",
     * using a String value.
     * @param enabledValue used during instantiation.
     */
    public void setEnabledValue(String enabledValue) throws JNCException {
        setEnabledValue(new YangBoolean(enabledValue));
    }

    /**
     * Unsets the value for child leaf "enabled".
     */
    public void unsetEnabledValue() throws JNCException {
        delete("enabled");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enabled" leaf will not have a value.
     */
    public void addEnabled() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "enabled",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "enabled" with operation "replace".
     */
    public void markEnabledReplace() throws JNCException {
        markLeafReplace("enabled");
    }

    /**
     * Marks the leaf "enabled" with operation "merge".
     */
    public void markEnabledMerge() throws JNCException {
        markLeafMerge("enabled");
    }

    /**
     * Marks the leaf "enabled" with operation "create".
     */
    public void markEnabledCreate() throws JNCException {
        markLeafCreate("enabled");
    }

    /**
     * Marks the leaf "enabled" with operation "delete".
     */
    public void markEnabledDelete() throws JNCException {
        markLeafDelete("enabled");
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
