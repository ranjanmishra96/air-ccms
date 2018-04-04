package com.test.server.datasource;

import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class SessionFactory extends LocalSessionFactoryBean {
	
	@Autowired
	private DataSource jndiDataSoruce;

	@Autowired
	private DataSource basicDataSource;
	
	 
		private void setDS(DataSource ds) {
			if (ds == null) {
				throw new RuntimeException("DataSource is null");
			}
			super.setDataSource(ds);

			//setEntityInterceptor((Interceptor) new Date());
		}


		public DataSource getJndiDataSoruce() {
			return jndiDataSoruce;
		}


		public void setJndiDataSoruce(DataSource jndiDataSoruce) {
			this.jndiDataSoruce = jndiDataSoruce;
		}


		public DataSource getBasicDataSource() {
			return basicDataSource;
		}


		public void setBasicDataSource(DataSource basicDataSource) {
			this.basicDataSource = basicDataSource;
		}
		
		@Override
		public void afterPropertiesSet() throws IOException{
			setDS(getBasicDataSource());
			super.afterPropertiesSet();
		}

}
