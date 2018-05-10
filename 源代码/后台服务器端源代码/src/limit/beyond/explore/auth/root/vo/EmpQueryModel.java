package limit.beyond.explore.auth.root.vo;

import limit.beyond.explore.util.base.BaseQueryModel;
import limit.beyond.explore.util.format.FormatUtil;


public class EmpQueryModel extends EmpModel implements BaseQueryModel{
	private Long birthday2;
	private String birthday2View;
	
	public String getBirthday2View() {
		return birthday2View;
	}
	public Long getBirthday2() {
		return birthday2;
	}
	public void setBirthday2(Long birthday2) {
		this.birthday2 = birthday2;
		this.birthday2View = FormatUtil.formatDate(birthday2);
	}
	
}
