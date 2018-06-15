/* 
 * @(#)CustomTlvs.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.lldpNotification.update.lldp.interfaces.interface_.neighbors.neighbor;

import com.nokia.eml.yang.openconfigLldp.OcLldp;
import com.nokia.eml.yang.openconfigNotificaions.lldpNotification.update.lldp.interfaces.interface_.neighbors.neighbor.customTlvs.Tlv;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/lldpNotification/update/lldp/interfaces/interface_/neighbors/neighbor/custom-tlvs"
 * <p>
 * See line 374 in
 * /root/nokia-yang/lldp/openconfig-lldp.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class CustomTlvs extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty CustomTlvs object.
     */
    public CustomTlvs() {
        super(OcLldp.NAMESPACE, "custom-tlvs");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public CustomTlvs clone() {
        return (CustomTlvs)cloneContent(new CustomTlvs());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public CustomTlvs cloneShallow() {
        return (CustomTlvs)cloneShallowContent(new CustomTlvs());
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
            "tlv",
        };
    }

    /* Access methods for list child: "tlv". */

    /**
     * Gets list entry "tlv", with specified keys.
     */
    public Tlv getTlv() throws JNCException {
        String path = "tlv";
        return (Tlv)searchOne(path);
    }

    /**
     * Iterator method for the list "tlv".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator tlvIterator() {
        return new ElementChildrenIterator(children, "tlv");
    }

    /**
     * Adds list entry "tlv", using an existing object.
     * @param tlv The object to add.
     * @return The added child.
     */
    public Tlv addTlv(Tlv tlv) throws JNCException {
        insertChild(tlv, childrenNames());
        return tlv;
    }

    /**
     * Adds list entry "tlv".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Tlv addTlv() throws JNCException {
        Tlv tlv = new Tlv();
        insertChild(tlv, childrenNames());
        return tlv;
    }

    /**
     * Deletes list entry "tlv", with specified keys.
     */
    public void deleteTlv() throws JNCException {
        String path = "tlv";
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
