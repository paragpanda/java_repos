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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateNetworkInterfaceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInterfaceRequestMarshaller implements Marshaller<Request<CreateNetworkInterfaceRequest>, CreateNetworkInterfaceRequest> {

    public Request<CreateNetworkInterfaceRequest> marshall(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) {

        if (createNetworkInterfaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkInterfaceRequest> request = new DefaultRequest<CreateNetworkInterfaceRequest>(createNetworkInterfaceRequest, "AmazonEC2");
        request.addParameter("Action", "CreateNetworkInterface");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createNetworkInterfaceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createNetworkInterfaceRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<String> createNetworkInterfaceRequestGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createNetworkInterfaceRequest
                .getGroups();
        if (!createNetworkInterfaceRequestGroupsList.isEmpty() || !createNetworkInterfaceRequestGroupsList.isAutoConstruct()) {
            int groupsListIndex = 1;

            for (String createNetworkInterfaceRequestGroupsListValue : createNetworkInterfaceRequestGroupsList) {
                if (createNetworkInterfaceRequestGroupsListValue != null) {
                    request.addParameter("SecurityGroupId." + groupsListIndex, StringUtils.fromString(createNetworkInterfaceRequestGroupsListValue));
                }
                groupsListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getIpv6AddressCount() != null) {
            request.addParameter("Ipv6AddressCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getIpv6AddressCount()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> createNetworkInterfaceRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) createNetworkInterfaceRequest
                .getIpv6Addresses();
        if (!createNetworkInterfaceRequestIpv6AddressesList.isEmpty() || !createNetworkInterfaceRequestIpv6AddressesList.isAutoConstruct()) {
            int ipv6AddressesListIndex = 1;

            for (InstanceIpv6Address createNetworkInterfaceRequestIpv6AddressesListValue : createNetworkInterfaceRequestIpv6AddressesList) {

                if (createNetworkInterfaceRequestIpv6AddressesListValue.getIpv6Address() != null) {
                    request.addParameter("Ipv6Addresses." + ipv6AddressesListIndex + ".Ipv6Address",
                            StringUtils.fromString(createNetworkInterfaceRequestIpv6AddressesListValue.getIpv6Address()));
                }
                ipv6AddressesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(createNetworkInterfaceRequest.getPrivateIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> createNetworkInterfaceRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) createNetworkInterfaceRequest
                .getPrivateIpAddresses();
        if (!createNetworkInterfaceRequestPrivateIpAddressesList.isEmpty() || !createNetworkInterfaceRequestPrivateIpAddressesList.isAutoConstruct()) {
            int privateIpAddressesListIndex = 1;

            for (PrivateIpAddressSpecification createNetworkInterfaceRequestPrivateIpAddressesListValue : createNetworkInterfaceRequestPrivateIpAddressesList) {

                if (createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrimary() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".Primary",
                            StringUtils.fromBoolean(createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrimary()));
                }

                if (createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                    request.addParameter("PrivateIpAddresses." + privateIpAddressesListIndex + ".PrivateIpAddress",
                            StringUtils.fromString(createNetworkInterfaceRequestPrivateIpAddressesListValue.getPrivateIpAddress()));
                }
                privateIpAddressesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount() != null) {
            request.addParameter("SecondaryPrivateIpAddressCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getSecondaryPrivateIpAddressCount()));
        }

        com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest> createNetworkInterfaceRequestIpv4PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest>) createNetworkInterfaceRequest
                .getIpv4Prefixes();
        if (!createNetworkInterfaceRequestIpv4PrefixesList.isEmpty() || !createNetworkInterfaceRequestIpv4PrefixesList.isAutoConstruct()) {
            int ipv4PrefixesListIndex = 1;

            for (Ipv4PrefixSpecificationRequest createNetworkInterfaceRequestIpv4PrefixesListValue : createNetworkInterfaceRequestIpv4PrefixesList) {

                if (createNetworkInterfaceRequestIpv4PrefixesListValue.getIpv4Prefix() != null) {
                    request.addParameter("Ipv4Prefix." + ipv4PrefixesListIndex + ".Ipv4Prefix",
                            StringUtils.fromString(createNetworkInterfaceRequestIpv4PrefixesListValue.getIpv4Prefix()));
                }
                ipv4PrefixesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getIpv4PrefixCount() != null) {
            request.addParameter("Ipv4PrefixCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getIpv4PrefixCount()));
        }

        com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest> createNetworkInterfaceRequestIpv6PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest>) createNetworkInterfaceRequest
                .getIpv6Prefixes();
        if (!createNetworkInterfaceRequestIpv6PrefixesList.isEmpty() || !createNetworkInterfaceRequestIpv6PrefixesList.isAutoConstruct()) {
            int ipv6PrefixesListIndex = 1;

            for (Ipv6PrefixSpecificationRequest createNetworkInterfaceRequestIpv6PrefixesListValue : createNetworkInterfaceRequestIpv6PrefixesList) {

                if (createNetworkInterfaceRequestIpv6PrefixesListValue.getIpv6Prefix() != null) {
                    request.addParameter("Ipv6Prefix." + ipv6PrefixesListIndex + ".Ipv6Prefix",
                            StringUtils.fromString(createNetworkInterfaceRequestIpv6PrefixesListValue.getIpv6Prefix()));
                }
                ipv6PrefixesListIndex++;
            }
        }

        if (createNetworkInterfaceRequest.getIpv6PrefixCount() != null) {
            request.addParameter("Ipv6PrefixCount", StringUtils.fromInteger(createNetworkInterfaceRequest.getIpv6PrefixCount()));
        }

        if (createNetworkInterfaceRequest.getInterfaceType() != null) {
            request.addParameter("InterfaceType", StringUtils.fromString(createNetworkInterfaceRequest.getInterfaceType()));
        }

        if (createNetworkInterfaceRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(createNetworkInterfaceRequest.getSubnetId()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createNetworkInterfaceRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createNetworkInterfaceRequest
                .getTagSpecifications();
        if (!createNetworkInterfaceRequestTagSpecificationsList.isEmpty() || !createNetworkInterfaceRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createNetworkInterfaceRequestTagSpecificationsListValue : createNetworkInterfaceRequestTagSpecificationsList) {

                if (createNetworkInterfaceRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createNetworkInterfaceRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createNetworkInterfaceRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(createNetworkInterfaceRequest.getClientToken()));

        return request;
    }

}