// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WSMessageResProto.proto

package com.lmxdawn.him.common.protobuf;

public final class WSMessageResProtoOuterClass {
  private WSMessageResProtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WSMessageResProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.WSMessageResProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type = 1;</code>
     */
    int getType();

    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    boolean hasMessage();
    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto getMessage();
    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder getMessageOrBuilder();

    /**
     * <code>string create_time = 3;</code>
     */
    java.lang.String getCreateTime();
    /**
     * <code>string create_time = 3;</code>
     */
    com.google.protobuf.ByteString
        getCreateTimeBytes();
  }
  /**
   * <pre>
   * 返回实体
   * </pre>
   *
   * Protobuf type {@code protocol.WSMessageResProto}
   */
  public  static final class WSMessageResProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.WSMessageResProto)
      WSMessageResProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WSMessageResProto.newBuilder() to construct.
    private WSMessageResProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WSMessageResProto() {
      createTime_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WSMessageResProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              type_ = input.readInt32();
              break;
            }
            case 18: {
              com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder subBuilder = null;
              if (message_ != null) {
                subBuilder = message_.toBuilder();
              }
              message_ = input.readMessage(com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(message_);
                message_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              createTime_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.internal_static_protocol_WSMessageResProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.internal_static_protocol_WSMessageResProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.class, com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>int32 type = 1;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto message_;
    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    public boolean hasMessage() {
      return message_ != null;
    }
    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    public com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto getMessage() {
      return message_ == null ? com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.getDefaultInstance() : message_;
    }
    /**
     * <code>.protocol.WSMessageProto message = 2;</code>
     */
    public com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder getMessageOrBuilder() {
      return getMessage();
    }

    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private volatile java.lang.Object createTime_;
    /**
     * <code>string create_time = 3;</code>
     */
    public java.lang.String getCreateTime() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createTime_ = s;
        return s;
      }
    }
    /**
     * <code>string create_time = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCreateTimeBytes() {
      java.lang.Object ref = createTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      if (message_ != null) {
        output.writeMessage(2, getMessage());
      }
      if (!getCreateTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, createTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (message_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMessage());
      }
      if (!getCreateTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, createTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto)) {
        return super.equals(obj);
      }
      com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto other = (com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto) obj;

      if (getType()
          != other.getType()) return false;
      if (hasMessage() != other.hasMessage()) return false;
      if (hasMessage()) {
        if (!getMessage()
            .equals(other.getMessage())) return false;
      }
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 返回实体
     * </pre>
     *
     * Protobuf type {@code protocol.WSMessageResProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.WSMessageResProto)
        com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.internal_static_protocol_WSMessageResProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.internal_static_protocol_WSMessageResProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.class, com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.Builder.class);
      }

      // Construct using com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        if (messageBuilder_ == null) {
          message_ = null;
        } else {
          message_ = null;
          messageBuilder_ = null;
        }
        createTime_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.internal_static_protocol_WSMessageResProto_descriptor;
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto getDefaultInstanceForType() {
        return com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.getDefaultInstance();
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto build() {
        com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto buildPartial() {
        com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto result = new com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto(this);
        result.type_ = type_;
        if (messageBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = messageBuilder_.build();
        }
        result.createTime_ = createTime_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto) {
          return mergeFrom((com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto other) {
        if (other == com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.hasMessage()) {
          mergeMessage(other.getMessage());
        }
        if (!other.getCreateTime().isEmpty()) {
          createTime_ = other.createTime_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 1;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto message_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder> messageBuilder_;
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public boolean hasMessage() {
        return messageBuilder_ != null || message_ != null;
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto getMessage() {
        if (messageBuilder_ == null) {
          return message_ == null ? com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.getDefaultInstance() : message_;
        } else {
          return messageBuilder_.getMessage();
        }
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public Builder setMessage(com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto value) {
        if (messageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          message_ = value;
          onChanged();
        } else {
          messageBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public Builder setMessage(
          com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder builderForValue) {
        if (messageBuilder_ == null) {
          message_ = builderForValue.build();
          onChanged();
        } else {
          messageBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public Builder mergeMessage(com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto value) {
        if (messageBuilder_ == null) {
          if (message_ != null) {
            message_ =
              com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.newBuilder(message_).mergeFrom(value).buildPartial();
          } else {
            message_ = value;
          }
          onChanged();
        } else {
          messageBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public Builder clearMessage() {
        if (messageBuilder_ == null) {
          message_ = null;
          onChanged();
        } else {
          message_ = null;
          messageBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder getMessageBuilder() {
        
        onChanged();
        return getMessageFieldBuilder().getBuilder();
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      public com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder getMessageOrBuilder() {
        if (messageBuilder_ != null) {
          return messageBuilder_.getMessageOrBuilder();
        } else {
          return message_ == null ?
              com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.getDefaultInstance() : message_;
        }
      }
      /**
       * <code>.protocol.WSMessageProto message = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder> 
          getMessageFieldBuilder() {
        if (messageBuilder_ == null) {
          messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProto.Builder, com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.WSMessageProtoOrBuilder>(
                  getMessage(),
                  getParentForChildren(),
                  isClean());
          message_ = null;
        }
        return messageBuilder_;
      }

      private java.lang.Object createTime_ = "";
      /**
       * <code>string create_time = 3;</code>
       */
      public java.lang.String getCreateTime() {
        java.lang.Object ref = createTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          createTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string create_time = 3;</code>
       */
      public com.google.protobuf.ByteString
          getCreateTimeBytes() {
        java.lang.Object ref = createTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          createTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string create_time = 3;</code>
       */
      public Builder setCreateTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string create_time = 3;</code>
       */
      public Builder clearCreateTime() {
        
        createTime_ = getDefaultInstance().getCreateTime();
        onChanged();
        return this;
      }
      /**
       * <code>string create_time = 3;</code>
       */
      public Builder setCreateTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        createTime_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.WSMessageResProto)
    }

    // @@protoc_insertion_point(class_scope:protocol.WSMessageResProto)
    private static final com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto();
    }

    public static com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WSMessageResProto>
        PARSER = new com.google.protobuf.AbstractParser<WSMessageResProto>() {
      @java.lang.Override
      public WSMessageResProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WSMessageResProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WSMessageResProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WSMessageResProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.lmxdawn.him.common.protobuf.WSMessageResProtoOuterClass.WSMessageResProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_WSMessageResProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_WSMessageResProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027WSMessageResProto.proto\022\010protocol\032\024WSM" +
      "essageProto.proto\"a\n\021WSMessageResProto\022\014" +
      "\n\004type\030\001 \001(\005\022)\n\007message\030\002 \001(\0132\030.protocol" +
      ".WSMessageProto\022\023\n\013create_time\030\003 \001(\tB#\n\037" +
      "com.lmxdawn.him.common.protobufH\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.getDescriptor(),
        }, assigner);
    internal_static_protocol_WSMessageResProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_WSMessageResProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_WSMessageResProto_descriptor,
        new java.lang.String[] { "Type", "Message", "CreateTime", });
    com.lmxdawn.him.common.protobuf.WSMessageProtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
