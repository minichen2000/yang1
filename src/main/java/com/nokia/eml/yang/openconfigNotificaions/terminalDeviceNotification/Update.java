/* 
 * @(#)Update.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification;

import com.nokia.eml.yang.openconfigNotificaions.OcNotify;
import com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.TerminalDevice;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/terminalDeviceNotification/update"
 * <p>
 * See line 53 in
 * /root/nokia-yang/openconfig-notificaions.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Update extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "terminal-device".
     */
    public TerminalDevice terminalDevice = null;

    /**
     * Constructor for an empty Update object.
     */
    public Update() {
        super(OcNotify.NAMESPACE, "update");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Update clone() {
        return (Update)cloneContent(new Update());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Update cloneShallow() {
        return (Update)cloneShallowContent(new Update());
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
            "terminal-device",
        };
    }

    /* Access methods for container child: "terminal-device". */

    /**
     * Adds container entry "terminalDevice", using an existing object.
     * @param terminalDevice The object to add.
     * @return The added child.
     */
    public TerminalDevice addTerminalDevice(TerminalDevice terminalDevice)
            throws JNCException {
        this.terminalDevice = terminalDevice;
        insertChild(terminalDevice, childrenNames());
        return terminalDevice;
    }

    /**
     * Adds container entry "terminalDevice".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TerminalDevice addTerminalDevice() throws JNCException {
        TerminalDevice terminalDevice = new TerminalDevice();
        this.terminalDevice = terminalDevice;
        insertChild(terminalDevice, childrenNames());
        return terminalDevice;
    }

    /**
     * Deletes container entry "terminalDevice".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTerminalDevice() throws JNCException {
        this.terminalDevice = null;
        String path = "terminal-device";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof TerminalDevice) terminalDevice = (TerminalDevice)child;
    }

}