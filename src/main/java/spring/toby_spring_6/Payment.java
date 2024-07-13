package spring.toby_spring_6;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    // 접근 제한자, 해당 클래스 외부에서는 이 필드에 접근할 수 없음. 이 필드의 값을 변경하는 것은 메소드 또는 생성자를 통해서만 일어나는 것이 바람직하다.
    private Long orderId;
    private String currency;
    // 정확한 계산이 필요한 경우, BigDecimal 타입을 사용합니다. 이는 add, subtract와 같은 메소드를 지원합니다.
    private BigDecimal foreignCurrencyAmmount;
    private BigDecimal exchangeRate;
    private BigDecimal convertedAmount;
    private LocalDateTime validUntil;

    // setter 방법 vs 생성자 방법 vs 빌더 방법(롬복 등)
    // 생성자 방법의 단점 : 같은 타입의 값을 삽입할 때 휴먼 에러가 날 수 있음 (값/환율의 값이 바뀌어도 자료형이 같아서 이를 검열해주진 않음)
    public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmmount, BigDecimal exchangeRate, BigDecimal convertedAmount, LocalDateTime validUntil) {
        this.orderId = orderId;
        this.currency = currency;
        this.foreignCurrencyAmmount = foreignCurrencyAmmount;
        this.exchangeRate = exchangeRate;
        this.convertedAmount = convertedAmount;
        this.validUntil = validUntil;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getForeignCurrencyAmmount() {
        return foreignCurrencyAmmount;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", currency='" + currency + '\'' +
                ", foreignCurrencyAmmount=" + foreignCurrencyAmmount +
                ", exchangeRate=" + exchangeRate +
                ", convertedAmount=" + convertedAmount +
                ", validUntil=" + validUntil +
                '}';
    }
}
