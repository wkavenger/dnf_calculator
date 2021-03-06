package dnf_class;

import dnf_InterfacesAndExceptions.Equip_part;
import dnf_InterfacesAndExceptions.Item_rarity;

public class Title extends Item
{
	private static final long serialVersionUID = 1992662128558331176L;
	private Card card;										//보주
	public final Equip_part part;							//부위
	public boolean enabled;
	public Title(String name, Item_rarity rarity, Card card, String version)
	{
		super(name, "image\\Title\\"+name+".png", rarity, version);
		this.card=card;
		part=Equip_part.TITLE;
		enabled=false;
	}
	public Title(String name, Item_rarity rarity, String version)
	{
		super(name, "image\\Title\\"+name+".png", rarity, version);
		this.card=new Card();
		part=Equip_part.TITLE;
		enabled=false;
	}
	public Title(){
		super();
		card=new Card();
		part=Equip_part.TITLE;
		enabled=false;
	}
	
	@Override
	public String getTypeName() { return "칭호";}
	
	@Override
	public Card getCard() {
		return card;
	}
	
	@Override
	public Equip_part getPart() {return part;}
	
	@Override
	public boolean setCard(Card card) {
		if(card.available(this)){
			this.card=(Card)card.clone();
			return true;
		}
		return false;
	}
	
	/*@Override
	public boolean getEnabled() {return enabled;}
	@Override
	public void setEnabled(boolean enabled){this.enabled=enabled;}*/
	
	@Override
	public int compareTo(Item arg) {
		if(arg instanceof SkillTitle) return 1;
		else if(!(arg instanceof Title)){
			if(arg instanceof Equipment) return -1;
			else return 1;
		}
		return arg.getName().compareTo(this.getName());
	}
	
	@Override
	public Object clone()
	{
		Title clone = (Title) super.clone();
		clone.card = (Card) card.clone();
		return clone;
	}
}
