// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: anduril/ontology/v1/type.pub.proto
// Protobuf Java Version: 4.27.3

package com.anduril.ontology.v1;

public final class TypePubProto {
  private TypePubProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TypePubProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_anduril_ontology_v1_ObjectType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_anduril_ontology_v1_ObjectType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"anduril/ontology/v1/type.pub.proto\022\023an" +
      "duril.ontology.v1\"\306\001\n\nObjectType\0220\n\005clas" +
      "s\030\001 \001(\0162\032.anduril.ontology.v1.ClassR\005cla" +
      "ss\022B\n\013disposition\030\002 \001(\0162 .anduril.ontolo" +
      "gy.v1.DispositionR\013disposition\022B\n\013enviro" +
      "nment\030\003 \001(\0162 .anduril.ontology.v1.Enviro" +
      "nmentR\013environment*\203\002\n\005Class\022\021\n\rCLASS_UN" +
      "KNOWN\020\000\022\020\n\014CLASS_PERSON\020\001\022\r\n\tCLASS_CAR\020\002" +
      "\022\020\n\014CLASS_ANIMAL\020\003\022\025\n\021CLASS_AIR_VEHICLE\020" +
      "\004\022\021\n\rCLASS_BICYCLE\020\005\022\027\n\023CLASS_WATER_VEHI" +
      "CLE\020\006\022\031\n\025CLASS_UNKNOWN_VEHICLE\020\007\022\021\n\rCLAS" +
      "S_MISSILE\020\010\022\035\n\031CLASS_UNKNOWN_AIR_VEHICLE" +
      "\020\t\022\016\n\nCLASS_BIRD\020\n\022\024\n\020CLASS_BACKGROUND\020\013" +
      "*\311\001\n\013Disposition\022\027\n\023DISPOSITION_UNKNOWN\020" +
      "\000\022\030\n\024DISPOSITION_FRIENDLY\020\001\022\027\n\023DISPOSITI" +
      "ON_HOSTILE\020\002\022\032\n\026DISPOSITION_SUSPICIOUS\020\003" +
      "\022 \n\034DISPOSITION_ASSUMED_FRIENDLY\020\004\022\027\n\023DI" +
      "SPOSITION_NEUTRAL\020\005\022\027\n\023DISPOSITION_PENDI" +
      "NG\020\006*\236\001\n\013Environment\022\027\n\023ENVIRONMENT_UNKN" +
      "OWN\020\000\022\023\n\017ENVIRONMENT_AIR\020\001\022\027\n\023ENVIRONMEN" +
      "T_SURFACE\020\002\022\033\n\027ENVIRONMENT_SUB_SURFACE\020\003" +
      "\022\024\n\020ENVIRONMENT_LAND\020\004\022\025\n\021ENVIRONMENT_SP" +
      "ACE\020\005*\311\030\n\013Nationality\022\027\n\023NATIONALITY_INV" +
      "ALID\020\000\022\027\n\023NATIONALITY_ALBANIA\020\001\022\027\n\023NATIO" +
      "NALITY_ALGERIA\020>\022\031\n\025NATIONALITY_ARGENTIN" +
      "A\020O\022\027\n\023NATIONALITY_ARMENIA\020\002\022\031\n\025NATIONAL" +
      "ITY_AUSTRALIA\020\003\022\027\n\023NATIONALITY_AUSTRIA\020\004" +
      "\022\032\n\026NATIONALITY_AZERBAIJAN\020\005\022\027\n\023NATIONAL" +
      "ITY_BELARUS\020\006\022\027\n\023NATIONALITY_BELGIUM\020\007\022\027" +
      "\n\023NATIONALITY_BOLIVIA\020j\022&\n\"NATIONALITY_B" +
      "OSNIA_AND_HERZEGOVINA\020\010\022\026\n\022NATIONALITY_B" +
      "RAZIL\020P\022\030\n\024NATIONALITY_BULGARIA\020\t\022\030\n\024NAT" +
      "IONALITY_CAMBODIA\020D\022\026\n\022NATIONALITY_CANAD" +
      "A\020\n\022\025\n\021NATIONALITY_CHILE\020Q\022\025\n\021NATIONALIT" +
      "Y_CHINA\020H\022\030\n\024NATIONALITY_COLOMBIA\020R\022\027\n\023N" +
      "ATIONALITY_CROATIA\020\013\022\024\n\020NATIONALITY_CUBA" +
      "\020W\022\026\n\022NATIONALITY_CYPRUS\0205\022\036\n\032NATIONALIT" +
      "Y_CZECH_REPUBLIC\020\014\0224\n0NATIONALITY_DEMOCR" +
      "ATIC_PEOPLES_REPUBLIC_OF_KOREA\020J\022\027\n\023NATI" +
      "ONALITY_DENMARK\020\r\022\"\n\036NATIONALITY_DOMINIC" +
      "AN_REPUBLIC\020X\022\027\n\023NATIONALITY_ECUADOR\020k\022\025" +
      "\n\021NATIONALITY_EGYPT\0206\022\027\n\023NATIONALITY_EST" +
      "ONIA\020\016\022\030\n\024NATIONALITY_ETHIOPIA\020?\022\027\n\023NATI" +
      "ONALITY_FINLAND\020\017\022\026\n\022NATIONALITY_FRANCE\020" +
      "\020\022\027\n\023NATIONALITY_GEORGIA\020\021\022\027\n\023NATIONALIT" +
      "Y_GERMANY\020\022\022\026\n\022NATIONALITY_GREECE\020\023\022\031\n\025N" +
      "ATIONALITY_GUATEMALA\020l\022\026\n\022NATIONALITY_GU" +
      "INEA\020\\\022\027\n\023NATIONALITY_HUNGARY\020\024\022\027\n\023NATIO" +
      "NALITY_ICELAND\020\025\022\025\n\021NATIONALITY_INDIA\020B\022" +
      "\031\n\025NATIONALITY_INDONESIA\020g\022\'\n#NATIONALIT" +
      "Y_INTERNATIONAL_RED_CROSS\020q\022\024\n\020NATIONALI" +
      "TY_IRAQ\0208\022\027\n\023NATIONALITY_IRELAND\020\026\022(\n$NA" +
      "TIONALITY_ISLAMIC_REPUBLIC_OF_IRAN\0207\022\026\n\022" +
      "NATIONALITY_ISRAEL\0209\022\025\n\021NATIONALITY_ITAL" +
      "Y\020\027\022\027\n\023NATIONALITY_JAMAICA\020p\022\025\n\021NATIONAL" +
      "ITY_JAPAN\020L\022\026\n\022NATIONALITY_JORDAN\020:\022\032\n\026N" +
      "ATIONALITY_KAZAKHSTAN\020\030\022\026\n\022NATIONALITY_K" +
      "UWAIT\020Z\022 \n\034NATIONALITY_KYRGHYZ_REPUBLIC\020" +
      "\031\022/\n+NATIONALITY_LAO_PEOPLES_DEMOCRATIC_" +
      "REPUBLIC\020E\022\026\n\022NATIONALITY_LATVIA\020\032\022\027\n\023NA" +
      "TIONALITY_LEBANON\020;\022\027\n\023NATIONALITY_LIBER" +
      "IA\020@\022\031\n\025NATIONALITY_LITHUANIA\020\033\022\032\n\026NATIO" +
      "NALITY_LUXEMBOURG\020\034\022\032\n\026NATIONALITY_MADAG" +
      "ASCAR\020]\022\030\n\024NATIONALITY_MALAYSIA\020h\022\025\n\021NAT" +
      "IONALITY_MALTA\020\035\022\026\n\022NATIONALITY_MEXICO\020S" +
      "\022\027\n\023NATIONALITY_MOLDOVA\020\036\022\032\n\026NATIONALITY" +
      "_MONTENEGRO\020\037\022\027\n\023NATIONALITY_MOROCCO\020^\022\027" +
      "\n\023NATIONALITY_MYANMAR\020f\022\024\n\020NATIONALITY_N" +
      "ATO\020 \022\033\n\027NATIONALITY_NETHERLANDS\020!\022\033\n\027NA" +
      "TIONALITY_NEW_ZEALAND\020N\022\031\n\025NATIONALITY_N" +
      "ICARAGUA\020m\022\027\n\023NATIONALITY_NIGERIA\020_\022\026\n\022N" +
      "ATIONALITY_NORWAY\020\"\022\030\n\024NATIONALITY_PAKIS" +
      "TAN\020C\022\026\n\022NATIONALITY_PANAMA\020T\022\030\n\024NATIONA" +
      "LITY_PARAGUAY\020n\022\024\n\020NATIONALITY_PERU\020U\022\033\n" +
      "\027NATIONALITY_PHILIPPINES\020M\022\026\n\022NATIONALIT" +
      "Y_POLAND\020#\022\030\n\024NATIONALITY_PORTUGAL\020$\022!\n\035" +
      "NATIONALITY_REPUBLIC_OF_KOREA\020K\022\027\n\023NATIO" +
      "NALITY_ROMANIA\020%\022\026\n\022NATIONALITY_RUSSIA\020&" +
      "\022\034\n\030NATIONALITY_SAUDI_ARABIA\020<\022\027\n\023NATION" +
      "ALITY_SENEGAL\020`\022\026\n\022NATIONALITY_SERBIA\020\'\022" +
      "\031\n\025NATIONALITY_SINGAPORE\020i\022\030\n\024NATIONALIT" +
      "Y_SLOVAKIA\020(\022\030\n\024NATIONALITY_SLOVENIA\020)\022\034" +
      "\n\030NATIONALITY_SOUTH_AFRICA\020A\022\025\n\021NATIONAL" +
      "ITY_SPAIN\020*\022\025\n\021NATIONALITY_SUDAN\020b\022\026\n\022NA" +
      "TIONALITY_SWEDEN\020+\022\033\n\027NATIONALITY_SWITZE" +
      "RLAND\020,\022$\n NATIONALITY_SYRIAN_ARAB_REPUB" +
      "LIC\020=\022(\n$NATIONALITY_TAIWAN_PROVINCE_OF_" +
      "CHINA\020I\022\032\n\026NATIONALITY_TAJIKISTAN\020-\022\030\n\024N" +
      "ATIONALITY_THAILAND\020F\0229\n5NATIONALITY_THE" +
      "_FORMER_YUGOSLAV_REPUBLIC_OF_MACEDONIA\020." +
      "\022\027\n\023NATIONALITY_TUNISIA\020d\022\026\n\022NATIONALITY" +
      "_TURKEY\020/\022\034\n\030NATIONALITY_TURKMENISTAN\0200\022" +
      "\026\n\022NATIONALITY_UGANDA\020e\022\027\n\023NATIONALITY_U" +
      "KRAINE\0201\022\036\n\032NATIONALITY_UNITED_KINGDOM\0202" +
      "\022\036\n\032NATIONALITY_UNITED_NATIONS\020Y\022+\n\'NATI" +
      "ONALITY_UNITED_REPUBLIC_OF_TANZANIA\020c\022(\n" +
      "$NATIONALITY_UNITED_STATES_OF_AMERICA\0203\022" +
      "\027\n\023NATIONALITY_URUGUAY\020o\022\032\n\026NATIONALITY_" +
      "UZBEKISTAN\0204\022\031\n\025NATIONALITY_VENEZUELA\020V\022" +
      "\027\n\023NATIONALITY_VIETNAM\020G\022\025\n\021NATIONALITY_" +
      "YEMEN\020[\022\030\n\024NATIONALITY_ZIMBABWE\020aB\341\001\n\027co" +
      "m.anduril.ontology.v1B\014TypePubProtoP\001ZJg" +
      "ithub.com/dogun-anduril/anduril-sdk-go/s" +
      "rc/anduril/ontology/v1;ontologyv1\242\002\003AOX\252" +
      "\002\023Anduril.Ontology.V1\312\002\023Anduril\\Ontology" +
      "\\V1\342\002\037Anduril\\Ontology\\V1\\GPBMetadata\352\002\025" +
      "Anduril::Ontology::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_anduril_ontology_v1_ObjectType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_anduril_ontology_v1_ObjectType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_anduril_ontology_v1_ObjectType_descriptor,
        new java.lang.String[] { "Class_", "Disposition", "Environment", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
