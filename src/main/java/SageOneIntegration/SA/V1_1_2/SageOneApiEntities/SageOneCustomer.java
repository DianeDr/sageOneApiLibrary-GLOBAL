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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;


@JsonDeserialize(builder = SageOneCustomer.Builder.class)
public final class SageOneCustomer {
   private final Integer ID;
   //RequiredString length: inclusive between 0 and 100
   private final String Name;
   private final SageOneCustomerCategory Category;
   private final Integer SalesRepresentativeId;
   private final SageOneSalesRepresentative SageOneSalesRepresentative;
    //String length: inclusive between 0 and 30
   private final String TaxReference;
   //String length: inclusive between 0 and 100
   private final String ContactName;
   //String length: inclusive between 0 and 30
   private final String Telephone;
   //String length: inclusive between 0 and 30
   private final String Fax;
   //String length: inclusive between 0 and 30
   private final String Mobile;
   private final String Email;
   //String length: inclusive between 0 and 100
   private final String WebAddress;
   private final Boolean Active;
   private final double Balance;
   private final double CreditLimit;
   //Gets or sets the communication method. Optional. None = 0, Print = 1, Email = 2, Print and Email = 3
   private final Integer CommunicationMethod;
   //String length: inclusive between 0 and 100
   private final String PostalAddress01;
   private final String PostalAddress02;
   private final String PostalAddress03;
   private final String PostalAddress04;
   private final String PostalAddress05;
   private final String DeliveryAddress01;
   private final String DeliveryAddress02;
   private final String DeliveryAddress03;
   private final String DeliveryAddress04;
   private final String DeliveryAddress05;
   //----------------------------------------------
   private final Boolean AutoAllocateToOldestInvoice;
   private final Boolean EnableCustomerZone;
   private final String CustomerZoneGuid;
   private final Boolean CashSale;
   //String length: inclusive between 0 and 100
   private final String TextField1;
   private final String TextField2;
   private final String TextField3;
   //------------------------------------
   private final double NumericField1;
   private final double NumericField2;
   private final double NumericField3;
   private final Boolean YesNoField1;
   private final Boolean YesNoField2;
   private final Boolean YesNoField3;
   private final Date DateField1;
   private final Date DateField2;
   private final Date DateField3;
   private final Integer DefaultPriceListId;
   private final SageOneAdditionalPriceList DefaultPriceList;
   private final String DefaultPriceListName;
   private final Boolean AcceptsElectronicInvoices;
   private final Date Modified;
   private final Date Created;
   private final String BusinessRegistrationNumber;
   private final Date TaxStatusVerified;
   private final Integer CurrencyId;
   private final Boolean HasActivity;
   private final double DefaultDiscountPercentage;
   private final Integer DefaultTaxTypeId;
   private final SageOneTaxType defaultSageOneTaxType;
   private final Integer DueDateMethodId;
   private final Integer DueDateMethodValue;
   private final String CurrencySymbol;

   public SageOneCustomer(Builder builder) {
      ID                          = builder.ID;
      Name                        = builder.Name;
      Category                    = builder.Category;
      SalesRepresentativeId       = builder.SalesRepresentativeId;
      SageOneSalesRepresentative = builder.SageOneSalesRepresentative;
      TaxReference                = builder.TaxReference;
      ContactName                 = builder.ContactName;
      Telephone                   = builder.Telephone;
      Fax                         = builder.Fax;
      Mobile                      = builder.Mobile;
      Email                       = builder.Email;
      WebAddress                  = builder.WebAddress;
      Active                      = builder.Active;
      Balance                     = builder.Balance;
      CreditLimit                 = builder.CreditLimit;
      CommunicationMethod         = builder.CommunicationMethod;
      PostalAddress01             = builder.PostalAddress01;
      PostalAddress02             = builder.PostalAddress02;
      PostalAddress03             = builder.PostalAddress03;
      PostalAddress04             = builder.PostalAddress04;
      PostalAddress05             = builder.PostalAddress05;
      DeliveryAddress01           = builder.DeliveryAddress01;
      DeliveryAddress02           = builder.DeliveryAddress02;
      DeliveryAddress03           = builder.DeliveryAddress03;
      DeliveryAddress04           = builder.DeliveryAddress04;
      DeliveryAddress05           = builder.DeliveryAddress05;
      AutoAllocateToOldestInvoice = builder.AutoAllocateToOldestInvoice;
      EnableCustomerZone          = builder.EnableCustomerZone;
      CustomerZoneGuid            = builder.CustomerZoneGuid;
      CashSale                    = builder.CashSale;
      TextField1                  = builder.TextField1;
      TextField2                  = builder.TextField2;
      TextField3                  = builder.TextField3;
      NumericField1               = builder.NumericField1;
      NumericField2               = builder.NumericField2;
      NumericField3               = builder.NumericField3;
      YesNoField1                 = builder.YesNoField1;
      YesNoField2                 = builder.YesNoField2;
      YesNoField3                 = builder.YesNoField3;
      DateField1                  = builder.DateField1;
      DateField2                  = builder.DateField2;
      DateField3                  = builder.DateField3;
      DefaultPriceListId          = builder.DefaultPriceListId;
      DefaultPriceList            = builder.DefaultPriceList;
      DefaultPriceListName        = builder.DefaultPriceListName;
      AcceptsElectronicInvoices   = builder.AcceptsElectronicInvoices;
      Modified                    = builder.Modified;
      Created                     = builder.Created;
      BusinessRegistrationNumber  = builder.BusinessRegistrationNumber;
      TaxStatusVerified           = builder.TaxStatusVerified;
      CurrencyId                  = builder.CurrencyId;
      HasActivity                 = builder.HasActivity;
      DefaultDiscountPercentage   = builder.DefaultDiscountPercentage;
      DefaultTaxTypeId            = builder.DefaultTaxTypeId;
      defaultSageOneTaxType = builder.defaultSageOneTaxType;
      DueDateMethodId             = builder.DueDateMethodId;
      DueDateMethodValue          = builder.DueDateMethodValue;
      CurrencySymbol              = builder.CurrencySymbol;
   }

