package com.jdddata.datahub.msghub.service.api;

import com.jdddata.datahub.common.service.message.Message;
import com.jdddata.datahub.msghub.common.RocketMQException;
import com.jdddata.datahub.msghub.config.MQInfo;

import java.io.Closeable;

/**
 * @InterfaceName: IProducer
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2018/9/7 18:06
 * @modified By:
 */
public interface IProducer extends Closeable {

    void start(MQInfo msgHubConfig) throws RocketMQException;

    boolean send(String namespace, String schema, Message message);

}