/* 
 * @(#)Tlv.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-lldp", revision: "2016-05-16".
 */

package com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.customTlvs;

import com.nokia.eml.yang.openconfigLldp.OcLldp;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.customTlvs.tlv.Config;
import com.nokia.eml.yang.openconfigLldp.lldp.interfaces.interface_.neighbors.neighbor.customTlvs.tlv.State;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangInt32;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/lldp
 * generated to "src/com/nokia/eml/yang/openconfigLldp/lldp/interfaces/interface_/neighbors/neighbor/customTlvs/tlv"
 * <p>
 * See line 380 in
 * /root/nokia-yang/lldp/openconfig-lldp.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Tlv extends YangElement {

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
     * Constructor for an empty Tlv object.
     */
    public Tlv() {
        super(OcLldp.NAMESPACE, "tlv");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Tlv clone() {
        return (Tlv)cloneContent(new Tlv());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Tlv cloneShallow() {
        return (Tlv)cloneShallowContent(new Tlv());
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
            "type",
            "oui",
            "oui-subtype",
            "config",
            "state",
        };
    }

    /* Access methods for leaf child: "type". */

    /**
     * Gets the value for child leaf "type".
     * @return The value of the leaf.
     */
    public YangInt32 getTypeValue() throws JNCException {
        return (YangInt32)getValue("type");
    }

    /**
     * Sets the value for child leaf "type",
     * using instance of generated typedef class.
     * @param typeValue The value to set.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(YangInt32 typeValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "type",
            typeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "type",
     * using Java primitive values.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(int typeValue) throws JNCException {
        setTypeValue(new YangInt32(typeValue));
    }

    /**
     * Sets the value for child leaf "type",
     * using a String value.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(String typeValue) throws JNCException {
        setTypeValue(new YangInt32(typeValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "type" leaf will not have a value.
     */
    public void addType() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "type",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "oui". */

    /**
     * Gets the value for child leaf "oui".
     * @return The value of the leaf.
     */
    public YangString getOuiValue() throws JNCException {
        return (YangString)getValue("oui");
    }

    /**
     * Sets the value for child leaf "oui",
     * using instance of generated typedef class.
     * @param ouiValue The value to set.
     * @param ouiValue used during instantiation.
     */
    public void setOuiValue(YangString ouiValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "oui",
            ouiValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "oui",
     * using a String value.
     * @param ouiValue used during instantiation.
     */
    public void setOuiValue(String ouiValue) throws JNCException {
        setOuiValue(new YangString(ouiValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "oui" leaf will not have a value.
     */
    public void addOui() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "oui",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "oui-subtype". */

    /**
     * Gets the value for child leaf "oui-subtype".
     * @return The value of the leaf.
     */
    public YangString getOuiSubtypeValue() throws JNCException {
        return (YangString)getValue("oui-subtype");
    }

    /**
     * Sets the value for child leaf "oui-subtype",
     * using instance of generated typedef class.
     * @param ouiSubtypeValue The value to set.
     * @param ouiSubtypeValue used during instantiation.
     */
    public void setOuiSubtypeValue(YangString ouiSubtypeValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "oui-subtype",
            ouiSubtypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "oui-subtype",
     * using a String value.
     * @param ouiSubtypeValue used during instantiation.
     */
    public void setOuiSubtypeValue(String ouiSubtypeValue) throws JNCException {
        setOuiSubtypeValue(new YangString(ouiSubtypeValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "oui-subtype" leaf will not have a value.
     */
    public void addOuiSubtype() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "oui-subtype",
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