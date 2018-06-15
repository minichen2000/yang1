/* 
 * @(#)Selectors.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-system", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigSystem.system.logging.console;

import com.nokia.eml.yang.openconfigSystem.system.logging.console.selectors.Selector;
import com.nokia.eml.yang.openconfigSystemLogging.OcLog;
import com.nokia.eml.yang.openconfigSystemLogging.SyslogSeverity;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangIdentityref;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/system
 * generated to "src/com/nokia/eml/yang/openconfigSystem/system/logging/console/selectors"
 * <p>
 * See line 315 in
 * /root/nokia-yang/system/openconfig-system-logging.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Selectors extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Selectors object.
     */
    public Selectors() {
        super(OcLog.NAMESPACE, "selectors");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Selectors clone() {
        return (Selectors)cloneContent(new Selectors());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Selectors cloneShallow() {
        return (Selectors)cloneShallowContent(new Selectors());
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
            "selector",
        };
    }

    /* Access methods for list child: "selector". */

    /**
     * Gets list entry "selector", with specified keys.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     */
    public Selector getSelector(YangIdentityref facilityValue, SyslogSeverity severityValue)
            throws JNCException {
        String path = "selector[facility='" + facilityValue + "'][severity='" + severityValue + "']";
        return (Selector)searchOne(path);
    }

    /**
     * Gets list entry "selector", with specified keys.
     * The keys are specified as strings.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     */
    public Selector getSelector(String facilityValue, String severityValue)
            throws JNCException {
        String path = "selector[facility='" + facilityValue + "'][severity='" + severityValue + "']";
        return (Selector)searchOne(path);
    }

    /**
     * Iterator method for the list "selector".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator selectorIterator() {
        return new ElementChildrenIterator(children, "selector");
    }

    /**
     * Adds list entry "selector", using an existing object.
     * @param selector The object to add.
     * @return The added child.
     */
    public Selector addSelector(Selector selector) throws JNCException {
        insertChild(selector, childrenNames());
        return selector;
    }

    /**
     * Adds list entry "selector", with specified keys.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     * @return The added child.
     */
    public Selector addSelector(YangIdentityref facilityValue, SyslogSeverity severityValue)
            throws JNCException {
        Selector selector = new Selector(facilityValue, severityValue);
        return addSelector(selector);
    }

    /**
     * Adds list entry "selector", with specified keys.
     * The keys are specified as strings.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     * @return The added child.
     */
    public Selector addSelector(String facilityValue, String severityValue)
            throws JNCException {
        Selector selector = new Selector(facilityValue, severityValue);
        return addSelector(selector);
    }

    /**
     * Adds list entry "selector".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Selector addSelector() throws JNCException {
        Selector selector = new Selector();
        insertChild(selector, childrenNames());
        return selector;
    }

    /**
     * Deletes list entry "selector", with specified keys.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     */
    public void deleteSelector(YangIdentityref facilityValue, SyslogSeverity severityValue)
            throws JNCException {
        String path = "selector[facility='" + facilityValue + "'][severity='" + severityValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "selector", with specified keys.
     * The keys are specified as strings.
     * @param facilityValue Key argument of child.
     * @param severityValue Key argument of child.
     */
    public void deleteSelector(String facilityValue, String severityValue)
            throws JNCException {
        String path = "selector[facility='" + facilityValue + "'][severity='" + severityValue + "']";
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
