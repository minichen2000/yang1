/* 
 * @(#)HostEntries.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.alarmNotification.update.system.dns;

import com.nokia.eml.yang.openconfigNotificaions.alarmNotification.update.system.dns.hostEntries.HostEntry;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/alarmNotification/update/system/dns/host-entries"
 * <p>
 * See line 315 in
 * /root/nokia-yang/system/openconfig-system.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class HostEntries extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty HostEntries object.
     */
    public HostEntries() {
        super(OcSys.NAMESPACE, "host-entries");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HostEntries clone() {
        return (HostEntries)cloneContent(new HostEntries());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HostEntries cloneShallow() {
        return (HostEntries)cloneShallowContent(new HostEntries());
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
            "host-entry",
        };
    }

    /* Access methods for list child: "host-entry". */

    /**
     * Gets list entry "hostEntry", with specified keys.
     */
    public HostEntry getHostEntry() throws JNCException {
        String path = "host-entry";
        return (HostEntry)searchOne(path);
    }

    /**
     * Iterator method for the list "host-entry".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator hostEntryIterator() {
        return new ElementChildrenIterator(children, "host-entry");
    }

    /**
     * Adds list entry "hostEntry", using an existing object.
     * @param hostEntry The object to add.
     * @return The added child.
     */
    public HostEntry addHostEntry(HostEntry hostEntry) throws JNCException {
        insertChild(hostEntry, childrenNames());
        return hostEntry;
    }

    /**
     * Adds list entry "hostEntry".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HostEntry addHostEntry() throws JNCException {
        HostEntry hostEntry = new HostEntry();
        insertChild(hostEntry, childrenNames());
        return hostEntry;
    }

    /**
     * Deletes list entry "hostEntry", with specified keys.
     */
    public void deleteHostEntry() throws JNCException {
        String path = "host-entry";
        delete(path);
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
