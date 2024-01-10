# RxJava란 ? 😀🥳

- RxAndroid 는 RxJava에 안드로이드용 스케쥴러 등 몇가지 클래스를 추가해 안드로이드 개발을 쉽게 해주는 라이브러리이다.
- RxJava는 ReactiveX(Reactive Extensions)를 Java로 구현한 라이브러리 이다.

<br><br>
> RxJava는 반응형 프로그래밍이다. 반응형이란 데이터가 변하면 알아서 캐치히야 결과로 반영.
따라서 데이터를 관찰 할 수 있고, 데이터를 스트림으로 처리.

<br><br>

-------
<br><br>
## Rx = Observable + Observers + Schedulers

- Observable : Observable 은 데이터 스트림입니다. Observable은 하나의 스레드에서 다른 스레드로 전달 할 데이터를 압축합니다. 주기적으로 또는 설정에 따라 생애주기 동안 한번만 데이터를 방출합니다.
Observable은 데이터를 처리하고 다른 구성요소에 전달하는 역할을 한다고 생각하면 된다.

- Observers : Observers는 Observable에 의해 방출된 데이터 스트림을 소비한다. Observers는 subscribeOn() 메서드를 사용해서 Observable에 의해 방출된 데이터 스트림을 소비한다.
Observable이 방출하는 데이터를 수신할 수 있다.

- Schedulers: Schedulers는 Observable과 Observers 에게 그들이 실행되어야 할 스레드를 알려준다. observeOn()메서드로 observers에게 관찰해야 할 스레드를 알려줄 수 있다. 또한, scheduleOn() 메서드로 observable이 실행해야할 스레드를 알려줄 수 있다.

<br><br>
## DI (Dependency injection) : 의존성 주입
왜 하냐면, 테스팅을 위해서 ~

<br><br>

# Koin
코틀린을 위한 의존성 관리 라이브러리 !
- applicationContext : context 주입
- bean : 싱글톤 컴포넌트 선언
- factory : 인스턴스를 가져올 factory 패턴을 선언하며 inject 할 때 마다 새로운 인스턴스를 가져옴
- bind : 종속시킬 class 나 infterface를 주입.
- get : bean이나 factory를 통해 정의된 컴포넌트 들을 가져온다.
