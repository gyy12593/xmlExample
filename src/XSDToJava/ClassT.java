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
 * <p>Class_T complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡclassID���Ե�ֵ��
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
     * ����classID���Ե�ֵ��
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
     * ��ȡteacherList���Ե�ֵ��
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
     * ����teacherList���Ե�ֵ��
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
