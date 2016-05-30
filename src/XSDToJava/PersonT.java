//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.06.11 ʱ�� 09:29:01 PM CST 
//


package XSDToJava;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Person_T complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbirthday���Ե�ֵ��
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
     * ����birthday���Ե�ֵ��
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
     * ��ȡpersonID���Ե�ֵ��
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
     * ����personID���Ե�ֵ��
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
     * ��ȡpersonName���Ե�ֵ��
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
     * ����personName���Ե�ֵ��
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
     * ��ȡfriendList���Ե�ֵ��
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
     * ����friendList���Ե�ֵ��
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
