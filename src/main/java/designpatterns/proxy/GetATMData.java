package designpatterns.proxy;

// This interface will contain just those methods
// that you want the proxy to provide access to

import designpatterns.state.ATMState;

public interface GetATMData
{
    public ATMState getATMState();
    public int getCashInMachine();
}
