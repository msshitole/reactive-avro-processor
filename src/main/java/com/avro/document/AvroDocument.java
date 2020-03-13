/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.avro.document;

@org.apache.avro.specific.AvroGenerated
public interface AvroDocument {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"AvroDocument\",\"namespace\":\"com.avro.document\",\"types\":[{\"type\":\"record\",\"name\":\"Attachment\",\"fields\":[{\"name\":\"url\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"description\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]},{\"type\":\"record\",\"name\":\"Document\",\"fields\":[{\"name\":\"_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"attachments\",\"type\":[{\"type\":\"array\",\"items\":\"Attachment\",\"java-class\":\"java.util.ArrayList\"},\"null\"]}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends AvroDocument {
    public static final org.apache.avro.Protocol PROTOCOL = com.avro.document.AvroDocument.PROTOCOL;
  }
}