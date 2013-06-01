package com.lamtrung.longdays;

import org.bukkit.plugin.java.JavaPlugin;

public class LongDays extends JavaPlugin{

	@Override
	public void onEnable() {

		super.onEnable();
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			int value = 0;
			@Override
			public void run() {
				if (value == 0) {
					if (getServer().getWorld("world").getTime() > 11000) {
						getServer().getWorld("world").setTime(2000);
						value = 1;
					}
				}
				else if (value == 1) {
					if (getServer().getWorld("world").getTime() > 0 && getServer().getWorld("world").getTime() < 400) {
						value = 0;
					}
				}
			}
		}, 20, 200);
	}

}
