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
 * ��Ŀ���Ϲ���
 * 
 * @author wuqiong
 *
 */
public class Integration {
	/**
	 * �ƶ���Ŀ�³�
	 * 
	 * @param ��Ŀ����˵����
	 * @param ��ҵ��֤
	 * @param Э��
	 * @param ��ҵ��������
	 * @param ��֯�����ʲ�
	 * @return ��Ŀ�³�
	 */
	public ProjectCharter developProjectCharter(StatementOfWork sow,
			BusinessCase bc, Agreement contract, EEF eef, OPA opa) {
		ExpertJudgment.stakeholder();// ר���ж� - ��ϵ��
		GuidingTechnology.brainStorming();// �������� - ͷ�Է籩
		return new ProjectCharter();
	}

	// �ƶ���Ŀ����ƻ�
	public void DevelopProjectManagementPlan() {

	}
}
