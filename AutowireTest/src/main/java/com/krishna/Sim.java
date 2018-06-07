package com.krishna;

public class Sim {
private int simId;
private String provider;
public Sim(int simId,String provider)
{
	this.simId=simId;
	this.provider=provider;
}

public String toString()
{
	return "Sim[simId="+simId+",provider="+provider+"]";
}
}
