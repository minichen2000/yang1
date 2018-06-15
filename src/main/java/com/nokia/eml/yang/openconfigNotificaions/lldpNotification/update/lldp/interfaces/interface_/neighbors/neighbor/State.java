/* 
 * @(#)State.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-notificaions", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigNotificaions.lldpNotification.update.lldp.interfaces.interface_.neighbors.neighbor;

import com.nokia.eml.yang.openconfigLldp.OcLldp;
import com.nokia.eml.yang.openconfigLldpTypes.ChassisIdType;
import com.nokia.eml.yang.openconfigLldpTypes.PortIdType;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangInt64;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt64;

import java.math.BigInteger;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/openconfig-notificaions
 * generated to "src/com/nokia/eml/yang/openconfigNotificaions/lldpNotification/update/lldp/interfaces/interface_/neighbors/neighbor/state"
 * <p>
 * See line 460 in
 * /root/nokia-yang/lldp/openconfig-lldp.yang
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
        super(OcLldp.NAMESPACE, "state");
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
            "system-name",
            "system-description",
            "chassis-id",
            "chassis-id-type",
            "id",
            "age",
            "last-update",
            "port-id",
            "port-id-type",
            "port-description",
            "management-address",
            "management-address-type",
        };
    }

    /* Access methods for optional leaf child: "system-name". */

    /**
     * Gets the value for child leaf "system-name".
     * @return The value of the leaf.
     */
    public YangString getSystemNameValue() throws JNCException {
        return (YangString)getValue("system-name");
    }

    /**
     * Sets the value for child leaf "system-name",
     * using instance of generated typedef class.
     * @param systemNameValue The value to set.
     * @param systemNameValue used during instantiation.
     */
    public void setSystemNameValue(YangString systemNameValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "system-name",
            systemNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "system-name",
     * using a String value.
     * @param systemNameValue used during instantiation.
     */
    public void setSystemNameValue(String systemNameValue) throws JNCException {
        setSystemNameValue(new YangString(systemNameValue));
    }

    /**
     * Unsets the value for child leaf "system-name".
     */
    public void unsetSystemNameValue() throws JNCException {
        delete("system-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "system-name" leaf will not have a value.
     */
    public void addSystemName() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "system-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "system-name" with operation "replace".
     */
    public void markSystemNameReplace() throws JNCException {
        markLeafReplace("systemName");
    }

    /**
     * Marks the leaf "system-name" with operation "merge".
     */
    public void markSystemNameMerge() throws JNCException {
        markLeafMerge("systemName");
    }

    /**
     * Marks the leaf "system-name" with operation "create".
     */
    public void markSystemNameCreate() throws JNCException {
        markLeafCreate("systemName");
    }

    /**
     * Marks the leaf "system-name" with operation "delete".
     */
    public void markSystemNameDelete() throws JNCException {
        markLeafDelete("systemName");
    }

    /* Access methods for optional leaf child: "system-description". */

    /**
     * Gets the value for child leaf "system-description".
     * @return The value of the leaf.
     */
    public YangString getSystemDescriptionValue() throws JNCException {
        return (YangString)getValue("system-description");
    }

    /**
     * Sets the value for child leaf "system-description",
     * using instance of generated typedef class.
     * @param systemDescriptionValue The value to set.
     * @param systemDescriptionValue used during instantiation.
     */
    public void setSystemDescriptionValue(YangString systemDescriptionValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "system-description",
            systemDescriptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "system-description",
     * using a String value.
     * @param systemDescriptionValue used during instantiation.
     */
    public void setSystemDescriptionValue(String systemDescriptionValue)
            throws JNCException {
        setSystemDescriptionValue(new YangString(systemDescriptionValue));
    }

    /**
     * Unsets the value for child leaf "system-description".
     */
    public void unsetSystemDescriptionValue() throws JNCException {
        delete("system-description");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "system-description" leaf will not have a value.
     */
    public void addSystemDescription() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "system-description",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "system-description" with operation "replace".
     */
    public void markSystemDescriptionReplace() throws JNCException {
        markLeafReplace("systemDescription");
    }

    /**
     * Marks the leaf "system-description" with operation "merge".
     */
    public void markSystemDescriptionMerge() throws JNCException {
        markLeafMerge("systemDescription");
    }

    /**
     * Marks the leaf "system-description" with operation "create".
     */
    public void markSystemDescriptionCreate() throws JNCException {
        markLeafCreate("systemDescription");
    }

    /**
     * Marks the leaf "system-description" with operation "delete".
     */
    public void markSystemDescriptionDelete() throws JNCException {
        markLeafDelete("systemDescription");
    }

    /* Access methods for optional leaf child: "chassis-id". */

    /**
     * Gets the value for child leaf "chassis-id".
     * @return The value of the leaf.
     */
    public YangString getChassisIdValue() throws JNCException {
        return (YangString)getValue("chassis-id");
    }

    /**
     * Sets the value for child leaf "chassis-id",
     * using instance of generated typedef class.
     * @param chassisIdValue The value to set.
     * @param chassisIdValue used during instantiation.
     */
    public void setChassisIdValue(YangString chassisIdValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "chassis-id",
            chassisIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "chassis-id",
     * using a String value.
     * @param chassisIdValue used during instantiation.
     */
    public void setChassisIdValue(String chassisIdValue) throws JNCException {
        setChassisIdValue(new YangString(chassisIdValue));
    }

    /**
     * Unsets the value for child leaf "chassis-id".
     */
    public void unsetChassisIdValue() throws JNCException {
        delete("chassis-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "chassis-id" leaf will not have a value.
     */
    public void addChassisId() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "chassis-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "chassis-id" with operation "replace".
     */
    public void markChassisIdReplace() throws JNCException {
        markLeafReplace("chassisId");
    }

    /**
     * Marks the leaf "chassis-id" with operation "merge".
     */
    public void markChassisIdMerge() throws JNCException {
        markLeafMerge("chassisId");
    }

    /**
     * Marks the leaf "chassis-id" with operation "create".
     */
    public void markChassisIdCreate() throws JNCException {
        markLeafCreate("chassisId");
    }

    /**
     * Marks the leaf "chassis-id" with operation "delete".
     */
    public void markChassisIdDelete() throws JNCException {
        markLeafDelete("chassisId");
    }

    /* Access methods for optional leaf child: "chassis-id-type". */

    /**
     * Gets the value for child leaf "chassis-id-type".
     * @return The value of the leaf.
     */
    public ChassisIdType getChassisIdTypeValue() throws JNCException {
        return (ChassisIdType)getValue("chassis-id-type");
    }

    /**
     * Sets the value for child leaf "chassis-id-type",
     * using a JNC type value.
     * @param chassisIdTypeValue The value to set.
     * @param chassisIdTypeValue used during instantiation.
     */
    public void setChassisIdTypeValue(ChassisIdType chassisIdTypeValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "chassis-id-type",
            chassisIdTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "chassis-id-type",
     * using a String value.
     * @param chassisIdTypeValue used during instantiation.
     */
    public void setChassisIdTypeValue(String chassisIdTypeValue)
            throws JNCException {
        setChassisIdTypeValue(new ChassisIdType(chassisIdTypeValue));
    }

    /**
     * Unsets the value for child leaf "chassis-id-type".
     */
    public void unsetChassisIdTypeValue() throws JNCException {
        delete("chassis-id-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "chassis-id-type" leaf will not have a value.
     */
    public void addChassisIdType() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "chassis-id-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "chassis-id-type" with operation "replace".
     */
    public void markChassisIdTypeReplace() throws JNCException {
        markLeafReplace("chassisIdType");
    }

    /**
     * Marks the leaf "chassis-id-type" with operation "merge".
     */
    public void markChassisIdTypeMerge() throws JNCException {
        markLeafMerge("chassisIdType");
    }

    /**
     * Marks the leaf "chassis-id-type" with operation "create".
     */
    public void markChassisIdTypeCreate() throws JNCException {
        markLeafCreate("chassisIdType");
    }

    /**
     * Marks the leaf "chassis-id-type" with operation "delete".
     */
    public void markChassisIdTypeDelete() throws JNCException {
        markLeafDelete("chassisIdType");
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
        setLeafValue(OcLldp.NAMESPACE,
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
        setLeafValue(OcLldp.NAMESPACE,
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

    /* Access methods for optional leaf child: "age". */

    /**
     * Gets the value for child leaf "age".
     * @return The value of the leaf.
     */
    public YangUInt64 getAgeValue() throws JNCException {
        return (YangUInt64)getValue("age");
    }

    /**
     * Sets the value for child leaf "age",
     * using instance of generated typedef class.
     * @param ageValue The value to set.
     * @param ageValue used during instantiation.
     */
    public void setAgeValue(YangUInt64 ageValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "age",
            ageValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "age",
     * using Java primitive values.
     * @param ageValue used during instantiation.
     */
    public void setAgeValue(BigInteger ageValue) throws JNCException {
        setAgeValue(new YangUInt64(ageValue));
    }

    /**
     * Sets the value for child leaf "age",
     * using a String value.
     * @param ageValue used during instantiation.
     */
    public void setAgeValue(String ageValue) throws JNCException {
        setAgeValue(new YangUInt64(ageValue));
    }

    /**
     * Unsets the value for child leaf "age".
     */
    public void unsetAgeValue() throws JNCException {
        delete("age");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "age" leaf will not have a value.
     */
    public void addAge() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "age",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "age" with operation "replace".
     */
    public void markAgeReplace() throws JNCException {
        markLeafReplace("age");
    }

    /**
     * Marks the leaf "age" with operation "merge".
     */
    public void markAgeMerge() throws JNCException {
        markLeafMerge("age");
    }

    /**
     * Marks the leaf "age" with operation "create".
     */
    public void markAgeCreate() throws JNCException {
        markLeafCreate("age");
    }

    /**
     * Marks the leaf "age" with operation "delete".
     */
    public void markAgeDelete() throws JNCException {
        markLeafDelete("age");
    }

    /* Access methods for optional leaf child: "last-update". */

    /**
     * Gets the value for child leaf "last-update".
     * @return The value of the leaf.
     */
    public YangInt64 getLastUpdateValue() throws JNCException {
        return (YangInt64)getValue("last-update");
    }

    /**
     * Sets the value for child leaf "last-update",
     * using instance of generated typedef class.
     * @param lastUpdateValue The value to set.
     * @param lastUpdateValue used during instantiation.
     */
    public void setLastUpdateValue(YangInt64 lastUpdateValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "last-update",
            lastUpdateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "last-update",
     * using Java primitive values.
     * @param lastUpdateValue used during instantiation.
     */
    public void setLastUpdateValue(long lastUpdateValue) throws JNCException {
        setLastUpdateValue(new YangInt64(lastUpdateValue));
    }

    /**
     * Sets the value for child leaf "last-update",
     * using a String value.
     * @param lastUpdateValue used during instantiation.
     */
    public void setLastUpdateValue(String lastUpdateValue) throws JNCException {
        setLastUpdateValue(new YangInt64(lastUpdateValue));
    }

    /**
     * Unsets the value for child leaf "last-update".
     */
    public void unsetLastUpdateValue() throws JNCException {
        delete("last-update");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "last-update" leaf will not have a value.
     */
    public void addLastUpdate() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "last-update",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "last-update" with operation "replace".
     */
    public void markLastUpdateReplace() throws JNCException {
        markLeafReplace("lastUpdate");
    }

    /**
     * Marks the leaf "last-update" with operation "merge".
     */
    public void markLastUpdateMerge() throws JNCException {
        markLeafMerge("lastUpdate");
    }

    /**
     * Marks the leaf "last-update" with operation "create".
     */
    public void markLastUpdateCreate() throws JNCException {
        markLeafCreate("lastUpdate");
    }

    /**
     * Marks the leaf "last-update" with operation "delete".
     */
    public void markLastUpdateDelete() throws JNCException {
        markLeafDelete("lastUpdate");
    }

    /* Access methods for optional leaf child: "port-id". */

    /**
     * Gets the value for child leaf "port-id".
     * @return The value of the leaf.
     */
    public YangString getPortIdValue() throws JNCException {
        return (YangString)getValue("port-id");
    }

    /**
     * Sets the value for child leaf "port-id",
     * using instance of generated typedef class.
     * @param portIdValue The value to set.
     * @param portIdValue used during instantiation.
     */
    public void setPortIdValue(YangString portIdValue) throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-id",
            portIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port-id",
     * using a String value.
     * @param portIdValue used during instantiation.
     */
    public void setPortIdValue(String portIdValue) throws JNCException {
        setPortIdValue(new YangString(portIdValue));
    }

    /**
     * Unsets the value for child leaf "port-id".
     */
    public void unsetPortIdValue() throws JNCException {
        delete("port-id");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port-id" leaf will not have a value.
     */
    public void addPortId() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-id",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port-id" with operation "replace".
     */
    public void markPortIdReplace() throws JNCException {
        markLeafReplace("portId");
    }

    /**
     * Marks the leaf "port-id" with operation "merge".
     */
    public void markPortIdMerge() throws JNCException {
        markLeafMerge("portId");
    }

    /**
     * Marks the leaf "port-id" with operation "create".
     */
    public void markPortIdCreate() throws JNCException {
        markLeafCreate("portId");
    }

    /**
     * Marks the leaf "port-id" with operation "delete".
     */
    public void markPortIdDelete() throws JNCException {
        markLeafDelete("portId");
    }

    /* Access methods for optional leaf child: "port-id-type". */

    /**
     * Gets the value for child leaf "port-id-type".
     * @return The value of the leaf.
     */
    public PortIdType getPortIdTypeValue() throws JNCException {
        return (PortIdType)getValue("port-id-type");
    }

    /**
     * Sets the value for child leaf "port-id-type",
     * using a JNC type value.
     * @param portIdTypeValue The value to set.
     * @param portIdTypeValue used during instantiation.
     */
    public void setPortIdTypeValue(PortIdType portIdTypeValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-id-type",
            portIdTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port-id-type",
     * using a String value.
     * @param portIdTypeValue used during instantiation.
     */
    public void setPortIdTypeValue(String portIdTypeValue) throws JNCException {
        setPortIdTypeValue(new PortIdType(portIdTypeValue));
    }

    /**
     * Unsets the value for child leaf "port-id-type".
     */
    public void unsetPortIdTypeValue() throws JNCException {
        delete("port-id-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port-id-type" leaf will not have a value.
     */
    public void addPortIdType() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-id-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port-id-type" with operation "replace".
     */
    public void markPortIdTypeReplace() throws JNCException {
        markLeafReplace("portIdType");
    }

    /**
     * Marks the leaf "port-id-type" with operation "merge".
     */
    public void markPortIdTypeMerge() throws JNCException {
        markLeafMerge("portIdType");
    }

    /**
     * Marks the leaf "port-id-type" with operation "create".
     */
    public void markPortIdTypeCreate() throws JNCException {
        markLeafCreate("portIdType");
    }

    /**
     * Marks the leaf "port-id-type" with operation "delete".
     */
    public void markPortIdTypeDelete() throws JNCException {
        markLeafDelete("portIdType");
    }

    /* Access methods for optional leaf child: "port-description". */

    /**
     * Gets the value for child leaf "port-description".
     * @return The value of the leaf.
     */
    public YangString getPortDescriptionValue() throws JNCException {
        return (YangString)getValue("port-description");
    }

    /**
     * Sets the value for child leaf "port-description",
     * using instance of generated typedef class.
     * @param portDescriptionValue The value to set.
     * @param portDescriptionValue used during instantiation.
     */
    public void setPortDescriptionValue(YangString portDescriptionValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-description",
            portDescriptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "port-description",
     * using a String value.
     * @param portDescriptionValue used during instantiation.
     */
    public void setPortDescriptionValue(String portDescriptionValue)
            throws JNCException {
        setPortDescriptionValue(new YangString(portDescriptionValue));
    }

    /**
     * Unsets the value for child leaf "port-description".
     */
    public void unsetPortDescriptionValue() throws JNCException {
        delete("port-description");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "port-description" leaf will not have a value.
     */
    public void addPortDescription() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "port-description",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "port-description" with operation "replace".
     */
    public void markPortDescriptionReplace() throws JNCException {
        markLeafReplace("portDescription");
    }

    /**
     * Marks the leaf "port-description" with operation "merge".
     */
    public void markPortDescriptionMerge() throws JNCException {
        markLeafMerge("portDescription");
    }

    /**
     * Marks the leaf "port-description" with operation "create".
     */
    public void markPortDescriptionCreate() throws JNCException {
        markLeafCreate("portDescription");
    }

    /**
     * Marks the leaf "port-description" with operation "delete".
     */
    public void markPortDescriptionDelete() throws JNCException {
        markLeafDelete("portDescription");
    }

    /* Access methods for optional leaf child: "management-address". */

    /**
     * Gets the value for child leaf "management-address".
     * @return The value of the leaf.
     */
    public YangString getManagementAddressValue() throws JNCException {
        return (YangString)getValue("management-address");
    }

    /**
     * Sets the value for child leaf "management-address",
     * using instance of generated typedef class.
     * @param managementAddressValue The value to set.
     * @param managementAddressValue used during instantiation.
     */
    public void setManagementAddressValue(YangString managementAddressValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "management-address",
            managementAddressValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "management-address",
     * using a String value.
     * @param managementAddressValue used during instantiation.
     */
    public void setManagementAddressValue(String managementAddressValue)
            throws JNCException {
        setManagementAddressValue(new YangString(managementAddressValue));
    }

    /**
     * Unsets the value for child leaf "management-address".
     */
    public void unsetManagementAddressValue() throws JNCException {
        delete("management-address");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "management-address" leaf will not have a value.
     */
    public void addManagementAddress() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "management-address",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "management-address" with operation "replace".
     */
    public void markManagementAddressReplace() throws JNCException {
        markLeafReplace("managementAddress");
    }

    /**
     * Marks the leaf "management-address" with operation "merge".
     */
    public void markManagementAddressMerge() throws JNCException {
        markLeafMerge("managementAddress");
    }

    /**
     * Marks the leaf "management-address" with operation "create".
     */
    public void markManagementAddressCreate() throws JNCException {
        markLeafCreate("managementAddress");
    }

    /**
     * Marks the leaf "management-address" with operation "delete".
     */
    public void markManagementAddressDelete() throws JNCException {
        markLeafDelete("managementAddress");
    }

    /* Access methods for optional leaf child: "management-address-type". */

    /**
     * Gets the value for child leaf "management-address-type".
     * @return The value of the leaf.
     */
    public YangString getManagementAddressTypeValue() throws JNCException {
        return (YangString)getValue("management-address-type");
    }

    /**
     * Sets the value for child leaf "management-address-type",
     * using instance of generated typedef class.
     * @param managementAddressTypeValue The value to set.
     * @param managementAddressTypeValue used during instantiation.
     */
    public void setManagementAddressTypeValue(YangString managementAddressTypeValue)
            throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "management-address-type",
            managementAddressTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "management-address-type",
     * using a String value.
     * @param managementAddressTypeValue used during instantiation.
     */
    public void setManagementAddressTypeValue(String managementAddressTypeValue)
            throws JNCException {
        setManagementAddressTypeValue(new YangString(managementAddressTypeValue));
    }

    /**
     * Unsets the value for child leaf "management-address-type".
     */
    public void unsetManagementAddressTypeValue() throws JNCException {
        delete("management-address-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "management-address-type" leaf will not have a value.
     */
    public void addManagementAddressType() throws JNCException {
        setLeafValue(OcLldp.NAMESPACE,
            "management-address-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "management-address-type" with operation "replace".
     */
    public void markManagementAddressTypeReplace() throws JNCException {
        markLeafReplace("managementAddressType");
    }

    /**
     * Marks the leaf "management-address-type" with operation "merge".
     */
    public void markManagementAddressTypeMerge() throws JNCException {
        markLeafMerge("managementAddressType");
    }

    /**
     * Marks the leaf "management-address-type" with operation "create".
     */
    public void markManagementAddressTypeCreate() throws JNCException {
        markLeafCreate("managementAddressType");
    }

    /**
     * Marks the leaf "management-address-type" with operation "delete".
     */
    public void markManagementAddressTypeDelete() throws JNCException {
        markLeafDelete("managementAddressType");
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
