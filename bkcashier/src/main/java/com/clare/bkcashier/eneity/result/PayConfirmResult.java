package com.clare.bkcashier.eneity.result;

import lombok.Data;

@Data
public class PayConfirmResult extends BaseResult{

    /*
     安全返回的VerifyID
     */
    private String verifyId;

}
