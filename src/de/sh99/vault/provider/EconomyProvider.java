package de.sh99.vault.provider;

import de.sh99.vault.EnvironmentProvider;
import de.sh99.vault.economy.Balance;
import de.sh99.vault.economy.Bank;

public interface EconomyProvider extends EnvironmentProvider
{
    public Balance getBalance();

    public void setBalance(Balance balance);

    public Bank getBank();

    public void setBank(Bank bank);
}