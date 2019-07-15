package com.coatardbul.xxl_job.jobHandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

/**
 * @author: suxiaolei
 * @date: 2019/7/15
 */
@JobHandler(value = "testJobHandler")
@Component
public class TestJobHandler extends IJobHandler {
    /**
     * execute handler, invoked when executor receives a scheduling request
     *
     * @param param
     * @return
     * @throws Exception
     */
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("*******任务执行******");
        return new ReturnT("success");
    }
}
