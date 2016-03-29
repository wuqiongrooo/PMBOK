package pmp.itto.io.stakeholderList;

/**
 * 人（干系人）
 * 
 * @author wuqiong
 *
 */
public class People {

	// basic
	String name;
	String position;
	String address;
	String role;
	String cantact;

	// assess
	/**
	 * 主要需求
	 */
	String requirment;
	/**
	 * 主要期望
	 */
	String expectation;
	/**
	 * 对项目的潜在影响
	 */
	String influence;
	/**
	 * 与生命周期的哪个阶段最密切相关
	 */
	String period;

	/**
	 * 干系人类型：内部/外部，支持者/中立者/反对者等
	 */
	String type;
}
