/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionCredentialsMarshaller {

    private static final MarshallingInfo<String> ACCESSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessKeyId").build();
    private static final MarshallingInfo<String> SECRETACCESSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretAccessKey").build();
    private static final MarshallingInfo<String> SESSIONTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionToken").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATION_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Expiration").build();

    private static final SessionCredentialsMarshaller instance = new SessionCredentialsMarshaller();

    public static SessionCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionCredentials sessionCredentials, ProtocolMarshaller protocolMarshaller) {

        if (sessionCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionCredentials.getAccessKeyId(), ACCESSKEYID_BINDING);
            protocolMarshaller.marshall(sessionCredentials.getSecretAccessKey(), SECRETACCESSKEY_BINDING);
            protocolMarshaller.marshall(sessionCredentials.getSessionToken(), SESSIONTOKEN_BINDING);
            protocolMarshaller.marshall(sessionCredentials.getExpiration(), EXPIRATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}