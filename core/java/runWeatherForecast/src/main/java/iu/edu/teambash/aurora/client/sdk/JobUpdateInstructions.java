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
 * Update configuration and setting details.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class JobUpdateInstructions implements org.apache.thrift.TBase<JobUpdateInstructions, JobUpdateInstructions._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdateInstructions> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdateInstructions");
    private static final org.apache.thrift.protocol.TField INITIAL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("initialState", org.apache.thrift.protocol.TType.SET, (short) 1);
    private static final org.apache.thrift.protocol.TField DESIRED_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("desiredState", org.apache.thrift.protocol.TType.STRUCT, (short) 2);
    private static final org.apache.thrift.protocol.TField SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("settings", org.apache.thrift.protocol.TType.STRUCT, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new JobUpdateInstructionsStandardSchemeFactory());
        schemes.put(TupleScheme.class, new JobUpdateInstructionsTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.INITIAL_STATE, new org.apache.thrift.meta_data.FieldMetaData("initialState", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InstanceTaskConfig.class))));
        tmpMap.put(_Fields.DESIRED_STATE, new org.apache.thrift.meta_data.FieldMetaData("desiredState", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InstanceTaskConfig.class)));
        tmpMap.put(_Fields.SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("settings", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateSettings.class)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdateInstructions.class, metaDataMap);
    }

    /**
     * Actual InstanceId -> TaskConfig mapping when the update was requested.
     */
    public Set<InstanceTaskConfig> initialState; // required
    /**
     * Desired configuration when the update completes.
     */
    public InstanceTaskConfig desiredState; // required
    /**
     * Update specific settings.
     */
    public JobUpdateSettings settings; // required

    public JobUpdateInstructions() {
    }

    public JobUpdateInstructions(
            Set<InstanceTaskConfig> initialState,
            InstanceTaskConfig desiredState,
            JobUpdateSettings settings) {
        this();
        this.initialState = initialState;
        this.desiredState = desiredState;
        this.settings = settings;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public JobUpdateInstructions(JobUpdateInstructions other) {
        if (other.isSetInitialState()) {
            Set<InstanceTaskConfig> __this__initialState = new HashSet<InstanceTaskConfig>(other.initialState.size());
            for (InstanceTaskConfig other_element : other.initialState) {
                __this__initialState.add(new InstanceTaskConfig(other_element));
            }
            this.initialState = __this__initialState;
        }
        if (other.isSetDesiredState()) {
            this.desiredState = new InstanceTaskConfig(other.desiredState);
        }
        if (other.isSetSettings()) {
            this.settings = new JobUpdateSettings(other.settings);
        }
    }

    public JobUpdateInstructions deepCopy() {
        return new JobUpdateInstructions(this);
    }

    @Override
    public void clear() {
        this.initialState = null;
        this.desiredState = null;
        this.settings = null;
    }

    public int getInitialStateSize() {
        return (this.initialState == null) ? 0 : this.initialState.size();
    }

    public java.util.Iterator<InstanceTaskConfig> getInitialStateIterator() {
        return (this.initialState == null) ? null : this.initialState.iterator();
    }

    public void addToInitialState(InstanceTaskConfig elem) {
        if (this.initialState == null) {
            this.initialState = new HashSet<InstanceTaskConfig>();
        }
        this.initialState.add(elem);
    }

    /**
     * Actual InstanceId -> TaskConfig mapping when the update was requested.
     */
    public Set<InstanceTaskConfig> getInitialState() {
        return this.initialState;
    }

    /**
     * Actual InstanceId -> TaskConfig mapping when the update was requested.
     */
    public JobUpdateInstructions setInitialState(Set<InstanceTaskConfig> initialState) {
        this.initialState = initialState;
        return this;
    }

    public void unsetInitialState() {
        this.initialState = null;
    }

    /**
     * Returns true if field initialState is set (has been assigned a value) and false otherwise
     */
    public boolean isSetInitialState() {
        return this.initialState != null;
    }

    public void setInitialStateIsSet(boolean value) {
        if (!value) {
            this.initialState = null;
        }
    }

    /**
     * Desired configuration when the update completes.
     */
    public InstanceTaskConfig getDesiredState() {
        return this.desiredState;
    }

    /**
     * Desired configuration when the update completes.
     */
    public JobUpdateInstructions setDesiredState(InstanceTaskConfig desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    public void unsetDesiredState() {
        this.desiredState = null;
    }

    /**
     * Returns true if field desiredState is set (has been assigned a value) and false otherwise
     */
    public boolean isSetDesiredState() {
        return this.desiredState != null;
    }

    public void setDesiredStateIsSet(boolean value) {
        if (!value) {
            this.desiredState = null;
        }
    }

    /**
     * Update specific settings.
     */
    public JobUpdateSettings getSettings() {
        return this.settings;
    }

    /**
     * Update specific settings.
     */
    public JobUpdateInstructions setSettings(JobUpdateSettings settings) {
        this.settings = settings;
        return this;
    }

    public void unsetSettings() {
        this.settings = null;
    }

    /**
     * Returns true if field settings is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSettings() {
        return this.settings != null;
    }

    public void setSettingsIsSet(boolean value) {
        if (!value) {
            this.settings = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case INITIAL_STATE:
                if (value == null) {
                    unsetInitialState();
                } else {
                    setInitialState((Set<InstanceTaskConfig>) value);
                }
                break;

            case DESIRED_STATE:
                if (value == null) {
                    unsetDesiredState();
                } else {
                    setDesiredState((InstanceTaskConfig) value);
                }
                break;

            case SETTINGS:
                if (value == null) {
                    unsetSettings();
                } else {
                    setSettings((JobUpdateSettings) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case INITIAL_STATE:
                return getInitialState();

            case DESIRED_STATE:
                return getDesiredState();

            case SETTINGS:
                return getSettings();

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
            case INITIAL_STATE:
                return isSetInitialState();
            case DESIRED_STATE:
                return isSetDesiredState();
            case SETTINGS:
                return isSetSettings();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof JobUpdateInstructions)
            return this.equals((JobUpdateInstructions) that);
        return false;
    }

    public boolean equals(JobUpdateInstructions that) {
        if (that == null)
            return false;

        boolean this_present_initialState = true && this.isSetInitialState();
        boolean that_present_initialState = true && that.isSetInitialState();
        if (this_present_initialState || that_present_initialState) {
            if (!(this_present_initialState && that_present_initialState))
                return false;
            if (!this.initialState.equals(that.initialState))
                return false;
        }

        boolean this_present_desiredState = true && this.isSetDesiredState();
        boolean that_present_desiredState = true && that.isSetDesiredState();
        if (this_present_desiredState || that_present_desiredState) {
            if (!(this_present_desiredState && that_present_desiredState))
                return false;
            if (!this.desiredState.equals(that.desiredState))
                return false;
        }

        boolean this_present_settings = true && this.isSetSettings();
        boolean that_present_settings = true && that.isSetSettings();
        if (this_present_settings || that_present_settings) {
            if (!(this_present_settings && that_present_settings))
                return false;
            if (!this.settings.equals(that.settings))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_initialState = true && (isSetInitialState());
        list.add(present_initialState);
        if (present_initialState)
            list.add(initialState);

        boolean present_desiredState = true && (isSetDesiredState());
        list.add(present_desiredState);
        if (present_desiredState)
            list.add(desiredState);

        boolean present_settings = true && (isSetSettings());
        list.add(present_settings);
        if (present_settings)
            list.add(settings);

        return list.hashCode();
    }

    @Override
    public int compareTo(JobUpdateInstructions other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetInitialState()).compareTo(other.isSetInitialState());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetInitialState()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initialState, other.initialState);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetDesiredState()).compareTo(other.isSetDesiredState());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetDesiredState()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desiredState, other.desiredState);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetSettings()).compareTo(other.isSetSettings());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSettings()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settings, other.settings);
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
        StringBuilder sb = new StringBuilder("JobUpdateInstructions(");
        boolean first = true;

        sb.append("initialState:");
        if (this.initialState == null) {
            sb.append("null");
        } else {
            sb.append(this.initialState);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("desiredState:");
        if (this.desiredState == null) {
            sb.append("null");
        } else {
            sb.append(this.desiredState);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("settings:");
        if (this.settings == null) {
            sb.append("null");
        } else {
            sb.append(this.settings);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
        if (desiredState != null) {
            desiredState.validate();
        }
        if (settings != null) {
            settings.validate();
        }
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
        /**
         * Actual InstanceId -> TaskConfig mapping when the update was requested.
         */
        INITIAL_STATE((short) 1, "initialState"),
        /**
         * Desired configuration when the update completes.
         */
        DESIRED_STATE((short) 2, "desiredState"),
        /**
         * Update specific settings.
         */
        SETTINGS((short) 3, "settings");

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
                case 1: // INITIAL_STATE
                    return INITIAL_STATE;
                case 2: // DESIRED_STATE
                    return DESIRED_STATE;
                case 3: // SETTINGS
                    return SETTINGS;
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

    private static class JobUpdateInstructionsStandardSchemeFactory implements SchemeFactory {
        public JobUpdateInstructionsStandardScheme getScheme() {
            return new JobUpdateInstructionsStandardScheme();
        }
    }

    private static class JobUpdateInstructionsStandardScheme extends StandardScheme<JobUpdateInstructions> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdateInstructions struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // INITIAL_STATE
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set222 = iprot.readSetBegin();
                                struct.initialState = new HashSet<InstanceTaskConfig>(2 * _set222.size);
                                InstanceTaskConfig _elem223;
                                for (int _i224 = 0; _i224 < _set222.size; ++_i224) {
                                    _elem223 = new InstanceTaskConfig();
                                    _elem223.read(iprot);
                                    struct.initialState.add(_elem223);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setInitialStateIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // DESIRED_STATE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.desiredState = new InstanceTaskConfig();
                            struct.desiredState.read(iprot);
                            struct.setDesiredStateIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // SETTINGS
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.settings = new JobUpdateSettings();
                            struct.settings.read(iprot);
                            struct.setSettingsIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdateInstructions struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.initialState != null) {
                oprot.writeFieldBegin(INITIAL_STATE_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.initialState.size()));
                    for (InstanceTaskConfig _iter225 : struct.initialState) {
                        _iter225.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            if (struct.desiredState != null) {
                oprot.writeFieldBegin(DESIRED_STATE_FIELD_DESC);
                struct.desiredState.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.settings != null) {
                oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
                struct.settings.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class JobUpdateInstructionsTupleSchemeFactory implements SchemeFactory {
        public JobUpdateInstructionsTupleScheme getScheme() {
            return new JobUpdateInstructionsTupleScheme();
        }
    }

    private static class JobUpdateInstructionsTupleScheme extends TupleScheme<JobUpdateInstructions> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdateInstructions struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetInitialState()) {
                optionals.set(0);
            }
            if (struct.isSetDesiredState()) {
                optionals.set(1);
            }
            if (struct.isSetSettings()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetInitialState()) {
                {
                    oprot.writeI32(struct.initialState.size());
                    for (InstanceTaskConfig _iter226 : struct.initialState) {
                        _iter226.write(oprot);
                    }
                }
            }
            if (struct.isSetDesiredState()) {
                struct.desiredState.write(oprot);
            }
            if (struct.isSetSettings()) {
                struct.settings.write(oprot);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdateInstructions struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TSet _set227 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.initialState = new HashSet<InstanceTaskConfig>(2 * _set227.size);
                    InstanceTaskConfig _elem228;
                    for (int _i229 = 0; _i229 < _set227.size; ++_i229) {
                        _elem228 = new InstanceTaskConfig();
                        _elem228.read(iprot);
                        struct.initialState.add(_elem228);
                    }
                }
                struct.setInitialStateIsSet(true);
            }
            if (incoming.get(1)) {
                struct.desiredState = new InstanceTaskConfig();
                struct.desiredState.read(iprot);
                struct.setDesiredStateIsSet(true);
            }
            if (incoming.get(2)) {
                struct.settings = new JobUpdateSettings();
                struct.settings.read(iprot);
                struct.setSettingsIsSet(true);
            }
        }
    }

}

