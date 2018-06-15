/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.ntp.ntpKeys.ntpKey;

import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/systemNotification/update/system/ntp/ntpKeys/ntpKey/state"
 * <p>
 * See line 693 in
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
            "key-id",
            "key-type",
            "key-value",
        };
    }

    /* Access methods for optional leaf child: "key-id". */

    /**
     * Gets the value for child leaf "key-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getKeyIdValue() throws JNCException {
        return (YangUInt16)getValue("key-id");
    }

    /**
     * Sets the value for child leaf "key-id",
     * using instance of generated typedef class.
     * @param keyIdValue The value to set.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(YangUInt16 keyIdValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-id",
            keyIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "key-id",
     * using Java primitive values.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(int keyIdValue) throws JNCException {
        setKeyIdValue(new YangUInt16(keyIdValue));
    }

    /**
     * Sets the value for child leaf "key-id",
     * using a String value.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(String keyIdValue) throws JNCException {
        setKeyIdValue(new YangUInt16(keyIdValue));
    }

    /**
     * Unsets the value for child leaf "key-id".
     */
    public void unsetKeyIdValue() throws JNCException {
        delete("key-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "key-id" leaf will not have a value.
     */
    public void addKeyId() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "key-id" with operation "replace".
     */
    public void markKeyIdReplace() throws JNCException {
        markLeafReplace("keyId");
    }

    /**
     * Marks the leaf "key-id" with operation "merge".
     */
    public void markKeyIdMerge() throws JNCException {
        markLeafMerge("keyId");
    }

    /**
     * Marks the leaf "key-id" with operation "create".
     */
    public void markKeyIdCreate() throws JNCException {
        markLeafCreate("keyId");
    }

    /**
     * Marks the leaf "key-id" with operation "delete".
     */
    public void markKeyIdDelete() throws JNCException {
        markLeafDelete("keyId");
    }

    /* Access methods for optional leaf child: "key-type". */

    /**
     * Gets the value for child leaf "key-type".
     * @return The value of the leaf.
     */
    public YangIdentityref getKeyTypeValue() throws JNCException {
        return (YangIdentityref)getValue("key-type");
    }

    /**
     * Sets the value for child leaf "key-type",
     * using instance of generated typedef class.
     * @param keyTypeValue The value to set.
     * @param keyTypeValue used during instantiation.
     */
    public void setKeyTypeValue(YangIdentityref keyTypeValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-type",
            keyTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "key-type",
     * using a String value.
     * @param keyTypeValue used during instantiation.
     */
    public void setKeyTypeValue(String keyTypeValue) throws JNCException {
        setKeyTypeValue(new YangIdentityref(keyTypeValue));
    }

    /**
     * Unsets the value for child leaf "key-type".
     */
    public void unsetKeyTypeValue() throws JNCException {
        delete("key-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "key-type" leaf will not have a value.
     */
    public void addKeyType() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "key-type" with operation "replace".
     */
    public void markKeyTypeReplace() throws JNCException {
        markLeafReplace("keyType");
    }

    /**
     * Marks the leaf "key-type" with operation "merge".
     */
    public void markKeyTypeMerge() throws JNCException {
        markLeafMerge("keyType");
    }

    /**
     * Marks the leaf "key-type" with operation "create".
     */
    public void markKeyTypeCreate() throws JNCException {
        markLeafCreate("keyType");
    }

    /**
     * Marks the leaf "key-type" with operation "delete".
     */
    public void markKeyTypeDelete() throws JNCException {
        markLeafDelete("keyType");
    }

    /* Access methods for optional leaf child: "key-value". */

    /**
     * Gets the value for child leaf "key-value".
     * @return The value of the leaf.
     */
    public YangString getKeyValueValue() throws JNCException {
        return (YangString)getValue("key-value");
    }

    /**
     * Sets the value for child leaf "key-value",
     * using instance of generated typedef class.
     * @param keyValueValue The value to set.
     * @param keyValueValue used during instantiation.
     */
    public void setKeyValueValue(YangString keyValueValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-value",
            keyValueValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "key-value",
     * using a String value.
     * @param keyValueValue used during instantiation.
     */
    public void setKeyValueValue(String keyValueValue) throws JNCException {
        setKeyValueValue(new YangString(keyValueValue));
    }

    /**
     * Unsets the value for child leaf "key-value".
     */
    public void unsetKeyValueValue() throws JNCException {
        delete("key-value");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "key-value" leaf will not have a value.
     */
    public void addKeyValue() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-value",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "key-value" with operation "replace".
     */
    public void markKeyValueReplace() throws JNCException {
        markLeafReplace("keyValue");
    }

    /**
     * Marks the leaf "key-value" with operation "merge".
     */
    public void markKeyValueMerge() throws JNCException {
        markLeafMerge("keyValue");
    }

    /**
     * Marks the leaf "key-value" with operation "create".
     */
    public void markKeyValueCreate() throws JNCException {
        markLeafCreate("keyValue");
    }

    /**
     * Marks the leaf "key-value" with operation "delete".
     */
    public void markKeyValueDelete() throws JNCException {
        markLeafDelete("keyValue");
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
