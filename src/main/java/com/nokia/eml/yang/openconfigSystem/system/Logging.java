/* 
 * @(#)Logging.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system;

import com.nokia.eml.yang.openconfigSystem.system.logging.Console;
import com.nokia.eml.yang.openconfigSystem.system.logging.RemoteServers;
import com.nokia.eml.yang.openconfigSystemLogging.OcLog;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/logging"
 * <p>
 * See line 481 in
 * /root/nokia-yang/system/openconfig-system-logging.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Logging extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "console".
     */
    public Console console = null;

    /**
     * Field for child container "remote-servers".
     */
    public RemoteServers remoteServers = null;

    /**
     * Constructor for an empty Logging object.
     */
    public Logging() {
        super(OcLog.NAMESPACE, "logging");
        setDefaultPrefix();
        setPrefix(OcLog.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Logging clone() {
        return (Logging)cloneContent(new Logging());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Logging cloneShallow() {
        return (Logging)cloneShallowContent(new Logging());
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
            "console",
            "remote-servers",
        };
    }

    /* Access methods for container child: "console". */

    /**
     * Adds container entry "console", using an existing object.
     * @param console The object to add.
     * @return The added child.
     */
    public Console addConsole(Console console) throws JNCException {
        this.console = console;
        insertChild(console, childrenNames());
        return console;
    }

    /**
     * Adds container entry "console".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Console addConsole() throws JNCException {
        Console console = new Console();
        this.console = console;
        insertChild(console, childrenNames());
        return console;
    }

    /**
     * Deletes container entry "console".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteConsole() throws JNCException {
        this.console = null;
        String path = "console";
        return delete(path);
    }

    /* Access methods for container child: "remote-servers". */

    /**
     * Adds container entry "remoteServers", using an existing object.
     * @param remoteServers The object to add.
     * @return The added child.
     */
    public RemoteServers addRemoteServers(RemoteServers remoteServers)
            throws JNCException {
        this.remoteServers = remoteServers;
        insertChild(remoteServers, childrenNames());
        return remoteServers;
    }

    /**
     * Adds container entry "remoteServers".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RemoteServers addRemoteServers() throws JNCException {
        RemoteServers remoteServers = new RemoteServers();
        this.remoteServers = remoteServers;
        insertChild(remoteServers, childrenNames());
        return remoteServers;
    }

    /**
     * Deletes container entry "remoteServers".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRemoteServers() throws JNCException {
        this.remoteServers = null;
        String path = "remote-servers";
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
        if (child instanceof Console) console = (Console)child;
        else if (child instanceof RemoteServers) remoteServers = (RemoteServers)child;
    }

}
