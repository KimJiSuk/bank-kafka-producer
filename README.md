# 사전 준비

## Overview
data.csv -> kafka topic(bank)
- 데이터 가공 없이 Line 단위로 Topic Value에 넣음.

로그명|컬럼명
----|-----
고객|고객번호(Key), 등록일시, 고객명, 추천인
고객상세|고객번호(Key), 등록일시, 성별, 생년월일
계좌|계좌번호(Key), 등록일시, 고객번호, 상품명
연결계좌|계좌번호(Key), 등록일시, 연결계좌번호
거래내역|계좌번호(Key), 거래일련번호(Key), 등록일시, 거래채널, 거래후잔액
ATM거래내역|계좌번호(Key), 거래일련번호(Key), 등록일시, ATM코드
자동이체거래내역|계좌번호(Key), 거래일련번호(Key), 등록일시, 자동이체주기
이체거래내역|계좌번호(Key), 거래일련번호(Key), 등록일시, 수취인명


## Requirements
```
Java 11
Spring Boot 2.5.1
```

## Usage
Kafka 메시지 발행

```
http://localhost:8080/producer
```
