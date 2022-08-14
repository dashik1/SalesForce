package testdata;

import models.NewAccountModel;
import utilits.FakeMessageGenerator;

public class PrepareNewAccountData {

    public static NewAccountModel getValidData() {
        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Analyst")
                .build();
    }
}
