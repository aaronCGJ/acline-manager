package com.acline.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author Aaron Chen
 * @date：2023/4/28 16:28
 * @Description:自定义线程池配置
 */

/**
 * ThreadPoolExecutor如何设置参数
 * 1、默认值
 * * corePoolSize=1
 * * queueCapacity=Integer.MAX_VALUE
 * * maxPoolSize=Integer.MAX_VALUE
 * * keepAliveTime=60s
 * * allowCoreThreadTimeout=false
 * * rejectedExecutionHandler=AbortPolicy()
 * <p>
 * 2、如何来设置
 * * 需要根据几个值来决定
 * - tasks ：每秒的任务数，假设为1000
 * - taskcost：每个任务花费时间，假设为0.1s
 * - responsetime：系统允许容忍的最大响应时间，假设为1s
 * * 做几个计算
 * - corePoolSize = 每秒需要多少个线程处理？
 * * 一颗CPU核心同一时刻只能执行一个线程，然后操作系统切换上下文，核心开始执行另一个线程的代码，以此类推，超过cpu核心数，就会放入队列，如果队列也满了，就另起一个新的线程执行，
 * 所有推荐：corePoolSize = ((cpu核心数 * 2) + 有效磁盘数)，
 * java可以使用Runtime.getRuntime().availableProcessors()获取cpu核心数
 * <p>
 * - queueCapacity = (corePoolSize/taskcost)*responsetime
 * * 计算可得 queueCapacity = corePoolSize/0.1*1。意思是队列里的线程可以等待1s，超过了的需要新开线程来执行
 * * 切记不能设置为Integer.MAX_VALUE，这样队列会很大，线程数只会保持在corePoolSize大小，当任务陡增时，不能新开线程来执行，响应时间会随之陡增。
 * <p>
 * - maxPoolSize = (max(tasks)- queueCapacity)/(1/taskcost)
 * * 计算可得 maxPoolSize = (1000-corePoolSize)/10，即(每秒并发数-corePoolSize大小) / 10
 * * （最大任务数-队列容量）/每个线程每秒处理能力 = 最大线程数
 * <p>
 * - rejectedExecutionHandler：根据具体情况来决定，任务不重要可丢弃，任务重要则要利用一些缓冲机制来处理
 * <p>
 * - keepAliveTime和allowCoreThreadTimeout采用默认通常能满足
 */

@Configuration
public class ThreadPoolConfig {
    //定义任务线程池


    //定义服务核心线程池


}
