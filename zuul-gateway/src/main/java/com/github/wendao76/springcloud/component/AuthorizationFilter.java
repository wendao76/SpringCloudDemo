package com.github.wendao76.springcloud.component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @Description 身份认证过滤器
 * @ClassName AuthorizationFilter
 * @Author tiger
 * @Date 2020/3/22 16:20
 * @Version 1.0
 */
public class AuthorizationFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		//执行顺序晚于自带filter
		return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("AuthorizationFilter.run");
		if (false) {
			//通过异常抛出的方式拦截
			throw new ZuulException("认证失败", 10000, "身份校验不通过");
		}
		//TODO 加入认证过滤器
		return null;
	}
}
