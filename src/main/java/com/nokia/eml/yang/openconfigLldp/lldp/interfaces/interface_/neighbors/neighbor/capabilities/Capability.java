/* 
 * @(#)Capability.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-lldp", revision: "2016-05-16".
 */

package com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.capabilities;

import com.nokia.eml.yang.openconfigLldp.OcLldp;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.capabilities.capability.Config;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.capabilities.capability.State;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/lldp
 * generated to "src/com/nokia/eml/yang/openconfigLldp/lldp/interfaces/interface_/neighbors/neighbor/capabilities/capability"
 * <p>
 * See line 292 in
 * /root/nokia-yang/lldp/openconfig-lldp.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Capability extends YangElement {

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
     * Constructor for an empty Capability object.
     */
    public Capability() {
        super(OcLldp.NAMESPACE, "capability");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Capability clone() {
        return (Capability)cloneContent(new Capability());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Capability cloneShallow() {
        return (Capability)cloneShallowContent(new Capability());
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
            "name",
            "config",
            "state",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangIdentityref getNameValue() throws JNCException {
        return (YangIdentityref)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangIdentityref nameValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangIdentityref(nameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "name",
            null,
            childrenNames());
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