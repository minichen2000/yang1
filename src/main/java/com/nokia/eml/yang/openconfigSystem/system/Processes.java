/* 
 * @(#)Processes.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system;

import com.nokia.eml.yang.openconfigProcmon.OcProc;
import com.nokia.eml.yang.openconfigSystem.system.processes.Process;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/processes"
 * <p>
 * See line 55 in
 * /root/nokia-yang/system/openconfig-procmon.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Processes extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Processes object.
     */
    public Processes() {
        super(OcProc.NAMESPACE, "processes");
        setDefaultPrefix();
        setPrefix(OcProc.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Processes clone() {
        return (Processes)cloneContent(new Processes());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Processes cloneShallow() {
        return (Processes)cloneShallowContent(new Processes());
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
            "process",
        };
    }

    /* Access methods for list child: "process". */

    /**
     * Gets list entry "process", with specified keys.
     */
    public Process getProcess() throws JNCException {
        String path = "process";
        return (Process)searchOne(path);
    }

    /**
     * Iterator method for the list "process".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator processIterator() {
        return new ElementChildrenIterator(children, "process");
    }

    /**
     * Adds list entry "process", using an existing object.
     * @param process The object to add.
     * @return The added child.
     */
    public Process addProcess(Process process) throws JNCException {
        insertChild(process, childrenNames());
        return process;
    }

    /**
     * Adds list entry "process".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Process addProcess() throws JNCException {
        Process process = new Process();
        insertChild(process, childrenNames());
        return process;
    }

    /**
     * Deletes list entry "process", with specified keys.
     */
    public void deleteProcess() throws JNCException {
        String path = "process";
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