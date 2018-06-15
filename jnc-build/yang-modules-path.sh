export YANG_MODPATH=/root/pyang-pyang-1.7.5/modules/ietf:/root/pyang-pyang-1.7.5/modules/iana:/root/nokia-yang:/root/nokia-yang/interfaces:/root/nokia-yang/lldp:/root/nokia-yang/optical-transport:/root/nokia-yang/platform:/root/nokia-yang/system:/root/nokia-yang/telemetry:/root/nokia-yang/types:/root/nokia-yang/vlan


pyang -f jnc --jnc-no-pkginfo --jnc-ignore-errors --jnc-classpath-schema-loading --jnc-output src/com/nokia/eml/yang /root/nokia-yang/platform/openconfig-platform.yang
pyang -f jnc --jnc-no-pkginfo --jnc-ignore-errors --jnc-classpath-schema-loading --jnc-output src/com/nokia/eml/yang /root/nokia-yang/platform/openconfig-platform-port.yang
pyang -f jnc --jnc-no-pkginfo --jnc-ignore-errors --jnc-classpath-schema-loading --jnc-output src/com/nokia/eml/yang /root/nokia-yang/platform/openconfig-platform-transceiver.yang
pyang -f jnc --jnc-no-pkginfo --jnc-ignore-errors --jnc-classpath-schema-loading --jnc-output src/com/nokia/eml/yang /root/nokia-yang/openconfig-notificaions.yang


sed -i ':a;N;$!ba;s/\n//g' OcPlatform.schema
find . -type f -name "*.schema" | xargs sed -i ':a;N;$!ba;s/\n//g'
