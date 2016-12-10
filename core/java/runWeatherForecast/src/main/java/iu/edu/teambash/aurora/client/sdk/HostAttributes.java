/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package iu.edu.teambash.aurora.client.sdk;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * The attributes assigned to a host.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class HostAttributes implements org.apache.thrift.TBase<HostAttributes, HostAttributes._Fields>, java.io.Serializable, Cloneable, Comparable<HostAttributes> {
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostAttributes");
    private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.SET, (short) 2);
    private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short) 3);
    private static final org.apache.thrift.protocol.TField SLAVE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveId", org.apache.thrift.protocol.TType.STRING, (short) 4);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    // isset id assignments
    private static final _Fields optionals[] = {_Fields.MODE, _Fields.SLAVE_ID};

    static {
        schemes.put(StandardScheme.class, new HostAttributesStandardSchemeFactory());
        schemes.put(TupleScheme.class, new HostAttributesTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Attribute.class))));
        tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MaintenanceMode.class)));
        tmpMap.put(_Fields.SLAVE_ID, new org.apache.thrift.meta_data.FieldMetaData("slaveId", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostAttributes.class, metaDataMap);
    }

    public String host; // required
    public Set<Attribute> attributes; // required
    /**
     * @see MaintenanceMode
     */
    public MaintenanceMode mode; // optional
    public String slaveId; // optional

    public HostAttributes() {
    }

    public HostAttributes(
            String host,
            Set<Attribute> attributes) {
        this();
        this.host = host;
        this.attributes = attributes;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public HostAttributes(HostAttributes other) {
        if (other.isSetHost()) {
            this.host = other.host;
        }
        if (other.isSetAttributes()) {
            Set<Attribute> __this__attributes = new HashSet<Attribute>(other.attributes.size());
            for (Attribute other_element : other.attributes) {
                __this__attributes.add(new Attribute(other_element));
            }
            this.attributes = __this__attributes;
        }
        if (other.isSetMode()) {
            this.mode = other.mode;
        }
        if (other.isSetSlaveId()) {
            this.slaveId = other.slaveId;
        }
    }

    public HostAttributes deepCopy() {
        return new HostAttributes(this);
    }

    @Override
    public void clear() {
        this.host = null;
        this.attributes = null;
        this.mode = null;
        this.slaveId = null;
    }

    public String getHost() {
        return this.host;
    }

    public HostAttributes setHost(String host) {
        this.host = host;
        return this;
    }

    public void unsetHost() {
        this.host = null;
    }

    /**
     * Returns true if field host is set (has been assigned a value) and false otherwise
     */
    public boolean isSetHost() {
        return this.host != null;
    }

    public void setHostIsSet(boolean value) {
        if (!value) {
            this.host = null;
        }
    }

    public int getAttributesSize() {
        return (this.attributes == null) ? 0 : this.attributes.size();
    }

    public java.util.Iterator<Attribute> getAttributesIterator() {
        return (this.attributes == null) ? null : this.attributes.iterator();
    }

    public void addToAttributes(Attribute elem) {
        if (this.attributes == null) {
            this.attributes = new HashSet<Attribute>();
        }
        this.attributes.add(elem);
    }

    public Set<Attribute> getAttributes() {
        return this.attributes;
    }

    public HostAttributes setAttributes(Set<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public void unsetAttributes() {
        this.attributes = null;
    }

    /**
     * Returns true if field attributes is set (has been assigned a value) and false otherwise
     */
    public boolean isSetAttributes() {
        return this.attributes != null;
    }

    public void setAttributesIsSet(boolean value) {
        if (!value) {
            this.attributes = null;
        }
    }

    /**
     * @see MaintenanceMode
     */
    public MaintenanceMode getMode() {
        return this.mode;
    }

    /**
     * @see MaintenanceMode
     */
    public HostAttributes setMode(MaintenanceMode mode) {
        this.mode = mode;
        return this;
    }

    public void unsetMode() {
        this.mode = null;
    }

    /**
     * Returns true if field mode is set (has been assigned a value) and false otherwise
     */
    public boolean isSetMode() {
        return this.mode != null;
    }

    public void setModeIsSet(boolean value) {
        if (!value) {
            this.mode = null;
        }
    }

    public String getSlaveId() {
        return this.slaveId;
    }

    public HostAttributes setSlaveId(String slaveId) {
        this.slaveId = slaveId;
        return this;
    }

    public void unsetSlaveId() {
        this.slaveId = null;
    }

    /**
     * Returns true if field slaveId is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSlaveId() {
        return this.slaveId != null;
    }

    public void setSlaveIdIsSet(boolean value) {
        if (!value) {
            this.slaveId = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case HOST:
                if (value == null) {
                    unsetHost();
                } else {
                    setHost((String) value);
                }
                break;

            case ATTRIBUTES:
                if (value == null) {
                    unsetAttributes();
                } else {
                    setAttributes((Set<Attribute>) value);
                }
                break;

            case MODE:
                if (value == null) {
                    unsetMode();
                } else {
                    setMode((MaintenanceMode) value);
                }
                break;

            case SLAVE_ID:
                if (value == null) {
                    unsetSlaveId();
                } else {
                    setSlaveId((String) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case HOST:
                return getHost();

            case ATTRIBUTES:
                return getAttributes();

            case MODE:
                return getMode();

            case SLAVE_ID:
                return getSlaveId();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case HOST:
                return isSetHost();
            case ATTRIBUTES:
                return isSetAttributes();
            case MODE:
                return isSetMode();
            case SLAVE_ID:
                return isSetSlaveId();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof HostAttributes)
            return this.equals((HostAttributes) that);
        return false;
    }

    public boolean equals(HostAttributes that) {
        if (that == null)
            return false;

        boolean this_present_host = true && this.isSetHost();
        boolean that_present_host = true && that.isSetHost();
        if (this_present_host || that_present_host) {
            if (!(this_present_host && that_present_host))
                return false;
            if (!this.host.equals(that.host))
                return false;
        }

        boolean this_present_attributes = true && this.isSetAttributes();
        boolean that_present_attributes = true && that.isSetAttributes();
        if (this_present_attributes || that_present_attributes) {
            if (!(this_present_attributes && that_present_attributes))
                return false;
            if (!this.attributes.equals(that.attributes))
                return false;
        }

        boolean this_present_mode = true && this.isSetMode();
        boolean that_present_mode = true && that.isSetMode();
        if (this_present_mode || that_present_mode) {
            if (!(this_present_mode && that_present_mode))
                return false;
            if (!this.mode.equals(that.mode))
                return false;
        }

        boolean this_present_slaveId = true && this.isSetSlaveId();
        boolean that_present_slaveId = true && that.isSetSlaveId();
        if (this_present_slaveId || that_present_slaveId) {
            if (!(this_present_slaveId && that_present_slaveId))
                return false;
            if (!this.slaveId.equals(that.slaveId))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_host = true && (isSetHost());
        list.add(present_host);
        if (present_host)
            list.add(host);

        boolean present_attributes = true && (isSetAttributes());
        list.add(present_attributes);
        if (present_attributes)
            list.add(attributes);

        boolean present_mode = true && (isSetMode());
        list.add(present_mode);
        if (present_mode)
            list.add(mode.getValue());

        boolean present_slaveId = true && (isSetSlaveId());
        list.add(present_slaveId);
        if (present_slaveId)
            list.add(slaveId);

        return list.hashCode();
    }

    @Override
    public int compareTo(HostAttributes other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetHost()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAttributes()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetMode()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSlaveId()).compareTo(other.isSetSlaveId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSlaveId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveId, other.slaveId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HostAttributes(");
        boolean first = true;

        sb.append("host:");
        if (this.host == null) {
            sb.append("null");
        } else {
            sb.append(this.host);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("attributes:");
        if (this.attributes == null) {
            sb.append("null");
        } else {
            sb.append(this.attributes);
        }
        first = false;
        if (isSetMode()) {
            if (!first) sb.append(", ");
            sb.append("mode:");
            if (this.mode == null) {
                sb.append("null");
            } else {
                sb.append(this.mode);
            }
            first = false;
        }
        if (isSetSlaveId()) {
            if (!first) sb.append(", ");
            sb.append("slaveId:");
            if (this.slaveId == null) {
                sb.append("null");
            } else {
                sb.append(this.slaveId);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        HOST((short) 1, "host"),
        ATTRIBUTES((short) 2, "attributes"),
        /**
         * @see MaintenanceMode
         */
        MODE((short) 3, "mode"),
        SLAVE_ID((short) 4, "slaveId");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // HOST
                    return HOST;
                case 2: // ATTRIBUTES
                    return ATTRIBUTES;
                case 3: // MODE
                    return MODE;
                case 4: // SLAVE_ID
                    return SLAVE_ID;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    private static class HostAttributesStandardSchemeFactory implements SchemeFactory {
        public HostAttributesStandardScheme getScheme() {
            return new HostAttributesStandardScheme();
        }
    }

    private static class HostAttributesStandardScheme extends StandardScheme<HostAttributes> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, HostAttributes struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // HOST
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.host = iprot.readString();
                            struct.setHostIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // ATTRIBUTES
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set8 = iprot.readSetBegin();
                                struct.attributes = new HashSet<Attribute>(2 * _set8.size);
                                Attribute _elem9;
                                for (int _i10 = 0; _i10 < _set8.size; ++_i10) {
                                    _elem9 = new Attribute();
                                    _elem9.read(iprot);
                                    struct.attributes.add(_elem9);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setAttributesIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // MODE
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.mode = iu.edu.teambash.aurora.client.sdk.MaintenanceMode.findByValue(iprot.readI32());
                            struct.setModeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // SLAVE_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.slaveId = iprot.readString();
                            struct.setSlaveIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, HostAttributes struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.host != null) {
                oprot.writeFieldBegin(HOST_FIELD_DESC);
                oprot.writeString(struct.host);
                oprot.writeFieldEnd();
            }
            if (struct.attributes != null) {
                oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.attributes.size()));
                    for (Attribute _iter11 : struct.attributes) {
                        _iter11.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            if (struct.mode != null) {
                if (struct.isSetMode()) {
                    oprot.writeFieldBegin(MODE_FIELD_DESC);
                    oprot.writeI32(struct.mode.getValue());
                    oprot.writeFieldEnd();
                }
            }
            if (struct.slaveId != null) {
                if (struct.isSetSlaveId()) {
                    oprot.writeFieldBegin(SLAVE_ID_FIELD_DESC);
                    oprot.writeString(struct.slaveId);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class HostAttributesTupleSchemeFactory implements SchemeFactory {
        public HostAttributesTupleScheme getScheme() {
            return new HostAttributesTupleScheme();
        }
    }

    private static class HostAttributesTupleScheme extends TupleScheme<HostAttributes> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, HostAttributes struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetHost()) {
                optionals.set(0);
            }
            if (struct.isSetAttributes()) {
                optionals.set(1);
            }
            if (struct.isSetMode()) {
                optionals.set(2);
            }
            if (struct.isSetSlaveId()) {
                optionals.set(3);
            }
            oprot.writeBitSet(optionals, 4);
            if (struct.isSetHost()) {
                oprot.writeString(struct.host);
            }
            if (struct.isSetAttributes()) {
                {
                    oprot.writeI32(struct.attributes.size());
                    for (Attribute _iter12 : struct.attributes) {
                        _iter12.write(oprot);
                    }
                }
            }
            if (struct.isSetMode()) {
                oprot.writeI32(struct.mode.getValue());
            }
            if (struct.isSetSlaveId()) {
                oprot.writeString(struct.slaveId);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, HostAttributes struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(4);
            if (incoming.get(0)) {
                struct.host = iprot.readString();
                struct.setHostIsSet(true);
            }
            if (incoming.get(1)) {
                {
                    org.apache.thrift.protocol.TSet _set13 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.attributes = new HashSet<Attribute>(2 * _set13.size);
                    Attribute _elem14;
                    for (int _i15 = 0; _i15 < _set13.size; ++_i15) {
                        _elem14 = new Attribute();
                        _elem14.read(iprot);
                        struct.attributes.add(_elem14);
                    }
                }
                struct.setAttributesIsSet(true);
            }
            if (incoming.get(2)) {
                struct.mode = iu.edu.teambash.aurora.client.sdk.MaintenanceMode.findByValue(iprot.readI32());
                struct.setModeIsSet(true);
            }
            if (incoming.get(3)) {
                struct.slaveId = iprot.readString();
                struct.setSlaveIdIsSet(true);
            }
        }
    }

}

