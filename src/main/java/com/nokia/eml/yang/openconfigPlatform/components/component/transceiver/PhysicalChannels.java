/* 
 * @(#)PhysicalChannels.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-platform", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigPlatform.components.component.transceiver;

import com.nokia.eml.yang.openconfigPlatform.components.component.transceiver.physicalChannels.Channel;
import com.nokia.eml.yang.openconfigPlatformTransceiver.OcTransceiver;
import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt16;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/platform
 * generated to "src/com/nokia/eml/yang/openconfigPlatform/components/component/transceiver/physical-channels"
 * <p>
 * See line 190 in
 * /root/nokia-yang/platform/openconfig-platform-transceiver.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class PhysicalChannels extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty PhysicalChannels object.
     */
    public PhysicalChannels() {
        super(OcTransceiver.NAMESPACE, "physical-channels");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public PhysicalChannels clone() {
        return (PhysicalChannels)cloneContent(new PhysicalChannels());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public PhysicalChannels cloneShallow() {
        return (PhysicalChannels)cloneShallowContent(new PhysicalChannels());
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
     * @param indexValue Key argument of child.
     */
    public Channel getChannel(YangUInt16 indexValue) throws JNCException {
        String path = "channel[index='" + indexValue + "']";
        return (Channel)searchOne(path);
    }

    /**
     * Gets list entry "channel", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public Channel getChannel(String indexValue) throws JNCException {
        String path = "channel[index='" + indexValue + "']";
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
     * Adds list entry "channel", with specified keys.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public Channel addChannel(YangUInt16 indexValue) throws JNCException {
        Channel channel = new Channel(indexValue);
        return addChannel(channel);
    }

    /**
     * Adds list entry "channel", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     * @return The added child.
     */
    public Channel addChannel(String indexValue) throws JNCException {
        Channel channel = new Channel(indexValue);
        return addChannel(channel);
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
     * @param indexValue Key argument of child.
     */
    public void deleteChannel(YangUInt16 indexValue) throws JNCException {
        String path = "channel[index='" + indexValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "channel", with specified keys.
     * The keys are specified as strings.
     * @param indexValue Key argument of child.
     */
    public void deleteChannel(String indexValue) throws JNCException {
        String path = "channel[index='" + indexValue + "']";
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