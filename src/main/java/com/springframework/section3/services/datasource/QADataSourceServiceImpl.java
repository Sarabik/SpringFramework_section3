package com.springframework.section3.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("DataSourceService")
public class QADataSourceServiceImpl implements DataSourceService {

	@Override
	public String getDataSource() {
		return "qa";
	}

}
