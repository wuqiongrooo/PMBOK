package pmp.knowledge;

import pmp.itto.io.EEF;
import pmp.itto.io.OPA;
import pmp.itto.io.ProjectCharter;
import pmp.itto.io.SOW.StatementOfWork;
import pmp.itto.io.agreement.Agreement;
import pmp.itto.io.businessCase.BusinessCase;
import pmp.itto.tt.ExpertJudgment;
import pmp.itto.tt.GuidingTechnology;

/**
 * 项目整合管理
 * 
 * @author wuqiong
 *
 */
public class Integration {
	/**
	 * 制定项目章程
	 * 
	 * @param 项目工作说明书
	 * @param 商业论证
	 * @param 协议
	 * @param 事业环境因素
	 * @param 组织过程资产
	 * @return 项目章程
	 */
	public ProjectCharter developProjectCharter(StatementOfWork sow,
			BusinessCase bc, Agreement contract, EEF eef, OPA opa) {
		ExpertJudgment.stakeholder();// 专家判断 - 干系人
		GuidingTechnology.brainStorming();// 引导技术 - 头脑风暴
		return new ProjectCharter();
	}

	// 制定项目管理计划
	public void DevelopProjectManagementPlan() {

	}
}
