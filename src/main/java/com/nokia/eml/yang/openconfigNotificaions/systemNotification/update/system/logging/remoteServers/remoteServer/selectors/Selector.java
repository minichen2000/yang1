/* 
 * @(#)Selector.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.logging.remoteServers.remoteServer.selectors;

import com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.logging.remoteServers.remoteServer.selectors.selector.Config;
import com.nokia.eml.yang.openconfigNotificaions.systemNotification.update.system.logging.remoteServers.remoteServer.selectors.selector.State;
import com.nokia.eml.yang.openconfigSystemLogging.OcLog;
import com.nokia.eml.yang.openconfigSystemLogging.SyslogSeverity;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/systemNotification/update/system/logging/remoteServers/remoteServer/selectors/selector"
 * <p>
 * See line 319 in
 * /root/nokia-yang/system/openconfig-system-logging.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Selector extends YangElement {

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
     * Constructor for an empty Selector object.
     */
    public Selector() {
        super(OcLog.NAMESPACE, "selector");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Selector clone() {
        return (Selector)cloneContent(new Selector());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Selector cloneShallow() {
        return (Selector)cloneShallowContent(new Selector());
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
            "facility",
            "severity",
            "config",
            "state",
        };
    }

    /* Access methods for leaf child: "facility". */

    /**
     * Gets the value for child leaf "facility".
     * @return The value of the leaf.
     */
    public YangIdentityref getFacilityValue() throws JNCException {
        return (YangIdentityref)getValue("facility");
    }

    /**
     * Sets the value for child leaf "facility",
     * using instance of generated typedef class.
     * @param facilityValue The value to set.
     * @param facilityValue used during instantiation.
     */
    public void setFacilityValue(YangIdentityref facilityValue)
            throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "facility",
            facilityValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "facility",
     * using a String value.
     * @param facilityValue used during instantiation.
     */
    public void setFacilityValue(String facilityValue) throws JNCException {
        setFacilityValue(new YangIdentityref(facilityValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "facility" leaf will not have a value.
     */
    public void addFacility() throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "facility",
            null,
            childrenNames());
    }

    /* Access methods for leaf child: "severity". */

    /**
     * Gets the value for child leaf "severity".
     * @return The value of the leaf.
     */
    public SyslogSeverity getSeverityValue() throws JNCException {
        return (SyslogSeverity)getValue("severity");
    }

    /**
     * Sets the value for child leaf "severity",
     * using a JNC type value.
     * @param severityValue The value to set.
     * @param severityValue used during instantiation.
     */
    public void setSeverityValue(SyslogSeverity severityValue)
            throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "severity",
            severityValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "severity",
     * using a String value.
     * @param severityValue used during instantiation.
     */
    public void setSeverityValue(String severityValue) throws JNCException {
        setSeverityValue(new SyslogSeverity(severityValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "severity" leaf will not have a value.
     */
    public void addSeverity() throws JNCException {
        setLeafValue(OcLog.NAMESPACE,
            "severity",
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
