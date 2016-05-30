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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Teacher_T complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取classList属性的值。
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
     * 设置classList属性的值。
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
     * 获取phoneNo属性的值。
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
     * 设置phoneNo属性的值。
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
     * 获取position属性的值。
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
     * 设置position属性的值。
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
     * 获取salary属性的值。
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
     * 设置salary属性的值。
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
     * 获取teacherID属性的值。
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
     * 设置teacherID属性的值。
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
