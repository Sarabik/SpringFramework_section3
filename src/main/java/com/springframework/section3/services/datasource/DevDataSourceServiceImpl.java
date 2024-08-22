package com.springframework.section3.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("DataSourceService")
public class DevDataSourceServiceImpl implements DataSourceService {

	@Override
	public String getDataSource() {
		return "dev";
	}

}
