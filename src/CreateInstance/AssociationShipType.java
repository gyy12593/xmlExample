package CreateInstance;
/* gyy add 2016/1/7 15:59
 * 自己写的一个类
 * */
public class AssociationShipType {
	private String direction;
	private String fromClass;
	private String toClass;
	private String fromAttribute;
	private String toAttribute;
	public void setDirection(String _direction){
		direction = _direction;
	}
	public void setFromClass(String _fromClass){
		fromClass = _fromClass;
	}
	public void setToClass(String _toClass){
		toClass = _toClass;
	}
	public void setFromAttribute(String _fromAttribute){
		fromAttribute = _fromAttribute;
	}
	public void setToAttribute(String _toAttribute){
		toAttribute = _toAttribute;
	}
	public String getDirection(){
		return direction;
	}
	public String getFromClass(){
		return fromClass;
	}
	public String getToClass(){
		return toClass;
	}
	public String getFromAttribute(){
		return fromAttribute;
	}
	public String getToAttribute(){
		return toAttribute;
	}
}
