package com.acline.core.poi;

import com.acline.common.dal.dataobject.ProductUserDO;
import com.acline.common.dto.UserDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Aaron Chen
 * @date：2024/5/6
 * @Description:用户切面
 * @Version 1.0
 */
@Component
@Aspect
public class UserCheckAspect {
    @Pointcut("@annotation(com.acline.core.poi.UserPoi)")// 切点
    public void pointCut(){

    }

//    @Before(value = "pointCut()")
//    public void beforeUserSetting(JoinPoint point){ //切面
//        System.err.println("开始调用用户的核心方法了"+"——>beforeUserSetting");
//
//    }

//    @AfterReturning(value = "pointCut()")
//    public  void afterRunningSetting(JoinPoint point){
//        String name = point.getSignature().getName();
//        List<Object> list = Arrays.asList(point.getArgs());
//        System.err.println("程序正常结束，告知！！-——>afterRunningSetting");
//
//    }
    @After(value = "pointCut()")
    public void afterSetting(JoinPoint point){
        String name = point.getSignature().getName();
        List<Object> list = Arrays.asList(point.getArgs());
        System.err.println("程序结束，告知！！"+name+":"+list.toString()+"-——>afterSetting");

    }
    @AfterThrowing(value = "pointCut()",throwing="ex")
    public void afterExceptionSetting(JoinPoint point,Exception ex){
        String name = point.getSignature().getName();
        List<Object> list = Arrays.asList(point.getArgs());
        System.err.println("参数："+name+":"+list.toString());

        System.err.println(ex.getMessage()+"-——>afterExceptionSetting");

    }

    /**
     * 测试： 慎用，需要调用过程方法。否则无返回值
     *
     * @param pjp
     * @return
     */

    @Around(value = "pointCut()")
    public List<ProductUserDO> aroundSetting(ProceedingJoinPoint pjp){
        List<ProductUserDO> productUserDOS=null;
        List<Object> list = Arrays.asList(pjp.getArgs());
        System.err.println("aroundSetting->"+list.toString());
        UserDTO userDTO = (UserDTO)list.get(0);
        userDTO.setId(2);
        userDTO.setUserName("aaron");
        userDTO.setPassWord("e2xasxq");
        try {
            productUserDOS = (List<ProductUserDO>) pjp.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.err.println("环绕通知："+"-——>aroundSetting");
return productUserDOS;
    }




}