   public static class Builder {
      private Integer ID = 0;
      private String Name;
      private SageOneCustomerCategory Category;
      private Integer SalesRepresentativeId;
      private SageOneSalesRepresentative SageOneSalesRepresentative;
      private String TaxReference;
      private String ContactName;
      private String Telephone;
      private String Fax;
      private String Mobile;
      private String Email;
      private String WebAddress;
      private Boolean Active;
      private double Balance;
      private double CreditLimit;
      private Integer CommunicationMethod;
      private String PostalAddress01 = "";
      private String PostalAddress02 = "";
      private String PostalAddress03 = "";
      private String PostalAddress04 = "";
      private String PostalAddress05 = "";
      private String DeliveryAddress01 = "";
      private String DeliveryAddress02 = "";
      private String DeliveryAddress03 = "";
      private String DeliveryAddress04 = "";
      private String DeliveryAddress05 = "";
      private Boolean AutoAllocateToOldestInvoice;
      private Boolean EnableCustomerZone;
      private String CustomerZoneGuid;
      private Boolean CashSale;
      private String TextField1;
      private String TextField2;
      private String TextField3;
      private double NumericField1;
      private double NumericField2;
      private double NumericField3;
      private Boolean YesNoField1;
      private Boolean YesNoField2;
      private Boolean YesNoField3;
      private Date DateField1;
      private Date DateField2;
      private Date DateField3;
      private Integer DefaultPriceListId;
      private SageOneAdditionalPriceList DefaultPriceList;
      private String DefaultPriceListName;
      private Boolean AcceptsElectronicInvoices;
      private Date Modified;
      private Date Created;
      private String BusinessRegistrationNumber;
      private Date TaxStatusVerified;
      private Integer CurrencyId;
      private Boolean HasActivity;
      private double DefaultDiscountPercentage;
      private Integer DefaultTaxTypeId;
      private SageOneTaxType defaultSageOneTaxType;
      private Integer DueDateMethodId;
      private Integer DueDateMethodValue;
      private String CurrencySymbol;


      public Builder withID(final Integer val){
         ID = val;
         return this;
      }

      public Builder withName(final String val){
         Name = val;
         return this;
      }

      public Builder withCategory(final SageOneCustomerCategory val){
         Category = val;
         return this;
      }

      public Builder withSalesRepresentativeId(final Integer val){
         SalesRepresentativeId = val;
         return this;
      }

      public Builder withSalesRepresentative(final SageOneSalesRepresentative val){
         SageOneSalesRepresentative = val;
         return this;
      }

      public Builder withTaxReference(final String val){
         TaxReference = val;
         return this;
      }

      public Builder withContactName(final String val){
         ContactName = val;
         return this;
      }

      public Builder withTelephone(final String val){
         Telephone = val;
         return this;
      }

      public Builder withFax(final String val){
         Fax = val;
         return this;
      }

      public Builder withMobile(final String val){
         Mobile = val;
         return this;
      }

      public Builder withEmail(final String val){
         Email = val;
         return this;
      }

