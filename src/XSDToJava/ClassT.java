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
 * <p>Class_T complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Class_T">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}ManagedObject_T">
 *       &lt;sequence>
 *         &lt;element name="classID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="teacherList" type="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}DNSetType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class_T", propOrder = {
    "classID",
    "teacherList"
})
public class ClassT
    extends ManagedObjectT
{

    @XmlElement(required = true)
    protected BigInteger classID;
    @XmlElement(required = true)
    protected DNSetType teacherList;

    /**
     * 获取classID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClassID() {
        return classID;
    }

    /**
     * 设置classID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClassID(BigInteger value) {
        this.classID = value;
    }

    /**
     * 获取teacherList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DNSetType }
     *     
     */
    public DNSetType getTeacherList() {
        return teacherList;
    }

    /**
     * 设置teacherList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DNSetType }
     *     
     */
    public void setTeacherList(DNSetType value) {
        this.teacherList = value;
    }

}
