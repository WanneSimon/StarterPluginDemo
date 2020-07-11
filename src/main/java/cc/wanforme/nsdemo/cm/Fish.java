package cc.wanforme.nsdemo.cm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cc.wanforme.nukkit.spring.configuration.NukkitSpringProperties;

/**
 * @author wanne
 *
 * 2020年7月10日
 */
@Component
public class Fish {

	@Autowired
	private NukkitSpringProperties properties;
	
	@Override
	public String toString() {
		System.out.println("properties bean existed? " + properties.isEnable());
		return "salty-fish rush!";
	}
}