      public Builder withWebAddress(final String val){
         WebAddress = val;
         return this;
      }

      public Builder withActive(final Boolean val){
         Active = val;
         return this;
      }

      public Builder withBalance(final double val){
         Balance = val;
         return this;
      }

      public Builder withCreditLimit(final double val){
         CreditLimit = val;
         return this;
      }

      public Builder withCommunicationMethod(final Integer val){
         CommunicationMethod = val;
         return this;
      }

      public Builder withPostalAddress01(final String val){
         PostalAddress01 = val;
         return this;
      }

      public Builder withPostalAddress02(final String val){
         PostalAddress02 = val;
         return this;
      }

      public Builder withPostalAddress03(final String val){
         PostalAddress03 = val;
         return this;
      }

      public Builder withPostalAddress04(final String val){
         PostalAddress04 = val;
         return this;
      }

      public Builder withPostalAddress05(final String val){
         PostalAddress05 = val;
         return this;
      }

      public Builder withDeliveryAddress01(final String val){
         DeliveryAddress01 = val;
         return this;
      }

      public Builder withDeliveryAddress02(final String val){
         DeliveryAddress02 = val;
         return this;
      }

      public Builder withDeliveryAddress03(final String val){
         DeliveryAddress03 = val;
         return this;
      }

      public Builder withDeliveryAddress04(final String val){
         DeliveryAddress04 = val;
         return this;
      }

      public Builder withDeliveryAddress05(final String val){
         DeliveryAddress05 = val;
         return this;
      }

      public Builder withAutoAllocateToOldestInvoice(final Boolean val){
         AutoAllocateToOldestInvoice = val;
         return this;
      }

      public Builder withEnableCustomerZone(final Boolean val){
         EnableCustomerZone = val;
         return this;
      }

      public Builder withCustomerZoneGuid(final String val){
         CustomerZoneGuid = val;
         return this;
      }

      public Builder withCashSale(final Boolean val){
         CashSale = val;
         return this;
      }

      public Builder withTextField1(final String val){
         TextField1 = val;
         return this;
      }

      public Builder withTextField2(final String val){
         TextField2 = val;
         return this;
      }

      public Builder withTextField3(final String val){
         TextField3 = val;
         return this;
      }

      public Builder withNumericField1(final double val){
         NumericField1 = val;
         return this;
      }

      public Builder withNumericField2(final double val){
         NumericField2 = val;
         return this;
      }

      public Builder withNumericField3(final double val){
         NumericField3 = val;
         return this;
      }

      public Builder withYesNoField1(final Boolean val){
         YesNoField1 = val;
         return this;
      }

      public Builder withYesNoField2(final Boolean val){
         YesNoField2 = val;
         return this;
      }

      public Builder withYesNoField3(final Boolean val){
         YesNoField3 = val;
         return this;
      }

      public Builder withDateField1(final Date val){
         DateField1 = val;
         return this;
      }

      public Builder withDateField2(final Date val){
         DateField2 = val;
         return this;
      }

      public Builder withDateField3(final Date val){
         DateField3 = val;
         return this;
      }

      public Builder withDefaultPriceListId(final Integer val){
         DefaultPriceListId = val;
         return this;
      }

      public Builder withDefaultPriceList(final SageOneAdditionalPriceList val){
         DefaultPriceList = val;
         return this;
      }

      public Builder withDefaultPriceListName(final String val){
         DefaultPriceListName = val;
         return this;
      }

      public Builder withAcceptsElectronicInvoices(final Boolean val){
         AcceptsElectronicInvoices = val;
         return this;
      }

      public Builder withModified(final Date val){
         Modified = val;
         return this;
      }

      public Builder withCreated(final Date val){
         Created = val;
         return this;
      }

      public Builder withBusinessRegistrationNumber(final String val){
         BusinessRegistrationNumber = val;
         return this;
      }

      public Builder withTaxStatusVerified(final Date val){
         TaxStatusVerified = val;
         return this;
      }

      public Builder withCurrencyId(final Integer val){
         CurrencyId = val;
         return this;
      }


      public Builder withHasActivity(final Boolean val){
         HasActivity = val;
         return this;
      }


      public Builder withDefaultDiscountPercentage(final double val){
         DefaultDiscountPercentage = val;
         return this;
      }


      public Builder withDefaultTaxTypeId(final Integer val){
         DefaultTaxTypeId = val;
         return this;
      }

      public Builder withDefaultTaxType(final SageOneTaxType val){
         defaultSageOneTaxType = val;
         return this;
      }


