/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system.logging.console.selectors.selector;

import com.nokia.eml.yang.openconfigSystemLogging.OcLog;
import com.nokia.eml.yang.openconfigSystemLogging.SyslogSeverity;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/logging/console/selectors/selector/state"
 * <p>
 * See line 349 in
 * /root/nokia-yang/system/openconfig-system-logging.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class State extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty State object.
     */
    public State() {
        super(OcLog.NAMESPACE, "state");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public State clone() {
        return (State)cloneContent(new State());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public State cloneShallow() {
        return (State)cloneShallowContent(new State());
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
        };
    }

    /* Access methods for optional leaf child: "facility". */

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
     * Unsets the value for child leaf "facility".
     */
    public void unsetFacilityValue() throws JNCException {
        delete("facility");
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

    /**
     * Marks the leaf "facility" with operation "replace".
     */
    public void markFacilityReplace() throws JNCException {
        markLeafReplace("facility");
    }

    /**
     * Marks the leaf "facility" with operation "merge".
     */
    public void markFacilityMerge() throws JNCException {
        markLeafMerge("facility");
    }

    /**
     * Marks the leaf "facility" with operation "create".
     */
    public void markFacilityCreate() throws JNCException {
        markLeafCreate("facility");
    }

    /**
     * Marks the leaf "facility" with operation "delete".
     */
    public void markFacilityDelete() throws JNCException {
        markLeafDelete("facility");
    }

    /* Access methods for optional leaf child: "severity". */

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
     * Unsets the value for child leaf "severity".
     */
    public void unsetSeverityValue() throws JNCException {
        delete("severity");
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

    /**
     * Marks the leaf "severity" with operation "replace".
     */
    public void markSeverityReplace() throws JNCException {
        markLeafReplace("severity");
    }

    /**
     * Marks the leaf "severity" with operation "merge".
     */
    public void markSeverityMerge() throws JNCException {
        markLeafMerge("severity");
    }

    /**
     * Marks the leaf "severity" with operation "create".
     */
    public void markSeverityCreate() throws JNCException {
        markLeafCreate("severity");
    }

    /**
     * Marks the leaf "severity" with operation "delete".
     */
    public void markSeverityDelete() throws JNCException {
        markLeafDelete("severity");
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