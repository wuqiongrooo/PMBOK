package pmp.knowledge;

import pmp.itto.io.EEF;
import pmp.itto.io.OPA;
import pmp.itto.io.ProjectCharter;
import pmp.itto.io.stakeholderList.StakeholderList;
import pmp.itto.tt.StakeholderAnalysis;

/**
 * ��Ŀ��ϵ�˹���
 * 
 * @author wuqiong
 *
 */
public class Stakeholder {

	/**
	 * 
	 * @param ��Ŀ�³�
	 * @param �ɹ��ļ�
	 * @param ��ҵ��������
	 * @param ��֯�����ʲ�
	 * @return ��ϵ�˵Ǽǲ�
	 */
	public StakeholderList identifyStakeholder(ProjectCharter pc,
			Procurement p, EEF eef, OPA opa) {

		StakeholderAnalysis.analysis();// ��ϵ�˷���

		return new StakeholderList();
	}
}
