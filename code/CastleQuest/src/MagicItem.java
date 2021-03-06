
public class MagicItem implements java.io.Serializable{

	private String type;
	private String desc;
	private String effect;

	public MagicItem(String typ){
		type = typ;
		switch(typ){
		case "Mangel-Slayer":
			desc = "This shimmering gold sword vibrates with dragon-slaying energy";
			effect = "Can kill Mangelor";
			break;
		case "Mantle of Perception":
			desc = "This mystical cloak makes you feel incredibly aware";
			effect = "Can't be robbed be thieves";
			break;
		case "Climbing Gear":
			desc = "No terrain can slow you down with this equipment!";
			effect = "Can't be Slowed";
			break;
		}
	}
	
	public String getType() {
		return type;
	}
	
	public String getDesc(){
		return desc;
	}

	public String getEffect() {
		return effect;
	}

}
