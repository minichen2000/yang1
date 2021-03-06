/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.alarmNotification.update.system.ntp.servers.server;

import com.nokia.eml.yang.openconfigInetTypes.Host;
import com.nokia.eml.yang.openconfigInetTypes.PortNumber;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEnumeration;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/alarmNotification/update/system/ntp/servers/server/config"
 * <p>
 * See line 611 in
 * /root/nokia-yang/system/openconfig-system.yang
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
        super(OcSys.NAMESPACE, "config");
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
            "address",
            "port",
            "version",
            "association-type",
            "iburst",
            "prefer",
        };
    }

    /* Access methods for optional leaf child: "address". */

    /**
     * Gets the value for child leaf "address".
     * @return The value of the leaf.
     */
    public Host getAddressValue() throws JNCException {
        return (Host)getValue("address");
    }

    /**
     * Sets the value for child leaf "address",
     * using a JNC type value.
     * @param addressValue The value to set.
     * @param addressValue used during instantiation.
     */
    public void setAddressValue(Host addressValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "address",
            addressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "address",
     * using a String value.
     * @param addressValue used during instantiation.
     */
    public void setAddressValue(String addressValue) throws JNCException {
        setAddressValue(new Host(addressValue));
    }

    /**
     * Unsets the value for child leaf "address".
     */
    public void unsetAddressValue() throws JNCException {
        delete("address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "address" leaf will not have a value.
     */
    public void addAddress() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "address" with operation "replace".
     */
    public void markAddressReplace() throws JNCException {
        markLeafReplace("address");
    }

    /**
     * Marks the leaf "address" with operation "merge".
     */
    public void markAddressMerge() throws JNCException {
        markLeafMerge("address");
    }

    /**
     * Marks the leaf "address" with operation "create".
     */
    public void markAddressCreate() throws JNCException {
        markLeafCreate("address");
    }

    /**
     * Marks the leaf "address" with operation "delete".
     */
    public void markAddressDelete() throws JNCException {
        markLeafDelete("address");
    }

    /* Access methods for optional leaf child: "port". */

    /**
     * Gets the value for child leaf "port".
     * @return The value of the leaf.
     */
    public PortNumber getPortValue() throws JNCException {
        PortNumber port = (PortNumber)getValue("port");
        if (port == null) {
            port = new PortNumber("123");  // default
        }
        return port;
    }

    /**
     * Sets the value for child leaf "port",
     * using a JNC type value.
     * @param portValue The value to set.
     * @param portValue used during instantiation.
     */
    public void setPortValue(PortNumber portValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "port",
            portValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port",
     * using Java primitive values.
     * @param portValue used during instantiation.
     */
    public void setPortValue(int portValue) throws JNCException {
        setPortValue(new PortNumber(portValue));
    }

    /**
     * Sets the value for child leaf "port",
     * using a String value.
     * @param portValue used during instantiation.
     */
    public void setPortValue(String portValue) throws JNCException {
        setPortValue(new PortNumber(portValue));
    }

    /**
     * Unsets the value for child leaf "port".
     */
    public void unsetPortValue() throws JNCException {
        delete("port");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port" leaf will not have a value.
     */
    public void addPort() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "port",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port" with operation "replace".
     */
    public void markPortReplace() throws JNCException {
        markLeafReplace("port");
    }

    /**
     * Marks the leaf "port" with operation "merge".
     */
    public void markPortMerge() throws JNCException {
        markLeafMerge("port");
    }

    /**
     * Marks the leaf "port" with operation "create".
     */
    public void markPortCreate() throws JNCException {
        markLeafCreate("port");
    }

    /**
     * Marks the leaf "port" with operation "delete".
     */
    public void markPortDelete() throws JNCException {
        markLeafDelete("port");
    }

    /* Access methods for optional leaf child: "version". */

    /**
     * Gets the value for child leaf "version".
     * @return The value of the leaf.
     */
    public YangUInt8 getVersionValue() throws JNCException {
        YangUInt8 version = (YangUInt8)getValue("version");
        if (version == null) {
            version = new YangUInt8("4");  // default
        }
        return version;
    }

    /**
     * Sets the value for child leaf "version",
     * using instance of generated typedef class.
     * @param versionValue The value to set.
     * @param versionValue used during instantiation.
     */
    public void setVersionValue(YangUInt8 versionValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "version",
            versionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "version",
     * using Java primitive values.
     * @param versionValue used during instantiation.
     */
    public void setVersionValue(short versionValue) throws JNCException {
        setVersionValue(new YangUInt8(versionValue));
    }

    /**
     * Sets the value for child leaf "version",
     * using a String value.
     * @param versionValue used during instantiation.
     */
    public void setVersionValue(String versionValue) throws JNCException {
        setVersionValue(new YangUInt8(versionValue));
    }

    /**
     * Unsets the value for child leaf "version".
     */
    public void unsetVersionValue() throws JNCException {
        delete("version");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "version" leaf will not have a value.
     */
    public void addVersion() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "version",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "version" with operation "replace".
     */
    public void markVersionReplace() throws JNCException {
        markLeafReplace("version");
    }

    /**
     * Marks the leaf "version" with operation "merge".
     */
    public void markVersionMerge() throws JNCException {
        markLeafMerge("version");
    }

    /**
     * Marks the leaf "version" with operation "create".
     */
    public void markVersionCreate() throws JNCException {
        markLeafCreate("version");
    }

    /**
     * Marks the leaf "version" with operation "delete".
     */
    public void markVersionDelete() throws JNCException {
        markLeafDelete("version");
    }

    /* Access methods for optional leaf child: "association-type". */

    /**
     * Gets the value for child leaf "association-type".
     * @return The value of the leaf.
     */
    public YangEnumeration getAssociationTypeValue() throws JNCException {
        YangEnumeration associationType = (YangEnumeration)getValue("association-type");
        if (associationType == null) {
            associationType = new YangEnumeration("SERVER", new String[] {  // default
                "SERVER",
                "PEER",
                "POOL",
            });
        }
        return associationType;
    }

    /**
     * Sets the value for child leaf "association-type",
     * using instance of generated typedef class.
     * @param associationTypeValue The value to set.
     * @param associationTypeValue used during instantiation.
     */
    public void setAssociationTypeValue(YangEnumeration associationTypeValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "association-type",
            associationTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "association-type",
     * using a String value.
     * @param associationTypeValue used during instantiation.
     */
    public void setAssociationTypeValue(String associationTypeValue)
            throws JNCException {
        setAssociationTypeValue(new YangEnumeration(associationTypeValue, new String[] {
             "SERVER",
             "PEER",
             "POOL",
        }));
    }

    /**
     * Unsets the value for child leaf "association-type".
     */
    public void unsetAssociationTypeValue() throws JNCException {
        delete("association-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "association-type" leaf will not have a value.
     */
    public void addAssociationType() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "association-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "association-type" with operation "replace".
     */
    public void markAssociationTypeReplace() throws JNCException {
        markLeafReplace("associationType");
    }

    /**
     * Marks the leaf "association-type" with operation "merge".
     */
    public void markAssociationTypeMerge() throws JNCException {
        markLeafMerge("associationType");
    }

    /**
     * Marks the leaf "association-type" with operation "create".
     */
    public void markAssociationTypeCreate() throws JNCException {
        markLeafCreate("associationType");
    }

    /**
     * Marks the leaf "association-type" with operation "delete".
     */
    public void markAssociationTypeDelete() throws JNCException {
        markLeafDelete("associationType");
    }

    /* Access methods for optional leaf child: "iburst". */

    /**
     * Gets the value for child leaf "iburst".
     * @return The value of the leaf.
     */
    public YangBoolean getIburstValue() throws JNCException {
        YangBoolean iburst = (YangBoolean)getValue("iburst");
        if (iburst == null) {
            iburst = new YangBoolean("false");  // default
        }
        return iburst;
    }

    /**
     * Sets the value for child leaf "iburst",
     * using instance of generated typedef class.
     * @param iburstValue The value to set.
     * @param iburstValue used during instantiation.
     */
    public void setIburstValue(YangBoolean iburstValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "iburst",
            iburstValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "iburst",
     * using Java primitive values.
     * @param iburstValue used during instantiation.
     */
    public void setIburstValue(Boolean iburstValue) throws JNCException {
        setIburstValue(new YangBoolean(iburstValue));
    }

    /**
     * Sets the value for child leaf "iburst",
     * using a String value.
     * @param iburstValue used during instantiation.
     */
    public void setIburstValue(String iburstValue) throws JNCException {
        setIburstValue(new YangBoolean(iburstValue));
    }

    /**
     * Unsets the value for child leaf "iburst".
     */
    public void unsetIburstValue() throws JNCException {
        delete("iburst");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "iburst" leaf will not have a value.
     */
    public void addIburst() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "iburst",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "iburst" with operation "replace".
     */
    public void markIburstReplace() throws JNCException {
        markLeafReplace("iburst");
    }

    /**
     * Marks the leaf "iburst" with operation "merge".
     */
    public void markIburstMerge() throws JNCException {
        markLeafMerge("iburst");
    }

    /**
     * Marks the leaf "iburst" with operation "create".
     */
    public void markIburstCreate() throws JNCException {
        markLeafCreate("iburst");
    }

    /**
     * Marks the leaf "iburst" with operation "delete".
     */
    public void markIburstDelete() throws JNCException {
        markLeafDelete("iburst");
    }

    /* Access methods for optional leaf child: "prefer". */

    /**
     * Gets the value for child leaf "prefer".
     * @return The value of the leaf.
     */
    public YangBoolean getPreferValue() throws JNCException {
        YangBoolean prefer = (YangBoolean)getValue("prefer");
        if (prefer == null) {
            prefer = new YangBoolean("false");  // default
        }
        return prefer;
    }

    /**
     * Sets the value for child leaf "prefer",
     * using instance of generated typedef class.
     * @param preferValue The value to set.
     * @param preferValue used during instantiation.
     */
    public void setPreferValue(YangBoolean preferValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "prefer",
            preferValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "prefer",
     * using Java primitive values.
     * @param preferValue used during instantiation.
     */
    public void setPreferValue(Boolean preferValue) throws JNCException {
        setPreferValue(new YangBoolean(preferValue));
    }

    /**
     * Sets the value for child leaf "prefer",
     * using a String value.
     * @param preferValue used during instantiation.
     */
    public void setPreferValue(String preferValue) throws JNCException {
        setPreferValue(new YangBoolean(preferValue));
    }

    /**
     * Unsets the value for child leaf "prefer".
     */
    public void unsetPreferValue() throws JNCException {
        delete("prefer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "prefer" leaf will not have a value.
     */
    public void addPrefer() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "prefer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "prefer" with operation "replace".
     */
    public void markPreferReplace() throws JNCException {
        markLeafReplace("prefer");
    }

    /**
     * Marks the leaf "prefer" with operation "merge".
     */
    public void markPreferMerge() throws JNCException {
        markLeafMerge("prefer");
    }

    /**
     * Marks the leaf "prefer" with operation "create".
     */
    public void markPreferCreate() throws JNCException {
        markLeafCreate("prefer");
    }

    /**
     * Marks the leaf "prefer" with operation "delete".
     */
    public void markPreferDelete() throws JNCException {
        markLeafDelete("prefer");
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
