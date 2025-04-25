package com.acline.common.dal.base.mapperinterceptor;

/**
 * @author Aaron Chen
 * @date：2023/8/22
 * @Description:TODO
 * @Version
 */

import org.apache.ibatis.builder.BuilderException;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

@Intercepts({@Signature(
        type = Executor.class,
        method = "update",
        args = {MappedStatement.class, Object.class}
), @Signature(
        type = Executor.class,
        method = "query",
        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
)})
public class MybatisExecutorInterceptor implements Interceptor {
    private static final Logger log = LoggerFactory.getLogger(MybatisExecutorInterceptor.class);

    public MybatisExecutorInterceptor() {
    }

    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];

        try {
            BoundSql boundSql = ms.getBoundSql(args[1]);
            log.info("SQL: {}", boundSql.getSql());
            log.info("Parameters: {}", boundSql.getParameterObject());
        } catch (BuilderException var5) {
            log.error("interceptor a BuilderException: {}", var5);
            ms.getBoundSql(args[1]);
        }

        return invocation.proceed();
    }

    public Object plugin(Object target) {
        return target instanceof Executor ? Plugin.wrap(target, this) : target;
    }

    public void setProperties(Properties properties) {
    }
}
