import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

import model.Address;
import model.Applicant;
import model.ApplicantUl;
import model.Base;
import model.BaseDeclaration;
import model.CertificationOrgan;
import model.Experts;
import model.Laboratory;
import model.Manufacturer;
import model.ManufacturerUl;
import model.Product;
import model.RdcTr;
import model.Requisites;
import model.ResponseFsaType;
import model.TechRegs;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ParserTest {

    @Test
    void testParseFromXmlToObject() {
        RdcTr rdcTr = (new Parser()).parseFromXmlToObject().getRdcTr();
        assertEquals("TrRf", rdcTr.getType());
        assertNull(rdcTr.getApplicantAl());
        assertNull(rdcTr.getApplicantFl());
        assertNull(rdcTr.getApplicantAu());
        assertNull(rdcTr.getDeclareAddInfo());
        ApplicantUl applicantUl = rdcTr.getApplicantUl();
        assertEquals("Табаков Валентин Семенович", applicantUl.getHead());
        assertEquals("Закрытое акционерное общество «Табак»", applicantUl.getFullName());
        assertEquals("7(812)7000001", applicantUl.getFax());
        assertEquals("TabakRU@mail.ru", applicantUl.getEmail());
        assertNull(applicantUl.getDate());
        assertNull(applicantUl.getContract());
        assertEquals(
                "190000, РОССИЯ, Ленинградская область, Ломоносовский район, производственная зона \"Горелово\", квартал"
                        + " 1, Волхонское шоссе, 1",
                applicantUl.getAddressActual());
        Product product = rdcTr.getProduct();
        assertNull(product.getStandart());
        assertEquals("100000 пачек", product.getSizeNumber());
        assertEquals("смола: 6 мг/сиг; никотин: 0,5 мг/сиг; СО: 7 мг/сиг", product.getProductInfo());
        assertNull(product.getPlaceMark());
        assertNull(product.getOkpdText());
        assertEquals("919340", product.getOkp());
        assertEquals("Сигареты с фильтром \"PR\"", product.getName());
        assertEquals(
                "Приказ Министерства здравоохранения и социального развития Российской Федерации от 05 Мая 2012 г. N"
                        + " 490н \"Об утверждении предупредительных надписей о вреде курения, сопровождаемых рисунками\"",
                product.getInfo());
        assertNull(product.getDetailsShippingDocumentation());
        assertEquals("Series", product.getDeclareType());
        assertEquals("Domestic", product.getDcOriginType());
        assertNull(product.getContractInfo());
        Manufacturer manufacturer = rdcTr.getManufacturer();
        assertNull(manufacturer.getManufacturerFl());
        assertNull(manufacturer.getManufacturerAl());
        Requisites requisites = rdcTr.getRequisites();
        assertEquals("Tr", requisites.getSection());
        assertEquals("Д-RU.СС10.В.00001", requisites.getNumber());
        assertNull(requisites.getNoExpiry());
        assertNull(requisites.getDiscontinued());
        assertEquals("00:00", requisites.getDateReg().toLocalTime().toString());
        assertEquals("00:00", requisites.getDateExpiry().toLocalTime().toString());
        Applicant applicant = rdcTr.getApplicant();
        assertEquals("Manufacturer", applicant.getDeclarantType());
        assertEquals("Табакова Валентина Семеновича", applicantUl.getHeadText());
        assertEquals("Active", requisites.getStatus());
        assertEquals("UL", applicant.getApplicantType());
        assertEquals("Руководителя", applicantUl.getHeadPost());
        assertEquals("Um", manufacturer.getType());
    }

    @Test
    void testParseFromObjectToYaml() {

        Parser parser = new Parser();

        Applicant applicant = new Applicant();
        applicant.setApplicantType("Applicant Type");
        applicant.setDeclarantType("Declarant Type");

        Address address = new Address();
        address.setString("String");

        ApplicantUl applicantUl = new ApplicantUl();
        applicantUl.setAddress(address);
        applicantUl.setAddressActual("42 Main St");
        applicantUl.setContract("Contract");
        applicantUl.setDate(LocalDateTime.of(1, 1, 1, 1, 1));
        applicantUl.setEmail("jane.doe@example.org");
        applicantUl.setFax("Fax");
        applicantUl.setFullName("Dr Jane Doe");
        applicantUl.setHead("Head");
        applicantUl.setHeadPost("Head Post");
        applicantUl.setHeadText("Head Text");
        applicantUl.setInn("Inn");
        applicantUl.setOgrn("Ogrn");
        applicantUl.setOrgan("Organ");
        applicantUl.setOrganForm("Organ Form");
        applicantUl.setPhone("4105551212");
        applicantUl.setRegInfo("Reg Info");
        applicantUl.setShortName("Short Name");

        Experts experts = new Experts();
        experts.setName("Name");
        experts.setPatronymic("Patronymic");
        experts.setSurname("Doe");

        CertificationOrgan certificationOrgan = new CertificationOrgan();
        certificationOrgan.setAddress("42 Main St");
        certificationOrgan.setAddressLegal("42 Main St");
        certificationOrgan.setDateReg(LocalDateTime.of(1, 1, 1, 1, 1));
        certificationOrgan.setEmail("jane.doe@example.org");
        certificationOrgan.setExperts(experts);
        certificationOrgan.setFax("Fax");
        certificationOrgan.setFullName("Dr Jane Doe");
        certificationOrgan.setHead("Head");
        certificationOrgan.setNumber("42");
        certificationOrgan.setOrgan("Organ");
        certificationOrgan.setOrgn("Orgn");
        certificationOrgan.setPhone("4105551212");

        Address address1 = new Address();
        address1.setString("String");

        ManufacturerUl manufacturerUl = new ManufacturerUl();
        manufacturerUl.setAddress(address1);
        manufacturerUl.setAddressActual("42 Main St");
        manufacturerUl.setDate(LocalDate.ofEpochDay(1L));
        manufacturerUl.setEmail("jane.doe@example.org");
        manufacturerUl.setFax("Fax");
        manufacturerUl.setFullName("Dr Jane Doe");
        manufacturerUl.setInn("Inn");
        manufacturerUl.setOgrn("Ogrn");
        manufacturerUl.setOrgan("Organ");
        manufacturerUl.setOrganForm("Organ Form");
        manufacturerUl.setPhone("4105551212");

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setManufacturerAl("Manufacturer Al");
        manufacturer.setManufacturerFl("Manufacturer Fl");
        manufacturer.setManufacturerUl(manufacturerUl);
        manufacturer.setType("Type");

        TechRegs techRegs = new TechRegs();
        techRegs.setTechReg("Tech Reg");
        techRegs.setTechRegInfo("Tech Reg Info");

        Product product = new Product();
        product.setContractInfo("Contract Info");
        product.setDcOriginType("Dc Origin Type");
        product.setDeclareType("Declare Type");
        product.setDetailsShippingDocumentation("Details Shipping Documentation");
        product.setInfo("Info");
        product.setName("Name");
        product.setOkp("Okp");
        product.setOkpdText("Okpd Text");
        product.setPlaceMark("Place Mark");
        product.setProductInfo("Product Info");
        product.setSizeNumber("42");
        product.setStandart("Standart");
        product.setTechRegs(techRegs);

        Base base = new Base();
        base.setString("String");

        Laboratory laboratory = new Laboratory();
        laboratory.setDateExpiry(null);
        laboratory.setDateReg(null);
        laboratory.setDocument("Document");
        laboratory.setInfo("Info");
        laboratory.setName("Name");
        laboratory.setNumberReg("42");

        BaseDeclaration baseDeclaration = new BaseDeclaration();
        baseDeclaration.setBase(base);
        baseDeclaration.setDocuments("Documents");
        baseDeclaration.setLaboratory(laboratory);
        baseDeclaration.setSchema("Schema");

        Requisites requisites = new Requisites();
        requisites.setBaseDeclaration(baseDeclaration);
        requisites.setDateExpiry(LocalDateTime.of(1, 1, 1, 1, 1));
        requisites.setDateReg(LocalDateTime.of(1, 1, 1, 1, 1));
        requisites.setDiscontinued("Discontinued");
        requisites.setNoExpiry("No Expiry");
        requisites.setNumber("42");
        requisites.setSection("Section");
        requisites.setStatus("Status");

        RdcTr rdcTr = new RdcTr();
        rdcTr.setApplicant(applicant);
        rdcTr.setApplicantAl("Applicant Al");
        rdcTr.setApplicantAu("Applicant Au");
        rdcTr.setApplicantFl("Applicant Fl");
        rdcTr.setApplicantUl(applicantUl);
        rdcTr.setCertificationOrgan(certificationOrgan);
        rdcTr.setDeclareAddInfo("Declare Add Info");
        rdcTr.setManufacturer(manufacturer);
        rdcTr.setProduct(product);
        rdcTr.setRequisites(requisites);
        rdcTr.setType("Type");

        ResponseFsaType responseFsaType = new ResponseFsaType();
        responseFsaType.setRdcTr(rdcTr);
        parser.parseFromObjectToYaml(responseFsaType);
    }
}

