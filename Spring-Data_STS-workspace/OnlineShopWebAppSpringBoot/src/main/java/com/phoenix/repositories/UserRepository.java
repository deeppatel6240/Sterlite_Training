package com.phoenix.repositories;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *    DAO interface
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
