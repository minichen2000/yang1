/* 
 * @(#)Otn.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-terminal-device", revision: "2017-07-08".
 */

package com.nokia.eml.yang.openconfigTerminalDevice.terminalDevice.logicalChannels.channel;

import com.nokia.eml.yang.openconfigTerminalDevice.OcOptTerm;
import com.nokia.eml.yang.openconfigTerminalDevice.terminalDevice.logicalChannels.channel.otn.Config;
import com.nokia.eml.yang.openconfigTerminalDevice.terminalDevice.logicalChannels.channel.otn.State;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/terminal-device
 * generated to "src/com/nokia/eml/yang/openconfigTerminalDevice/terminalDevice/logicalChannels/channel/otn"
 * <p>
 * See line 325 in
 * /root/nokia-yang/optical-transport/openconfig-terminal-device.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Otn extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "config".
     */
    public Config config = null;

    /**
     * Field for child container "state".
     */
    public State state = null;

    /**
     * Constructor for an empty Otn object.
     */
    public Otn() {
        super(OcOptTerm.NAMESPACE, "otn");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Otn clone() {
        return (Otn)cloneContent(new Otn());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Otn cloneShallow() {
        return (Otn)cloneShallowContent(new Otn());
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
            "config",
            "state",
        };
    }

    /* Access methods for container child: "config". */

    /**
     * Adds container entry "config", using an existing object.
     * @param config The object to add.
     * @return The added child.
     */
    public Config addConfig(Config config) throws JNCException {
        this.config = config;
        insertChild(config, childrenNames());
        return config;
    }

    /**
     * Adds container entry "config".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Config addConfig() throws JNCException {
        Config config = new Config();
        this.config = config;
        insertChild(config, childrenNames());
        return config;
    }

    /**
     * Deletes container entry "config".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteConfig() throws JNCException {
        this.config = null;
        String path = "config";
        return delete(path);
    }

    /* Access methods for container child: "state". */

    /**
     * Adds container entry "state", using an existing object.
     * @param state The object to add.
     * @return The added child.
     */
    public State addState(State state) throws JNCException {
        this.state = state;
        insertChild(state, childrenNames());
        return state;
    }

    /**
     * Adds container entry "state".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public State addState() throws JNCException {
        State state = new State();
        this.state = state;
        insertChild(state, childrenNames());
        return state;
    }

    /**
     * Deletes container entry "state".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteState() throws JNCException {
        this.state = null;
        String path = "state";
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
        if (child instanceof Config) config = (Config)child;
        else if (child instanceof State) state = (State)child;
    }

}
