/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system.sshServer;

import com.nokia.eml.yang.openconfigSystemTerminal.OcSysTerm;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/sshServer/config"
 * <p>
 * See line 163 in
 * /root/nokia-yang/system/openconfig-system-terminal.yang
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
        super(OcSysTerm.NAMESPACE, "config");
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
            "enable",
            "protocol-version",
            "timeout",
            "rate-limit",
            "session-limit",
        };
    }

    /* Access methods for optional leaf child: "enable". */

    /**
     * Gets the value for child leaf "enable".
     * @return The value of the leaf.
     */
    public YangBoolean getEnableValue() throws JNCException {
        YangBoolean enable = (YangBoolean)getValue("enable");
        if (enable == null) {
            enable = new YangBoolean("true");  // default
        }
        return enable;
    }

    /**
     * Sets the value for child leaf "enable",
     * using instance of generated typedef class.
     * @param enableValue The value to set.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(YangBoolean enableValue) throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "enable",
            enableValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enable",
     * using Java primitive values.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(Boolean enableValue) throws JNCException {
        setEnableValue(new YangBoolean(enableValue));
    }

    /**
     * Sets the value for child leaf "enable",
     * using a String value.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(String enableValue) throws JNCException {
        setEnableValue(new YangBoolean(enableValue));
    }

    /**
     * Unsets the value for child leaf "enable".
     */
    public void unsetEnableValue() throws JNCException {
        delete("enable");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enable" leaf will not have a value.
     */
    public void addEnable() throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "enable",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "enable" with operation "replace".
     */
    public void markEnableReplace() throws JNCException {
        markLeafReplace("enable");
    }

    /**
     * Marks the leaf "enable" with operation "merge".
     */
    public void markEnableMerge() throws JNCException {
        markLeafMerge("enable");
    }

    /**
     * Marks the leaf "enable" with operation "create".
     */
    public void markEnableCreate() throws JNCException {
        markLeafCreate("enable");
    }

    /**
     * Marks the leaf "enable" with operation "delete".
     */
    public void markEnableDelete() throws JNCException {
        markLeafDelete("enable");
    }

    /* Access methods for optional leaf child: "protocol-version". */

    /**
     * Gets the value for child leaf "protocol-version".
     * @return The value of the leaf.
     */
    public YangEnumeration getProtocolVersionValue() throws JNCException {
        YangEnumeration protocolVersion = (YangEnumeration)getValue("protocol-version");
        if (protocolVersion == null) {
            protocolVersion = new YangEnumeration("V2", new String[] {  // default
                "V2",
                "V1",
                "V1_V2",
            });
        }
        return protocolVersion;
    }

    /**
     * Sets the value for child leaf "protocol-version",
     * using instance of generated typedef class.
     * @param protocolVersionValue The value to set.
     * @param protocolVersionValue used during instantiation.
     */
    public void setProtocolVersionValue(YangEnumeration protocolVersionValue)
            throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "protocol-version",
            protocolVersionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "protocol-version",
     * using a String value.
     * @param protocolVersionValue used during instantiation.
     */
    public void setProtocolVersionValue(String protocolVersionValue)
            throws JNCException {
        setProtocolVersionValue(new YangEnumeration(protocolVersionValue, new String[] {
             "V2",
             "V1",
             "V1_V2",
        }));
    }

    /**
     * Unsets the value for child leaf "protocol-version".
     */
    public void unsetProtocolVersionValue() throws JNCException {
        delete("protocol-version");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "protocol-version" leaf will not have a value.
     */
    public void addProtocolVersion() throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "protocol-version",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "protocol-version" with operation "replace".
     */
    public void markProtocolVersionReplace() throws JNCException {
        markLeafReplace("protocolVersion");
    }

    /**
     * Marks the leaf "protocol-version" with operation "merge".
     */
    public void markProtocolVersionMerge() throws JNCException {
        markLeafMerge("protocolVersion");
    }

    /**
     * Marks the leaf "protocol-version" with operation "create".
     */
    public void markProtocolVersionCreate() throws JNCException {
        markLeafCreate("protocolVersion");
    }

    /**
     * Marks the leaf "protocol-version" with operation "delete".
     */
    public void markProtocolVersionDelete() throws JNCException {
        markLeafDelete("protocolVersion");
    }

    /* Access methods for optional leaf child: "timeout". */

    /**
     * Gets the value for child leaf "timeout".
     * @return The value of the leaf.
     */
    public YangUInt16 getTimeoutValue() throws JNCException {
        return (YangUInt16)getValue("timeout");
    }

    /**
     * Sets the value for child leaf "timeout",
     * using instance of generated typedef class.
     * @param timeoutValue The value to set.
     * @param timeoutValue used during instantiation.
     */
    public void setTimeoutValue(YangUInt16 timeoutValue) throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "timeout",
            timeoutValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "timeout",
     * using Java primitive values.
     * @param timeoutValue used during instantiation.
     */
    public void setTimeoutValue(int timeoutValue) throws JNCException {
        setTimeoutValue(new YangUInt16(timeoutValue));
    }

    /**
     * Sets the value for child leaf "timeout",
     * using a String value.
     * @param timeoutValue used during instantiation.
     */
    public void setTimeoutValue(String timeoutValue) throws JNCException {
        setTimeoutValue(new YangUInt16(timeoutValue));
    }

    /**
     * Unsets the value for child leaf "timeout".
     */
    public void unsetTimeoutValue() throws JNCException {
        delete("timeout");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "timeout" leaf will not have a value.
     */
    public void addTimeout() throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "timeout",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "timeout" with operation "replace".
     */
    public void markTimeoutReplace() throws JNCException {
        markLeafReplace("timeout");
    }

    /**
     * Marks the leaf "timeout" with operation "merge".
     */
    public void markTimeoutMerge() throws JNCException {
        markLeafMerge("timeout");
    }

    /**
     * Marks the leaf "timeout" with operation "create".
     */
    public void markTimeoutCreate() throws JNCException {
        markLeafCreate("timeout");
    }

    /**
     * Marks the leaf "timeout" with operation "delete".
     */
    public void markTimeoutDelete() throws JNCException {
        markLeafDelete("timeout");
    }

    /* Access methods for optional leaf child: "rate-limit". */

    /**
     * Gets the value for child leaf "rate-limit".
     * @return The value of the leaf.
     */
    public YangUInt16 getRateLimitValue() throws JNCException {
        return (YangUInt16)getValue("rate-limit");
    }

    /**
     * Sets the value for child leaf "rate-limit",
     * using instance of generated typedef class.
     * @param rateLimitValue The value to set.
     * @param rateLimitValue used during instantiation.
     */
    public void setRateLimitValue(YangUInt16 rateLimitValue)
            throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "rate-limit",
            rateLimitValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "rate-limit",
     * using Java primitive values.
     * @param rateLimitValue used during instantiation.
     */
    public void setRateLimitValue(int rateLimitValue) throws JNCException {
        setRateLimitValue(new YangUInt16(rateLimitValue));
    }

    /**
     * Sets the value for child leaf "rate-limit",
     * using a String value.
     * @param rateLimitValue used during instantiation.
     */
    public void setRateLimitValue(String rateLimitValue) throws JNCException {
        setRateLimitValue(new YangUInt16(rateLimitValue));
    }

    /**
     * Unsets the value for child leaf "rate-limit".
     */
    public void unsetRateLimitValue() throws JNCException {
        delete("rate-limit");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "rate-limit" leaf will not have a value.
     */
    public void addRateLimit() throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "rate-limit",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "rate-limit" with operation "replace".
     */
    public void markRateLimitReplace() throws JNCException {
        markLeafReplace("rateLimit");
    }

    /**
     * Marks the leaf "rate-limit" with operation "merge".
     */
    public void markRateLimitMerge() throws JNCException {
        markLeafMerge("rateLimit");
    }

    /**
     * Marks the leaf "rate-limit" with operation "create".
     */
    public void markRateLimitCreate() throws JNCException {
        markLeafCreate("rateLimit");
    }

    /**
     * Marks the leaf "rate-limit" with operation "delete".
     */
    public void markRateLimitDelete() throws JNCException {
        markLeafDelete("rateLimit");
    }

    /* Access methods for optional leaf child: "session-limit". */

    /**
     * Gets the value for child leaf "session-limit".
     * @return The value of the leaf.
     */
    public YangUInt16 getSessionLimitValue() throws JNCException {
        return (YangUInt16)getValue("session-limit");
    }

    /**
     * Sets the value for child leaf "session-limit",
     * using instance of generated typedef class.
     * @param sessionLimitValue The value to set.
     * @param sessionLimitValue used during instantiation.
     */
    public void setSessionLimitValue(YangUInt16 sessionLimitValue)
            throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "session-limit",
            sessionLimitValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "session-limit",
     * using Java primitive values.
     * @param sessionLimitValue used during instantiation.
     */
    public void setSessionLimitValue(int sessionLimitValue) throws JNCException {
        setSessionLimitValue(new YangUInt16(sessionLimitValue));
    }

    /**
     * Sets the value for child leaf "session-limit",
     * using a String value.
     * @param sessionLimitValue used during instantiation.
     */
    public void setSessionLimitValue(String sessionLimitValue)
            throws JNCException {
        setSessionLimitValue(new YangUInt16(sessionLimitValue));
    }

    /**
     * Unsets the value for child leaf "session-limit".
     */
    public void unsetSessionLimitValue() throws JNCException {
        delete("session-limit");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "session-limit" leaf will not have a value.
     */
    public void addSessionLimit() throws JNCException {
        setLeafValue(OcSysTerm.NAMESPACE,
            "session-limit",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "session-limit" with operation "replace".
     */
    public void markSessionLimitReplace() throws JNCException {
        markLeafReplace("sessionLimit");
    }

    /**
     * Marks the leaf "session-limit" with operation "merge".
     */
    public void markSessionLimitMerge() throws JNCException {
        markLeafMerge("sessionLimit");
    }

    /**
     * Marks the leaf "session-limit" with operation "create".
     */
    public void markSessionLimitCreate() throws JNCException {
        markLeafCreate("sessionLimit");
    }

    /**
     * Marks the leaf "session-limit" with operation "delete".
     */
    public void markSessionLimitDelete() throws JNCException {
        markLeafDelete("sessionLimit");
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
