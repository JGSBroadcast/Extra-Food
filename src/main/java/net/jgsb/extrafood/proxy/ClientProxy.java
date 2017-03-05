package net.jgsb.extrafood.proxy;

import net.jgsb.extrafood.init.Foods;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders(){
		Foods.registerRenders();
	}

}
