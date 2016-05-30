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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Teacher_T complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Teacher_T">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}Person_T">
 *       &lt;sequence>
 *         &lt;element name="classList" type="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}DNSetType"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="teacherID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teacher_T", propOrder = {
    "classList",
    "phoneNo",
    "position",
    "salary",
    "teacherID"
})
public class TeacherT
    extends PersonT
{

    @XmlElement(required = true)
    protected DNSetType classList;
    @XmlElement(required = true)
    protected BigInteger phoneNo;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(required = true)
    protected BigInteger salary;
    @XmlElement(required = true)
    protected BigInteger teacherID;

    /**
     * ��ȡclassList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DNSetType }
     *     
     */
    public DNSetType getClassList() {
        return classList;
    }

    /**
     * ����classList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DNSetType }
     *     
     */
    public void setClassList(DNSetType value) {
        this.classList = value;
    }

    /**
     * ��ȡphoneNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhoneNo() {
        return phoneNo;
    }

    /**
     * ����phoneNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhoneNo(BigInteger value) {
        this.phoneNo = value;
    }

    /**
     * ��ȡposition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * ����position���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * ��ȡsalary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalary() {
        return salary;
    }

    /**
     * ����salary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalary(BigInteger value) {
        this.salary = value;
    }

    /**
     * ��ȡteacherID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTeacherID() {
        return teacherID;
    }

    /**
     * ����teacherID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTeacherID(BigInteger value) {
        this.teacherID = value;
    }

}
