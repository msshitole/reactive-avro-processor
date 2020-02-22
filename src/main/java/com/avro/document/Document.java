/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.avro.document;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Document extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4390977065193322442L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Document\",\"namespace\":\"com.avro.document\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"attachments\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Attachment\",\"fields\":[{\"name\":\"url\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"description\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]},\"java-class\":\"java.util.ArrayList\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Document> ENCODER =
      new BinaryMessageEncoder<Document>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Document> DECODER =
      new BinaryMessageDecoder<Document>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Document> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Document> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Document>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Document to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Document from a ByteBuffer. */
  public static Document fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String _id;
  @Deprecated public java.lang.String text;
  @Deprecated public java.util.List<com.avro.document.Attachment> attachments;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Document() {}

  /**
   * All-args constructor.
   * @param _id The new value for _id
   * @param text The new value for text
   * @param attachments The new value for attachments
   */
  public Document(java.lang.String _id, java.lang.String text, java.util.List<com.avro.document.Attachment> attachments) {
    this._id = _id;
    this.text = text;
    this.attachments = attachments;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _id;
    case 1: return text;
    case 2: return attachments;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _id = (java.lang.String)value$; break;
    case 1: text = (java.lang.String)value$; break;
    case 2: attachments = (java.util.List<com.avro.document.Attachment>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_id' field.
   * @return The value of the '_id' field.
   */
  public java.lang.String getId$1() {
    return _id;
  }

  /**
   * Sets the value of the '_id' field.
   * @param value the value to set.
   */
  public void setId$1(java.lang.String value) {
    this._id = value;
  }

  /**
   * Gets the value of the 'text' field.
   * @return The value of the 'text' field.
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.String value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'attachments' field.
   * @return The value of the 'attachments' field.
   */
  public java.util.List<com.avro.document.Attachment> getAttachments() {
    return attachments;
  }

  /**
   * Sets the value of the 'attachments' field.
   * @param value the value to set.
   */
  public void setAttachments(java.util.List<com.avro.document.Attachment> value) {
    this.attachments = value;
  }

  /**
   * Creates a new Document RecordBuilder.
   * @return A new Document RecordBuilder
   */
  public static com.avro.document.Document.Builder newBuilder() {
    return new com.avro.document.Document.Builder();
  }

  /**
   * Creates a new Document RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Document RecordBuilder
   */
  public static com.avro.document.Document.Builder newBuilder(com.avro.document.Document.Builder other) {
    return new com.avro.document.Document.Builder(other);
  }

  /**
   * Creates a new Document RecordBuilder by copying an existing Document instance.
   * @param other The existing instance to copy.
   * @return A new Document RecordBuilder
   */
  public static com.avro.document.Document.Builder newBuilder(com.avro.document.Document other) {
    return new com.avro.document.Document.Builder(other);
  }

  /**
   * RecordBuilder for Document instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Document>
    implements org.apache.avro.data.RecordBuilder<Document> {

    private java.lang.String _id;
    private java.lang.String text;
    private java.util.List<com.avro.document.Attachment> attachments;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.avro.document.Document.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attachments)) {
        this.attachments = data().deepCopy(fields()[2].schema(), other.attachments);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Document instance
     * @param other The existing instance to copy.
     */
    private Builder(com.avro.document.Document other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other._id)) {
        this._id = data().deepCopy(fields()[0].schema(), other._id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attachments)) {
        this.attachments = data().deepCopy(fields()[2].schema(), other.attachments);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the '_id' field.
      * @return The value.
      */
    public java.lang.String getId$1() {
      return _id;
    }

    /**
      * Sets the value of the '_id' field.
      * @param value The value of '_id'.
      * @return This builder.
      */
    public com.avro.document.Document.Builder setId$1(java.lang.String value) {
      validate(fields()[0], value);
      this._id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the '_id' field has been set.
      * @return True if the '_id' field has been set, false otherwise.
      */
    public boolean hasId$1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the '_id' field.
      * @return This builder.
      */
    public com.avro.document.Document.Builder clearId$1() {
      _id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'text' field.
      * @return The value.
      */
    public java.lang.String getText() {
      return text;
    }

    /**
      * Sets the value of the 'text' field.
      * @param value The value of 'text'.
      * @return This builder.
      */
    public com.avro.document.Document.Builder setText(java.lang.String value) {
      validate(fields()[1], value);
      this.text = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'text' field has been set.
      * @return True if the 'text' field has been set, false otherwise.
      */
    public boolean hasText() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'text' field.
      * @return This builder.
      */
    public com.avro.document.Document.Builder clearText() {
      text = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'attachments' field.
      * @return The value.
      */
    public java.util.List<com.avro.document.Attachment> getAttachments() {
      return attachments;
    }

    /**
      * Sets the value of the 'attachments' field.
      * @param value The value of 'attachments'.
      * @return This builder.
      */
    public com.avro.document.Document.Builder setAttachments(java.util.List<com.avro.document.Attachment> value) {
      validate(fields()[2], value);
      this.attachments = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'attachments' field has been set.
      * @return True if the 'attachments' field has been set, false otherwise.
      */
    public boolean hasAttachments() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'attachments' field.
      * @return This builder.
      */
    public com.avro.document.Document.Builder clearAttachments() {
      attachments = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Document build() {
      try {
        Document record = new Document();
        record._id = fieldSetFlags()[0] ? this._id : (java.lang.String) defaultValue(fields()[0]);
        record.text = fieldSetFlags()[1] ? this.text : (java.lang.String) defaultValue(fields()[1]);
        record.attachments = fieldSetFlags()[2] ? this.attachments : (java.util.List<com.avro.document.Attachment>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Document>
    WRITER$ = (org.apache.avro.io.DatumWriter<Document>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Document>
    READER$ = (org.apache.avro.io.DatumReader<Document>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}