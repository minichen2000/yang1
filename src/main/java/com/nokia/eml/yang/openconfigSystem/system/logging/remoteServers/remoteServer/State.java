/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system.logging.remoteServers.remoteServer;

import com.nokia.eml.yang.openconfigInetTypes.Host;
import com.nokia.eml.yang.openconfigInetTypes.IpAddress;
import com.nokia.eml.yang.openconfigInetTypes.PortNumber;
import com.nokia.eml.yang.openconfigSystemLogging.OcLog;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/logging/remoteServers/remoteServer/state"
 * <p>
 * See line 462 in
 * /root/nokia-yang/system/openconfig-system-logging.yang
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
        super(OcLog.NAMESPACE, "state");
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
            "host",
            "source-address",
            "remote-port",
        };
    }

    /* Access methods for optional leaf child: "host". */

    /**
     * Gets the value for child leaf "host".
     * @return The value of the leaf.
     */
    public Host getHostValue() throws JNCException {
        return (Host)getValue("host");
    }

    /**
     * Sets the value for child leaf "host",
     * using a JNC type value.
     * @param hostValue The value to set.
     * @param hostValue used during instantiation.
     */
    public void setHostValue(Host hostValue) throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "host",
            hostValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "host",
     * using a String value.
     * @param hostValue used during instantiation.
     */
    public void setHostValue(String hostValue) throws JNCException {
        setHostValue(new Host(hostValue));
    }

    /**
     * Unsets the value for child leaf "host".
     */
    public void unsetHostValue() throws JNCException {
        delete("host");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "host" leaf will not have a value.
     */
    public void addHost() throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "host",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "host" with operation "replace".
     */
    public void markHostReplace() throws JNCException {
        markLeafReplace("host");
    }

    /**
     * Marks the leaf "host" with operation "merge".
     */
    public void markHostMerge() throws JNCException {
        markLeafMerge("host");
    }

    /**
     * Marks the leaf "host" with operation "create".
     */
    public void markHostCreate() throws JNCException {
        markLeafCreate("host");
    }

    /**
     * Marks the leaf "host" with operation "delete".
     */
    public void markHostDelete() throws JNCException {
        markLeafDelete("host");
    }

    /* Access methods for optional leaf child: "source-address". */

    /**
     * Gets the value for child leaf "source-address".
     * @return The value of the leaf.
     */
    public IpAddress getSourceAddressValue() throws JNCException {
        return (IpAddress)getValue("source-address");
    }

    /**
     * Sets the value for child leaf "source-address",
     * using a JNC type value.
     * @param sourceAddressValue The value to set.
     * @param sourceAddressValue used during instantiation.
     */
    public void setSourceAddressValue(IpAddress sourceAddressValue)
            throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "source-address",
            sourceAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "source-address",
     * using a String value.
     * @param sourceAddressValue used during instantiation.
     */
    public void setSourceAddressValue(String sourceAddressValue)
            throws JNCException {
        setSourceAddressValue(new IpAddress(sourceAddressValue));
    }

    /**
     * Unsets the value for child leaf "source-address".
     */
    public void unsetSourceAddressValue() throws JNCException {
        delete("source-address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "source-address" leaf will not have a value.
     */
    public void addSourceAddress() throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "source-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "source-address" with operation "replace".
     */
    public void markSourceAddressReplace() throws JNCException {
        markLeafReplace("sourceAddress");
    }

    /**
     * Marks the leaf "source-address" with operation "merge".
     */
    public void markSourceAddressMerge() throws JNCException {
        markLeafMerge("sourceAddress");
    }

    /**
     * Marks the leaf "source-address" with operation "create".
     */
    public void markSourceAddressCreate() throws JNCException {
        markLeafCreate("sourceAddress");
    }

    /**
     * Marks the leaf "source-address" with operation "delete".
     */
    public void markSourceAddressDelete() throws JNCException {
        markLeafDelete("sourceAddress");
    }

    /* Access methods for optional leaf child: "remote-port". */

    /**
     * Gets the value for child leaf "remote-port".
     * @return The value of the leaf.
     */
    public PortNumber getRemotePortValue() throws JNCException {
        PortNumber remotePort = (PortNumber)getValue("remote-port");
        if (remotePort == null) {
            remotePort = new PortNumber("514");  // default
        }
        return remotePort;
    }

    /**
     * Sets the value for child leaf "remote-port",
     * using a JNC type value.
     * @param remotePortValue The value to set.
     * @param remotePortValue used during instantiation.
     */
    public void setRemotePortValue(PortNumber remotePortValue)
            throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "remote-port",
            remotePortValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "remote-port",
     * using Java primitive values.
     * @param remotePortValue used during instantiation.
     */
    public void setRemotePortValue(int remotePortValue) throws JNCException {
        setRemotePortValue(new PortNumber(remotePortValue));
    }

    /**
     * Sets the value for child leaf "remote-port",
     * using a String value.
     * @param remotePortValue used during instantiation.
     */
    public void setRemotePortValue(String remotePortValue) throws JNCException {
        setRemotePortValue(new PortNumber(remotePortValue));
    }

    /**
     * Unsets the value for child leaf "remote-port".
     */
    public void unsetRemotePortValue() throws JNCException {
        delete("remote-port");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "remote-port" leaf will not have a value.
     */
    public void addRemotePort() throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "remote-port",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "remote-port" with operation "replace".
     */
    public void markRemotePortReplace() throws JNCException {
        markLeafReplace("remotePort");
    }

    /**
     * Marks the leaf "remote-port" with operation "merge".
     */
    public void markRemotePortMerge() throws JNCException {
        markLeafMerge("remotePort");
    }

    /**
     * Marks the leaf "remote-port" with operation "create".
     */
    public void markRemotePortCreate() throws JNCException {
        markLeafCreate("remotePort");
    }

    /**
     * Marks the leaf "remote-port" with operation "delete".
     */
    public void markRemotePortDelete() throws JNCException {
        markLeafDelete("remotePort");
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
