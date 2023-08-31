# Simple Kafka + Spring Boot Example Application

This repository contains a basic example of using Apache Kafka in a Spring Boot Application.

## Prerequisites

- Apache Kafka downloaded.
- Java Development Kit (JDK) installed.

## Getting Started

1. Clone this repository:

   ```bash
   git clone https://github.com/Ezema/simple-kafka-spring-boot-example.git
   cd simple-kafka-spring-boot-example

2. Start a Kafka with ZooKeeper and create the topic
    ```bash
    bin/zookeeper-server-start.sh config/zookeeper.properties
    bin/kafka-server-start.sh config/server.properties
    kafka-topics.sh --create --topic sampleTopic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

2. Run the Spring App:
   ```bash
    ./gradlew bootRun
