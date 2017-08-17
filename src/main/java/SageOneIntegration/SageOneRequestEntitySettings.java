/** "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements; and to You under the Apache License, Version 2.0. "**/
package SageOneIntegration;


public final class SageOneRequestEntitySettings {
    private String stringProperty;
    private Class<?> classProperty;
    private boolean canBeUsedInRequest = true;
    private boolean canBeDeleted = true;
    private boolean canBeSaved = true;
    private boolean canBeGrabbedById = true;
    private boolean canBeDownloaded = false;
    private boolean canBeGrabbedWithoutId = true;
    private boolean initialized = false;

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest,
                                        final boolean canBeDeleted) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.canBeDeleted = canBeDeleted;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest,
                                        final boolean canBeDeleted,
                                        final boolean canBeSaved) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.canBeDeleted = canBeDeleted;
        this.canBeSaved = canBeSaved;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest,
                                        final boolean canBeDeleted,
                                        final boolean canBeSaved,
                                        final boolean canBeGrabbedById) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.canBeDeleted = canBeDeleted;
        this.canBeSaved = canBeSaved;
        this.canBeGrabbedById = canBeGrabbedById;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest,
                                        final boolean canBeDeleted,
                                        final boolean canBeSaved,
                                        final boolean canBeGrabbedById,
                                        final boolean canBeGrabbedWithoutId) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.canBeDeleted = canBeDeleted;
        this.canBeSaved = canBeSaved;
        this.canBeGrabbedById = canBeGrabbedById;
        this.canBeGrabbedWithoutId = canBeGrabbedWithoutId;
        this.initialized = true;
    }

    public SageOneRequestEntitySettings(final String stringProperty,
                                        final Class<?> classProperty,
                                        final boolean canBeUsedInRequest,
                                        final boolean canBeDeleted,
                                        final boolean canBeSaved,
                                        final boolean canBeGrabbedById,
                                        final boolean canBeGrabbedWithoutId,
                                        final boolean canBeDownloaded) {
        this.stringProperty = stringProperty;
        this.classProperty = classProperty;
        this.canBeUsedInRequest = canBeUsedInRequest;
        this.canBeDeleted = canBeDeleted;
        this.canBeSaved = canBeSaved;
        this.canBeGrabbedById = canBeGrabbedById;
        this.canBeGrabbedWithoutId = canBeGrabbedWithoutId;
        this.canBeDownloaded = canBeDownloaded;
        this.initialized = true;
    }


    public final String getStringProperty() {
        return (this.initialized) ? this.stringProperty : null;
    }

    public final void setStringProperty(final String stringProperty) {
        this.stringProperty = (this.initialized) ? stringProperty : this.stringProperty;
    }

    public final Class<?> getClassProperty() {
        return (this.initialized) ? this.classProperty : null;
    }

    public final void setClassProperty(final Class<?> classProperty) {
        this.classProperty = (this.initialized) ? classProperty : this.classProperty;
    }

    public final boolean getCanBeUsedInRequest() {
        return (this.initialized) ? this.canBeUsedInRequest : null;
    }

    public final void setCanBeUsedInRequest(final boolean canBeUsedInRequest) {
        this.canBeUsedInRequest = canBeUsedInRequest;
    }

    public final boolean getCanBeDeleted() {
        return (this.initialized && this.canBeDeleted);
    }

    public final void setCanBeDeleted(final boolean canBeDeleted) {
        this.canBeDeleted = (this.initialized) ? canBeDeleted : this.canBeDeleted;
    }

    public final boolean getCanBeSaved() {
        return (this.initialized) ? this.canBeSaved : null;
    }

    public final void setCanBeSaved(final boolean canBeSaved) {
        this.canBeSaved = (this.initialized) ? canBeSaved : this.canBeSaved;
    }

    public final boolean getCanBeGrabbedById() {
        return (this.initialized) ? this.canBeGrabbedById : null;
    }

    public final void setCanBeGrabbedById(final boolean canBeGrabbedById) {
        this.canBeGrabbedById = (this.initialized) ? canBeGrabbedById : this.canBeGrabbedById;
    }

    public final boolean getCanBeGrabbedWithoutId() {
        return (this.initialized) ? this.canBeGrabbedWithoutId : null;
    }

    public final void setCanBeGrabbedWithoutId(final boolean canBeGrabbedWithoutId) {
        this.canBeGrabbedWithoutId = (this.initialized) ? canBeGrabbedWithoutId : this.canBeGrabbedWithoutId;
    }

    public final boolean getCanBeDownloaded() {
        return (this.initialized) ? this.canBeDownloaded : false;
    }

    public final void setCanBeDownloaded(final boolean canBeDownloaded) {
        this.canBeDownloaded = (this.initialized) ? this.canBeDownloaded : false;
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
