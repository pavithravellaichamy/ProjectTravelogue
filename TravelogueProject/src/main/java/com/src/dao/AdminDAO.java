package com.src.dao;

import com.src.model.AdminLogin;

public interface AdminDAO {

	public boolean validate(AdminLogin login);
}
