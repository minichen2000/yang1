/* 
 * @(#)Neighbor.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-lldp", revision: "2016-05-16".
 */

package com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors;

import com.nokia.eml.yang.openconfigLldp.OcLldp;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.Capabilities;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.Config;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.CustomTlvs;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.State;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/lldp
 * generated to "src/com/nokia/eml/yang/openconfigLldp/lldp/interfaces/interface_/neighbors/neighbor"
 * <p>
 * See line 440 in
 * /root/nokia-yang/lldp/openconfig-lldp.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Neighbor extends YangElement {

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
     * Field for child container "custom-tlvs".
     */
    public CustomTlvs customTlvs = null;

    /**
     * Field for child container "capabilities".
     */
    public Capabilities capabilities = null;

    /**
     * Constructor for an empty Neighbor object.
     */
    public Neighbor() {
        super(OcLldp.NAMESPACE, "neighbor");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Neighbor clone() {
        return (Neighbor)cloneContent(new Neighbor());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Neighbor cloneShallow() {
        return (Neighbor)cloneShallowContent(new Neighbor());
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
            "id",
            "config",
            "state",
            "custom-tlvs",
            "capabilities",
        };
    }

    /* Access methods for leaf child: "id". */

    /**
     * Gets the value for child leaf "id".
     * @return The value of the leaf.
     */
    public YangString getIdValue() throws JNCException {
        return (YangString)getValue("id");
    }

    /**
     * Sets the value for child leaf "id",
     * using instance of generated typedef class.
     * @param idValue The value to set.
     * @param idValue used during instantiation.
     */
    public void setIdValue(YangString idValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "id",
            idValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "id",
     * using a String value.
     * @param idValue used during instantiation.
     */
    public void setIdValue(String idValue) throws JNCException {
        setIdValue(new YangString(idValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "id" leaf will not have a value.
     */
    public void addId() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "id",
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

    /* Access methods for container child: "custom-tlvs". */

    /**
     * Adds container entry "customTlvs", using an existing object.
     * @param customTlvs The object to add.
     * @return The added child.
     */
    public CustomTlvs addCustomTlvs(CustomTlvs customTlvs) throws JNCException {
        this.customTlvs = customTlvs;
        insertChild(customTlvs, childrenNames());
        return customTlvs;
    }

    /**
     * Adds container entry "customTlvs".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public CustomTlvs addCustomTlvs() throws JNCException {
        CustomTlvs customTlvs = new CustomTlvs();
        this.customTlvs = customTlvs;
        insertChild(customTlvs, childrenNames());
        return customTlvs;
    }

    /**
     * Deletes container entry "customTlvs".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCustomTlvs() throws JNCException {
        this.customTlvs = null;
        String path = "custom-tlvs";
        return delete(path);
    }

    /* Access methods for container child: "capabilities". */

    /**
     * Adds container entry "capabilities", using an existing object.
     * @param capabilities The object to add.
     * @return The added child.
     */
    public Capabilities addCapabilities(Capabilities capabilities)
            throws JNCException {
        this.capabilities = capabilities;
        insertChild(capabilities, childrenNames());
        return capabilities;
    }

    /**
     * Adds container entry "capabilities".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Capabilities addCapabilities() throws JNCException {
        Capabilities capabilities = new Capabilities();
        this.capabilities = capabilities;
        insertChild(capabilities, childrenNames());
        return capabilities;
    }

    /**
     * Deletes container entry "capabilities".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCapabilities() throws JNCException {
        this.capabilities = null;
        String path = "capabilities";
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
        else if (child instanceof CustomTlvs) customTlvs = (CustomTlvs)child;
        else if (child instanceof Capabilities) capabilities = (Capabilities)child;
    }

}
