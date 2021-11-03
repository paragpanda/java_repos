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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * User JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserJsonUnmarshaller implements Unmarshaller<User, JsonUnmarshallerContext> {

    public User unmarshall(JsonUnmarshallerContext context) throws Exception {
        User user = new User();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    user.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    user.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Email", targetDepth)) {
                    context.nextToken();
                    user.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    user.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityType", targetDepth)) {
                    context.nextToken();
                    user.setIdentityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Active", targetDepth)) {
                    context.nextToken();
                    user.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PrincipalId", targetDepth)) {
                    context.nextToken();
                    user.setPrincipalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomPermissionsName", targetDepth)) {
                    context.nextToken();
                    user.setCustomPermissionsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalLoginFederationProviderType", targetDepth)) {
                    context.nextToken();
                    user.setExternalLoginFederationProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalLoginFederationProviderUrl", targetDepth)) {
                    context.nextToken();
                    user.setExternalLoginFederationProviderUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalLoginId", targetDepth)) {
                    context.nextToken();
                    user.setExternalLoginId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return user;
    }

    private static UserJsonUnmarshaller instance;

    public static UserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserJsonUnmarshaller();
        return instance;
    }
}