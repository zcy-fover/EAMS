package com.group.eams.mapper;

import org.springframework.stereotype.Repository;

import com.group.eams.entity.User;

@Repository
public interface UserMapper {
	public User getUser();
}
