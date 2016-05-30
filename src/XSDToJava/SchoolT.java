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
 * <p>School_T complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="School_T">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}ManagedObject_T">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schoolID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="studentLimit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "School_T", propOrder = {
    "location",
    "schoolID",
    "schoolName",
    "studentLimit"
})
public class SchoolT
    extends ManagedObjectT
{

    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected BigInteger schoolID;
    @XmlElement(required = true)
    protected String schoolName;
    @XmlElement(required = true)
    protected int studentLimit;

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取schoolID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSchoolID() {
        return schoolID;
    }

    /**
     * 设置schoolID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSchoolID(BigInteger value) {
        this.schoolID = value;
    }

    /**
     * 获取schoolName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置schoolName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * 获取studentLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getStudentLimit() {
        return studentLimit;
    }

    /**
     * 设置studentLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStudentLimit(int value) {
        this.studentLimit = value;
    }

}
