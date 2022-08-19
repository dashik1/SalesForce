package testdata;

import models.NewAccountModel;
import utilits.FakeMessageGenerator;

public class PrepareNewAccountData {


    public static NewAccountModel getValidData() {

        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .fax(FakeMessageGenerator.generatePhone())
                .website(FakeMessageGenerator.generateWebsite())
                .employees(FakeMessageGenerator.generateQuantity())
                .annualRevenue(FakeMessageGenerator.generateQuantity())
                .description(FakeMessageGenerator.generateDescription())
                .type("Analyst")
                .industry("Education")
                .billingStreet(FakeMessageGenerator.generateStreet())
                .shippingStreet(FakeMessageGenerator.generateStreet())
                .billingCity(FakeMessageGenerator.generateCity())
                .billingState(FakeMessageGenerator.generateState())
                .billingZipCode(FakeMessageGenerator.generateZipCode())
                .billingCountry(FakeMessageGenerator.generateCountry())
                .shippingCity(FakeMessageGenerator.generateCity())
                .shippingState(FakeMessageGenerator.generateState())
                .shippingZipCode(FakeMessageGenerator.generateZipCode())
                .shippingCountry(FakeMessageGenerator.generateCountry())
                .build();

    }

}
