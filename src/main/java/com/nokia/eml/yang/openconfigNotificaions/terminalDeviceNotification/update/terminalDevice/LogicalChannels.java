/* 
 * @(#)LogicalChannels.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice;

import com.nokia.eml.yang.openconfigNotificaions.terminalDeviceNotification.update.terminalDevice.logicalChannels.Channel;
import com.nokia.eml.yang.openconfigTerminalDevice.OcOptTerm;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/terminalDeviceNotification/update/terminalDevice/logical-channels"
 * <p>
 * See line 789 in
 * /root/nokia-yang/optical-transport/openconfig-terminal-device.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class LogicalChannels extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty LogicalChannels object.
     */
    public LogicalChannels() {
        super(OcOptTerm.NAMESPACE, "logical-channels");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public LogicalChannels clone() {
        return (LogicalChannels)cloneContent(new LogicalChannels());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public LogicalChannels cloneShallow() {
        return (LogicalChannels)cloneShallowContent(new LogicalChannels());
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
            "channel",
        };
    }

    /* Access methods for list child: "channel". */

    /**
     * Gets list entry "channel", with specified keys.
     */
    public Channel getChannel() throws JNCException {
        String path = "channel";
        return (Channel)searchOne(path);
    }

    /**
     * Iterator method for the list "channel".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator channelIterator() {
        return new ElementChildrenIterator(children, "channel");
    }

    /**
     * Adds list entry "channel", using an existing object.
     * @param channel The object to add.
     * @return The added child.
     */
    public Channel addChannel(Channel channel) throws JNCException {
        insertChild(channel, childrenNames());
        return channel;
    }

    /**
     * Adds list entry "channel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Channel addChannel() throws JNCException {
        Channel channel = new Channel();
        insertChild(channel, childrenNames());
        return channel;
    }

    /**
     * Deletes list entry "channel", with specified keys.
     */
    public void deleteChannel() throws JNCException {
        String path = "channel";
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