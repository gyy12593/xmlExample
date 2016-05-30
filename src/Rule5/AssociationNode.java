package Rule5;

public class AssociationNode {
	private String associationRelationshipName;
	private String associationDirection;
	private String fromClass;
	private String fromAssociationAttribute;
	private String toClass;
	private String toAssociationAttribute;
	private char fromMultiplicity[];
	private char toMultiplicity[];
	public AssociationNode(String _associationRelationshipName){
		this.associationRelationshipName = _associationRelationshipName;
		fromClass = null;
		fromAssociationAttribute = null;
		toClass = null;
		toAssociationAttribute = null;
		fromMultiplicity = new char[2];
		toMultiplicity = new char[2];
	}
	public String getAssociationRelationshipName(){
		return associationRelationshipName;
	}
	public void setAssociationRelationshipName(String _associationRelationshipName){
		this.associationRelationshipName = _associationRelationshipName;
	}
	public String getAssociationDirection(){
		return associationDirection;
	}
	public void setAssociationDirection(String _associationDirection){
		associationDirection = _associationDirection;
	}
	public String getFromClass(){
		return fromClass;
	}
	public void setFromClass(String _fromClass){
		fromClass = _fromClass;
	}
	public String getFromAssociationAttribute(){
		return fromAssociationAttribute;
	}
	public void setFromAssociationAttribute(String _fromAssociationAttribute){
		fromAssociationAttribute = _fromAssociationAttribute;
	}
	
	public String getToClass(){
		return toClass;
	}
	public void setToClass(String _toClass){
		toClass = _toClass;
	}
	public String getToAssociationAttribute(){
		return toAssociationAttribute;
	}
	public void setToAssociationAttribute(String _toAssociationAttribute){
		toAssociationAttribute = _toAssociationAttribute;
	}
	public void setFromMultiplicity(String s){
		fromMultiplicity[0] = s.charAt(0);
		fromMultiplicity[1] = s.charAt(s.length()-1);
	}
	public char[] getFromMultiplicity(){
		return fromMultiplicity;
	}
	public void setToMultiplicity(String s){
		toMultiplicity[0] = s.charAt(0);
		toMultiplicity[1] = s.charAt(s.length()-1);
	}
	public char[] getToMultiplicity(){
		return toMultiplicity;
	}
}
