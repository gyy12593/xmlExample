//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.06.11 时间 09:29:01 PM CST 
//


package XSDToJava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the XSDToJava package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClassC_QNAME = new QName("http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", "Class_C");
    private final static QName _StudentC_QNAME = new QName("http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", "Student_C");
    private final static QName _TeacherC_QNAME = new QName("http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", "Teacher_C");
    private final static QName _OutputInstanceList_QNAME = new QName("http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", "outputInstanceList");
    private final static QName _SchoolC_QNAME = new QName("http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", "School_C");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: XSDToJava
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InstanceOutputType }
     * 
     */
    public InstanceOutputType createInstanceOutputType() {
        return new InstanceOutputType();
    }

    /**
     * Create an instance of {@link ClassT }
     * 
     */
    public ClassT createClassT() {
        return new ClassT();
    }

    /**
     * Create an instance of {@link StudentT }
     * 
     */
    public StudentT createStudentT() {
        return new StudentT();
    }

    /**
     * Create an instance of {@link TeacherT }
     * 
     */
    public TeacherT createTeacherT() {
        return new TeacherT();
    }

    /**
     * Create an instance of {@link SchoolT }
     * 
     */
    public SchoolT createSchoolT() {
        return new SchoolT();
    }

    /**
     * Create an instance of {@link DNSetType }
     * 
     */
    public DNSetType createDNSetType() {
        return new DNSetType();
    }

    /**
     * Create an instance of {@link PersonT }
     * 
     */
    public PersonT createPersonT() {
        return new PersonT();
    }

    /**
     * Create an instance of {@link ManagedObjectT }
     * 
     */
    public ManagedObjectT createManagedObjectT() {
        return new ManagedObjectT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", name = "Class_C")
    public JAXBElement<ClassT> createClassC(ClassT value) {
        return new JAXBElement<ClassT>(_ClassC_QNAME, ClassT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", name = "Student_C")
    public JAXBElement<StudentT> createStudentC(StudentT value) {
        return new JAXBElement<StudentT>(_StudentC_QNAME, StudentT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeacherT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", name = "Teacher_C")
    public JAXBElement<TeacherT> createTeacherC(TeacherT value) {
        return new JAXBElement<TeacherT>(_TeacherC_QNAME, TeacherT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", name = "outputInstanceList")
    public JAXBElement<InstanceOutputType> createOutputInstanceList(InstanceOutputType value) {
        return new JAXBElement<InstanceOutputType>(_OutputInstanceList_QNAME, InstanceOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ws.zc/xml-namespace/informationModel/UMLModelGenericModel", name = "School_C")
    public JAXBElement<SchoolT> createSchoolC(SchoolT value) {
        return new JAXBElement<SchoolT>(_SchoolC_QNAME, SchoolT.class, null, value);
    }

}
