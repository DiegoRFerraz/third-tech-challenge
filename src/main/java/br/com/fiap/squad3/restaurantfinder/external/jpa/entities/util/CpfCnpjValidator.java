package br.com.fiap.squad3.restaurantfinder.external.jpa.entities.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CNPJValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;

public class CpfCnpjValidator implements ConstraintValidator<CpfCnpj, String> {
    private final CPFValidator cpfValidator = new CPFValidator();
    private final CNPJValidator cnpjValidator = new CNPJValidator();

    @Override
    public void initialize(CpfCnpj constraintAnnotation) {
        cpfValidator.initialize(null);
        cnpjValidator.initialize(null);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        String sanitizedValue = value.replaceAll("\\D", "");

        if (sanitizedValue.length() == 11) {
            return cpfValidator.isValid(sanitizedValue, context);
        } else if (sanitizedValue.length() == 14) {
            return cnpjValidator.isValid(sanitizedValue, context);
        }
        return false;
    }
}