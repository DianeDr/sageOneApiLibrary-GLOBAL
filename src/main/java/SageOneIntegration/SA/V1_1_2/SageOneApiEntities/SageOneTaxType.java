/**
 Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 **/
package SageOneIntegration.SA.V1_1_2.SageOneApiEntities;


import java.util.Date;

/**
 * Created by brent on 2017/05/31.
 */
public final class SageOneTaxType extends SageOneMainEntity {
    private String Name;
    private Double Percentage;
    private Boolean IsDefault;
    private Boolean HasActivity;
    private Boolean IsManualTax;
    private Date Created;
    private Date Modified;

    public SageOneTaxType() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public Boolean isDefault() {
        return IsDefault;
    }

    public void setDefault(Boolean aDefault) {
        IsDefault = aDefault;
    }

    public Boolean isHasActivity() {
        return HasActivity;
    }

    public void setHasActivity(Boolean hasActivity) {
        HasActivity = hasActivity;
    }

    public Boolean isManualTax() {
        return IsManualTax;
    }

    public void setManualTax(Boolean manualTax) {
        IsManualTax = manualTax;
    }

    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date created) {
        Created = created;
    }

    public Date getModified() {
        return Modified;
    }

    public void setModified(Date modified) {
        Modified = modified;
    }
}
