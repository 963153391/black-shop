/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 *
 * @version 1.0
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.basic.apollo.constans;

/**
 *	阿波罗命名空间常量
 * @author zibin
 *
 */
public interface ApolloNamespaceConstant {

	/**
	 * 部门名称
	 */
	String DEPARTMENT = "DEV1.";

	/**
	 * 默认命名空间
	 */
	String DEFAULT = "application";

	/**
	 * nacos配置的公共命名空间
	 */
	String PUBLIC_NACOS_CONFIG = DEPARTMENT + "NACOS-CONFIG";

	/**
	 * datasource数据源公共服务的命名空间
	 */
	String PUBLIC_DATASOURCE_CONFIG = DEPARTMENT + "DATASOURCE-CONFIG";

	/**
	 * ribbon配置项
	 */
	String PUBLIC_RIBBON_CONFIG = DEPARTMENT + "RIBBON-CONFIG";

	/**
	 * ridis配置项
	 */
	String PUBLIC_REDIS_CONFIG = DEPARTMENT + "REDIS-CONFIG";
}
