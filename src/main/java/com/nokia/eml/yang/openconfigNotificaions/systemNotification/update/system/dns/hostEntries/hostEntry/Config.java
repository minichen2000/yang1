/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.dns.hostEntries.hostEntry;

import com.nokia.eml.yang.openconfigInetTypes.Ipv4Address;
import com.nokia.eml.yang.openconfigInetTypes.Ipv6Address;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementLeafListValueIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/systemNotification/update/system/dns/hostEntries/hostEntry/config"
 * <p>
 * See line 332 in
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
            "hostname",
            "alias",
            "ipv4-address",
            "ipv6-address",
        };
    }

    /* Access methods for optional leaf child: "hostname". */

    /**
     * Gets the value for child leaf "hostname".
     * @return The value of the leaf.
     */
    public YangString getHostnameValue() throws JNCException {
        return (YangString)getValue("hostname");
    }

    /**
     * Sets the value for child leaf "hostname",
     * using instance of generated typedef class.
     * @param hostnameValue The value to set.
     * @param hostnameValue used during instantiation.
     */
    public void setHostnameValue(YangString hostnameValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "hostname",
            hostnameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "hostname",
     * using a String value.
     * @param hostnameValue used during instantiation.
     */
    public void setHostnameValue(String hostnameValue) throws JNCException {
        setHostnameValue(new YangString(hostnameValue));
    }

    /**
     * Unsets the value for child leaf "hostname".
     */
    public void unsetHostnameValue() throws JNCException {
        delete("hostname");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "hostname" leaf will not have a value.
     */
    public void addHostname() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "hostname",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "hostname" with operation "replace".
     */
    public void markHostnameReplace() throws JNCException {
        markLeafReplace("hostname");
    }

    /**
     * Marks the leaf "hostname" with operation "merge".
     */
    public void markHostnameMerge() throws JNCException {
        markLeafMerge("hostname");
    }

    /**
     * Marks the leaf "hostname" with operation "create".
     */
    public void markHostnameCreate() throws JNCException {
        markLeafCreate("hostname");
    }

    /**
     * Marks the leaf "hostname" with operation "delete".
     */
    public void markHostnameDelete() throws JNCException {
        markLeafDelete("hostname");
    }

    /* Access methods for optional leaf-list child: "alias". */

    /**
     * Iterator method for the leaf-list "alias".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator aliasIterator() {
        return new ElementLeafListValueIterator(children, "alias");
    }

    /**
     * Sets the value for child leaf-list "alias",
     * using instance of generated typedef class.
     * @param aliasValue The value to set.
     * @param aliasValue used during instantiation.
     */
    public void setAliasValue(YangString aliasValue) throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "alias",
            aliasValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "alias",
     * using a String value.
     * @param aliasValue used during instantiation.
     */
    public void setAliasValue(String aliasValue) throws JNCException {
        setAliasValue(new YangString(aliasValue));
    }

    /**
     * Deletes leaf-list entry "alias".
     * @param aliasValue Value to delete.
     */
    public void deleteAlias(YangString aliasValue) throws JNCException {
        String path = "alias[aliasValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "alias".
     * The value is specified as a string.
     * @param aliasValue Value to delete.
     */
    public void deleteAlias(String aliasValue) throws JNCException {
        String path = "alias[aliasValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "alias" leaf-list will not have a value.
     */
    public void addAlias() throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "alias",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "alias" with operation "replace".
     * @param aliasValue The value to mark
     */
    public void markAliasReplace(YangString aliasValue) throws JNCException {
        markLeafReplace("alias[name='" + aliasValue + "']");
    }

    /**
     * Marks the leaf-list "alias" with operation "merge".
     * @param aliasValue The value to mark
     */
    public void markAliasMerge(YangString aliasValue) throws JNCException {
        markLeafMerge("alias[name='" + aliasValue + "']");
    }

    /**
     * Marks the leaf-list "alias" with operation "create".
     * @param aliasValue The value to mark
     */
    public void markAliasCreate(YangString aliasValue) throws JNCException {
        markLeafCreate("alias[name='" + aliasValue + "']");
    }

    /**
     * Marks the leaf-list "alias" with operation "delete".
     * @param aliasValue The value to mark
     */
    public void markAliasDelete(YangString aliasValue) throws JNCException {
        markLeafDelete("alias[name='" + aliasValue + "']");
    }

    /* Access methods for optional leaf-list child: "ipv4-address". */

    /**
     * Iterator method for the leaf-list "ipv4-address".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator ipv4AddressIterator() {
        return new ElementLeafListValueIterator(children, "ipv4-address");
    }

    /**
     * Sets the value for child leaf-list "ipv4-address",
     * using a JNC type value.
     * @param ipv4AddressValue The value to set.
     * @param ipv4AddressValue used during instantiation.
     */
    public void setIpv4AddressValue(Ipv4Address ipv4AddressValue)
            throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "ipv4-address",
            ipv4AddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "ipv4-address",
     * using a String value.
     * @param ipv4AddressValue used during instantiation.
     */
    public void setIpv4AddressValue(String ipv4AddressValue)
            throws JNCException {
        setIpv4AddressValue(new Ipv4Address(ipv4AddressValue));
    }

    /**
     * Deletes leaf-list entry "ipv4Address".
     * @param ipv4AddressValue Value to delete.
     */
    public void deleteIpv4Address(Ipv4Address ipv4AddressValue)
            throws JNCException {
        String path = "ipv4Address[ipv4AddressValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "ipv4Address".
     * The value is specified as a string.
     * @param ipv4AddressValue Value to delete.
     */
    public void deleteIpv4Address(String ipv4AddressValue) throws JNCException {
        String path = "ipv4Address[ipv4AddressValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ipv4-address" leaf-list will not have a value.
     */
    public void addIpv4Address() throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "ipv4-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "ipv4-address" with operation "replace".
     * @param ipv4AddressValue The value to mark
     */
    public void markIpv4AddressReplace(Ipv4Address ipv4AddressValue)
            throws JNCException {
        markLeafReplace("ipv4Address[name='" + ipv4AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv4-address" with operation "merge".
     * @param ipv4AddressValue The value to mark
     */
    public void markIpv4AddressMerge(Ipv4Address ipv4AddressValue)
            throws JNCException {
        markLeafMerge("ipv4Address[name='" + ipv4AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv4-address" with operation "create".
     * @param ipv4AddressValue The value to mark
     */
    public void markIpv4AddressCreate(Ipv4Address ipv4AddressValue)
            throws JNCException {
        markLeafCreate("ipv4Address[name='" + ipv4AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv4-address" with operation "delete".
     * @param ipv4AddressValue The value to mark
     */
    public void markIpv4AddressDelete(Ipv4Address ipv4AddressValue)
            throws JNCException {
        markLeafDelete("ipv4Address[name='" + ipv4AddressValue + "']");
    }

    /* Access methods for optional leaf-list child: "ipv6-address". */

    /**
     * Iterator method for the leaf-list "ipv6-address".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator ipv6AddressIterator() {
        return new ElementLeafListValueIterator(children, "ipv6-address");
    }

    /**
     * Sets the value for child leaf-list "ipv6-address",
     * using a JNC type value.
     * @param ipv6AddressValue The value to set.
     * @param ipv6AddressValue used during instantiation.
     */
    public void setIpv6AddressValue(Ipv6Address ipv6AddressValue)
            throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "ipv6-address",
            ipv6AddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "ipv6-address",
     * using a String value.
     * @param ipv6AddressValue used during instantiation.
     */
    public void setIpv6AddressValue(String ipv6AddressValue)
            throws JNCException {
        setIpv6AddressValue(new Ipv6Address(ipv6AddressValue));
    }

    /**
     * Deletes leaf-list entry "ipv6Address".
     * @param ipv6AddressValue Value to delete.
     */
    public void deleteIpv6Address(Ipv6Address ipv6AddressValue)
            throws JNCException {
        String path = "ipv6Address[ipv6AddressValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "ipv6Address".
     * The value is specified as a string.
     * @param ipv6AddressValue Value to delete.
     */
    public void deleteIpv6Address(String ipv6AddressValue) throws JNCException {
        String path = "ipv6Address[ipv6AddressValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ipv6-address" leaf-list will not have a value.
     */
    public void addIpv6Address() throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "ipv6-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "ipv6-address" with operation "replace".
     * @param ipv6AddressValue The value to mark
     */
    public void markIpv6AddressReplace(Ipv6Address ipv6AddressValue)
            throws JNCException {
        markLeafReplace("ipv6Address[name='" + ipv6AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv6-address" with operation "merge".
     * @param ipv6AddressValue The value to mark
     */
    public void markIpv6AddressMerge(Ipv6Address ipv6AddressValue)
            throws JNCException {
        markLeafMerge("ipv6Address[name='" + ipv6AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv6-address" with operation "create".
     * @param ipv6AddressValue The value to mark
     */
    public void markIpv6AddressCreate(Ipv6Address ipv6AddressValue)
            throws JNCException {
        markLeafCreate("ipv6Address[name='" + ipv6AddressValue + "']");
    }

    /**
     * Marks the leaf-list "ipv6-address" with operation "delete".
     * @param ipv6AddressValue The value to mark
     */
    public void markIpv6AddressDelete(Ipv6Address ipv6AddressValue)
            throws JNCException {
        markLeafDelete("ipv6Address[name='" + ipv6AddressValue + "']");
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
