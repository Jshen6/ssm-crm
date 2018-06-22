package crm.service;

import java.util.List;

import crm.pojo.BaseDict;

public interface BaseDictService {

	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
