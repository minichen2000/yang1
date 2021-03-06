/* 
 * @(#)OperationalModes.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice;

import com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice.operationalModes.Mode;
import com.nokia.eml.yang.openconfigTerminalDevice.OcOptTerm;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/terminalDeviceNotification/update/terminalDevice/operational-modes"
 * <p>
 * See line 1033 in
 * /root/nokia-yang/optical-transport/openconfig-terminal-device.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class OperationalModes extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty OperationalModes object.
     */
    public OperationalModes() {
        super(OcOptTerm.NAMESPACE, "operational-modes");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public OperationalModes clone() {
        return (OperationalModes)cloneContent(new OperationalModes());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public OperationalModes cloneShallow() {
        return (OperationalModes)cloneShallowContent(new OperationalModes());
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
            "mode",
        };
    }

    /* Access methods for list child: "mode". */

    /**
     * Gets list entry "mode", with specified keys.
     */
    public Mode getMode() throws JNCException {
        String path = "mode";
        return (Mode)searchOne(path);
    }

    /**
     * Iterator method for the list "mode".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator modeIterator() {
        return new ElementChildrenIterator(children, "mode");
    }

    /**
     * Adds list entry "mode", using an existing object.
     * @param mode The object to add.
     * @return The added child.
     */
    public Mode addMode(Mode mode) throws JNCException {
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Adds list entry "mode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mode addMode() throws JNCException {
        Mode mode = new Mode();
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Deletes list entry "mode", with specified keys.
     */
    public void deleteMode() throws JNCException {
        String path = "mode";
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
