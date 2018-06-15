/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-interfaces", revision: "2018-01-05".
 */

package com.nokia.eml.yang.openconfigInterfaces.interfaces.interface_;

import com.nokia.eml.yang.openconfigInterfaces.OcIf;
import com.nokia.eml.yang.openconfigInterfaces.interfaces.interface_.state.Counters;
import com.nokia.eml.yang.openconfigPlatformPort.OcPort;
import com.nokia.eml.yang.openconfigPlatformTransceiver.OcTransceiver;
import com.nokia.eml.yang.openconfigTypes.Timeticks64;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementLeafListValueIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangIdentityref;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt16;
import com.tailf.jnc.YangUInt32;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/interfaces
 * generated to "src/com/nokia/eml/yang/openconfigInterfaces/interfaces/interface_/state"
 * <p>
 * See line 972 in
 * /root/nokia-yang/interfaces/openconfig-interfaces.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class State extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "counters".
     */
    public Counters counters = null;

    /**
     * Constructor for an empty State object.
     */
    public State() {
        super(OcIf.NAMESPACE, "state");
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
            "name",
            "type",
            "mtu",
            "loopback-mode",
            "description",
            "enabled",
            "ifindex",
            "admin-status",
            "oper-status",
            "last-change",
            "counters",
            "hardware-port",
            "physical-channel",
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
        setLeafValue(OcIf.NAMESPACE,
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
        setLeafValue(OcIf.NAMESPACE,
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

    /* Access methods for optional leaf child: "type". */

    /**
     * Gets the value for child leaf "type".
     * @return The value of the leaf.
     */
    public YangIdentityref getTypeValue() throws JNCException {
        return (YangIdentityref)getValue("type");
    }

    /**
     * Sets the value for child leaf "type",
     * using instance of generated typedef class.
     * @param typeValue The value to set.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(YangIdentityref typeValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "type",
            typeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "type",
     * using a String value.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(String typeValue) throws JNCException {
        setTypeValue(new YangIdentityref(typeValue));
    }

    /**
     * Unsets the value for child leaf "type".
     */
    public void unsetTypeValue() throws JNCException {
        delete("type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "type" leaf will not have a value.
     */
    public void addType() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "type" with operation "replace".
     */
    public void markTypeReplace() throws JNCException {
        markLeafReplace("type");
    }

    /**
     * Marks the leaf "type" with operation "merge".
     */
    public void markTypeMerge() throws JNCException {
        markLeafMerge("type");
    }

    /**
     * Marks the leaf "type" with operation "create".
     */
    public void markTypeCreate() throws JNCException {
        markLeafCreate("type");
    }

    /**
     * Marks the leaf "type" with operation "delete".
     */
    public void markTypeDelete() throws JNCException {
        markLeafDelete("type");
    }

    /* Access methods for optional leaf child: "mtu". */

    /**
     * Gets the value for child leaf "mtu".
     * @return The value of the leaf.
     */
    public YangUInt16 getMtuValue() throws JNCException {
        return (YangUInt16)getValue("mtu");
    }

    /**
     * Sets the value for child leaf "mtu",
     * using instance of generated typedef class.
     * @param mtuValue The value to set.
     * @param mtuValue used during instantiation.
     */
    public void setMtuValue(YangUInt16 mtuValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "mtu",
            mtuValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "mtu",
     * using Java primitive values.
     * @param mtuValue used during instantiation.
     */
    public void setMtuValue(int mtuValue) throws JNCException {
        setMtuValue(new YangUInt16(mtuValue));
    }

    /**
     * Sets the value for child leaf "mtu",
     * using a String value.
     * @param mtuValue used during instantiation.
     */
    public void setMtuValue(String mtuValue) throws JNCException {
        setMtuValue(new YangUInt16(mtuValue));
    }

    /**
     * Unsets the value for child leaf "mtu".
     */
    public void unsetMtuValue() throws JNCException {
        delete("mtu");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "mtu" leaf will not have a value.
     */
    public void addMtu() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "mtu",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "mtu" with operation "replace".
     */
    public void markMtuReplace() throws JNCException {
        markLeafReplace("mtu");
    }

    /**
     * Marks the leaf "mtu" with operation "merge".
     */
    public void markMtuMerge() throws JNCException {
        markLeafMerge("mtu");
    }

    /**
     * Marks the leaf "mtu" with operation "create".
     */
    public void markMtuCreate() throws JNCException {
        markLeafCreate("mtu");
    }

    /**
     * Marks the leaf "mtu" with operation "delete".
     */
    public void markMtuDelete() throws JNCException {
        markLeafDelete("mtu");
    }

    /* Access methods for optional leaf child: "loopback-mode". */

    /**
     * Gets the value for child leaf "loopback-mode".
     * @return The value of the leaf.
     */
    public YangBoolean getLoopbackModeValue() throws JNCException {
        YangBoolean loopbackMode = (YangBoolean)getValue("loopback-mode");
        if (loopbackMode == null) {
            loopbackMode = new YangBoolean("false");  // default
        }
        return loopbackMode;
    }

    /**
     * Sets the value for child leaf "loopback-mode",
     * using instance of generated typedef class.
     * @param loopbackModeValue The value to set.
     * @param loopbackModeValue used during instantiation.
     */
    public void setLoopbackModeValue(YangBoolean loopbackModeValue)
            throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "loopback-mode",
            loopbackModeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "loopback-mode",
     * using Java primitive values.
     * @param loopbackModeValue used during instantiation.
     */
    public void setLoopbackModeValue(Boolean loopbackModeValue)
            throws JNCException {
        setLoopbackModeValue(new YangBoolean(loopbackModeValue));
    }

    /**
     * Sets the value for child leaf "loopback-mode",
     * using a String value.
     * @param loopbackModeValue used during instantiation.
     */
    public void setLoopbackModeValue(String loopbackModeValue)
            throws JNCException {
        setLoopbackModeValue(new YangBoolean(loopbackModeValue));
    }

    /**
     * Unsets the value for child leaf "loopback-mode".
     */
    public void unsetLoopbackModeValue() throws JNCException {
        delete("loopback-mode");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "loopback-mode" leaf will not have a value.
     */
    public void addLoopbackMode() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "loopback-mode",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "loopback-mode" with operation "replace".
     */
    public void markLoopbackModeReplace() throws JNCException {
        markLeafReplace("loopbackMode");
    }

    /**
     * Marks the leaf "loopback-mode" with operation "merge".
     */
    public void markLoopbackModeMerge() throws JNCException {
        markLeafMerge("loopbackMode");
    }

    /**
     * Marks the leaf "loopback-mode" with operation "create".
     */
    public void markLoopbackModeCreate() throws JNCException {
        markLeafCreate("loopbackMode");
    }

    /**
     * Marks the leaf "loopback-mode" with operation "delete".
     */
    public void markLoopbackModeDelete() throws JNCException {
        markLeafDelete("loopbackMode");
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

    /* Access methods for optional leaf child: "ifindex". */

    /**
     * Gets the value for child leaf "ifindex".
     * @return The value of the leaf.
     */
    public YangUInt32 getIfindexValue() throws JNCException {
        return (YangUInt32)getValue("ifindex");
    }

    /**
     * Sets the value for child leaf "ifindex",
     * using instance of generated typedef class.
     * @param ifindexValue The value to set.
     * @param ifindexValue used during instantiation.
     */
    public void setIfindexValue(YangUInt32 ifindexValue) throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "ifindex",
            ifindexValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ifindex",
     * using Java primitive values.
     * @param ifindexValue used during instantiation.
     */
    public void setIfindexValue(long ifindexValue) throws JNCException {
        setIfindexValue(new YangUInt32(ifindexValue));
    }

    /**
     * Sets the value for child leaf "ifindex",
     * using a String value.
     * @param ifindexValue used during instantiation.
     */
    public void setIfindexValue(String ifindexValue) throws JNCException {
        setIfindexValue(new YangUInt32(ifindexValue));
    }

    /**
     * Unsets the value for child leaf "ifindex".
     */
    public void unsetIfindexValue() throws JNCException {
        delete("ifindex");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ifindex" leaf will not have a value.
     */
    public void addIfindex() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "ifindex",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "ifindex" with operation "replace".
     */
    public void markIfindexReplace() throws JNCException {
        markLeafReplace("ifindex");
    }

    /**
     * Marks the leaf "ifindex" with operation "merge".
     */
    public void markIfindexMerge() throws JNCException {
        markLeafMerge("ifindex");
    }

    /**
     * Marks the leaf "ifindex" with operation "create".
     */
    public void markIfindexCreate() throws JNCException {
        markLeafCreate("ifindex");
    }

    /**
     * Marks the leaf "ifindex" with operation "delete".
     */
    public void markIfindexDelete() throws JNCException {
        markLeafDelete("ifindex");
    }

    /* Access methods for optional leaf child: "admin-status". */

    /**
     * Gets the value for child leaf "admin-status".
     * @return The value of the leaf.
     */
    public YangEnumeration getAdminStatusValue() throws JNCException {
        return (YangEnumeration)getValue("admin-status");
    }

    /**
     * Sets the value for child leaf "admin-status",
     * using instance of generated typedef class.
     * @param adminStatusValue The value to set.
     * @param adminStatusValue used during instantiation.
     */
    public void setAdminStatusValue(YangEnumeration adminStatusValue)
            throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "admin-status",
            adminStatusValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "admin-status",
     * using a String value.
     * @param adminStatusValue used during instantiation.
     */
    public void setAdminStatusValue(String adminStatusValue)
            throws JNCException {
        setAdminStatusValue(new YangEnumeration(adminStatusValue, new String[] {
             "UP",
             "DOWN",
             "TESTING",
        }));
    }

    /**
     * Unsets the value for child leaf "admin-status".
     */
    public void unsetAdminStatusValue() throws JNCException {
        delete("admin-status");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "admin-status" leaf will not have a value.
     */
    public void addAdminStatus() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "admin-status",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "admin-status" with operation "replace".
     */
    public void markAdminStatusReplace() throws JNCException {
        markLeafReplace("adminStatus");
    }

    /**
     * Marks the leaf "admin-status" with operation "merge".
     */
    public void markAdminStatusMerge() throws JNCException {
        markLeafMerge("adminStatus");
    }

    /**
     * Marks the leaf "admin-status" with operation "create".
     */
    public void markAdminStatusCreate() throws JNCException {
        markLeafCreate("adminStatus");
    }

    /**
     * Marks the leaf "admin-status" with operation "delete".
     */
    public void markAdminStatusDelete() throws JNCException {
        markLeafDelete("adminStatus");
    }

    /* Access methods for optional leaf child: "oper-status". */

    /**
     * Gets the value for child leaf "oper-status".
     * @return The value of the leaf.
     */
    public YangEnumeration getOperStatusValue() throws JNCException {
        return (YangEnumeration)getValue("oper-status");
    }

    /**
     * Sets the value for child leaf "oper-status",
     * using instance of generated typedef class.
     * @param operStatusValue The value to set.
     * @param operStatusValue used during instantiation.
     */
    public void setOperStatusValue(YangEnumeration operStatusValue)
            throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "oper-status",
            operStatusValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "oper-status",
     * using a String value.
     * @param operStatusValue used during instantiation.
     */
    public void setOperStatusValue(String operStatusValue) throws JNCException {
        setOperStatusValue(new YangEnumeration(operStatusValue, new String[] {
             "UP",
             "DOWN",
             "TESTING",
             "UNKNOWN",
             "DORMANT",
             "NOT_PRESENT",
             "LOWER_LAYER_DOWN",
        }));
    }

    /**
     * Unsets the value for child leaf "oper-status".
     */
    public void unsetOperStatusValue() throws JNCException {
        delete("oper-status");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "oper-status" leaf will not have a value.
     */
    public void addOperStatus() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "oper-status",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "oper-status" with operation "replace".
     */
    public void markOperStatusReplace() throws JNCException {
        markLeafReplace("operStatus");
    }

    /**
     * Marks the leaf "oper-status" with operation "merge".
     */
    public void markOperStatusMerge() throws JNCException {
        markLeafMerge("operStatus");
    }

    /**
     * Marks the leaf "oper-status" with operation "create".
     */
    public void markOperStatusCreate() throws JNCException {
        markLeafCreate("operStatus");
    }

    /**
     * Marks the leaf "oper-status" with operation "delete".
     */
    public void markOperStatusDelete() throws JNCException {
        markLeafDelete("operStatus");
    }

    /* Access methods for optional leaf child: "last-change". */

    /**
     * Gets the value for child leaf "last-change".
     * @return The value of the leaf.
     */
    public Timeticks64 getLastChangeValue() throws JNCException {
        return (Timeticks64)getValue("last-change");
    }

    /**
     * Sets the value for child leaf "last-change",
     * using a JNC type value.
     * @param lastChangeValue The value to set.
     * @param lastChangeValue used during instantiation.
     */
    public void setLastChangeValue(Timeticks64 lastChangeValue)
            throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "last-change",
            lastChangeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "last-change",
     * using Java primitive values.
     * @param lastChangeValue used during instantiation.
     */
    public void setLastChangeValue(BigInteger lastChangeValue)
            throws JNCException {
        setLastChangeValue(new Timeticks64(lastChangeValue));
    }

    /**
     * Sets the value for child leaf "last-change",
     * using a String value.
     * @param lastChangeValue used during instantiation.
     */
    public void setLastChangeValue(String lastChangeValue) throws JNCException {
        setLastChangeValue(new Timeticks64(lastChangeValue));
    }

    /**
     * Unsets the value for child leaf "last-change".
     */
    public void unsetLastChangeValue() throws JNCException {
        delete("last-change");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "last-change" leaf will not have a value.
     */
    public void addLastChange() throws JNCException {
        setLeafValue(OcIf.NAMESPACE,
            "last-change",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "last-change" with operation "replace".
     */
    public void markLastChangeReplace() throws JNCException {
        markLeafReplace("lastChange");
    }

    /**
     * Marks the leaf "last-change" with operation "merge".
     */
    public void markLastChangeMerge() throws JNCException {
        markLeafMerge("lastChange");
    }

    /**
     * Marks the leaf "last-change" with operation "create".
     */
    public void markLastChangeCreate() throws JNCException {
        markLeafCreate("lastChange");
    }

    /**
     * Marks the leaf "last-change" with operation "delete".
     */
    public void markLastChangeDelete() throws JNCException {
        markLeafDelete("lastChange");
    }

    /* Access methods for container child: "counters". */

    /**
     * Adds container entry "counters", using an existing object.
     * @param counters The object to add.
     * @return The added child.
     */
    public Counters addCounters(Counters counters) throws JNCException {
        this.counters = counters;
        insertChild(counters, childrenNames());
        return counters;
    }

    /**
     * Adds container entry "counters".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Counters addCounters() throws JNCException {
        Counters counters = new Counters();
        this.counters = counters;
        insertChild(counters, childrenNames());
        return counters;
    }

    /**
     * Deletes container entry "counters".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCounters() throws JNCException {
        this.counters = null;
        String path = "counters";
        return delete(path);
    }

    /* Access methods for optional leaf child: "hardware-port". */

    /**
     * Gets the value for child leaf "hardware-port".
     * @return The value of the leaf.
     */
    public YangString getHardwarePortValue() throws JNCException {
        return (YangString)getValue("hardware-port");
    }

    /**
     * Sets the value for child leaf "hardware-port",
     * using instance of generated typedef class.
     * @param hardwarePortValue The value to set.
     * @param hardwarePortValue used during instantiation.
     */
    public void setHardwarePortValue(YangString hardwarePortValue)
            throws JNCException {
        setLeafValue(OcPort.NAMESPACE,
            "hardware-port",
            hardwarePortValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "hardware-port",
     * using a String value.
     * @param hardwarePortValue used during instantiation.
     */
    public void setHardwarePortValue(String hardwarePortValue)
            throws JNCException {
        setHardwarePortValue(new YangString(hardwarePortValue));
    }

    /**
     * Unsets the value for child leaf "hardware-port".
     */
    public void unsetHardwarePortValue() throws JNCException {
        delete("hardware-port");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "hardware-port" leaf will not have a value.
     */
    public void addHardwarePort() throws JNCException {
        setLeafValue(OcPort.NAMESPACE,
            "hardware-port",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "hardware-port" with operation "replace".
     */
    public void markHardwarePortReplace() throws JNCException {
        markLeafReplace("hardwarePort");
    }

    /**
     * Marks the leaf "hardware-port" with operation "merge".
     */
    public void markHardwarePortMerge() throws JNCException {
        markLeafMerge("hardwarePort");
    }

    /**
     * Marks the leaf "hardware-port" with operation "create".
     */
    public void markHardwarePortCreate() throws JNCException {
        markLeafCreate("hardwarePort");
    }

    /**
     * Marks the leaf "hardware-port" with operation "delete".
     */
    public void markHardwarePortDelete() throws JNCException {
        markLeafDelete("hardwarePort");
    }

    /* Access methods for optional leaf-list child: "physical-channel". */

    /**
     * Iterator method for the leaf-list "physical-channel".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator physicalChannelIterator() {
        return new ElementLeafListValueIterator(children, "physical-channel");
    }

    /**
     * Sets the value for child leaf-list "physical-channel",
     * using instance of generated typedef class.
     * @param physicalChannelValue The value to set.
     * @param physicalChannelValue used during instantiation.
     */
    public void setPhysicalChannelValue(YangUInt16 physicalChannelValue)
            throws JNCException {
        setLeafListValue(OcTransceiver.NAMESPACE,
            "physical-channel",
            physicalChannelValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "physical-channel",
     * using Java primitive values.
     * @param physicalChannelValue used during instantiation.
     */
    public void setPhysicalChannelValue(int physicalChannelValue)
            throws JNCException {
        setPhysicalChannelValue(new YangUInt16(physicalChannelValue));
    }

    /**
     * Sets the value for child leaf-list "physical-channel",
     * using a String value.
     * @param physicalChannelValue used during instantiation.
     */
    public void setPhysicalChannelValue(String physicalChannelValue)
            throws JNCException {
        setPhysicalChannelValue(new YangUInt16(physicalChannelValue));
    }

    /**
     * Deletes leaf-list entry "physicalChannel".
     * @param physicalChannelValue Value to delete.
     */
    public void deletePhysicalChannel(YangUInt16 physicalChannelValue)
            throws JNCException {
        String path = "physicalChannel[physicalChannelValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "physicalChannel".
     * The value is specified as a string.
     * @param physicalChannelValue Value to delete.
     */
    public void deletePhysicalChannel(String physicalChannelValue)
            throws JNCException {
        String path = "physicalChannel[physicalChannelValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "physical-channel" leaf-list will not have a value.
     */
    public void addPhysicalChannel() throws JNCException {
        setLeafListValue(OcTransceiver.NAMESPACE,
            "physical-channel",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "replace".
     * @param physicalChannelValue The value to mark
     */
    public void markPhysicalChannelReplace(YangUInt16 physicalChannelValue)
            throws JNCException {
        markLeafReplace("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "replace".
     * @param physicalChannelValue The value to mark, given as a String
     */
    public void markPhysicalChannelReplace(String physicalChannelValue)
            throws JNCException {
        markLeafReplace("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "merge".
     * @param physicalChannelValue The value to mark
     */
    public void markPhysicalChannelMerge(YangUInt16 physicalChannelValue)
            throws JNCException {
        markLeafMerge("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "merge".
     * @param physicalChannelValue The value to mark, given as a String
     */
    public void markPhysicalChannelMerge(String physicalChannelValue)
            throws JNCException {
        markLeafMerge("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "create".
     * @param physicalChannelValue The value to mark
     */
    public void markPhysicalChannelCreate(YangUInt16 physicalChannelValue)
            throws JNCException {
        markLeafCreate("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "create".
     * @param physicalChannelValue The value to mark, given as a String
     */
    public void markPhysicalChannelCreate(String physicalChannelValue)
            throws JNCException {
        markLeafCreate("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "delete".
     * @param physicalChannelValue The value to mark
     */
    public void markPhysicalChannelDelete(YangUInt16 physicalChannelValue)
            throws JNCException {
        markLeafDelete("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Marks the leaf-list "physical-channel" with operation "delete".
     * @param physicalChannelValue The value to mark, given as a String
     */
    public void markPhysicalChannelDelete(String physicalChannelValue)
            throws JNCException {
        markLeafDelete("physicalChannel[name='" + physicalChannelValue + "']");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Counters) counters = (Counters)child;
    }

}