# ⏱️ StopWatchUtil

JDK 1.8 기반의 **실행 시간 측정 유틸리티**입니다.  
코드 블록 간의 성능 구간을 빠르게 측정할 수 있도록 도와줍니다.

---

## ✅ 주요 기능

| 메소드        | 설명                              |
|---------------|-----------------------------------|
| `start()`     | 스톱워치 시작                     |
| `checkpoint(label)` | 특정 지점의 경과 시간 측정    |
| `stop()`      | 전체 소요 시간 출력               |

---

## 🧪 예제

```java
import com.sangmoo.StopWatchUtil;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        StopWatchUtil stopwatch = new StopWatchUtil();
        stopwatch.start();

        Thread.sleep(300); // 첫 작업
        stopwatch.checkpoint("데이터 로딩");

        Thread.sleep(500); // 두 번째 작업
        stopwatch.checkpoint("데이터 처리");

        Thread.sleep(200); // 세 번째 작업
        stopwatch.stop();
    }
}
```

## 출력 예시
```css
[StopWatch] ⏱Stopwatch started.
[StopWatch] [데이터 로딩] → 301 ms
[StopWatch] [데이터 처리] → 502 ms
[StopWatch] Stopwatch stopped. Total elapsed time: 1006 ms
```

## 설치 방법
1. jar 생성
```bash
mvn clean package
```
2. 로컬 설치
```bash
mvn install:install-file \
  -Dfile=target/stopwatch-util-1.0.0.jar \
  -DgroupId=com.sangmoo \
  -DartifactId=stopwatch-util \
  -Dversion=1.0.0 \
  -Dpackaging=jar
````
3. 프로젝트에 의존성 추가
```bash
<dependency>
    <groupId>com.sangmoo</groupId>
    <artifactId>stopwatch-util</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 활용 예시
1. 대용량 배치 로직 성능 측정
2. API 응답 속도 분석
3. 로깅 기반 구간 트래킹