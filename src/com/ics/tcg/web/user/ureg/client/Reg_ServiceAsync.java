package com.ics.tcg.web.user.ureg.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface Reg_ServiceAsync {

	void check(String username,AsyncCallback<Integer> asyncCallback);

	void saveUser(User_Client user, AsyncCallback<String> callback);

}
