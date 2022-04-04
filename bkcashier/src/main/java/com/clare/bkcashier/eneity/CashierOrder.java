package com.clare.bkcashier.eneity;


import com.clare.bkcashier.enums.CashierOrderTypeEnum;
import lombok.Data;
import org.springframework.aop.support.AbstractRegexpMethodPointcut;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

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
    private CashierAsset payeeFundDetails;
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

    public CashierOrder() {
        this.cashierOrderId = generateCashierId();
        this.amount = new CashierMoney();
        this.cashierType = CashierOrderTypeEnum.STANDARD;
        this.payeeFundDetails = new CashierAsset();
        this.bizPayDate = new Date();
    }

    public CashierOrder(CashierMoney amount, CashierOrderTypeEnum cashierType,  CashierAsset payeeFundDetails) {
        this.amount = amount;
        this.cashierType = cashierType;
        this.payeeFundDetails = payeeFundDetails;
        this.cashierOrderId = generateCashierId();
        this.bizPayDate = new Date();
    }

    public CashierOrder(CashierMoney amount, CashierOrderTypeEnum cashierType, CashierAsset payeeFundDetails, String description) {
        this.amount = amount;
        this.cashierType = cashierType;
        this.payeeFundDetails = payeeFundDetails;
        this.description = description;
        this.cashierOrderId = generateCashierId();
        this.bizPayDate = new Date();
    }
    private String generateCashierId(){
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return timeInMillis+"";
    }


}
