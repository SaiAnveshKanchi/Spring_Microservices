package spring.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.microservices.currencyexchangeservice.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	//CurrencyExchange findByFromAndTo(String from,String to);

	CurrencyExchange findByFromAndTo(String from, String to);
}
