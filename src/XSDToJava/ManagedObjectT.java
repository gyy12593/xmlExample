//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.06.11 时间 09:29:01 PM CST 
//


package XSDToJava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManagedObject_T complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManagedObject_T">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objectClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectInstance" type="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}DNType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedObject_T", propOrder = {
    "objectClass",
    "objectInstance"
})
@XmlSeeAlso({
    ClassT.class,
    SchoolT.class,
    PersonT.class
})
public class ManagedObjectT {

    @XmlElement(required = true)
    protected String objectClass;
    @XmlElement(required = true)
    protected String objectInstance;

    /**
     * 获取objectClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectClass() {
        return objectClass;
    }

    /**
     * 设置objectClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectClass(String value) {
        this.objectClass = value;
    }

    /**
     * 获取objectInstance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectInstance() {
        return objectInstance;
    }

    /**
     * 设置objectInstance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectInstance(String value) {
        this.objectInstance = value;
    }

}
