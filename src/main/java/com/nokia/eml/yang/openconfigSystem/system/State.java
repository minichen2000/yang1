/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system;

import com.nokia.eml.yang.openconfigInetTypes.DomainName;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.nokia.eml.yang.openconfigTypes.Timeticks64;
import com.nokia.eml.yang.openconfigYangTypes.DateAndTime;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/state"
 * <p>
 * See line 962 in
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
            "hostname",
            "domain-name",
            "login-banner",
            "motd-banner",
            "current-datetime",
            "boot-time",
        };
    }

    /* Access methods for optional leaf child: "hostname". */

    /**
     * Gets the value for child leaf "hostname".
     * @return The value of the leaf.
     */
    public DomainName getHostnameValue() throws JNCException {
        return (DomainName)getValue("hostname");
    }

    /**
     * Sets the value for child leaf "hostname",
     * using a JNC type value.
     * @param hostnameValue The value to set.
     * @param hostnameValue used during instantiation.
     */
    public void setHostnameValue(DomainName hostnameValue) throws JNCException {
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
        setHostnameValue(new DomainName(hostnameValue));
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

    /* Access methods for optional leaf child: "domain-name". */

    /**
     * Gets the value for child leaf "domain-name".
     * @return The value of the leaf.
     */
    public DomainName getDomainNameValue() throws JNCException {
        return (DomainName)getValue("domain-name");
    }

    /**
     * Sets the value for child leaf "domain-name",
     * using a JNC type value.
     * @param domainNameValue The value to set.
     * @param domainNameValue used during instantiation.
     */
    public void setDomainNameValue(DomainName domainNameValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "domain-name",
            domainNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "domain-name",
     * using a String value.
     * @param domainNameValue used during instantiation.
     */
    public void setDomainNameValue(String domainNameValue) throws JNCException {
        setDomainNameValue(new DomainName(domainNameValue));
    }

    /**
     * Unsets the value for child leaf "domain-name".
     */
    public void unsetDomainNameValue() throws JNCException {
        delete("domain-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "domain-name" leaf will not have a value.
     */
    public void addDomainName() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "domain-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "domain-name" with operation "replace".
     */
    public void markDomainNameReplace() throws JNCException {
        markLeafReplace("domainName");
    }

    /**
     * Marks the leaf "domain-name" with operation "merge".
     */
    public void markDomainNameMerge() throws JNCException {
        markLeafMerge("domainName");
    }

    /**
     * Marks the leaf "domain-name" with operation "create".
     */
    public void markDomainNameCreate() throws JNCException {
        markLeafCreate("domainName");
    }

    /**
     * Marks the leaf "domain-name" with operation "delete".
     */
    public void markDomainNameDelete() throws JNCException {
        markLeafDelete("domainName");
    }

    /* Access methods for optional leaf child: "login-banner". */

    /**
     * Gets the value for child leaf "login-banner".
     * @return The value of the leaf.
     */
    public YangString getLoginBannerValue() throws JNCException {
        return (YangString)getValue("login-banner");
    }

    /**
     * Sets the value for child leaf "login-banner",
     * using instance of generated typedef class.
     * @param loginBannerValue The value to set.
     * @param loginBannerValue used during instantiation.
     */
    public void setLoginBannerValue(YangString loginBannerValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "login-banner",
            loginBannerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "login-banner",
     * using a String value.
     * @param loginBannerValue used during instantiation.
     */
    public void setLoginBannerValue(String loginBannerValue)
            throws JNCException {
        setLoginBannerValue(new YangString(loginBannerValue));
    }

    /**
     * Unsets the value for child leaf "login-banner".
     */
    public void unsetLoginBannerValue() throws JNCException {
        delete("login-banner");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "login-banner" leaf will not have a value.
     */
    public void addLoginBanner() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "login-banner",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "login-banner" with operation "replace".
     */
    public void markLoginBannerReplace() throws JNCException {
        markLeafReplace("loginBanner");
    }

    /**
     * Marks the leaf "login-banner" with operation "merge".
     */
    public void markLoginBannerMerge() throws JNCException {
        markLeafMerge("loginBanner");
    }

    /**
     * Marks the leaf "login-banner" with operation "create".
     */
    public void markLoginBannerCreate() throws JNCException {
        markLeafCreate("loginBanner");
    }

    /**
     * Marks the leaf "login-banner" with operation "delete".
     */
    public void markLoginBannerDelete() throws JNCException {
        markLeafDelete("loginBanner");
    }

    /* Access methods for optional leaf child: "motd-banner". */

    /**
     * Gets the value for child leaf "motd-banner".
     * @return The value of the leaf.
     */
    public YangString getMotdBannerValue() throws JNCException {
        return (YangString)getValue("motd-banner");
    }

    /**
     * Sets the value for child leaf "motd-banner",
     * using instance of generated typedef class.
     * @param motdBannerValue The value to set.
     * @param motdBannerValue used during instantiation.
     */
    public void setMotdBannerValue(YangString motdBannerValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "motd-banner",
            motdBannerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "motd-banner",
     * using a String value.
     * @param motdBannerValue used during instantiation.
     */
    public void setMotdBannerValue(String motdBannerValue) throws JNCException {
        setMotdBannerValue(new YangString(motdBannerValue));
    }

    /**
     * Unsets the value for child leaf "motd-banner".
     */
    public void unsetMotdBannerValue() throws JNCException {
        delete("motd-banner");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "motd-banner" leaf will not have a value.
     */
    public void addMotdBanner() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "motd-banner",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "motd-banner" with operation "replace".
     */
    public void markMotdBannerReplace() throws JNCException {
        markLeafReplace("motdBanner");
    }

    /**
     * Marks the leaf "motd-banner" with operation "merge".
     */
    public void markMotdBannerMerge() throws JNCException {
        markLeafMerge("motdBanner");
    }

    /**
     * Marks the leaf "motd-banner" with operation "create".
     */
    public void markMotdBannerCreate() throws JNCException {
        markLeafCreate("motdBanner");
    }

    /**
     * Marks the leaf "motd-banner" with operation "delete".
     */
    public void markMotdBannerDelete() throws JNCException {
        markLeafDelete("motdBanner");
    }

    /* Access methods for optional leaf child: "current-datetime". */

    /**
     * Gets the value for child leaf "current-datetime".
     * @return The value of the leaf.
     */
    public DateAndTime getCurrentDatetimeValue() throws JNCException {
        return (DateAndTime)getValue("current-datetime");
    }

    /**
     * Sets the value for child leaf "current-datetime",
     * using a JNC type value.
     * @param currentDatetimeValue The value to set.
     * @param currentDatetimeValue used during instantiation.
     */
    public void setCurrentDatetimeValue(DateAndTime currentDatetimeValue)
            throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "current-datetime",
            currentDatetimeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "current-datetime",
     * using a String value.
     * @param currentDatetimeValue used during instantiation.
     */
    public void setCurrentDatetimeValue(String currentDatetimeValue)
            throws JNCException {
        setCurrentDatetimeValue(new DateAndTime(currentDatetimeValue));
    }

    /**
     * Unsets the value for child leaf "current-datetime".
     */
    public void unsetCurrentDatetimeValue() throws JNCException {
        delete("current-datetime");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "current-datetime" leaf will not have a value.
     */
    public void addCurrentDatetime() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "current-datetime",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "current-datetime" with operation "replace".
     */
    public void markCurrentDatetimeReplace() throws JNCException {
        markLeafReplace("currentDatetime");
    }

    /**
     * Marks the leaf "current-datetime" with operation "merge".
     */
    public void markCurrentDatetimeMerge() throws JNCException {
        markLeafMerge("currentDatetime");
    }

    /**
     * Marks the leaf "current-datetime" with operation "create".
     */
    public void markCurrentDatetimeCreate() throws JNCException {
        markLeafCreate("currentDatetime");
    }

    /**
     * Marks the leaf "current-datetime" with operation "delete".
     */
    public void markCurrentDatetimeDelete() throws JNCException {
        markLeafDelete("currentDatetime");
    }

    /* Access methods for optional leaf child: "boot-time". */

    /**
     * Gets the value for child leaf "boot-time".
     * @return The value of the leaf.
     */
    public Timeticks64 getBootTimeValue() throws JNCException {
        return (Timeticks64)getValue("boot-time");
    }

    /**
     * Sets the value for child leaf "boot-time",
     * using a JNC type value.
     * @param bootTimeValue The value to set.
     * @param bootTimeValue used during instantiation.
     */
    public void setBootTimeValue(Timeticks64 bootTimeValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "boot-time",
            bootTimeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "boot-time",
     * using Java primitive values.
     * @param bootTimeValue used during instantiation.
     */
    public void setBootTimeValue(BigInteger bootTimeValue) throws JNCException {
        setBootTimeValue(new Timeticks64(bootTimeValue));
    }

    /**
     * Sets the value for child leaf "boot-time",
     * using a String value.
     * @param bootTimeValue used during instantiation.
     */
    public void setBootTimeValue(String bootTimeValue) throws JNCException {
        setBootTimeValue(new Timeticks64(bootTimeValue));
    }

    /**
     * Unsets the value for child leaf "boot-time".
     */
    public void unsetBootTimeValue() throws JNCException {
        delete("boot-time");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "boot-time" leaf will not have a value.
     */
    public void addBootTime() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "boot-time",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "boot-time" with operation "replace".
     */
    public void markBootTimeReplace() throws JNCException {
        markLeafReplace("bootTime");
    }

    /**
     * Marks the leaf "boot-time" with operation "merge".
     */
    public void markBootTimeMerge() throws JNCException {
        markLeafMerge("bootTime");
    }

    /**
     * Marks the leaf "boot-time" with operation "create".
     */
    public void markBootTimeCreate() throws JNCException {
        markLeafCreate("bootTime");
    }

    /**
     * Marks the leaf "boot-time" with operation "delete".
     */
    public void markBootTimeDelete() throws JNCException {
        markLeafDelete("bootTime");
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
