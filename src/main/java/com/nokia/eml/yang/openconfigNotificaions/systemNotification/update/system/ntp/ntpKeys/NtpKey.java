/* 
 * @(#)NtpKey.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.ntp.ntpKeys;

import com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.ntp.ntpKeys.ntpKey.Config;
import com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.ntp.ntpKeys.ntpKey.State;
import com.nokia.eml.yang.openconfigSystem.OcSys;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/systemNotification/update/system/ntp/ntpKeys/ntp-key"
 * <p>
 * See line 673 in
 * /root/nokia-yang/system/openconfig-system.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class NtpKey extends YangElement {

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
     * Constructor for an empty NtpKey object.
     */
    public NtpKey() {
        super(OcSys.NAMESPACE, "ntp-key");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public NtpKey clone() {
        return (NtpKey)cloneContent(new NtpKey());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public NtpKey cloneShallow() {
        return (NtpKey)cloneShallowContent(new NtpKey());
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
            "key-id",
            "config",
            "state",
        };
    }

    /* Access methods for leaf child: "key-id". */

    /**
     * Gets the value for child leaf "key-id".
     * @return The value of the leaf.
     */
    public YangUInt16 getKeyIdValue() throws JNCException {
        return (YangUInt16)getValue("key-id");
    }

    /**
     * Sets the value for child leaf "key-id",
     * using instance of generated typedef class.
     * @param keyIdValue The value to set.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(YangUInt16 keyIdValue) throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-id",
            keyIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "key-id",
     * using Java primitive values.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(int keyIdValue) throws JNCException {
        setKeyIdValue(new YangUInt16(keyIdValue));
    }

    /**
     * Sets the value for child leaf "key-id",
     * using a String value.
     * @param keyIdValue used during instantiation.
     */
    public void setKeyIdValue(String keyIdValue) throws JNCException {
        setKeyIdValue(new YangUInt16(keyIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "key-id" leaf will not have a value.
     */
    public void addKeyId() throws JNCException {
        setLeafValue(OcSys.NAMESPACE,
            "key-id",
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
