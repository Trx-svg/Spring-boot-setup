package com.app.BabyBuy.repo.usermgmt;

import com.app.BabyBuy.model.usermgmt.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
