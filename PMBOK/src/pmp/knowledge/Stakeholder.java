package pmp.knowledge;

import pmp.itto.io.EEF;
import pmp.itto.io.OPA;
import pmp.itto.io.ProjectCharter;
import pmp.itto.io.stakeholderList.StakeholderList;
import pmp.itto.tt.StakeholderAnalysis;

/**
 * 项目干系人管理
 * 
 * @author wuqiong
 *
 */
public class Stakeholder {

	/**
	 * 
	 * @param 项目章程
	 * @param 采购文件
	 * @param 事业环境因素
	 * @param 组织过程资产
	 * @return 干系人登记册
	 */
	public StakeholderList identifyStakeholder(ProjectCharter pc,
			Procurement p, EEF eef, OPA opa) {

		StakeholderAnalysis.analysis();// 干系人分析

		return new StakeholderList();
	}
}
