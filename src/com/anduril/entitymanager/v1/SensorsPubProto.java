// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/sensors.pub.proto

package com.anduril.entitymanager.v1;

public final class SensorsPubProto {
  private SensorsPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Sensors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Sensors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Sensor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Sensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_FieldOfView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_FieldOfView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ProjectedFrustum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ProjectedFrustum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_RFConfiguration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_RFConfiguration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_BandwidthRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_BandwidthRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Bandwidth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Bandwidth_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*anduril/entitymanager/v1/sensors.pub.p" +
      "roto\022\030anduril.entitymanager.v1\032+anduril/" +
      "entitymanager/v1/location.pub.proto\032)and" +
      "uril/entitymanager/v1/signal.pub.proto\032\037" +
      "google/protobuf/timestamp.proto\032\036google/" +
      "protobuf/wrappers.proto\"E\n\007Sensors\022:\n\007se" +
      "nsors\030\001 \003(\0132 .anduril.entitymanager.v1.S" +
      "ensorR\007sensors\"\361\003\n\006Sensor\022\033\n\tsensor_id\030\001" +
      " \001(\tR\010sensorId\022W\n\021operational_state\030\003 \001(" +
      "\0162*.anduril.entitymanager.v1.Operational" +
      "StateR\020operationalState\022E\n\013sensor_type\030\005" +
      " \001(\0162$.anduril.entitymanager.v1.SensorTy" +
      "peR\nsensorType\022-\n\022sensor_description\030\006 \001" +
      "(\tR\021sensorDescription\022R\n\017rf_configuraton" +
      "\030\007 \001(\0132).anduril.entitymanager.v1.RFConf" +
      "igurationR\016rfConfiguraton\022T\n\030last_detect" +
      "ion_timestamp\030\010 \001(\0132\032.google.protobuf.Ti" +
      "mestampR\026lastDetectionTimestamp\022K\n\016field" +
      "s_of_view\030\t \003(\0132%.anduril.entitymanager." +
      "v1.FieldOfViewR\014fieldsOfViewJ\004\010\004\020\005\"\355\003\n\013F" +
      "ieldOfView\022\025\n\006fov_id\030\001 \001(\005R\005fovId\022\031\n\010mou" +
      "nt_id\030\002 \001(\tR\007mountId\022W\n\021projected_frustu" +
      "m\030\003 \001(\0132*.anduril.entitymanager.v1.Proje" +
      "ctedFrustumR\020projectedFrustum\022T\n\024project" +
      "ed_center_ray\030\004 \001(\0132\".anduril.entitymana" +
      "ger.v1.PositionR\022projectedCenterRay\022F\n\017c" +
      "enter_ray_pose\030\005 \001(\0132\036.anduril.entityman" +
      "ager.v1.PoseR\rcenterRayPose\022%\n\016horizonta" +
      "l_fov\030\006 \001(\002R\rhorizontalFov\022!\n\014vertical_f" +
      "ov\030\007 \001(\002R\013verticalFov\0221\n\005range\030\010 \001(\0132\033.g" +
      "oogle.protobuf.FloatValueR\005range\0228\n\004mode" +
      "\030\t \001(\0162$.anduril.entitymanager.v1.Sensor" +
      "ModeR\004mode\"\246\002\n\020ProjectedFrustum\022A\n\nupper" +
      "_left\030\001 \001(\0132\".anduril.entitymanager.v1.P" +
      "ositionR\tupperLeft\022C\n\013upper_right\030\002 \001(\0132" +
      "\".anduril.entitymanager.v1.PositionR\nupp" +
      "erRight\022E\n\014bottom_right\030\003 \001(\0132\".anduril." +
      "entitymanager.v1.PositionR\013bottomRight\022C" +
      "\n\013bottom_left\030\004 \001(\0132\".anduril.entitymana" +
      "ger.v1.PositionR\nbottomLeft\"\315\001\n\017RFConfig" +
      "uration\022V\n\022frequency_range_hz\030\003 \003(\0132(.an" +
      "duril.entitymanager.v1.FrequencyRangeR\020f" +
      "requencyRangeHz\022V\n\022bandwidth_range_hz\030\004 " +
      "\003(\0132(.anduril.entitymanager.v1.Bandwidth" +
      "RangeR\020bandwidthRangeHzJ\004\010\001\020\002J\004\010\002\020\003\"\264\001\n\016" +
      "BandwidthRange\022P\n\021minimum_bandwidth\030\001 \001(" +
      "\0132#.anduril.entitymanager.v1.BandwidthR\020" +
      "minimumBandwidth\022P\n\021maximum_bandwidth\030\002 " +
      "\001(\0132#.anduril.entitymanager.v1.Bandwidth" +
      "R\020maximumBandwidth\"L\n\tBandwidth\022?\n\014bandw" +
      "idth_hz\030\001 \001(\0132\034.google.protobuf.DoubleVa" +
      "lueR\013bandwidthHz*\324\001\n\020OperationalState\022\035\n" +
      "\031OPERATIONAL_STATE_INVALID\020\000\022\031\n\025OPERATIO" +
      "NAL_STATE_OFF\020\001\022%\n!OPERATIONAL_STATE_NON" +
      "_OPERATIONAL\020\002\022\036\n\032OPERATIONAL_STATE_DEGR" +
      "ADED\020\003\022!\n\035OPERATIONAL_STATE_OPERATIONAL\020" +
      "\004\022\034\n\030OPERATIONAL_STATE_DENIED\020\005*\240\001\n\nSens" +
      "orMode\022\027\n\023SENSOR_MODE_INVALID\020\000\022\026\n\022SENSO" +
      "R_MODE_SEARCH\020\001\022\025\n\021SENSOR_MODE_TRACK\020\002\022\036" +
      "\n\032SENSOR_MODE_WEAPON_SUPPORT\020\003\022\024\n\020SENSOR" +
      "_MODE_AUTO\020\004\022\024\n\020SENSOR_MODE_MUTE\020\005*\353\001\n\nS" +
      "ensorType\022\027\n\023SENSOR_TYPE_INVALID\020\000\022\025\n\021SE" +
      "NSOR_TYPE_RADAR\020\001\022\026\n\022SENSOR_TYPE_CAMERA\020" +
      "\002\022\033\n\027SENSOR_TYPE_TRANSPONDER\020\003\022\022\n\016SENSOR" +
      "_TYPE_RF\020\004\022\023\n\017SENSOR_TYPE_GPS\020\005\022\027\n\023SENSO" +
      "R_TYPE_PTU_POS\020\006\022\031\n\025SENSOR_TYPE_PERIMETE" +
      "R\020\010\022\025\n\021SENSOR_TYPE_SONAR\020\t\"\004\010\007\020\007B\203\002\n\034com" +
      ".anduril.entitymanager.v1B\017SensorsPubPro" +
      "toP\001ZPgithub.com/anduril/lattice-sdk-jav" +
      "a/src/anduril/entitymanager/v1;entityman" +
      "agerv1\242\002\003AEX\252\002\030Anduril.Entitymanager.V1\312" +
      "\002\030Anduril\\Entitymanager\\V1\342\002$Anduril\\Ent" +
      "itymanager\\V1\\GPBMetadata\352\002\032Anduril::Ent" +
      "itymanager::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.entitymanager.v1.LocationPubProto.getDescriptor(),
          com.anduril.entitymanager.v1.SignalPubProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_Sensors_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Sensors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Sensors_descriptor,
        new java.lang.String[] { "Sensors", });
    internal_static_anduril_entitymanager_v1_Sensor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_Sensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Sensor_descriptor,
        new java.lang.String[] { "SensorId", "OperationalState", "SensorType", "SensorDescription", "RfConfiguraton", "LastDetectionTimestamp", "FieldsOfView", });
    internal_static_anduril_entitymanager_v1_FieldOfView_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_FieldOfView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_FieldOfView_descriptor,
        new java.lang.String[] { "FovId", "MountId", "ProjectedFrustum", "ProjectedCenterRay", "CenterRayPose", "HorizontalFov", "VerticalFov", "Range", "Mode", });
    internal_static_anduril_entitymanager_v1_ProjectedFrustum_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entitymanager_v1_ProjectedFrustum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ProjectedFrustum_descriptor,
        new java.lang.String[] { "UpperLeft", "UpperRight", "BottomRight", "BottomLeft", });
    internal_static_anduril_entitymanager_v1_RFConfiguration_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_entitymanager_v1_RFConfiguration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_RFConfiguration_descriptor,
        new java.lang.String[] { "FrequencyRangeHz", "BandwidthRangeHz", });
    internal_static_anduril_entitymanager_v1_BandwidthRange_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_entitymanager_v1_BandwidthRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_BandwidthRange_descriptor,
        new java.lang.String[] { "MinimumBandwidth", "MaximumBandwidth", });
    internal_static_anduril_entitymanager_v1_Bandwidth_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_entitymanager_v1_Bandwidth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Bandwidth_descriptor,
        new java.lang.String[] { "BandwidthHz", });
    com.anduril.entitymanager.v1.LocationPubProto.getDescriptor();
    com.anduril.entitymanager.v1.SignalPubProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
