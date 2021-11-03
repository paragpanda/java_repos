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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddThingsToThingGroupParamsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddThingsToThingGroupParamsMarshaller {

    private static final MarshallingInfo<List> THINGGROUPNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("thingGroupNames").build();
    private static final MarshallingInfo<Boolean> OVERRIDEDYNAMICGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overrideDynamicGroups").build();

    private static final AddThingsToThingGroupParamsMarshaller instance = new AddThingsToThingGroupParamsMarshaller();

    public static AddThingsToThingGroupParamsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddThingsToThingGroupParams addThingsToThingGroupParams, ProtocolMarshaller protocolMarshaller) {

        if (addThingsToThingGroupParams == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addThingsToThingGroupParams.getThingGroupNames(), THINGGROUPNAMES_BINDING);
            protocolMarshaller.marshall(addThingsToThingGroupParams.getOverrideDynamicGroups(), OVERRIDEDYNAMICGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}