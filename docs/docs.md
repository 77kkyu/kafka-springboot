# kafka, zookeeper를 docker로 실행시키기

---

## docker images 설치
- kafka 설치
> docker pull wurstmeister/kafka



- zookeeper 설치 
> docker pull wurstmeister/zookeeper

<br>

---

## docker-compose 파일 생성
- docker-compose.yml 파일 생성합니다 (경로는 자유입니다)

``` yaml
version: '2'
services:
  zookeeper:
    image: wurstmeister/zookeeper
    container_name: zookeeper
    ports:
      - "2181:2181"
  kafka:
    image: wurstmeister/kafka
    container_name: kafka
    ports:
      - "9092:9092"
    environment:
      KAFKA_ADVERTISED_HOST_NAME: 127.0.0.1
      KAFKA_ZOOKEEPER_CONNECT: zookeeper:2181
    volumes:
      - /var/run/docker.sock:/var/run/docker.sock
```

<br>

---

## docker-compose.yml 실행
- 해당 docker-compose.yml가 있는 경로로 이동을 합니다
> cd 경로
- 해당 경로로 이동을 했으면 아래 명령어를 실행해 줍니다
> docker-compose up -d

<br>

---

## docker container 실행하기
> docker container exec -it kafka bash