package com.repo;

import com.model.Account1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by debasish paul on 14-11-2017.
 */
public interface AccountRepository extends JpaRepository<Account1,Integer>{
}
