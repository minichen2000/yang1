/* 
 * @(#)Alarms.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system;

import com.nokia.eml.yang.openconfigAlarms.OcAlarms;
import com.nokia.eml.yang.openconfigSystem.system.alarms.Alarm;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/alarms"
 * <p>
 * See line 156 in
 * /root/nokia-yang/system/openconfig-alarms.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Alarms extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Alarms object.
     */
    public Alarms() {
        super(OcAlarms.NAMESPACE, "alarms");
        setDefaultPrefix();
        setPrefix(OcAlarms.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Alarms clone() {
        return (Alarms)cloneContent(new Alarms());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Alarms cloneShallow() {
        return (Alarms)cloneShallowContent(new Alarms());
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
            "alarm",
        };
    }

    /* Access methods for list child: "alarm". */

    /**
     * Gets list entry "alarm", with specified keys.
     */
    public Alarm getAlarm() throws JNCException {
        String path = "alarm";
        return (Alarm)searchOne(path);
    }

    /**
     * Iterator method for the list "alarm".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator alarmIterator() {
        return new ElementChildrenIterator(children, "alarm");
    }

    /**
     * Adds list entry "alarm", using an existing object.
     * @param alarm The object to add.
     * @return The added child.
     */
    public Alarm addAlarm(Alarm alarm) throws JNCException {
        insertChild(alarm, childrenNames());
        return alarm;
    }

    /**
     * Adds list entry "alarm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Alarm addAlarm() throws JNCException {
        Alarm alarm = new Alarm();
        insertChild(alarm, childrenNames());
        return alarm;
    }

    /**
     * Deletes list entry "alarm", with specified keys.
     */
    public void deleteAlarm() throws JNCException {
        String path = "alarm";
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
