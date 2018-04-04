package com.test.server.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {

	void doLogin(String username, String password, HttpServletRequest request);

}
