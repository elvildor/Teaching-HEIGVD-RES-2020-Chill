package ch.heigvd.res.chill.domain.UxorialRook;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Paulaner implements IProduct {

        public final static String NAME = "Paulaner";
        public final static BigDecimal PRICE = new BigDecimal(2.25);

        @Override
        public String getName() {
            return NAME;
        }

        @Override
        public BigDecimal getPrice() {
            return PRICE;
        }
}
