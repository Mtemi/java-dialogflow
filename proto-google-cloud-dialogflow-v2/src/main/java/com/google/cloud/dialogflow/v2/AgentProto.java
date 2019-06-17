// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dialogflow/v2/agent.proto"
          + "\022\032google.cloud.dialogflow.v2\032\034google/api"
          + "/annotations.proto\032#google/longrunning/o"
          + "perations.proto\032\033google/protobuf/empty.p"
          + "roto\032 google/protobuf/field_mask.proto\032\034"
          + "google/protobuf/struct.proto\032\027google/api"
          + "/client.proto\"\304\005\n\005Agent\022\016\n\006parent\030\001 \001(\t\022"
          + "\024\n\014display_name\030\002 \001(\t\022\035\n\025default_languag"
          + "e_code\030\003 \001(\t\022 \n\030supported_language_codes"
          + "\030\004 \003(\t\022\021\n\ttime_zone\030\005 \001(\t\022\023\n\013description"
          + "\030\006 \001(\t\022\022\n\navatar_uri\030\007 \001(\t\022\026\n\016enable_log"
          + "ging\030\010 \001(\010\022?\n\nmatch_mode\030\t \001(\0162+.google."
          + "cloud.dialogflow.v2.Agent.MatchMode\022 \n\030c"
          + "lassification_threshold\030\n \001(\002\022A\n\013api_ver"
          + "sion\030\016 \001(\0162,.google.cloud.dialogflow.v2."
          + "Agent.ApiVersion\0224\n\004tier\030\017 \001(\0162&.google."
          + "cloud.dialogflow.v2.Agent.Tier\"V\n\tMatchM"
          + "ode\022\032\n\026MATCH_MODE_UNSPECIFIED\020\000\022\025\n\021MATCH"
          + "_MODE_HYBRID\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020\002\"l"
          + "\n\nApiVersion\022\033\n\027API_VERSION_UNSPECIFIED\020"
          + "\000\022\022\n\016API_VERSION_V1\020\001\022\022\n\016API_VERSION_V2\020"
          + "\002\022\031\n\025API_VERSION_V2_BETA_1\020\003\"^\n\004Tier\022\024\n\020"
          + "TIER_UNSPECIFIED\020\000\022\021\n\rTIER_STANDARD\020\001\022\023\n"
          + "\017TIER_ENTERPRISE\020\002\022\030\n\024TIER_ENTERPRISE_PL"
          + "US\020\003\"!\n\017GetAgentRequest\022\016\n\006parent\030\001 \001(\t\""
          + "t\n\017SetAgentRequest\0220\n\005agent\030\001 \001(\0132!.goog"
          + "le.cloud.dialogflow.v2.Agent\022/\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMask\"$\n"
          + "\022DeleteAgentRequest\022\016\n\006parent\030\001 \001(\t\"L\n\023S"
          + "earchAgentsRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpa"
          + "ge_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"b\n\024Sea"
          + "rchAgentsResponse\0221\n\006agents\030\001 \003(\0132!.goog"
          + "le.cloud.dialogflow.v2.Agent\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"#\n\021TrainAgentRequest\022\016\n\006pa"
          + "rent\030\001 \001(\t\"7\n\022ExportAgentRequest\022\016\n\006pare"
          + "nt\030\001 \001(\t\022\021\n\tagent_uri\030\002 \001(\t\"L\n\023ExportAge"
          + "ntResponse\022\023\n\tagent_uri\030\001 \001(\tH\000\022\027\n\ragent"
          + "_content\030\002 \001(\014H\000B\007\n\005agent\"[\n\022ImportAgent"
          + "Request\022\016\n\006parent\030\001 \001(\t\022\023\n\tagent_uri\030\002 \001"
          + "(\tH\000\022\027\n\ragent_content\030\003 \001(\014H\000B\007\n\005agent\"\\"
          + "\n\023RestoreAgentRequest\022\016\n\006parent\030\001 \001(\t\022\023\n"
          + "\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001("
          + "\014H\000B\007\n\005agent2\367\t\n\006Agents\022\201\001\n\010GetAgent\022+.g"
          + "oogle.cloud.dialogflow.v2.GetAgentReques"
          + "t\032!.google.cloud.dialogflow.v2.Agent\"%\202\323"
          + "\344\223\002\037\022\035/v2/{parent=projects/*}/agent\022\216\001\n\010"
          + "SetAgent\022+.google.cloud.dialogflow.v2.Se"
          + "tAgentRequest\032!.google.cloud.dialogflow."
          + "v2.Agent\"2\202\323\344\223\002,\"#/v2/{agent.parent=proj"
          + "ects/*}/agent:\005agent\022|\n\013DeleteAgent\022..go"
          + "ogle.cloud.dialogflow.v2.DeleteAgentRequ"
          + "est\032\026.google.protobuf.Empty\"%\202\323\344\223\002\037*\035/v2"
          + "/{parent=projects/*}/agent\022\237\001\n\014SearchAge"
          + "nts\022/.google.cloud.dialogflow.v2.SearchA"
          + "gentsRequest\0320.google.cloud.dialogflow.v"
          + "2.SearchAgentsResponse\",\202\323\344\223\002&\022$/v2/{par"
          + "ent=projects/*}/agent:search\022\212\001\n\nTrainAg"
          + "ent\022-.google.cloud.dialogflow.v2.TrainAg"
          + "entRequest\032\035.google.longrunning.Operatio"
          + "n\".\202\323\344\223\002(\"#/v2/{parent=projects/*}/agent"
          + ":train:\001*\022\215\001\n\013ExportAgent\022..google.cloud"
          + ".dialogflow.v2.ExportAgentRequest\032\035.goog"
          + "le.longrunning.Operation\"/\202\323\344\223\002)\"$/v2/{p"
          + "arent=projects/*}/agent:export:\001*\022\215\001\n\013Im"
          + "portAgent\022..google.cloud.dialogflow.v2.I"
          + "mportAgentRequest\032\035.google.longrunning.O"
          + "peration\"/\202\323\344\223\002)\"$/v2/{parent=projects/*"
          + "}/agent:import:\001*\022\220\001\n\014RestoreAgent\022/.goo"
          + "gle.cloud.dialogflow.v2.RestoreAgentRequ"
          + "est\032\035.google.longrunning.Operation\"0\202\323\344\223"
          + "\002*\"%/v2/{parent=projects/*}/agent:restor"
          + "e:\001*\032x\312A\031dialogflow.googleapis.com\322AYhtt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "orm,https://www.googleapis.com/auth/dial"
          + "ogflowB\231\001\n\036com.google.cloud.dialogflow.v"
          + "2B\nAgentProtoP\001ZDgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/dialogflow/v2;dialo"
          + "gflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow."
          + "V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2_Agent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Agent_descriptor,
            new java.lang.String[] {
              "Parent",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "EnableLogging",
              "MatchMode",
              "ClassificationThreshold",
              "ApiVersion",
              "Tier",
            });
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
