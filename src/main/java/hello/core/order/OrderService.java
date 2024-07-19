package hello.core.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
    //왜 이렇게 클래스로 만들어준 것의 생성자인가?? 이게 이걸 왜 인터페이스에서 만들어주는걸까??
    //이게 어떤 식의 코드인지 확실하게 아는 것이 중요하겠다.


}
