package cc.wanforme.nsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cc.wanforme.nsdemo.cm.Fish;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

/**
 * @author wanne
 *
 * 2020年7月10日
 */
@Component
public class NsDemo extends PluginBase{
	
	@Autowired
	private Fish fish;
	
	@Override
	public void onLoad() {
//		getLogger().info("<< NsDemo on load>>");
		System.out.println("<< NsDemo on load>>");
	}
	
	
	@Override
	public void onEnable() {
		System.out.println("<< NsDemo on enable>>");
	}
	
	@Override
	public void onDisable() {
		System.out.println("<< NsDemo>> on disable");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		System.out.println("<< NsDemo on command>>");
		
		if(args.length > 0) {
			System.out.println(fish.toString());
		}
		
		return true;
	}
	
}
