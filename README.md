# Description
- auth : 77kkyu
- development environment : spring-boot
- technology : kafka, zookeeper, docker

> kafka, zookeeper서버는 docker에서 실행 시켰습니다
> 
> 간단한 API를 만들어 메세지를 Topic으로 구분하여 전송하고(Producer) 
> 
>받은 메세지를(Consumer) 식별해 해당 로직이 실행됩니다 
>
> [docker로 실행시키는 문서입니다](https://github.com/77kkyu/kafka-springboot/blob/main/docs/docs.md)

<br>

---

- kafka란?

``` text
Kafka는 고성능 TCP 네트워크 프로토콜을 통해 통신하는 서버와 클라이언트로 구성된 분산 시스템이고,
베어메탈 하드웨어, 가상 머신, 온프레미스 및 클라우드 환경의 컨테이너에 배포할 수 있습니다
```

> [kafka 공식 문서](https://kafka.apache.org/documentation/#introduction)

<br>

1. Topic
``` text
일종의 "큐", 카프카안에 topic이 있다 즉, 
프로듀서와 컨슈머들이 카프카로 보낸 메세지를 구분하기 위한 이름이다
다수의 프로듀스, 컨슈머들이 동일한 카프카를 사용하면 메세지들이 뒤섞이기 때문에 토픽으로 구분하여 처리한다
```

<br>

2. Producer
``` text
"큐"에 데이터를 넣는다 메세지를 생산해서 브로커의 토픽이름으로 보내는 서버 또는 어플
```

<br>

3. Consumer
``` text
"큐"안에 데이터를 가져오고 브로커의 토픽 이름으로 저장된 메세지를 가져가는 서버 또는 어플
```

<br>

4. zookeeper
``` text
Consumer와 통신, kafka의 메타데이터 정보를 저장 및 상태관리 등 목적으로 이용
```

<br>

---

- 사용사례
``` text
1. 메세징
2. 웹사이트 활동 추적
3. 측정항목
4. 로그 집계
5. 스트림 처리
6. 이벤트 소싱
7. 커밋 로그
```
