/* 
 * @(#)Component.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-platform", revision: "2018-06-06".
 */

package com.nokia.eml.yang.openconfigPlatform.components;

import com.nokia.eml.yang.openconfigPlatform.OcPlatform;
import com.nokia.eml.yang.openconfigPlatform.components.component.Backplane;
import com.nokia.eml.yang.openconfigPlatform.components.component.Chassis;
import com.nokia.eml.yang.openconfigPlatform.components.component.Config;
import com.nokia.eml.yang.openconfigPlatform.components.component.Cpu;
import com.nokia.eml.yang.openconfigPlatform.components.component.Fabric;
import com.nokia.eml.yang.openconfigPlatform.components.component.Fan;
import com.nokia.eml.yang.openconfigPlatform.components.component.IntegratedCircuit;
import com.nokia.eml.yang.openconfigPlatform.components.component.OpticalChannel;
import com.nokia.eml.yang.openconfigPlatform.components.component.Port;
import com.nokia.eml.yang.openconfigPlatform.components.component.PowerSupply;
import com.nokia.eml.yang.openconfigPlatform.components.component.Properties;
import com.nokia.eml.yang.openconfigPlatform.components.component.State;
import com.nokia.eml.yang.openconfigPlatform.components.component.Storage;
import com.nokia.eml.yang.openconfigPlatform.components.component.Subcomponents;
import com.nokia.eml.yang.openconfigPlatform.components.component.Transceiver;
import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Leaf;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace http://openconfig.net/yang/platform
 * generated to "src/com/nokia/eml/yang/openconfigPlatform/components/component"
 * <p>
 * See line 654 in
 * /root/nokia-yang/platform/openconfig-platform.yang
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class Component extends YangElement {

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
     * Field for child container "properties".
     */
    public Properties properties = null;

    /**
     * Field for child container "subcomponents".
     */
    public Subcomponents subcomponents = null;

    /**
     * Field for child container "chassis".
     */
    public Chassis chassis = null;

    /**
     * Field for child container "port".
     */
    public Port port = null;

    /**
     * Field for child container "power-supply".
     */
    public PowerSupply powerSupply = null;

    /**
     * Field for child container "fan".
     */
    public Fan fan = null;

    /**
     * Field for child container "fabric".
     */
    public Fabric fabric = null;

    /**
     * Field for child container "storage".
     */
    public Storage storage = null;

    /**
     * Field for child container "cpu".
     */
    public Cpu cpu = null;

    /**
     * Field for child container "integrated-circuit".
     */
    public IntegratedCircuit integratedCircuit = null;

    /**
     * Field for child container "backplane".
     */
    public Backplane backplane = null;

    /**
     * Field for child container "transceiver".
     */
    public Transceiver transceiver = null;

    /**
     * Field for child container "optical-channel".
     */
    public OpticalChannel opticalChannel = null;

    /**
     * Constructor for an empty Component object.
     */
    public Component() {
        super(OcPlatform.NAMESPACE, "component");
    }

    /**
     * Constructor for an initialized Component object,
     * 
     * @param nameValue Key argument of child.
     */
    public Component(YangString nameValue) throws JNCException {
        super(OcPlatform.NAMESPACE, "component");
        Leaf name = new Leaf(OcPlatform.NAMESPACE, "name");
        name.setValue(nameValue);
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized Component object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public Component(String nameValue) throws JNCException {
        super(OcPlatform.NAMESPACE, "component");
        Leaf name = new Leaf(OcPlatform.NAMESPACE, "name");
        name.setValue(new YangString(nameValue));
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Component clone() {
        Component copy;
        try {
            copy = new Component(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Component)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Component cloneShallow() {
        Component copy;
        try {
            copy = new Component(getNameValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Component)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
            "config",
            "state",
            "properties",
            "subcomponents",
            "chassis",
            "port",
            "power-supply",
            "fan",
            "fabric",
            "storage",
            "cpu",
            "integrated-circuit",
            "backplane",
            "transceiver",
            "optical-channel",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(OcPlatform.NAMESPACE,
            "name",
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

    /* Access methods for container child: "properties". */

    /**
     * Adds container entry "properties", using an existing object.
     * @param properties The object to add.
     * @return The added child.
     */
    public Properties addProperties(Properties properties) throws JNCException {
        this.properties = properties;
        insertChild(properties, childrenNames());
        return properties;
    }

    /**
     * Adds container entry "properties".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Properties addProperties() throws JNCException {
        Properties properties = new Properties();
        this.properties = properties;
        insertChild(properties, childrenNames());
        return properties;
    }

    /**
     * Deletes container entry "properties".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteProperties() throws JNCException {
        this.properties = null;
        String path = "properties";
        return delete(path);
    }

    /* Access methods for container child: "subcomponents". */

    /**
     * Adds container entry "subcomponents", using an existing object.
     * @param subcomponents The object to add.
     * @return The added child.
     */
    public Subcomponents addSubcomponents(Subcomponents subcomponents)
            throws JNCException {
        this.subcomponents = subcomponents;
        insertChild(subcomponents, childrenNames());
        return subcomponents;
    }

    /**
     * Adds container entry "subcomponents".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Subcomponents addSubcomponents() throws JNCException {
        Subcomponents subcomponents = new Subcomponents();
        this.subcomponents = subcomponents;
        insertChild(subcomponents, childrenNames());
        return subcomponents;
    }

    /**
     * Deletes container entry "subcomponents".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSubcomponents() throws JNCException {
        this.subcomponents = null;
        String path = "subcomponents";
        return delete(path);
    }

    /* Access methods for container child: "chassis". */

    /**
     * Adds container entry "chassis", using an existing object.
     * @param chassis The object to add.
     * @return The added child.
     */
    public Chassis addChassis(Chassis chassis) throws JNCException {
        this.chassis = chassis;
        insertChild(chassis, childrenNames());
        return chassis;
    }

    /**
     * Adds container entry "chassis".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Chassis addChassis() throws JNCException {
        Chassis chassis = new Chassis();
        this.chassis = chassis;
        insertChild(chassis, childrenNames());
        return chassis;
    }

    /**
     * Deletes container entry "chassis".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteChassis() throws JNCException {
        this.chassis = null;
        String path = "chassis";
        return delete(path);
    }

    /* Access methods for container child: "port". */

    /**
     * Adds container entry "port", using an existing object.
     * @param port The object to add.
     * @return The added child.
     */
    public Port addPort(Port port) throws JNCException {
        this.port = port;
        insertChild(port, childrenNames());
        return port;
    }

    /**
     * Adds container entry "port".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Port addPort() throws JNCException {
        Port port = new Port();
        this.port = port;
        insertChild(port, childrenNames());
        return port;
    }

    /**
     * Deletes container entry "port".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePort() throws JNCException {
        this.port = null;
        String path = "port";
        return delete(path);
    }

    /* Access methods for container child: "power-supply". */

    /**
     * Adds container entry "powerSupply", using an existing object.
     * @param powerSupply The object to add.
     * @return The added child.
     */
    public PowerSupply addPowerSupply(PowerSupply powerSupply)
            throws JNCException {
        this.powerSupply = powerSupply;
        insertChild(powerSupply, childrenNames());
        return powerSupply;
    }

    /**
     * Adds container entry "powerSupply".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PowerSupply addPowerSupply() throws JNCException {
        PowerSupply powerSupply = new PowerSupply();
        this.powerSupply = powerSupply;
        insertChild(powerSupply, childrenNames());
        return powerSupply;
    }

    /**
     * Deletes container entry "powerSupply".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePowerSupply() throws JNCException {
        this.powerSupply = null;
        String path = "power-supply";
        return delete(path);
    }

    /* Access methods for container child: "fan". */

    /**
     * Adds container entry "fan", using an existing object.
     * @param fan The object to add.
     * @return The added child.
     */
    public Fan addFan(Fan fan) throws JNCException {
        this.fan = fan;
        insertChild(fan, childrenNames());
        return fan;
    }

    /**
     * Adds container entry "fan".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Fan addFan() throws JNCException {
        Fan fan = new Fan();
        this.fan = fan;
        insertChild(fan, childrenNames());
        return fan;
    }

    /**
     * Deletes container entry "fan".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFan() throws JNCException {
        this.fan = null;
        String path = "fan";
        return delete(path);
    }

    /* Access methods for container child: "fabric". */

    /**
     * Adds container entry "fabric", using an existing object.
     * @param fabric The object to add.
     * @return The added child.
     */
    public Fabric addFabric(Fabric fabric) throws JNCException {
        this.fabric = fabric;
        insertChild(fabric, childrenNames());
        return fabric;
    }

    /**
     * Adds container entry "fabric".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Fabric addFabric() throws JNCException {
        Fabric fabric = new Fabric();
        this.fabric = fabric;
        insertChild(fabric, childrenNames());
        return fabric;
    }

    /**
     * Deletes container entry "fabric".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFabric() throws JNCException {
        this.fabric = null;
        String path = "fabric";
        return delete(path);
    }

    /* Access methods for container child: "storage". */

    /**
     * Adds container entry "storage", using an existing object.
     * @param storage The object to add.
     * @return The added child.
     */
    public Storage addStorage(Storage storage) throws JNCException {
        this.storage = storage;
        insertChild(storage, childrenNames());
        return storage;
    }

    /**
     * Adds container entry "storage".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Storage addStorage() throws JNCException {
        Storage storage = new Storage();
        this.storage = storage;
        insertChild(storage, childrenNames());
        return storage;
    }

    /**
     * Deletes container entry "storage".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStorage() throws JNCException {
        this.storage = null;
        String path = "storage";
        return delete(path);
    }

    /* Access methods for container child: "cpu". */

    /**
     * Adds container entry "cpu", using an existing object.
     * @param cpu The object to add.
     * @return The added child.
     */
    public Cpu addCpu(Cpu cpu) throws JNCException {
        this.cpu = cpu;
        insertChild(cpu, childrenNames());
        return cpu;
    }

    /**
     * Adds container entry "cpu".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Cpu addCpu() throws JNCException {
        Cpu cpu = new Cpu();
        this.cpu = cpu;
        insertChild(cpu, childrenNames());
        return cpu;
    }

    /**
     * Deletes container entry "cpu".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCpu() throws JNCException {
        this.cpu = null;
        String path = "cpu";
        return delete(path);
    }

    /* Access methods for container child: "integrated-circuit". */

    /**
     * Adds container entry "integratedCircuit", using an existing object.
     * @param integratedCircuit The object to add.
     * @return The added child.
     */
    public IntegratedCircuit addIntegratedCircuit(IntegratedCircuit integratedCircuit)
            throws JNCException {
        this.integratedCircuit = integratedCircuit;
        insertChild(integratedCircuit, childrenNames());
        return integratedCircuit;
    }

    /**
     * Adds container entry "integratedCircuit".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IntegratedCircuit addIntegratedCircuit() throws JNCException {
        IntegratedCircuit integratedCircuit = new IntegratedCircuit();
        this.integratedCircuit = integratedCircuit;
        insertChild(integratedCircuit, childrenNames());
        return integratedCircuit;
    }

    /**
     * Deletes container entry "integratedCircuit".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIntegratedCircuit() throws JNCException {
        this.integratedCircuit = null;
        String path = "integrated-circuit";
        return delete(path);
    }

    /* Access methods for container child: "backplane". */

    /**
     * Adds container entry "backplane", using an existing object.
     * @param backplane The object to add.
     * @return The added child.
     */
    public Backplane addBackplane(Backplane backplane) throws JNCException {
        this.backplane = backplane;
        insertChild(backplane, childrenNames());
        return backplane;
    }

    /**
     * Adds container entry "backplane".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Backplane addBackplane() throws JNCException {
        Backplane backplane = new Backplane();
        this.backplane = backplane;
        insertChild(backplane, childrenNames());
        return backplane;
    }

    /**
     * Deletes container entry "backplane".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBackplane() throws JNCException {
        this.backplane = null;
        String path = "backplane";
        return delete(path);
    }

    /* Access methods for container child: "transceiver". */

    /**
     * Adds container entry "transceiver", using an existing object.
     * @param transceiver The object to add.
     * @return The added child.
     */
    public Transceiver addTransceiver(Transceiver transceiver)
            throws JNCException {
        this.transceiver = transceiver;
        insertChild(transceiver, childrenNames());
        return transceiver;
    }

    /**
     * Adds container entry "transceiver".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Transceiver addTransceiver() throws JNCException {
        Transceiver transceiver = new Transceiver();
        this.transceiver = transceiver;
        insertChild(transceiver, childrenNames());
        return transceiver;
    }

    /**
     * Deletes container entry "transceiver".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTransceiver() throws JNCException {
        this.transceiver = null;
        String path = "transceiver";
        return delete(path);
    }

    /* Access methods for container child: "optical-channel". */

    /**
     * Adds container entry "opticalChannel", using an existing object.
     * @param opticalChannel The object to add.
     * @return The added child.
     */
    public OpticalChannel addOpticalChannel(OpticalChannel opticalChannel)
            throws JNCException {
        this.opticalChannel = opticalChannel;
        insertChild(opticalChannel, childrenNames());
        return opticalChannel;
    }

    /**
     * Adds container entry "opticalChannel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public OpticalChannel addOpticalChannel() throws JNCException {
        OpticalChannel opticalChannel = new OpticalChannel();
        this.opticalChannel = opticalChannel;
        insertChild(opticalChannel, childrenNames());
        return opticalChannel;
    }

    /**
     * Deletes container entry "opticalChannel".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteOpticalChannel() throws JNCException {
        this.opticalChannel = null;
        String path = "optical-channel";
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
        else if (child instanceof Properties) properties = (Properties)child;
        else if (child instanceof Subcomponents) subcomponents = (Subcomponents)child;
        else if (child instanceof Chassis) chassis = (Chassis)child;
        else if (child instanceof Port) port = (Port)child;
        else if (child instanceof PowerSupply) powerSupply = (PowerSupply)child;
        else if (child instanceof Fan) fan = (Fan)child;
        else if (child instanceof Fabric) fabric = (Fabric)child;
        else if (child instanceof Storage) storage = (Storage)child;
        else if (child instanceof Cpu) cpu = (Cpu)child;
        else if (child instanceof IntegratedCircuit) integratedCircuit = (IntegratedCircuit)child;
        else if (child instanceof Backplane) backplane = (Backplane)child;
        else if (child instanceof Transceiver) transceiver = (Transceiver)child;
        else if (child instanceof OpticalChannel) opticalChannel = (OpticalChannel)child;
    }

}