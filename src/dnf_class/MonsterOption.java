package dnf_class;

import java.util.LinkedList;

public class MonsterOption extends IconObject{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8451333591805878196L;
	public LinkedList<String> explanation;						//설명
	public final Monster monster;
	
	public MonsterOption(String name, String icon, Monster monster)
	{
		super();
		this.name=name;
		this.iconAddress=icon;
		this.monster=monster;
		explanation = new LinkedList<String>();
	}
	public MonsterOption(Monster monster)
	{
		super();
		this.monster=monster;
		explanation = new LinkedList<String>();
	}
}
