/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-platform", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigPlatform.components.component.transceiver;

import com.nokia.eml.yang.openconfigPlatformTransceiver.OcTransceiver;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/platform
 * generated to "src/com/nokia/eml/yang/openconfigPlatform/components/component/transceiver/config"
 * <p>
 * See line 432 in
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
            "enabled",
            "form-factor-preconf",
            "ethernet-pmd-preconf",
        };
    }

    /* Access methods for optional leaf child: "enabled". */

    /**
     * Gets the value for child leaf "enabled".
     * @return The value of the leaf.
     */
    public YangBoolean getEnabledValue() throws JNCException {
        return (YangBoolean)getValue("enabled");
    }

    /**
     * Sets the value for child leaf "enabled",
     * using instance of generated typedef class.
     * @param enabledValue The value to set.
     * @param enabledValue used during instantiation.
     */
    public void setEnabledValue(YangBoolean enabledValue) throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
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
        setLeafValue(OcTransceiver.NAMESPACE,
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

    /* Access methods for optional leaf child: "form-factor-preconf". */

    /**
     * Gets the value for child leaf "form-factor-preconf".
     * @return The value of the leaf.
     */
    public YangIdentityref getFormFactorPreconfValue() throws JNCException {
        return (YangIdentityref)getValue("form-factor-preconf");
    }

    /**
     * Sets the value for child leaf "form-factor-preconf",
     * using instance of generated typedef class.
     * @param formFactorPreconfValue The value to set.
     * @param formFactorPreconfValue used during instantiation.
     */
    public void setFormFactorPreconfValue(YangIdentityref formFactorPreconfValue)
            throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "form-factor-preconf",
            formFactorPreconfValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "form-factor-preconf",
     * using a String value.
     * @param formFactorPreconfValue used during instantiation.
     */
    public void setFormFactorPreconfValue(String formFactorPreconfValue)
            throws JNCException {
        setFormFactorPreconfValue(new YangIdentityref(formFactorPreconfValue));
    }

    /**
     * Unsets the value for child leaf "form-factor-preconf".
     */
    public void unsetFormFactorPreconfValue() throws JNCException {
        delete("form-factor-preconf");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "form-factor-preconf" leaf will not have a value.
     */
    public void addFormFactorPreconf() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "form-factor-preconf",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "form-factor-preconf" with operation "replace".
     */
    public void markFormFactorPreconfReplace() throws JNCException {
        markLeafReplace("formFactorPreconf");
    }

    /**
     * Marks the leaf "form-factor-preconf" with operation "merge".
     */
    public void markFormFactorPreconfMerge() throws JNCException {
        markLeafMerge("formFactorPreconf");
    }

    /**
     * Marks the leaf "form-factor-preconf" with operation "create".
     */
    public void markFormFactorPreconfCreate() throws JNCException {
        markLeafCreate("formFactorPreconf");
    }

    /**
     * Marks the leaf "form-factor-preconf" with operation "delete".
     */
    public void markFormFactorPreconfDelete() throws JNCException {
        markLeafDelete("formFactorPreconf");
    }

    /* Access methods for optional leaf child: "ethernet-pmd-preconf". */

    /**
     * Gets the value for child leaf "ethernet-pmd-preconf".
     * @return The value of the leaf.
     */
    public YangIdentityref getEthernetPmdPreconfValue() throws JNCException {
        return (YangIdentityref)getValue("ethernet-pmd-preconf");
    }

    /**
     * Sets the value for child leaf "ethernet-pmd-preconf",
     * using instance of generated typedef class.
     * @param ethernetPmdPreconfValue The value to set.
     * @param ethernetPmdPreconfValue used during instantiation.
     */
    public void setEthernetPmdPreconfValue(YangIdentityref ethernetPmdPreconfValue)
            throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "ethernet-pmd-preconf",
            ethernetPmdPreconfValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ethernet-pmd-preconf",
     * using a String value.
     * @param ethernetPmdPreconfValue used during instantiation.
     */
    public void setEthernetPmdPreconfValue(String ethernetPmdPreconfValue)
            throws JNCException {
        setEthernetPmdPreconfValue(new YangIdentityref(ethernetPmdPreconfValue));
    }

    /**
     * Unsets the value for child leaf "ethernet-pmd-preconf".
     */
    public void unsetEthernetPmdPreconfValue() throws JNCException {
        delete("ethernet-pmd-preconf");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ethernet-pmd-preconf" leaf will not have a value.
     */
    public void addEthernetPmdPreconf() throws JNCException {
        setLeafValue(OcTransceiver.NAMESPACE,
            "ethernet-pmd-preconf",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ethernet-pmd-preconf" with operation "replace".
     */
    public void markEthernetPmdPreconfReplace() throws JNCException {
        markLeafReplace("ethernetPmdPreconf");
    }

    /**
     * Marks the leaf "ethernet-pmd-preconf" with operation "merge".
     */
    public void markEthernetPmdPreconfMerge() throws JNCException {
        markLeafMerge("ethernetPmdPreconf");
    }

    /**
     * Marks the leaf "ethernet-pmd-preconf" with operation "create".
     */
    public void markEthernetPmdPreconfCreate() throws JNCException {
        markLeafCreate("ethernetPmdPreconf");
    }

    /**
     * Marks the leaf "ethernet-pmd-preconf" with operation "delete".
     */
    public void markEthernetPmdPreconfDelete() throws JNCException {
        markLeafDelete("ethernetPmdPreconf");
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
