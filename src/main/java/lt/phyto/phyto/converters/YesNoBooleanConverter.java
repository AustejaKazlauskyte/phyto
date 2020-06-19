package lt.phyto.phyto.converters;

import javax.persistence.AttributeConverter;

public class YesNoBooleanConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        // reikes parasyti salyga kuri handlins null, bet veliau
        return attribute ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equals("Y");
    }
}
