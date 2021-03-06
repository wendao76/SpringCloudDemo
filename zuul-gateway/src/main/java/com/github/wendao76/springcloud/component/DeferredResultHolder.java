package com.github.wendao76.springcloud.component;

import com.github.wendao76.springcloud.model.RespEntity;
import lombok.Data;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description 延迟结果类容器
 * @ClassName DeferredResultHolder
 * @Author tiger
 * @Date 2020/3/20 14:42
 * @Version 1.0
 */
@Data
public class DeferredResultHolder {
	private static Map<String, DeferredResult<RespEntity>> map = new ConcurrentHashMap<>();

	public static DeferredResult<RespEntity> get(String key) {
		return map.get(key);
	}

	public static void put(String key, DeferredResult<RespEntity> deferredResult) {
		map.put(key, deferredResult);
	}
}
