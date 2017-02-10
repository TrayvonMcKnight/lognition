/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.redsaz.meterrier.importer.model;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HttpSample extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3008963535636828819L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HttpSample\",\"namespace\":\"com.redsaz.meterrier.importer.model\",\"fields\":[{\"name\":\"millisOffset\",\"type\":\"long\",\"default\":0},{\"name\":\"millisElapsed\",\"type\":\"long\",\"default\":-1},{\"name\":\"labelRef\",\"type\":\"int\",\"default\":0},{\"name\":\"threadNameRef\",\"type\":\"int\",\"default\":0},{\"name\":\"responseCodeRef\",\"type\":\"int\",\"default\":0},{\"name\":\"success\",\"type\":\"boolean\",\"default\":true},{\"name\":\"bytesReceived\",\"type\":\"long\",\"default\":-1},{\"name\":\"bytesSent\",\"type\":\"long\",\"default\":-1},{\"name\":\"urlRef\",\"type\":\"int\",\"default\":0},{\"name\":\"currentThreads\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long millisOffset;
  @Deprecated public long millisElapsed;
  @Deprecated public int labelRef;
  @Deprecated public int threadNameRef;
  @Deprecated public int responseCodeRef;
  @Deprecated public boolean success;
  @Deprecated public long bytesReceived;
  @Deprecated public long bytesSent;
  @Deprecated public int urlRef;
  @Deprecated public int currentThreads;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HttpSample() {}

  /**
   * All-args constructor.
   * @param millisOffset The new value for millisOffset
   * @param millisElapsed The new value for millisElapsed
   * @param labelRef The new value for labelRef
   * @param threadNameRef The new value for threadNameRef
   * @param responseCodeRef The new value for responseCodeRef
   * @param success The new value for success
   * @param bytesReceived The new value for bytesReceived
   * @param bytesSent The new value for bytesSent
   * @param urlRef The new value for urlRef
   * @param currentThreads The new value for currentThreads
   */
  public HttpSample(java.lang.Long millisOffset, java.lang.Long millisElapsed, java.lang.Integer labelRef, java.lang.Integer threadNameRef, java.lang.Integer responseCodeRef, java.lang.Boolean success, java.lang.Long bytesReceived, java.lang.Long bytesSent, java.lang.Integer urlRef, java.lang.Integer currentThreads) {
    this.millisOffset = millisOffset;
    this.millisElapsed = millisElapsed;
    this.labelRef = labelRef;
    this.threadNameRef = threadNameRef;
    this.responseCodeRef = responseCodeRef;
    this.success = success;
    this.bytesReceived = bytesReceived;
    this.bytesSent = bytesSent;
    this.urlRef = urlRef;
    this.currentThreads = currentThreads;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return millisOffset;
    case 1: return millisElapsed;
    case 2: return labelRef;
    case 3: return threadNameRef;
    case 4: return responseCodeRef;
    case 5: return success;
    case 6: return bytesReceived;
    case 7: return bytesSent;
    case 8: return urlRef;
    case 9: return currentThreads;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: millisOffset = (java.lang.Long)value$; break;
    case 1: millisElapsed = (java.lang.Long)value$; break;
    case 2: labelRef = (java.lang.Integer)value$; break;
    case 3: threadNameRef = (java.lang.Integer)value$; break;
    case 4: responseCodeRef = (java.lang.Integer)value$; break;
    case 5: success = (java.lang.Boolean)value$; break;
    case 6: bytesReceived = (java.lang.Long)value$; break;
    case 7: bytesSent = (java.lang.Long)value$; break;
    case 8: urlRef = (java.lang.Integer)value$; break;
    case 9: currentThreads = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'millisOffset' field.
   * @return The value of the 'millisOffset' field.
   */
  public java.lang.Long getMillisOffset() {
    return millisOffset;
  }

  /**
   * Sets the value of the 'millisOffset' field.
   * @param value the value to set.
   */
  public void setMillisOffset(java.lang.Long value) {
    this.millisOffset = value;
  }

  /**
   * Gets the value of the 'millisElapsed' field.
   * @return The value of the 'millisElapsed' field.
   */
  public java.lang.Long getMillisElapsed() {
    return millisElapsed;
  }

  /**
   * Sets the value of the 'millisElapsed' field.
   * @param value the value to set.
   */
  public void setMillisElapsed(java.lang.Long value) {
    this.millisElapsed = value;
  }

  /**
   * Gets the value of the 'labelRef' field.
   * @return The value of the 'labelRef' field.
   */
  public java.lang.Integer getLabelRef() {
    return labelRef;
  }

  /**
   * Sets the value of the 'labelRef' field.
   * @param value the value to set.
   */
  public void setLabelRef(java.lang.Integer value) {
    this.labelRef = value;
  }

  /**
   * Gets the value of the 'threadNameRef' field.
   * @return The value of the 'threadNameRef' field.
   */
  public java.lang.Integer getThreadNameRef() {
    return threadNameRef;
  }

  /**
   * Sets the value of the 'threadNameRef' field.
   * @param value the value to set.
   */
  public void setThreadNameRef(java.lang.Integer value) {
    this.threadNameRef = value;
  }

  /**
   * Gets the value of the 'responseCodeRef' field.
   * @return The value of the 'responseCodeRef' field.
   */
  public java.lang.Integer getResponseCodeRef() {
    return responseCodeRef;
  }

  /**
   * Sets the value of the 'responseCodeRef' field.
   * @param value the value to set.
   */
  public void setResponseCodeRef(java.lang.Integer value) {
    this.responseCodeRef = value;
  }

  /**
   * Gets the value of the 'success' field.
   * @return The value of the 'success' field.
   */
  public java.lang.Boolean getSuccess() {
    return success;
  }

  /**
   * Sets the value of the 'success' field.
   * @param value the value to set.
   */
  public void setSuccess(java.lang.Boolean value) {
    this.success = value;
  }

  /**
   * Gets the value of the 'bytesReceived' field.
   * @return The value of the 'bytesReceived' field.
   */
  public java.lang.Long getBytesReceived() {
    return bytesReceived;
  }

  /**
   * Sets the value of the 'bytesReceived' field.
   * @param value the value to set.
   */
  public void setBytesReceived(java.lang.Long value) {
    this.bytesReceived = value;
  }

  /**
   * Gets the value of the 'bytesSent' field.
   * @return The value of the 'bytesSent' field.
   */
  public java.lang.Long getBytesSent() {
    return bytesSent;
  }

  /**
   * Sets the value of the 'bytesSent' field.
   * @param value the value to set.
   */
  public void setBytesSent(java.lang.Long value) {
    this.bytesSent = value;
  }

  /**
   * Gets the value of the 'urlRef' field.
   * @return The value of the 'urlRef' field.
   */
  public java.lang.Integer getUrlRef() {
    return urlRef;
  }

  /**
   * Sets the value of the 'urlRef' field.
   * @param value the value to set.
   */
  public void setUrlRef(java.lang.Integer value) {
    this.urlRef = value;
  }

  /**
   * Gets the value of the 'currentThreads' field.
   * @return The value of the 'currentThreads' field.
   */
  public java.lang.Integer getCurrentThreads() {
    return currentThreads;
  }

  /**
   * Sets the value of the 'currentThreads' field.
   * @param value the value to set.
   */
  public void setCurrentThreads(java.lang.Integer value) {
    this.currentThreads = value;
  }

  /**
   * Creates a new HttpSample RecordBuilder.
   * @return A new HttpSample RecordBuilder
   */
  public static com.redsaz.meterrier.importer.model.HttpSample.Builder newBuilder() {
    return new com.redsaz.meterrier.importer.model.HttpSample.Builder();
  }

  /**
   * Creates a new HttpSample RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HttpSample RecordBuilder
   */
  public static com.redsaz.meterrier.importer.model.HttpSample.Builder newBuilder(com.redsaz.meterrier.importer.model.HttpSample.Builder other) {
    return new com.redsaz.meterrier.importer.model.HttpSample.Builder(other);
  }

  /**
   * Creates a new HttpSample RecordBuilder by copying an existing HttpSample instance.
   * @param other The existing instance to copy.
   * @return A new HttpSample RecordBuilder
   */
  public static com.redsaz.meterrier.importer.model.HttpSample.Builder newBuilder(com.redsaz.meterrier.importer.model.HttpSample other) {
    return new com.redsaz.meterrier.importer.model.HttpSample.Builder(other);
  }

  /**
   * RecordBuilder for HttpSample instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HttpSample>
    implements org.apache.avro.data.RecordBuilder<HttpSample> {

    private long millisOffset;
    private long millisElapsed;
    private int labelRef;
    private int threadNameRef;
    private int responseCodeRef;
    private boolean success;
    private long bytesReceived;
    private long bytesSent;
    private int urlRef;
    private int currentThreads;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.redsaz.meterrier.importer.model.HttpSample.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.millisOffset)) {
        this.millisOffset = data().deepCopy(fields()[0].schema(), other.millisOffset);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.millisElapsed)) {
        this.millisElapsed = data().deepCopy(fields()[1].schema(), other.millisElapsed);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.labelRef)) {
        this.labelRef = data().deepCopy(fields()[2].schema(), other.labelRef);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.threadNameRef)) {
        this.threadNameRef = data().deepCopy(fields()[3].schema(), other.threadNameRef);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.responseCodeRef)) {
        this.responseCodeRef = data().deepCopy(fields()[4].schema(), other.responseCodeRef);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.success)) {
        this.success = data().deepCopy(fields()[5].schema(), other.success);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.bytesReceived)) {
        this.bytesReceived = data().deepCopy(fields()[6].schema(), other.bytesReceived);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.bytesSent)) {
        this.bytesSent = data().deepCopy(fields()[7].schema(), other.bytesSent);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.urlRef)) {
        this.urlRef = data().deepCopy(fields()[8].schema(), other.urlRef);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.currentThreads)) {
        this.currentThreads = data().deepCopy(fields()[9].schema(), other.currentThreads);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HttpSample instance
     * @param other The existing instance to copy.
     */
    private Builder(com.redsaz.meterrier.importer.model.HttpSample other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.millisOffset)) {
        this.millisOffset = data().deepCopy(fields()[0].schema(), other.millisOffset);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.millisElapsed)) {
        this.millisElapsed = data().deepCopy(fields()[1].schema(), other.millisElapsed);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.labelRef)) {
        this.labelRef = data().deepCopy(fields()[2].schema(), other.labelRef);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.threadNameRef)) {
        this.threadNameRef = data().deepCopy(fields()[3].schema(), other.threadNameRef);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.responseCodeRef)) {
        this.responseCodeRef = data().deepCopy(fields()[4].schema(), other.responseCodeRef);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.success)) {
        this.success = data().deepCopy(fields()[5].schema(), other.success);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.bytesReceived)) {
        this.bytesReceived = data().deepCopy(fields()[6].schema(), other.bytesReceived);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.bytesSent)) {
        this.bytesSent = data().deepCopy(fields()[7].schema(), other.bytesSent);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.urlRef)) {
        this.urlRef = data().deepCopy(fields()[8].schema(), other.urlRef);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.currentThreads)) {
        this.currentThreads = data().deepCopy(fields()[9].schema(), other.currentThreads);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'millisOffset' field.
      * @return The value.
      */
    public java.lang.Long getMillisOffset() {
      return millisOffset;
    }

    /**
      * Sets the value of the 'millisOffset' field.
      * @param value The value of 'millisOffset'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setMillisOffset(long value) {
      validate(fields()[0], value);
      this.millisOffset = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'millisOffset' field has been set.
      * @return True if the 'millisOffset' field has been set, false otherwise.
      */
    public boolean hasMillisOffset() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'millisOffset' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearMillisOffset() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'millisElapsed' field.
      * @return The value.
      */
    public java.lang.Long getMillisElapsed() {
      return millisElapsed;
    }

    /**
      * Sets the value of the 'millisElapsed' field.
      * @param value The value of 'millisElapsed'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setMillisElapsed(long value) {
      validate(fields()[1], value);
      this.millisElapsed = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'millisElapsed' field has been set.
      * @return True if the 'millisElapsed' field has been set, false otherwise.
      */
    public boolean hasMillisElapsed() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'millisElapsed' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearMillisElapsed() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'labelRef' field.
      * @return The value.
      */
    public java.lang.Integer getLabelRef() {
      return labelRef;
    }

    /**
      * Sets the value of the 'labelRef' field.
      * @param value The value of 'labelRef'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setLabelRef(int value) {
      validate(fields()[2], value);
      this.labelRef = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'labelRef' field has been set.
      * @return True if the 'labelRef' field has been set, false otherwise.
      */
    public boolean hasLabelRef() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'labelRef' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearLabelRef() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'threadNameRef' field.
      * @return The value.
      */
    public java.lang.Integer getThreadNameRef() {
      return threadNameRef;
    }

    /**
      * Sets the value of the 'threadNameRef' field.
      * @param value The value of 'threadNameRef'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setThreadNameRef(int value) {
      validate(fields()[3], value);
      this.threadNameRef = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'threadNameRef' field has been set.
      * @return True if the 'threadNameRef' field has been set, false otherwise.
      */
    public boolean hasThreadNameRef() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'threadNameRef' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearThreadNameRef() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'responseCodeRef' field.
      * @return The value.
      */
    public java.lang.Integer getResponseCodeRef() {
      return responseCodeRef;
    }

    /**
      * Sets the value of the 'responseCodeRef' field.
      * @param value The value of 'responseCodeRef'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setResponseCodeRef(int value) {
      validate(fields()[4], value);
      this.responseCodeRef = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'responseCodeRef' field has been set.
      * @return True if the 'responseCodeRef' field has been set, false otherwise.
      */
    public boolean hasResponseCodeRef() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'responseCodeRef' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearResponseCodeRef() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'success' field.
      * @return The value.
      */
    public java.lang.Boolean getSuccess() {
      return success;
    }

    /**
      * Sets the value of the 'success' field.
      * @param value The value of 'success'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setSuccess(boolean value) {
      validate(fields()[5], value);
      this.success = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'success' field has been set.
      * @return True if the 'success' field has been set, false otherwise.
      */
    public boolean hasSuccess() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'success' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearSuccess() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'bytesReceived' field.
      * @return The value.
      */
    public java.lang.Long getBytesReceived() {
      return bytesReceived;
    }

    /**
      * Sets the value of the 'bytesReceived' field.
      * @param value The value of 'bytesReceived'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setBytesReceived(long value) {
      validate(fields()[6], value);
      this.bytesReceived = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'bytesReceived' field has been set.
      * @return True if the 'bytesReceived' field has been set, false otherwise.
      */
    public boolean hasBytesReceived() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'bytesReceived' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearBytesReceived() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'bytesSent' field.
      * @return The value.
      */
    public java.lang.Long getBytesSent() {
      return bytesSent;
    }

    /**
      * Sets the value of the 'bytesSent' field.
      * @param value The value of 'bytesSent'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setBytesSent(long value) {
      validate(fields()[7], value);
      this.bytesSent = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'bytesSent' field has been set.
      * @return True if the 'bytesSent' field has been set, false otherwise.
      */
    public boolean hasBytesSent() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'bytesSent' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearBytesSent() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'urlRef' field.
      * @return The value.
      */
    public java.lang.Integer getUrlRef() {
      return urlRef;
    }

    /**
      * Sets the value of the 'urlRef' field.
      * @param value The value of 'urlRef'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setUrlRef(int value) {
      validate(fields()[8], value);
      this.urlRef = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'urlRef' field has been set.
      * @return True if the 'urlRef' field has been set, false otherwise.
      */
    public boolean hasUrlRef() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'urlRef' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearUrlRef() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentThreads' field.
      * @return The value.
      */
    public java.lang.Integer getCurrentThreads() {
      return currentThreads;
    }

    /**
      * Sets the value of the 'currentThreads' field.
      * @param value The value of 'currentThreads'.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder setCurrentThreads(int value) {
      validate(fields()[9], value);
      this.currentThreads = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'currentThreads' field has been set.
      * @return True if the 'currentThreads' field has been set, false otherwise.
      */
    public boolean hasCurrentThreads() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'currentThreads' field.
      * @return This builder.
      */
    public com.redsaz.meterrier.importer.model.HttpSample.Builder clearCurrentThreads() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public HttpSample build() {
      try {
        HttpSample record = new HttpSample();
        record.millisOffset = fieldSetFlags()[0] ? this.millisOffset : (java.lang.Long) defaultValue(fields()[0]);
        record.millisElapsed = fieldSetFlags()[1] ? this.millisElapsed : (java.lang.Long) defaultValue(fields()[1]);
        record.labelRef = fieldSetFlags()[2] ? this.labelRef : (java.lang.Integer) defaultValue(fields()[2]);
        record.threadNameRef = fieldSetFlags()[3] ? this.threadNameRef : (java.lang.Integer) defaultValue(fields()[3]);
        record.responseCodeRef = fieldSetFlags()[4] ? this.responseCodeRef : (java.lang.Integer) defaultValue(fields()[4]);
        record.success = fieldSetFlags()[5] ? this.success : (java.lang.Boolean) defaultValue(fields()[5]);
        record.bytesReceived = fieldSetFlags()[6] ? this.bytesReceived : (java.lang.Long) defaultValue(fields()[6]);
        record.bytesSent = fieldSetFlags()[7] ? this.bytesSent : (java.lang.Long) defaultValue(fields()[7]);
        record.urlRef = fieldSetFlags()[8] ? this.urlRef : (java.lang.Integer) defaultValue(fields()[8]);
        record.currentThreads = fieldSetFlags()[9] ? this.currentThreads : (java.lang.Integer) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
