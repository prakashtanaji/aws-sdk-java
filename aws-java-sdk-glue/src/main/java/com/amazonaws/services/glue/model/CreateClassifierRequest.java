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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClassifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateGrokClassifierRequest grokClassifier;
    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateXMLClassifierRequest xMLClassifier;

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object specifying the classifier to create.
     */

    public void setGrokClassifier(CreateGrokClassifierRequest grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @return A <code>GrokClassifier</code> object specifying the classifier to create.
     */

    public CreateGrokClassifierRequest getGrokClassifier() {
        return this.grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @param grokClassifier
     *        A <code>GrokClassifier</code> object specifying the classifier to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassifierRequest withGrokClassifier(CreateGrokClassifierRequest grokClassifier) {
        setGrokClassifier(grokClassifier);
        return this;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object specifying the classifier to create.
     */

    public void setXMLClassifier(CreateXMLClassifierRequest xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @return An <code>XMLClassifier</code> object specifying the classifier to create.
     */

    public CreateXMLClassifierRequest getXMLClassifier() {
        return this.xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     * 
     * @param xMLClassifier
     *        An <code>XMLClassifier</code> object specifying the classifier to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClassifierRequest withXMLClassifier(CreateXMLClassifierRequest xMLClassifier) {
        setXMLClassifier(xMLClassifier);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGrokClassifier() != null)
            sb.append("GrokClassifier: ").append(getGrokClassifier()).append(",");
        if (getXMLClassifier() != null)
            sb.append("XMLClassifier: ").append(getXMLClassifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClassifierRequest == false)
            return false;
        CreateClassifierRequest other = (CreateClassifierRequest) obj;
        if (other.getGrokClassifier() == null ^ this.getGrokClassifier() == null)
            return false;
        if (other.getGrokClassifier() != null && other.getGrokClassifier().equals(this.getGrokClassifier()) == false)
            return false;
        if (other.getXMLClassifier() == null ^ this.getXMLClassifier() == null)
            return false;
        if (other.getXMLClassifier() != null && other.getXMLClassifier().equals(this.getXMLClassifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrokClassifier() == null) ? 0 : getGrokClassifier().hashCode());
        hashCode = prime * hashCode + ((getXMLClassifier() == null) ? 0 : getXMLClassifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateClassifierRequest clone() {
        return (CreateClassifierRequest) super.clone();
    }

}
