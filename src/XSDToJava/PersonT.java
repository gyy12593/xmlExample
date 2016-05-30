//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.06.11 时间 09:29:01 PM CST 
//


package XSDToJava;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Person_T complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Person_T">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}ManagedObject_T">
 *       &lt;sequence>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="friendList" type="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}DNSetType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_T", propOrder = {
    "birthday",
    "personID",
    "personName",
    "friendList"
})
@XmlSeeAlso({
    StudentT.class,
    TeacherT.class
})
public class PersonT
    extends ManagedObjectT
{

    @XmlElement(required = true)
    protected String birthday;
    @XmlElement(required = true)
    protected BigInteger personID;
    @XmlElement(required = true)
    protected String personName;
    @XmlElement(required = true)
    protected DNSetType friendList;

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * 获取personID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonID() {
        return personID;
    }

    /**
     * 设置personID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonID(BigInteger value) {
        this.personID = value;
    }

    /**
     * 获取personName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 设置personName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * 获取friendList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DNSetType }
     *     
     */
    public DNSetType getFriendList() {
        return friendList;
    }

    /**
     * 设置friendList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DNSetType }
     *     
     */
    public void setFriendList(DNSetType value) {
        this.friendList = value;
    }

}
