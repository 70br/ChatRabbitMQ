package br.ufs.dcomp.rabbitmq;

public final class MsgProto {
  private MsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatMessengerOrBuilder extends
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    java.lang.String getSender();
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    com.google.protobuf.ByteString
        getSenderBytes();

    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string date = 2;</code>
     */
    java.lang.String getDate();
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string date = 2;</code>
     */
    com.google.protobuf.ByteString
        getDateBytes();

    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string time = 3;</code>
     */
    java.lang.String getTime();
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string time = 3;</code>
     */
    com.google.protobuf.ByteString
        getTimeBytes();

    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    java.lang.String getGroup();
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    com.google.protobuf.ByteString
        getGroupBytes();

    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    boolean hasContent();
    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getContent();
    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder getContentOrBuilder();
  }
  /**
   * Protobuf type {@code rabbitmq.ChatMessenger}
   */
  public  static final class ChatMessenger extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:rabbitmq.ChatMessenger)
      ChatMessengerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatMessenger.newBuilder() to construct.
    private ChatMessenger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatMessenger() {
      sender_ = "";
      date_ = "";
      time_ = "";
      group_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMessenger(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              sender_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              date_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              time_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              group_ = s;
              break;
            }
            case 42: {
              br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder subBuilder = null;
              if (content_ != null) {
                subBuilder = content_.toBuilder();
              }
              content_ = input.readMessage(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(content_);
                content_ = subBuilder.buildPartial();
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
      return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.class, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Builder.class);
    }

    public interface ConteudoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:rabbitmq.ChatMessenger.Conteudo)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      java.lang.String getType();
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      com.google.protobuf.ByteString
          getTypeBytes();

      /**
       * <pre>
       * Sequência de bytes que compõe o corpo da mensagem
       * </pre>
       *
       * <code>bytes body = 2;</code>
       */
      com.google.protobuf.ByteString getBody();

      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      java.lang.String getName();
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      com.google.protobuf.ByteString
          getNameBytes();
    }
    /**
     * Protobuf type {@code rabbitmq.ChatMessenger.Conteudo}
     */
    public  static final class Conteudo extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:rabbitmq.ChatMessenger.Conteudo)
        ConteudoOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Conteudo.newBuilder() to construct.
      private Conteudo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Conteudo() {
        type_ = "";
        body_ = com.google.protobuf.ByteString.EMPTY;
        name_ = "";
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Conteudo(
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
              default: {
                if (!parseUnknownFieldProto3(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                java.lang.String s = input.readStringRequireUtf8();

                type_ = s;
                break;
              }
              case 18: {

                body_ = input.readBytes();
                break;
              }
              case 26: {
                java.lang.String s = input.readStringRequireUtf8();

                name_ = s;
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
        return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_Conteudo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.class, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder.class);
      }

      public static final int TYPE_FIELD_NUMBER = 1;
      private volatile java.lang.Object type_;
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        }
      }
      /**
       * <pre>
       * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int BODY_FIELD_NUMBER = 2;
      private com.google.protobuf.ByteString body_;
      /**
       * <pre>
       * Sequência de bytes que compõe o corpo da mensagem
       * </pre>
       *
       * <code>bytes body = 2;</code>
       */
      public com.google.protobuf.ByteString getBody() {
        return body_;
      }

      public static final int NAME_FIELD_NUMBER = 3;
      private volatile java.lang.Object name_;
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        }
      }
      /**
       * <pre>
       * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (!getTypeBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
        }
        if (!body_.isEmpty()) {
          output.writeBytes(2, body_);
        }
        if (!getNameBytes().isEmpty()) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
        }
        unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getTypeBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
        }
        if (!body_.isEmpty()) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(2, body_);
        }
        if (!getNameBytes().isEmpty()) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
        if (!(obj instanceof br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo)) {
          return super.equals(obj);
        }
        br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo other = (br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo) obj;

        boolean result = true;
        result = result && getType()
            .equals(other.getType());
        result = result && getBody()
            .equals(other.getBody());
        result = result && getName()
            .equals(other.getName());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
        hash = (37 * hash) + BODY_FIELD_NUMBER;
        hash = (53 * hash) + getBody().hashCode();
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
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
       * Protobuf type {@code rabbitmq.ChatMessenger.Conteudo}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:rabbitmq.ChatMessenger.Conteudo)
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_Conteudo_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.class, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder.class);
        }

        // Construct using br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.newBuilder()
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
        public Builder clear() {
          super.clear();
          type_ = "";

          body_ = com.google.protobuf.ByteString.EMPTY;

          name_ = "";

          return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor;
        }

        public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getDefaultInstanceForType() {
          return br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.getDefaultInstance();
        }

        public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo build() {
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo buildPartial() {
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo result = new br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo(this);
          result.type_ = type_;
          result.body_ = body_;
          result.name_ = name_;
          onBuilt();
          return result;
        }

        public Builder clone() {
          return (Builder) super.clone();
        }
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.setField(field, value);
        }
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return (Builder) super.clearField(field);
        }
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return (Builder) super.clearOneof(oneof);
        }
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return (Builder) super.setRepeatedField(field, index, value);
        }
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return (Builder) super.addRepeatedField(field, value);
        }
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo) {
            return mergeFrom((br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo other) {
          if (other == br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.getDefaultInstance()) return this;
          if (!other.getType().isEmpty()) {
            type_ = other.type_;
            onChanged();
          }
          if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
            setBody(other.getBody());
          }
          if (!other.getName().isEmpty()) {
            name_ = other.name_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        public final boolean isInitialized() {
          return true;
        }

        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private java.lang.Object type_ = "";
        /**
         * <pre>
         * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
         * </pre>
         *
         * <code>string type = 1;</code>
         */
        public java.lang.String getType() {
          java.lang.Object ref = type_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            type_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
         * </pre>
         *
         * <code>string type = 1;</code>
         */
        public com.google.protobuf.ByteString
            getTypeBytes() {
          java.lang.Object ref = type_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            type_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
         * </pre>
         *
         * <code>string type = 1;</code>
         */
        public Builder setType(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  
          type_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
         * </pre>
         *
         * <code>string type = 1;</code>
         */
        public Builder clearType() {
          
          type_ = getDefaultInstance().getType();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Tipo do conteúdo no padrão de tipos MIME. Exemplos: "text/plain", "image/png" 
         * </pre>
         *
         * <code>string type = 1;</code>
         */
        public Builder setTypeBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
          
          type_ = value;
          onChanged();
          return this;
        }

        private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
        /**
         * <pre>
         * Sequência de bytes que compõe o corpo da mensagem
         * </pre>
         *
         * <code>bytes body = 2;</code>
         */
        public com.google.protobuf.ByteString getBody() {
          return body_;
        }
        /**
         * <pre>
         * Sequência de bytes que compõe o corpo da mensagem
         * </pre>
         *
         * <code>bytes body = 2;</code>
         */
        public Builder setBody(com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  
          body_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Sequência de bytes que compõe o corpo da mensagem
         * </pre>
         *
         * <code>bytes body = 2;</code>
         */
        public Builder clearBody() {
          
          body_ = getDefaultInstance().getBody();
          onChanged();
          return this;
        }

        private java.lang.Object name_ = "";
        /**
         * <pre>
         * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
         * </pre>
         *
         * <code>string name = 3;</code>
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
         * </pre>
         *
         * <code>string name = 3;</code>
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
         * </pre>
         *
         * <code>string name = 3;</code>
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  
          name_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
         * </pre>
         *
         * <code>string name = 3;</code>
         */
        public Builder clearName() {
          
          name_ = getDefaultInstance().getName();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Nome do conteúdo, se existente. Exemplos: "logo_ufs.png", "index.html"
         * </pre>
         *
         * <code>string name = 3;</code>
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
          
          name_ = value;
          onChanged();
          return this;
        }
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:rabbitmq.ChatMessenger.Conteudo)
      }

      // @@protoc_insertion_point(class_scope:rabbitmq.ChatMessenger.Conteudo)
      private static final br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo();
      }

      public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      private static final com.google.protobuf.Parser<Conteudo>
          PARSER = new com.google.protobuf.AbstractParser<Conteudo>() {
        public Conteudo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Conteudo(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<Conteudo> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Conteudo> getParserForType() {
        return PARSER;
      }

      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public static final int SENDER_FIELD_NUMBER = 1;
    private volatile java.lang.Object sender_;
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Nome do emissor
     * </pre>
     *
     * <code>string sender = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATE_FIELD_NUMBER = 2;
    private volatile java.lang.Object date_;
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string date = 2;</code>
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Data de envio
     * </pre>
     *
     * <code>string date = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIME_FIELD_NUMBER = 3;
    private volatile java.lang.Object time_;
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string time = 3;</code>
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Hora de envio
     * </pre>
     *
     * <code>string time = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GROUP_FIELD_NUMBER = 4;
    private volatile java.lang.Object group_;
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        group_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Informa o nome do grupo, se a mensagem for para um grupo
     * </pre>
     *
     * <code>string group = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 5;
    private br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo content_;
    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    public boolean hasContent() {
      return content_ != null;
    }
    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getContent() {
      return content_ == null ? br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.getDefaultInstance() : content_;
    }
    /**
     * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
     */
    public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder getContentOrBuilder() {
      return getContent();
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getSenderBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
      }
      if (!getDateBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, date_);
      }
      if (!getTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, time_);
      }
      if (!getGroupBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, group_);
      }
      if (content_ != null) {
        output.writeMessage(5, getContent());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSenderBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
      }
      if (!getDateBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, date_);
      }
      if (!getTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, time_);
      }
      if (!getGroupBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, group_);
      }
      if (content_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getContent());
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
      if (!(obj instanceof br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger)) {
        return super.equals(obj);
      }
      br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger other = (br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger) obj;

      boolean result = true;
      result = result && getSender()
          .equals(other.getSender());
      result = result && getDate()
          .equals(other.getDate());
      result = result && getTime()
          .equals(other.getTime());
      result = result && getGroup()
          .equals(other.getGroup());
      result = result && (hasContent() == other.hasContent());
      if (hasContent()) {
        result = result && getContent()
            .equals(other.getContent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDate().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
      if (hasContent()) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code rabbitmq.ChatMessenger}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:rabbitmq.ChatMessenger)
        br.ufs.dcomp.rabbitmq.MsgProto.ChatMessengerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.class, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Builder.class);
      }

      // Construct using br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.newBuilder()
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
      public Builder clear() {
        super.clear();
        sender_ = "";

        date_ = "";

        time_ = "";

        group_ = "";

        if (contentBuilder_ == null) {
          content_ = null;
        } else {
          content_ = null;
          contentBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return br.ufs.dcomp.rabbitmq.MsgProto.internal_static_rabbitmq_ChatMessenger_descriptor;
      }

      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger getDefaultInstanceForType() {
        return br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.getDefaultInstance();
      }

      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger build() {
        br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger buildPartial() {
        br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger result = new br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger(this);
        result.sender_ = sender_;
        result.date_ = date_;
        result.time_ = time_;
        result.group_ = group_;
        if (contentBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = contentBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger) {
          return mergeFrom((br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger other) {
        if (other == br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.getDefaultInstance()) return this;
        if (!other.getSender().isEmpty()) {
          sender_ = other.sender_;
          onChanged();
        }
        if (!other.getDate().isEmpty()) {
          date_ = other.date_;
          onChanged();
        }
        if (!other.getTime().isEmpty()) {
          time_ = other.time_;
          onChanged();
        }
        if (!other.getGroup().isEmpty()) {
          group_ = other.group_;
          onChanged();
        }
        if (other.hasContent()) {
          mergeContent(other.getContent());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object sender_ = "";
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string sender = 1;</code>
       */
      public java.lang.String getSender() {
        java.lang.Object ref = sender_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          sender_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string sender = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        java.lang.Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string sender = 1;</code>
       */
      public Builder setSender(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sender_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string sender = 1;</code>
       */
      public Builder clearSender() {
        
        sender_ = getDefaultInstance().getSender();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Nome do emissor
       * </pre>
       *
       * <code>string sender = 1;</code>
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sender_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object date_ = "";
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string date = 2;</code>
       */
      public java.lang.String getDate() {
        java.lang.Object ref = date_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          date_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string date = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDateBytes() {
        java.lang.Object ref = date_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          date_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string date = 2;</code>
       */
      public Builder setDate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        date_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string date = 2;</code>
       */
      public Builder clearDate() {
        
        date_ = getDefaultInstance().getDate();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Data de envio
       * </pre>
       *
       * <code>string date = 2;</code>
       */
      public Builder setDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        date_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object time_ = "";
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string time = 3;</code>
       */
      public java.lang.String getTime() {
        java.lang.Object ref = time_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          time_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string time = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTimeBytes() {
        java.lang.Object ref = time_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          time_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string time = 3;</code>
       */
      public Builder setTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string time = 3;</code>
       */
      public Builder clearTime() {
        
        time_ = getDefaultInstance().getTime();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hora de envio
       * </pre>
       *
       * <code>string time = 3;</code>
       */
      public Builder setTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        time_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object group_ = "";
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string group = 4;</code>
       */
      public java.lang.String getGroup() {
        java.lang.Object ref = group_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          group_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string group = 4;</code>
       */
      public com.google.protobuf.ByteString
          getGroupBytes() {
        java.lang.Object ref = group_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          group_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string group = 4;</code>
       */
      public Builder setGroup(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        group_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string group = 4;</code>
       */
      public Builder clearGroup() {
        
        group_ = getDefaultInstance().getGroup();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Informa o nome do grupo, se a mensagem for para um grupo
       * </pre>
       *
       * <code>string group = 4;</code>
       */
      public Builder setGroupBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        group_ = value;
        onChanged();
        return this;
      }

      private br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo content_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder> contentBuilder_;
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public boolean hasContent() {
        return contentBuilder_ != null || content_ != null;
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo getContent() {
        if (contentBuilder_ == null) {
          return content_ == null ? br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.getDefaultInstance() : content_;
        } else {
          return contentBuilder_.getMessage();
        }
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public Builder setContent(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo value) {
        if (contentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          content_ = value;
          onChanged();
        } else {
          contentBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public Builder setContent(
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder builderForValue) {
        if (contentBuilder_ == null) {
          content_ = builderForValue.build();
          onChanged();
        } else {
          contentBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public Builder mergeContent(br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo value) {
        if (contentBuilder_ == null) {
          if (content_ != null) {
            content_ =
              br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.newBuilder(content_).mergeFrom(value).buildPartial();
          } else {
            content_ = value;
          }
          onChanged();
        } else {
          contentBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public Builder clearContent() {
        if (contentBuilder_ == null) {
          content_ = null;
          onChanged();
        } else {
          content_ = null;
          contentBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder getContentBuilder() {
        
        onChanged();
        return getContentFieldBuilder().getBuilder();
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder getContentOrBuilder() {
        if (contentBuilder_ != null) {
          return contentBuilder_.getMessageOrBuilder();
        } else {
          return content_ == null ?
              br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.getDefaultInstance() : content_;
        }
      }
      /**
       * <code>.rabbitmq.ChatMessenger.Conteudo content = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder> 
          getContentFieldBuilder() {
        if (contentBuilder_ == null) {
          contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.Conteudo.Builder, br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger.ConteudoOrBuilder>(
                  getContent(),
                  getParentForChildren(),
                  isClean());
          content_ = null;
        }
        return contentBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:rabbitmq.ChatMessenger)
    }

    // @@protoc_insertion_point(class_scope:rabbitmq.ChatMessenger)
    private static final br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger();
    }

    public static br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatMessenger>
        PARSER = new com.google.protobuf.AbstractParser<ChatMessenger>() {
      public ChatMessenger parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMessenger(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatMessenger> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessenger> getParserForType() {
      return PARSER;
    }

    public br.ufs.dcomp.rabbitmq.MsgProto.ChatMessenger getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rabbitmq_ChatMessenger_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rabbitmq_ChatMessenger_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rabbitmq_ChatMessenger_Conteudo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017messenger.proto\022\010rabbitmq\"\263\001\n\rChatMess" +
      "enger\022\016\n\006sender\030\001 \001(\t\022\014\n\004date\030\002 \001(\t\022\014\n\004t" +
      "ime\030\003 \001(\t\022\r\n\005group\030\004 \001(\t\0221\n\007content\030\005 \001(" +
      "\0132 .rabbitmq.ChatMessenger.Conteudo\0324\n\010C" +
      "onteudo\022\014\n\004type\030\001 \001(\t\022\014\n\004body\030\002 \001(\014\022\014\n\004n" +
      "ame\030\003 \001(\tB!\n\025br.ufs.dcomp.rabbitmqB\010MsgP" +
      "rotob\006proto3"
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
        }, assigner);
    internal_static_rabbitmq_ChatMessenger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rabbitmq_ChatMessenger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rabbitmq_ChatMessenger_descriptor,
        new java.lang.String[] { "Sender", "Date", "Time", "Group", "Content", });
    internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor =
      internal_static_rabbitmq_ChatMessenger_descriptor.getNestedTypes().get(0);
    internal_static_rabbitmq_ChatMessenger_Conteudo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rabbitmq_ChatMessenger_Conteudo_descriptor,
        new java.lang.String[] { "Type", "Body", "Name", });
  }
}
