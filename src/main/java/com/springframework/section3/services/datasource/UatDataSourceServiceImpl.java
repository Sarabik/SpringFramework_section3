package com.springframework.section3.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("DataSourceService")
public class UatDataSourceServiceImpl implements DataSourceService {

	@Override
	public String getDataSource() {
		return "uat";
	}

}
