package com.clare.bkcashier.eneity.order;


import com.clare.bkcashier.eneity.cashierVO.CashierFundDetail;
import com.clare.bkcashier.eneity.util.CashierMoney;
import com.clare.bkcashier.enums.CashierOrderTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Data
public class CashierOrder implements Serializable {
    /*
    实现CashierOrder存入数据库的序列化
     */
    private static final long serialVersionUID = 133832354007185093L;
    /*
    收银单唯一标识id，自动化生成
     */
    private String cashierOrderId;
    /*
    收银单金额
 */
    private CashierMoney amount;
    /*
    收银类型：
        前置收银
        标准收银
     */
    private CashierOrderTypeEnum cashierType;
    /*
    收方资产TODO
     */
    private CashierFundDetail payeeFundDetails;
    /*
     安全校验信息
     */
//    private Map<String,Object> securityExt;
    /*
    转账日期
     */
    private Date bizPayDate;
    /*
    转账说明
     */
    private String description;
    /*
    路由id
     */
    private  String sharding;
    /*
        收银单状态
     */
    private String status;

//
//    public CashierOrder(CashierOrderView cashierOrderView){
//        this.cashierOrderId = generateCashierId();
//        this.amount = new CashierMoney(cashierOrderView.getAmount());
//        this.cashierType = CashierOrderTypeEnum.valueOf(cashierOrderView.getCashierType());
//        this.payeeFundDetails = new CashierAssetDTO(cashierOrderView.getPayeeFundDetails());
//        this.bizPayDate = new Date();
//        this.description = (String) cashierOrderView.getDescription();
//        this.sharding = null;
//    }

    public CashierOrder(){
    }


    private String generateCashierId(){
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return timeInMillis+"";
    }




}
