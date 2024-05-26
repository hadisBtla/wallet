package com.wallet.repository;

import com.wallet.domian.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
}
