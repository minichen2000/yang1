/* 
 * @(#)Config.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.alarmNotification.update.system.dns;

import com.nokia.eml.yang.openconfigInetTypes.DomainName;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementLeafListValueIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/alarmNotification/update/system/dns/config"
 * <p>
 * See line 425 in
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
            "search",
        };
    }

    /* Access methods for optional leaf-list child: "search". */

    /**
     * Iterator method for the leaf-list "search".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator searchIterator() {
        return new ElementLeafListValueIterator(children, "search");
    }

    /**
     * Sets the value for child leaf-list "search",
     * using a JNC type value.
     * @param searchValue The value to set.
     * @param searchValue used during instantiation.
     */
    public void setSearchValue(DomainName searchValue) throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "search",
            searchValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "search",
     * using a String value.
     * @param searchValue used during instantiation.
     */
    public void setSearchValue(String searchValue) throws JNCException {
        setSearchValue(new DomainName(searchValue));
    }

    /**
     * Deletes leaf-list entry "search".
     * @param searchValue Value to delete.
     */
    public void deleteSearch(DomainName searchValue) throws JNCException {
        String path = "search[searchValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "search".
     * The value is specified as a string.
     * @param searchValue Value to delete.
     */
    public void deleteSearch(String searchValue) throws JNCException {
        String path = "search[searchValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "search" leaf-list will not have a value.
     */
    public void addSearch() throws JNCException {
        setLeafListValue(OcSys.NAMESPACE,
            "search",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "search" with operation "replace".
     * @param searchValue The value to mark
     */
    public void markSearchReplace(DomainName searchValue) throws JNCException {
        markLeafReplace("search[name='" + searchValue + "']");
    }

    /**
     * Marks the leaf-list "search" with operation "merge".
     * @param searchValue The value to mark
     */
    public void markSearchMerge(DomainName searchValue) throws JNCException {
        markLeafMerge("search[name='" + searchValue + "']");
    }

    /**
     * Marks the leaf-list "search" with operation "create".
     * @param searchValue The value to mark
     */
    public void markSearchCreate(DomainName searchValue) throws JNCException {
        markLeafCreate("search[name='" + searchValue + "']");
    }

    /**
     * Marks the leaf-list "search" with operation "delete".
     * @param searchValue The value to mark
     */
    public void markSearchDelete(DomainName searchValue) throws JNCException {
        markLeafDelete("search[name='" + searchValue + "']");
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
