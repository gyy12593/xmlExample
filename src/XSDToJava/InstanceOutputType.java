//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.06.11 时间 09:29:01 PM CST 
//


package XSDToJava;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InstanceOutputType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InstanceOutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}Class_C" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}School_C" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}Teacher_C" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel}Student_C" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceOutputType", propOrder = {
    "classC",
    "schoolC",
    "teacherC",
    "studentC"
})
public class InstanceOutputType {

    @XmlElement(name = "Class_C")
    protected List<ClassT> classC;
    @XmlElement(name = "School_C")
    protected List<SchoolT> schoolC;
    @XmlElement(name = "Teacher_C")
    protected List<TeacherT> teacherC;
    @XmlElement(name = "Student_C")
    protected List<StudentT> studentC;

    /**
     * Gets the value of the classC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassT }
     * 
     * 
     */
    public List<ClassT> getClassC() {
        if (classC == null) {
            classC = new ArrayList<ClassT>();
        }
        return this.classC;
    }

    /**
     * Gets the value of the schoolC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolT }
     * 
     * 
     */
    public List<SchoolT> getSchoolC() {
        if (schoolC == null) {
            schoolC = new ArrayList<SchoolT>();
        }
        return this.schoolC;
    }

    /**
     * Gets the value of the teacherC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teacherC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeacherC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeacherT }
     * 
     * 
     */
    public List<TeacherT> getTeacherC() {
        if (teacherC == null) {
            teacherC = new ArrayList<TeacherT>();
        }
        return this.teacherC;
    }

    /**
     * Gets the value of the studentC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentT }
     * 
     * 
     */
    public List<StudentT> getStudentC() {
        if (studentC == null) {
            studentC = new ArrayList<StudentT>();
        }
        return this.studentC;
    }

}
