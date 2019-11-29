package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.repo.TransactionLogRepository;
@Service
@Transactional
public class TransactionLogServiceImpl implements TransactionLogService{
	@Autowired
	private TransactionLogRepository transactionLogRepository;

	@Override
	public List<TransactionLog> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionLogRepository.findAll();
	}

	@Override
	public List<TransactionLog> findByfromAccount(Long fromAccount) {
		// TODO Auto-generated method stub
		return transactionLogRepository.findByfromAccount(fromAccount);
	}

}
