/** "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements; and to You under the Apache License, Version 2.0. "*/
package SageOneIntegration.SA.V1_1_2.SageOneApiEntities;


import java.util.Date;

public final class SageOneItemCategory extends SageOneMainEntity {
    private String Description;
    private Date Modified;
    private Date Created;

    public final String getDescription() {
        return (this.isInitialized()) ? this.Description : "";
    }

    public final void setDescription(final String Description) {
       this.Description = (this.isInitialized()) ? Description : this.Description;
    }

    public final Date getModified() {
        return (this.isInitialized()) ? this.Modified : null;
    }

    public final void setModified(final Date Modified) {
        this.Modified = (this.isInitialized()) ? Modified : this.Modified;
    }

    public final Date getCreated() {
        return (this.isInitialized()) ? this.Created : null;
    }

    public final void setCreated(final Date Created) {
        this.Created = (this.isInitialized()) ? Created : this.Created;
    }
}
