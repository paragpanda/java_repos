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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetInstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about an instance profile.
     * </p>
     */
    private InstanceProfile instanceProfile;

    /**
     * <p>
     * An object that contains information about an instance profile.
     * </p>
     * 
     * @param instanceProfile
     *        An object that contains information about an instance profile.
     */

    public void setInstanceProfile(InstanceProfile instanceProfile) {
        this.instanceProfile = instanceProfile;
    }

    /**
     * <p>
     * An object that contains information about an instance profile.
     * </p>
     * 
     * @return An object that contains information about an instance profile.
     */

    public InstanceProfile getInstanceProfile() {
        return this.instanceProfile;
    }

    /**
     * <p>
     * An object that contains information about an instance profile.
     * </p>
     * 
     * @param instanceProfile
     *        An object that contains information about an instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceProfileResult withInstanceProfile(InstanceProfile instanceProfile) {
        setInstanceProfile(instanceProfile);
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
        if (getInstanceProfile() != null)
            sb.append("InstanceProfile: ").append(getInstanceProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceProfileResult == false)
            return false;
        GetInstanceProfileResult other = (GetInstanceProfileResult) obj;
        if (other.getInstanceProfile() == null ^ this.getInstanceProfile() == null)
            return false;
        if (other.getInstanceProfile() != null && other.getInstanceProfile().equals(this.getInstanceProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceProfile() == null) ? 0 : getInstanceProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceProfileResult clone() {
        try {
            return (GetInstanceProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}