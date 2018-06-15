/* 
 * @(#)OcOptTypes.java        1.0 15/06/18
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "openconfig-transport-types", revision: "2017-08-16".
 */

package com.nokia.eml.yang.openconfigTransportTypes;

import com.tailf.jnc.JNCException;
import com.tailf.jnc.SchemaNode;
import com.tailf.jnc.SchemaParser;
import com.tailf.jnc.SchemaTree;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;

import java.util.HashMap;

/**
 * The root class for namespace http://openconfig.net/yang/transport-types (accessible from 
 * OpenconfigTransportTypes.NAMESPACE) with prefix "oc-opt-types" (OpenconfigTransportTypes.PREFIX).
 *
 * @version 1.0 2018-06-15
 * @author Auto Generated
 */
public class OcOptTypes {

    public static final String NAMESPACE = "http://openconfig.net/yang/transport-types";

    public static final String PREFIX = "oc-opt-types";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "com.nokia.eml.yang.openconfigTransportTypes");
        OcOptTypes.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("OcOptTypes.schema", h, OcOptTypes.class);
    }

}