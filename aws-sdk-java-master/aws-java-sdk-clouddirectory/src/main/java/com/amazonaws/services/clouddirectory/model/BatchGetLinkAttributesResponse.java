/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>GetLinkAttributes</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchGetLinkAttributesResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetLinkAttributesResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attributes that are associated with the typed link.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> attributes;

    /**
     * <p>
     * The attributes that are associated with the typed link.
     * </p>
     * 
     * @return The attributes that are associated with the typed link.
     */

    public java.util.List<AttributeKeyAndValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes that are associated with the typed link.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the typed link.
     */

    public void setAttributes(java.util.Collection<AttributeKeyAndValue> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeKeyAndValue>(attributes);
    }

    /**
     * <p>
     * The attributes that are associated with the typed link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLinkAttributesResponse withAttributes(AttributeKeyAndValue... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AttributeKeyAndValue>(attributes.length));
        }
        for (AttributeKeyAndValue ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes that are associated with the typed link.
     * </p>
     * 
     * @param attributes
     *        The attributes that are associated with the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLinkAttributesResponse withAttributes(java.util.Collection<AttributeKeyAndValue> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetLinkAttributesResponse == false)
            return false;
        BatchGetLinkAttributesResponse other = (BatchGetLinkAttributesResponse) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetLinkAttributesResponse clone() {
        try {
            return (BatchGetLinkAttributesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchGetLinkAttributesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}