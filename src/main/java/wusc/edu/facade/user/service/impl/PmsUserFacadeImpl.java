package wusc.edu.facade.user.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wusc.edu.facade.common.page.PageBean;
import wusc.edu.facade.common.page.PageParam;
import wusc.edu.facade.entity.PmsUser;
import wusc.edu.facade.service.PmsUserFacade;
import wusc.edu.service.user.biz.PmsUserBiz;

@Service("pmsUserFacade")
public class PmsUserFacadeImpl implements PmsUserFacade{
	@Autowired
	private PmsUserBiz bmsUserBiz;

	@Override
	public void create(PmsUser pmsUser) {
		bmsUserBiz.create(pmsUser);
	}

	@Override
	public PmsUser getById(Long userId) {
		return bmsUserBiz.getById(userId);
	}

	@Override
	public PmsUser findUserByUserNo(String userNo) {
		return bmsUserBiz.findUserByUserNo(userNo);
	}

	@Override
	public void deleteUserById(long userId) {
		bmsUserBiz.deleteUserById(userId);
	}

	@Override
	public void update(PmsUser user) {
		bmsUserBiz.update(user);
	}

	@Override
	public void updateUserPwd(Long userId, String newPwd, boolean isTrue) {
		bmsUserBiz.updateUserPwd(userId, newPwd, isTrue);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {
		return bmsUserBiz.listPage(pageParam, paramMap);
	}
}