      public Builder withDueDateMethodId(final Integer val){
         DueDateMethodId = val;
         return this;
      }


      public Builder withDueDateMethodValue(final Integer val){
         DueDateMethodValue = val;
         return this;
      }

      public Builder withCurrencySymbol(final String val){
         CurrencySymbol = val;
         return this;
      }

      public SageOneCustomer build(){
         return new SageOneCustomer(this);
      }
   }

   public Integer getId() {
      return ID;
   }

   public String getName() {
      return Name;
   }

   public SageOneCustomerCategory getCategory() {
      return Category;
   }

   public Integer getSalesRepresentativeId() {
      return SalesRepresentativeId;
   }

   public SageOneSalesRepresentative getSageOneSalesRepresentative() {
      return SageOneSalesRepresentative;
   }

   public String getTaxReference() {
      return TaxReference;
   }

   public String getContactName() {
      return ContactName;
   }

   public String getTelephone() {
      return Telephone;
   }

   public String getFax() {
      return Fax;
   }

   public String getMobile() {
      return Mobile;
   }

   public String getEmail() {
      return Email;
   }

   public String getWebAddress() {
      return WebAddress;
   }

   public Boolean isActive() {
      return Active;
   }

   public double getBalance() {
      return Balance;
   }

   public double getCreditLimit() {
      return CreditLimit;
   }

   public Integer getCommunicationMethod() {
      return CommunicationMethod;
   }

   public String getPostalAddress01() {
      return PostalAddress01;
   }

   public String getPostalAddress02() {
      return PostalAddress02;
   }

   public String getPostalAddress03() {
      return PostalAddress03;
   }

   public String getPostalAddress04() {
      return PostalAddress04;
   }

   public String getPostalAddress05() {
      return PostalAddress05;
   }

   public String getDeliveryAddress01() {
      return DeliveryAddress01;
   }

   public String getDeliveryAddress02() {
      return DeliveryAddress02;
   }

   public String getDeliveryAddress03() {
      return DeliveryAddress03;
   }

   public String getDeliveryAddress04() {
      return DeliveryAddress04;
   }

   public String getDeliveryAddress05() {
      return DeliveryAddress05;
   }

   public Boolean isAutoAllocateToOldestInvoice() {
      return AutoAllocateToOldestInvoice;
   }

   public Boolean isEnableCustomerZone() {
      return EnableCustomerZone;
   }

   public String getCustomerZoneGuid() {
      return CustomerZoneGuid;
   }

   public Boolean isCashSale() {
      return CashSale;
   }

   public String getTextField1() {
      return TextField1;
   }

   public String getTextField2() {
      return TextField2;
   }

   public String getTextField3() {
      return TextField3;
   }

   public double getNumericField1() {
      return NumericField1;
   }

   public double getNumericField2() {
      return NumericField2;
   }

   public double getNumericField3() {
      return NumericField3;
   }

   public Boolean isYesNoField1() {
      return YesNoField1;
   }

   public Boolean isYesNoField2() {
      return YesNoField2;
   }

   public Boolean isYesNoField3() {
      return YesNoField3;
   }

   public Date getDateField1() {
      return DateField1;
   }

   public Date getDateField2() {
      return DateField2;
   }

   public Date getDateField3() {
      return DateField3;
   }

   public Integer getDefaultPriceListId() {
      return DefaultPriceListId;
   }

   public SageOneAdditionalPriceList getDefaultPriceList() {
      return DefaultPriceList;
   }

   public String getDefaultPriceListName() {
      return DefaultPriceListName;
   }

   public Boolean isAcceptsElectronicInvoices() {
      return AcceptsElectronicInvoices;
   }

   public Date getModified() {
      return Modified;
   }

   public Date getCreated() {
      return Created;
   }

   public String getBusinessRegistrationNumber() {
      return BusinessRegistrationNumber;
   }

   public Date getTaxStatusVerified() {
      return TaxStatusVerified;
   }

   public Integer getCurrencyId() {
      return CurrencyId;
   }

   public Boolean isHasActivity() {
      return HasActivity;
   }

   public double getDefaultDiscountPercentage() {
      return DefaultDiscountPercentage;
   }

   public Integer getDefaultTaxTypeId() {
      return DefaultTaxTypeId;
   }

   public SageOneTaxType getDefaultSageOneTaxType() {
      return defaultSageOneTaxType;
   }

   public Integer getDueDateMethodId() {
      return DueDateMethodId;
   }

   public Integer getDueDateMethodValue() {
      return DueDateMethodValue;
   }

   public String getCurrencySymbol() {
      return CurrencySymbol;
   }
}
