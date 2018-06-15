/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-platform", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigPlatform.components.component.properties.property;

import com.nokia.eml.yang.openconfigPlatform.OcPlatform;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/platform
 * generated to "src/com/nokia/eml/yang/openconfigPlatform/components/component/properties/property/config"
 * <p>
 * See line 171 in
 * /root/nokia-yang/platform/openconfig-platform.yang
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
        super(OcPlatform.NAMESPACE, "config");
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
            "name",
            "value",
        };
    }

    /* Access methods for optional leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * Unsets the value for child leaf "name".
     */
    public void unsetNameValue() throws JNCException {
        delete("name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "name" with operation "replace".
     */
    public void markNameReplace() throws JNCException {
        markLeafReplace("name");
    }

    /**
     * Marks the leaf "name" with operation "merge".
     */
    public void markNameMerge() throws JNCException {
        markLeafMerge("name");
    }

    /**
     * Marks the leaf "name" with operation "create".
     */
    public void markNameCreate() throws JNCException {
        markLeafCreate("name");
    }

    /**
     * Marks the leaf "name" with operation "delete".
     */
    public void markNameDelete() throws JNCException {
        markLeafDelete("name");
    }

    /* Access methods for optional leaf child: "value". */

    /**
     * Gets the value for child leaf "value".
     * @return The value of the leaf.
     */
    public YangUnion getValueValue() throws JNCException {
        return (YangUnion)getValue("value");
    }

    /**
     * Sets the value for child leaf "value",
     * using instance of generated typedef class.
     * @param valueValue The value to set.
     * @param valueValue used during instantiation.
     */
    public void setValueValue(YangUnion valueValue) throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "value",
            valueValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "value",
     * using a String value.
     * @param valueValue used during instantiation.
     */
    public void setValueValue(String valueValue) throws JNCException {
        setValueValue(new YangUnion(valueValue, new String[] {
             "com.tailf.jnc.YangString",
             "com.tailf.jnc.YangBoolean",
             "com.tailf.jnc.YangInt64",
             "com.tailf.jnc.YangUInt64",
             "com.tailf.jnc.YangDecimal64",
        }));
    }

    /**
     * Unsets the value for child leaf "value".
     */
    public void unsetValueValue() throws JNCException {
        delete("value");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "value" leaf will not have a value.
     */
    public void addValue() throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "value",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "value" with operation "replace".
     */
    public void markValueReplace() throws JNCException {
        markLeafReplace("value");
    }

    /**
     * Marks the leaf "value" with operation "merge".
     */
    public void markValueMerge() throws JNCException {
        markLeafMerge("value");
    }

    /**
     * Marks the leaf "value" with operation "create".
     */
    public void markValueCreate() throws JNCException {
        markLeafCreate("value");
    }

    /**
     * Marks the leaf "value" with operation "delete".
     */
    public void markValueDelete() throws JNCException {
        markLeafDelete("value");
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