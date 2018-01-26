package com.xu.drools.rule.complexProblem;

import com.xu.drools.bean.PointDomain;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


/**
 * 计算商户消费积分
 * Created by Administrator on 2018/1/26.
 */
public class PointCount {

    public static void main(String[] args) {
        System.setProperty("drools.dateformat","yyyy-MM-dd HH:mm:ss");
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession ksession = kContainer.newKieSession("pointKS");

        PointDomain pd = new PointDomain();
        pd.setUserName("whp");
        pd.setBillThisMonth(5);
        pd.setPoint(0l);
//        pd.setBackMoney(10);
//        pd.setBackNums(1);
        pd.setBirthDay(true);
        pd.setBuyNums(5);
        pd.setBuyMoney(1020);

        ksession.insert(pd);
        ksession.fireAllRules();

        System.out.println("执行完毕BillThisMonth："        + pd.getBillThisMonth());
        System.out.println("执行完毕BuyMoney：" + pd.getBuyMoney());
        System.out.println("执行完毕BuyNums：" + pd.getBuyNums());
        System.out.println("执行完规则引擎,发送积分："+pd.getPoint());
    }
}
