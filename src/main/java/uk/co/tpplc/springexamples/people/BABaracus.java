package uk.co.tpplc.springexamples.people;

import org.springframework.stereotype.Component;


@Component
public class BABaracus implements Driver {

	private String quote = "I'm not gettin' on a chopper with this nutjob!";
	
	@Override
	public String turnKey() {
		return quote + " - fool!";
	}

	@Override
	public String getQuote() {
		return quote + " - fool!";
	}

	@Override
	public void setQuote(String value) {
	this.quote = value;

	}

	@Override
	public String getName() {
		return "BABaracus";
	}

}
