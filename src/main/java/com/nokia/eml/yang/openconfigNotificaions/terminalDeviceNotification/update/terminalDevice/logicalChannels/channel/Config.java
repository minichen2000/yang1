/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice.logicalChannels.channel;

import com.nokia.eml.yang.openconfigTerminalDevice.OcOptTerm;
import com.nokia.eml.yang.openconfigTransportTypes.AdminStateType;
import com.nokia.eml.yang.openconfigTransportTypes.LoopbackModeType;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/terminalDeviceNotification/update/terminalDevice/logicalChannels/channel/config"
 * <p>
 * See line 808 in
 * /root/nokia-yang/optical-transport/openconfig-terminal-device.yang
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
        super(OcOptTerm.NAMESPACE, "config");
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
            "admin-state",
            "rate-class",
            "trib-protocol",
            "logical-channel-type",
            "loopback-mode",
            "test-signal",
        };
    }

    /* Access methods for optional leaf child: "index". */

    /**
     * Gets the value for child leaf "index".
     * @return The value of the leaf.
     */
    public YangUInt32 getIndexValue() throws JNCException {
        return (YangUInt32)getValue("index");
    }

    /**
     * Sets the value for child leaf "index",
     * using instance of generated typedef class.
     * @param indexValue The value to set.
     * @param indexValue used during instantiation.
     */
    public void setIndexValue(YangUInt32 indexValue) throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
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
        setLeafValue(OcOptTerm.NAMESPACE,
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
        setLeafValue(OcOptTerm.NAMESPACE,
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
        setLeafValue(OcOptTerm.NAMESPACE,
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

    /* Access methods for optional leaf child: "admin-state". */

    /**
     * Gets the value for child leaf "admin-state".
     * @return The value of the leaf.
     */
    public AdminStateType getAdminStateValue() throws JNCException {
        return (AdminStateType)getValue("admin-state");
    }

    /**
     * Sets the value for child leaf "admin-state",
     * using a JNC type value.
     * @param adminStateValue The value to set.
     * @param adminStateValue used during instantiation.
     */
    public void setAdminStateValue(AdminStateType adminStateValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "admin-state",
            adminStateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "admin-state",
     * using a String value.
     * @param adminStateValue used during instantiation.
     */
    public void setAdminStateValue(String adminStateValue) throws JNCException {
        setAdminStateValue(new AdminStateType(adminStateValue));
    }

    /**
     * Unsets the value for child leaf "admin-state".
     */
    public void unsetAdminStateValue() throws JNCException {
        delete("admin-state");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "admin-state" leaf will not have a value.
     */
    public void addAdminState() throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "admin-state",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "admin-state" with operation "replace".
     */
    public void markAdminStateReplace() throws JNCException {
        markLeafReplace("adminState");
    }

    /**
     * Marks the leaf "admin-state" with operation "merge".
     */
    public void markAdminStateMerge() throws JNCException {
        markLeafMerge("adminState");
    }

    /**
     * Marks the leaf "admin-state" with operation "create".
     */
    public void markAdminStateCreate() throws JNCException {
        markLeafCreate("adminState");
    }

    /**
     * Marks the leaf "admin-state" with operation "delete".
     */
    public void markAdminStateDelete() throws JNCException {
        markLeafDelete("adminState");
    }

    /* Access methods for optional leaf child: "rate-class". */

    /**
     * Gets the value for child leaf "rate-class".
     * @return The value of the leaf.
     */
    public YangIdentityref getRateClassValue() throws JNCException {
        return (YangIdentityref)getValue("rate-class");
    }

    /**
     * Sets the value for child leaf "rate-class",
     * using instance of generated typedef class.
     * @param rateClassValue The value to set.
     * @param rateClassValue used during instantiation.
     */
    public void setRateClassValue(YangIdentityref rateClassValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "rate-class",
            rateClassValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "rate-class",
     * using a String value.
     * @param rateClassValue used during instantiation.
     */
    public void setRateClassValue(String rateClassValue) throws JNCException {
        setRateClassValue(new YangIdentityref(rateClassValue));
    }

    /**
     * Unsets the value for child leaf "rate-class".
     */
    public void unsetRateClassValue() throws JNCException {
        delete("rate-class");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "rate-class" leaf will not have a value.
     */
    public void addRateClass() throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "rate-class",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "rate-class" with operation "replace".
     */
    public void markRateClassReplace() throws JNCException {
        markLeafReplace("rateClass");
    }

    /**
     * Marks the leaf "rate-class" with operation "merge".
     */
    public void markRateClassMerge() throws JNCException {
        markLeafMerge("rateClass");
    }

    /**
     * Marks the leaf "rate-class" with operation "create".
     */
    public void markRateClassCreate() throws JNCException {
        markLeafCreate("rateClass");
    }

    /**
     * Marks the leaf "rate-class" with operation "delete".
     */
    public void markRateClassDelete() throws JNCException {
        markLeafDelete("rateClass");
    }

    /* Access methods for optional leaf child: "trib-protocol". */

    /**
     * Gets the value for child leaf "trib-protocol".
     * @return The value of the leaf.
     */
    public YangIdentityref getTribProtocolValue() throws JNCException {
        return (YangIdentityref)getValue("trib-protocol");
    }

    /**
     * Sets the value for child leaf "trib-protocol",
     * using instance of generated typedef class.
     * @param tribProtocolValue The value to set.
     * @param tribProtocolValue used during instantiation.
     */
    public void setTribProtocolValue(YangIdentityref tribProtocolValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "trib-protocol",
            tribProtocolValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "trib-protocol",
     * using a String value.
     * @param tribProtocolValue used during instantiation.
     */
    public void setTribProtocolValue(String tribProtocolValue)
            throws JNCException {
        setTribProtocolValue(new YangIdentityref(tribProtocolValue));
    }

    /**
     * Unsets the value for child leaf "trib-protocol".
     */
    public void unsetTribProtocolValue() throws JNCException {
        delete("trib-protocol");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "trib-protocol" leaf will not have a value.
     */
    public void addTribProtocol() throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "trib-protocol",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "trib-protocol" with operation "replace".
     */
    public void markTribProtocolReplace() throws JNCException {
        markLeafReplace("tribProtocol");
    }

    /**
     * Marks the leaf "trib-protocol" with operation "merge".
     */
    public void markTribProtocolMerge() throws JNCException {
        markLeafMerge("tribProtocol");
    }

    /**
     * Marks the leaf "trib-protocol" with operation "create".
     */
    public void markTribProtocolCreate() throws JNCException {
        markLeafCreate("tribProtocol");
    }

    /**
     * Marks the leaf "trib-protocol" with operation "delete".
     */
    public void markTribProtocolDelete() throws JNCException {
        markLeafDelete("tribProtocol");
    }

    /* Access methods for optional leaf child: "logical-channel-type". */

    /**
     * Gets the value for child leaf "logical-channel-type".
     * @return The value of the leaf.
     */
    public YangIdentityref getLogicalChannelTypeValue() throws JNCException {
        return (YangIdentityref)getValue("logical-channel-type");
    }

    /**
     * Sets the value for child leaf "logical-channel-type",
     * using instance of generated typedef class.
     * @param logicalChannelTypeValue The value to set.
     * @param logicalChannelTypeValue used during instantiation.
     */
    public void setLogicalChannelTypeValue(YangIdentityref logicalChannelTypeValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "logical-channel-type",
            logicalChannelTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "logical-channel-type",
     * using a String value.
     * @param logicalChannelTypeValue used during instantiation.
     */
    public void setLogicalChannelTypeValue(String logicalChannelTypeValue)
            throws JNCException {
        setLogicalChannelTypeValue(new YangIdentityref(logicalChannelTypeValue));
    }

    /**
     * Unsets the value for child leaf "logical-channel-type".
     */
    public void unsetLogicalChannelTypeValue() throws JNCException {
        delete("logical-channel-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "logical-channel-type" leaf will not have a value.
     */
    public void addLogicalChannelType() throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "logical-channel-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "logical-channel-type" with operation "replace".
     */
    public void markLogicalChannelTypeReplace() throws JNCException {
        markLeafReplace("logicalChannelType");
    }

    /**
     * Marks the leaf "logical-channel-type" with operation "merge".
     */
    public void markLogicalChannelTypeMerge() throws JNCException {
        markLeafMerge("logicalChannelType");
    }

    /**
     * Marks the leaf "logical-channel-type" with operation "create".
     */
    public void markLogicalChannelTypeCreate() throws JNCException {
        markLeafCreate("logicalChannelType");
    }

    /**
     * Marks the leaf "logical-channel-type" with operation "delete".
     */
    public void markLogicalChannelTypeDelete() throws JNCException {
        markLeafDelete("logicalChannelType");
    }

    /* Access methods for optional leaf child: "loopback-mode". */

    /**
     * Gets the value for child leaf "loopback-mode".
     * @return The value of the leaf.
     */
    public LoopbackModeType getLoopbackModeValue() throws JNCException {
        return (LoopbackModeType)getValue("loopback-mode");
    }

    /**
     * Sets the value for child leaf "loopback-mode",
     * using a JNC type value.
     * @param loopbackModeValue The value to set.
     * @param loopbackModeValue used during instantiation.
     */
    public void setLoopbackModeValue(LoopbackModeType loopbackModeValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "loopback-mode",
            loopbackModeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "loopback-mode",
     * using a String value.
     * @param loopbackModeValue used during instantiation.
     */
    public void setLoopbackModeValue(String loopbackModeValue)
            throws JNCException {
        setLoopbackModeValue(new LoopbackModeType(loopbackModeValue));
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
        setLeafValue(OcOptTerm.NAMESPACE,
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

    /* Access methods for optional leaf child: "test-signal". */

    /**
     * Gets the value for child leaf "test-signal".
     * @return The value of the leaf.
     */
    public YangBoolean getTestSignalValue() throws JNCException {
        return (YangBoolean)getValue("test-signal");
    }

    /**
     * Sets the value for child leaf "test-signal",
     * using instance of generated typedef class.
     * @param testSignalValue The value to set.
     * @param testSignalValue used during instantiation.
     */
    public void setTestSignalValue(YangBoolean testSignalValue)
            throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "test-signal",
            testSignalValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "test-signal",
     * using Java primitive values.
     * @param testSignalValue used during instantiation.
     */
    public void setTestSignalValue(Boolean testSignalValue) throws JNCException {
        setTestSignalValue(new YangBoolean(testSignalValue));
    }

    /**
     * Sets the value for child leaf "test-signal",
     * using a String value.
     * @param testSignalValue used during instantiation.
     */
    public void setTestSignalValue(String testSignalValue) throws JNCException {
        setTestSignalValue(new YangBoolean(testSignalValue));
    }

    /**
     * Unsets the value for child leaf "test-signal".
     */
    public void unsetTestSignalValue() throws JNCException {
        delete("test-signal");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "test-signal" leaf will not have a value.
     */
    public void addTestSignal() throws JNCException {
        setLeafValue(OcOptTerm.NAMESPACE,
            "test-signal",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "test-signal" with operation "replace".
     */
    public void markTestSignalReplace() throws JNCException {
        markLeafReplace("testSignal");
    }

    /**
     * Marks the leaf "test-signal" with operation "merge".
     */
    public void markTestSignalMerge() throws JNCException {
        markLeafMerge("testSignal");
    }

    /**
     * Marks the leaf "test-signal" with operation "create".
     */
    public void markTestSignalCreate() throws JNCException {
        markLeafCreate("testSignal");
    }

    /**
     * Marks the leaf "test-signal" with operation "delete".
     */
    public void markTestSignalDelete() throws JNCException {
        markLeafDelete("testSignal");
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
