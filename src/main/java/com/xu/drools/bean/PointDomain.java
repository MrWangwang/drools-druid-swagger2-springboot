package com.xu.drools.bean;

/**
 * 网站伴随业务产生而进行的积分发放操作。比如支付宝信用卡还款奖励积分等。
 * 发放积分可能伴随不同的运营策略和季节性调整，发放数目和规则完全不同，
 * 如果使用硬编码的方式去伴随业务调整而修改，
 * 代码的修改、管理、优化、测试、上线将是一件非常麻烦的事情，
 * 所以，将发放规则部分提取出来，交给Drools管理，可以极大程度的解决这个问题。
 * 我们定义一下发放规则：
 * 积分的发放参考因素有：
 * 交易笔数、交易金额数目、信用卡还款次数、生日特别优惠等。
 * 定义规则：
 * // 过生日，则加10分，并且将当月交易比数翻倍后再计算积分
 * // 2011-01-08 - 2011-08-08每月信用卡还款3次以上，每满3笔赠送30分
 * // 当月购物总金额100以上，每100元赠送10分
 * // 当月购物次数5次以上，每五次赠送50分
 * // 特别的，如果全部满足了要求，则额外奖励100分
 * Created by Administrator on 2018/1/26.
 */
public class PointDomain {
    //用户名
    private String userName;
    //是否生日
    private boolean birthDay;
    //当前积分
    private long point;
    //当月购买次数
    private int buyNums;
    //当月退货次数
    private int backNums;
    //当月购物总金额
    private double buyMoney;
    //当月退货总金额
    private double backMoney;
    //当月信用卡还款次数
    private int billThisMonth;

    /**
     * 记录积分发放流水
     */
    public void recodePointLog(String userName,String type){
        System.out.println("增加对"+userName+"类型为"+type+"的积分记录");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isBirthDay() {
        return birthDay;
    }

    public void setBirthDay(boolean birthDay) {
        this.birthDay = birthDay;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public int getBuyNums() {
        return buyNums;
    }

    public void setBuyNums(int buyNums) {
        this.buyNums = buyNums;
    }

    public int getBackNums() {
        return backNums;
    }

    public void setBackNums(int backNums) {
        this.backNums = backNums;
    }

    public double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(double buyMoney) {
        this.buyMoney = buyMoney;
    }

    public double getBackMoney() {
        return backMoney;
    }

    public void setBackMoney(double backMoney) {
        this.backMoney = backMoney;
    }

    public int getBillThisMonth() {
        return billThisMonth;
    }

    public void setBillThisMonth(int billThisMonth) {
        this.billThisMonth = billThisMonth;
    }
}
