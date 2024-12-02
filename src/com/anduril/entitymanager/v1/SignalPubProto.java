// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: anduril/entitymanager/v1/signal.pub.proto

package com.anduril.entitymanager.v1;

public final class SignalPubProto {
  private SignalPubProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Signal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Signal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_EmitterNotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_EmitterNotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Measurement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Measurement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Frequency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Frequency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_FrequencyRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_LineOfBearing_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_LineOfBearing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_AngleOfArrival_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_AngleOfArrival_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_Fixed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_Fixed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_PulseRepetitionInterval_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_PulseRepetitionInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_anduril_entitymanager_v1_ScanCharacteristics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)anduril/entitymanager/v1/signal.pub.pr" +
      "oto\022\030anduril.entitymanager.v1\032\035anduril/t" +
      "ype/coords.pub.proto\032\036google/protobuf/wr" +
      "appers.proto\"\341\006\n\006Signal\022P\n\020frequency_cen" +
      "ter\030\001 \001(\0132#.anduril.entitymanager.v1.Fre" +
      "quencyH\000R\017frequencyCenter\022S\n\017frequency_r" +
      "ange\030\002 \001(\0132(.anduril.entitymanager.v1.Fr" +
      "equencyRangeH\000R\016frequencyRange\022?\n\014bandwi" +
      "dth_hz\030\003 \001(\0132\034.google.protobuf.DoubleVal" +
      "ueR\013bandwidthHz\022O\n\025signal_to_noise_ratio" +
      "\030\004 \001(\0132\034.google.protobuf.DoubleValueR\022si" +
      "gnalToNoiseRatio\022Q\n\017line_of_bearing\030\005 \001(" +
      "\0132\'.anduril.entitymanager.v1.LineOfBeari" +
      "ngH\001R\rlineOfBearing\0227\n\005fixed\030\006 \001(\0132\037.and" +
      "uril.entitymanager.v1.FixedH\001R\005fixed\022V\n\021" +
      "emitter_notations\030\007 \003(\0132).anduril.entity" +
      "manager.v1.EmitterNotationR\020emitterNotat" +
      "ions\022@\n\rpulse_width_s\030\010 \001(\0132\034.google.pro" +
      "tobuf.DoubleValueR\013pulseWidthS\022m\n\031pulse_" +
      "repetition_interval\030\t \001(\01321.anduril.enti" +
      "tymanager.v1.PulseRepetitionIntervalR\027pu" +
      "lseRepetitionInterval\022`\n\024scan_characteri" +
      "stics\030\013 \001(\0132-.anduril.entitymanager.v1.S" +
      "canCharacteristicsR\023scanCharacteristicsB" +
      "\027\n\025frequency_measurementB\010\n\006reportJ\004\010\n\020\013" +
      "\"z\n\017EmitterNotation\022)\n\020emitter_notation\030" +
      "\001 \001(\tR\017emitterNotation\022<\n\nconfidence\030\002 \001" +
      "(\0132\034.google.protobuf.DoubleValueR\nconfid" +
      "ence\"u\n\013Measurement\0222\n\005value\030\001 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValueR\005value\0222\n\005sigma" +
      "\030\002 \001(\0132\034.google.protobuf.DoubleValueR\005si" +
      "gma\"U\n\tFrequency\022H\n\014frequency_hz\030\001 \001(\0132%" +
      ".anduril.entitymanager.v1.MeasurementR\013f" +
      "requencyHz\"\276\001\n\016FrequencyRange\022U\n\024minimum" +
      "_frequency_hz\030\001 \001(\0132#.anduril.entitymana" +
      "ger.v1.FrequencyR\022minimumFrequencyHz\022U\n\024" +
      "maximum_frequency_hz\030\002 \001(\0132#.anduril.ent" +
      "itymanager.v1.FrequencyR\022maximumFrequenc" +
      "yHz\"\236\002\n\rLineOfBearing\022R\n\020angle_of_arriva" +
      "l\030\003 \001(\0132(.anduril.entitymanager.v1.Angle" +
      "OfArrivalR\016angleOfArrival\022Q\n\020range_estim" +
      "ate_m\030\004 \001(\0132%.anduril.entitymanager.v1.M" +
      "easurementH\000R\016rangeEstimateM\022G\n\013max_rang" +
      "e_m\030\005 \001(\0132%.anduril.entitymanager.v1.Mea" +
      "surementH\000R\tmaxRangeMB\021\n\017detection_range" +
      "J\004\010\001\020\002J\004\010\002\020\003\"\251\001\n\016AngleOfArrival\0227\n\rrelat" +
      "ive_pose\030\001 \001(\0132\022.anduril.type.PoseR\014rela" +
      "tivePose\022^\n!bearing_elevation_covariance" +
      "_rad2\030\002 \001(\0132\023.anduril.type.TMat2R\036bearin" +
      "gElevationCovarianceRad2\"\007\n\005Fixed\"\177\n\027Pul" +
      "seRepetitionInterval\022d\n\033pulse_repetition" +
      "_interval_s\030\001 \001(\0132%.anduril.entitymanage" +
      "r.v1.MeasurementR\030pulseRepetitionInterva" +
      "lS\"\230\001\n\023ScanCharacteristics\022?\n\tscan_type\030" +
      "\001 \001(\0162\".anduril.entitymanager.v1.ScanTyp" +
      "eR\010scanType\022@\n\rscan_period_s\030\002 \001(\0132\034.goo" +
      "gle.protobuf.DoubleValueR\013scanPeriodS*\274\004" +
      "\n\010ScanType\022\025\n\021SCAN_TYPE_INVALID\020\000\022\026\n\022SCA" +
      "N_TYPE_CIRCULAR\020\001\022-\n)SCAN_TYPE_BIDIRECTI" +
      "ONAL_HORIZONTAL_SECTOR\020\002\022+\n\'SCAN_TYPE_BI" +
      "DIRECTIONAL_VERTICAL_SECTOR\020\003\022\032\n\026SCAN_TY" +
      "PE_NON_SCANNING\020\004\022\027\n\023SCAN_TYPE_IRREGULAR" +
      "\020\005\022\025\n\021SCAN_TYPE_CONICAL\020\006\022\034\n\030SCAN_TYPE_L" +
      "OBE_SWITCHING\020\007\022\024\n\020SCAN_TYPE_RASTER\020\010\022&\n" +
      "\"SCAN_TYPE_CIRCULAR_VERTICAL_SECTOR\020\t\022\036\n" +
      "\032SCAN_TYPE_CIRCULAR_CONICAL\020\n\022\034\n\030SCAN_TY" +
      "PE_SECTOR_CONICAL\020\013\022\030\n\024SCAN_TYPE_AGILE_B" +
      "EAM\020\014\022,\n(SCAN_TYPE_UNIDIRECTIONAL_VERTIC" +
      "AL_SECTOR\020\r\022.\n*SCAN_TYPE_UNIDIRECTIONAL_" +
      "HORIZONTAL_SECTOR\020\016\022#\n\037SCAN_TYPE_UNIDIRE" +
      "CTIONAL_SECTOR\020\017\022\"\n\036SCAN_TYPE_BIDIRECTIO" +
      "NAL_SECTOR\020\020B\202\002\n\034com.anduril.entitymanag" +
      "er.v1B\016SignalPubProtoP\001ZPgithub.com/andu" +
      "ril/lattice-sdk-java/src/anduril/entitym" +
      "anager/v1;entitymanagerv1\242\002\003AEX\252\002\030Anduri" +
      "l.Entitymanager.V1\312\002\030Anduril\\Entitymanag" +
      "er\\V1\342\002$Anduril\\Entitymanager\\V1\\GPBMeta" +
      "data\352\002\032Anduril::Entitymanager::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.anduril.type.CoordsPubProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_anduril_entitymanager_v1_Signal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_entitymanager_v1_Signal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Signal_descriptor,
        new java.lang.String[] { "FrequencyCenter", "FrequencyRange", "BandwidthHz", "SignalToNoiseRatio", "LineOfBearing", "Fixed", "EmitterNotations", "PulseWidthS", "PulseRepetitionInterval", "ScanCharacteristics", "FrequencyMeasurement", "Report", });
    internal_static_anduril_entitymanager_v1_EmitterNotation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_anduril_entitymanager_v1_EmitterNotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_EmitterNotation_descriptor,
        new java.lang.String[] { "EmitterNotation", "Confidence", });
    internal_static_anduril_entitymanager_v1_Measurement_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_anduril_entitymanager_v1_Measurement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Measurement_descriptor,
        new java.lang.String[] { "Value", "Sigma", });
    internal_static_anduril_entitymanager_v1_Frequency_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_anduril_entitymanager_v1_Frequency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Frequency_descriptor,
        new java.lang.String[] { "FrequencyHz", });
    internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_anduril_entitymanager_v1_FrequencyRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_FrequencyRange_descriptor,
        new java.lang.String[] { "MinimumFrequencyHz", "MaximumFrequencyHz", });
    internal_static_anduril_entitymanager_v1_LineOfBearing_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_anduril_entitymanager_v1_LineOfBearing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_LineOfBearing_descriptor,
        new java.lang.String[] { "AngleOfArrival", "RangeEstimateM", "MaxRangeM", "DetectionRange", });
    internal_static_anduril_entitymanager_v1_AngleOfArrival_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_anduril_entitymanager_v1_AngleOfArrival_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_AngleOfArrival_descriptor,
        new java.lang.String[] { "RelativePose", "BearingElevationCovarianceRad2", });
    internal_static_anduril_entitymanager_v1_Fixed_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_anduril_entitymanager_v1_Fixed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_Fixed_descriptor,
        new java.lang.String[] { });
    internal_static_anduril_entitymanager_v1_PulseRepetitionInterval_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_anduril_entitymanager_v1_PulseRepetitionInterval_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_PulseRepetitionInterval_descriptor,
        new java.lang.String[] { "PulseRepetitionIntervalS", });
    internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_anduril_entitymanager_v1_ScanCharacteristics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_anduril_entitymanager_v1_ScanCharacteristics_descriptor,
        new java.lang.String[] { "ScanType", "ScanPeriodS", });
    com.anduril.type.CoordsPubProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
