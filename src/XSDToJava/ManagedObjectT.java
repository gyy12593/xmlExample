//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.06.11 ʱ�� 09:29:01 PM CST 
//


package XSDToJava;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ManagedObject_T complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡobjectClass���Ե�ֵ��
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
     * ����objectClass���Ե�ֵ��
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
     * ��ȡobjectInstance���Ե�ֵ��
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
     * ����objectInstance���Ե�ֵ��
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
