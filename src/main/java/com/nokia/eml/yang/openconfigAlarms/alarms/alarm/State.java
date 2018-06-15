/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-alarms", revision: "2018-01-16".
 */

package com.nokia.eml.yang.openconfigAlarms.alarms.alarm;

import com.nokia.eml.yang.openconfigAlarms.OcAlarms;
import com.nokia.eml.yang.openconfigTypes.Timeticks64;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUnion;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/alarms
 * generated to "src/com/nokia/eml/yang/openconfigAlarms/alarms/alarm/state"
 * <p>
 * See line 183 in
 * /root/nokia-yang/system/openconfig-alarms.yang
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
        super(OcAlarms.NAMESPACE, "state");
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
            "id",
            "resource",
            "text",
            "time-created",
            "severity",
            "type-id",
        };
    }

    /* Access methods for optional leaf child: "id". */

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
        setLeafValue(OcAlarms.NAMESPACE,
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
     * Unsets the value for child leaf "id".
     */
    public void unsetIdValue() throws JNCException {
        delete("id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "id" leaf will not have a value.
     */
    public void addId() throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "id" with operation "replace".
     */
    public void markIdReplace() throws JNCException {
        markLeafReplace("id");
    }

    /**
     * Marks the leaf "id" with operation "merge".
     */
    public void markIdMerge() throws JNCException {
        markLeafMerge("id");
    }

    /**
     * Marks the leaf "id" with operation "create".
     */
    public void markIdCreate() throws JNCException {
        markLeafCreate("id");
    }

    /**
     * Marks the leaf "id" with operation "delete".
     */
    public void markIdDelete() throws JNCException {
        markLeafDelete("id");
    }

    /* Access methods for optional leaf child: "resource". */

    /**
     * Gets the value for child leaf "resource".
     * @return The value of the leaf.
     */
    public YangString getResourceValue() throws JNCException {
        return (YangString)getValue("resource");
    }

    /**
     * Sets the value for child leaf "resource",
     * using instance of generated typedef class.
     * @param resourceValue The value to set.
     * @param resourceValue used during instantiation.
     */
    public void setResourceValue(YangString resourceValue) throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "resource",
            resourceValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "resource",
     * using a String value.
     * @param resourceValue used during instantiation.
     */
    public void setResourceValue(String resourceValue) throws JNCException {
        setResourceValue(new YangString(resourceValue));
    }

    /**
     * Unsets the value for child leaf "resource".
     */
    public void unsetResourceValue() throws JNCException {
        delete("resource");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "resource" leaf will not have a value.
     */
    public void addResource() throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "resource",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "resource" with operation "replace".
     */
    public void markResourceReplace() throws JNCException {
        markLeafReplace("resource");
    }

    /**
     * Marks the leaf "resource" with operation "merge".
     */
    public void markResourceMerge() throws JNCException {
        markLeafMerge("resource");
    }

    /**
     * Marks the leaf "resource" with operation "create".
     */
    public void markResourceCreate() throws JNCException {
        markLeafCreate("resource");
    }

    /**
     * Marks the leaf "resource" with operation "delete".
     */
    public void markResourceDelete() throws JNCException {
        markLeafDelete("resource");
    }

    /* Access methods for optional leaf child: "text". */

    /**
     * Gets the value for child leaf "text".
     * @return The value of the leaf.
     */
    public YangString getTextValue() throws JNCException {
        return (YangString)getValue("text");
    }

    /**
     * Sets the value for child leaf "text",
     * using instance of generated typedef class.
     * @param textValue The value to set.
     * @param textValue used during instantiation.
     */
    public void setTextValue(YangString textValue) throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "text",
            textValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "text",
     * using a String value.
     * @param textValue used during instantiation.
     */
    public void setTextValue(String textValue) throws JNCException {
        setTextValue(new YangString(textValue));
    }

    /**
     * Unsets the value for child leaf "text".
     */
    public void unsetTextValue() throws JNCException {
        delete("text");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "text" leaf will not have a value.
     */
    public void addText() throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "text",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "text" with operation "replace".
     */
    public void markTextReplace() throws JNCException {
        markLeafReplace("text");
    }

    /**
     * Marks the leaf "text" with operation "merge".
     */
    public void markTextMerge() throws JNCException {
        markLeafMerge("text");
    }

    /**
     * Marks the leaf "text" with operation "create".
     */
    public void markTextCreate() throws JNCException {
        markLeafCreate("text");
    }

    /**
     * Marks the leaf "text" with operation "delete".
     */
    public void markTextDelete() throws JNCException {
        markLeafDelete("text");
    }

    /* Access methods for optional leaf child: "time-created". */

    /**
     * Gets the value for child leaf "time-created".
     * @return The value of the leaf.
     */
    public Timeticks64 getTimeCreatedValue() throws JNCException {
        return (Timeticks64)getValue("time-created");
    }

    /**
     * Sets the value for child leaf "time-created",
     * using a JNC type value.
     * @param timeCreatedValue The value to set.
     * @param timeCreatedValue used during instantiation.
     */
    public void setTimeCreatedValue(Timeticks64 timeCreatedValue)
            throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "time-created",
            timeCreatedValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "time-created",
     * using Java primitive values.
     * @param timeCreatedValue used during instantiation.
     */
    public void setTimeCreatedValue(BigInteger timeCreatedValue)
            throws JNCException {
        setTimeCreatedValue(new Timeticks64(timeCreatedValue));
    }

    /**
     * Sets the value for child leaf "time-created",
     * using a String value.
     * @param timeCreatedValue used during instantiation.
     */
    public void setTimeCreatedValue(String timeCreatedValue)
            throws JNCException {
        setTimeCreatedValue(new Timeticks64(timeCreatedValue));
    }

    /**
     * Unsets the value for child leaf "time-created".
     */
    public void unsetTimeCreatedValue() throws JNCException {
        delete("time-created");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "time-created" leaf will not have a value.
     */
    public void addTimeCreated() throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "time-created",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "time-created" with operation "replace".
     */
    public void markTimeCreatedReplace() throws JNCException {
        markLeafReplace("timeCreated");
    }

    /**
     * Marks the leaf "time-created" with operation "merge".
     */
    public void markTimeCreatedMerge() throws JNCException {
        markLeafMerge("timeCreated");
    }

    /**
     * Marks the leaf "time-created" with operation "create".
     */
    public void markTimeCreatedCreate() throws JNCException {
        markLeafCreate("timeCreated");
    }

    /**
     * Marks the leaf "time-created" with operation "delete".
     */
    public void markTimeCreatedDelete() throws JNCException {
        markLeafDelete("timeCreated");
    }

    /* Access methods for optional leaf child: "severity". */

    /**
     * Gets the value for child leaf "severity".
     * @return The value of the leaf.
     */
    public YangIdentityref getSeverityValue() throws JNCException {
        return (YangIdentityref)getValue("severity");
    }

    /**
     * Sets the value for child leaf "severity",
     * using instance of generated typedef class.
     * @param severityValue The value to set.
     * @param severityValue used during instantiation.
     */
    public void setSeverityValue(YangIdentityref severityValue)
            throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
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
        setSeverityValue(new YangIdentityref(severityValue));
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
        setLeafValue(OcAlarms.NAMESPACE,
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

    /* Access methods for optional leaf child: "type-id". */

    /**
     * Gets the value for child leaf "type-id".
     * @return The value of the leaf.
     */
    public YangUnion getTypeIdValue() throws JNCException {
        return (YangUnion)getValue("type-id");
    }

    /**
     * Sets the value for child leaf "type-id",
     * using instance of generated typedef class.
     * @param typeIdValue The value to set.
     * @param typeIdValue used during instantiation.
     */
    public void setTypeIdValue(YangUnion typeIdValue) throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "type-id",
            typeIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "type-id",
     * using a String value.
     * @param typeIdValue used during instantiation.
     */
    public void setTypeIdValue(String typeIdValue) throws JNCException {
        setTypeIdValue(new YangUnion(typeIdValue, new String[] {
             "com.tailf.jnc.YangString",
             "com.tailf.jnc.YangIdentityref",
        }));
    }

    /**
     * Unsets the value for child leaf "type-id".
     */
    public void unsetTypeIdValue() throws JNCException {
        delete("type-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "type-id" leaf will not have a value.
     */
    public void addTypeId() throws JNCException {
        setLeafValue(OcAlarms.NAMESPACE,
            "type-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "type-id" with operation "replace".
     */
    public void markTypeIdReplace() throws JNCException {
        markLeafReplace("typeId");
    }

    /**
     * Marks the leaf "type-id" with operation "merge".
     */
    public void markTypeIdMerge() throws JNCException {
        markLeafMerge("typeId");
    }

    /**
     * Marks the leaf "type-id" with operation "create".
     */
    public void markTypeIdCreate() throws JNCException {
        markLeafCreate("typeId");
    }

    /**
     * Marks the leaf "type-id" with operation "delete".
     */
    public void markTypeIdDelete() throws JNCException {
        markLeafDelete("typeId");
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
