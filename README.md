# 객체지향의 사실과 오해
> 목표 : '객체지향의 사실과 오해' 책을 읽고 이를 실습해보자.

- 객체들은 협력하는 공동체이다.
- 객체들은 협력하기 위해 '메세지 전송'을 이용한다.
- 협력관계에 있는 객체들의 '행동'을 중심으로 설계한다.

## [커피 전문점 (v1)](src/v1/Example.md)
커피 전문점에서 커피를 주문하는 과정을 객체들의 협력 관계로 구현해보자.
 - 공동체안에서 객체가 어떤 책임과 역할을 가지고 행동하는지에 초점을 맞추자.

## [커피 전문점 (v2)](src/v2/Example.md)
스무디, 쥬스 등 음료 메뉴가 추가되었다. 이를 설계해보자.
 - 스무디, 쥬스, 커피를 추상화(일반화)함으로써 이를 쉽게 수정할 수 있다.
 - 메뉴판에 메뉴가 추가되었음에도 손님에게는 영향을 주지 않는다.
 - 바리스타의 코드가 변경되었지만 이 역시 손님에게 역할을 주지 않는다.

## [커피 전문점 (v3)](src/v3/Example.md)
쿠폰 서비스를 도입해보자.
 - V1을 잘 이해했다면 V3도 어렵지 않게 가능할 것이다.

